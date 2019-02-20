package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XPackageManager} interface is used to add or remove packages to a specific repository. This interface represents a particular repository.
  * Packages are deployable files, e.g. scripts or UNO components.
  *
  * Adding an UNO package means that a copy of the package is stored in the repository.
  *
  * Removing an UNO package means that the previously added package is removed from the repository.
  *
  * All interface methods do neither register nor revoke an extension. This happens exclusively by {@link XExtensionManager} .
  *
  * Objects of this interface are created using the {@link XPackageManagerFactory} service resp. the singleton `
  * /singletons/com.sun.star.deployment.thePackageManagerFactory` .
  * @deprecated DeprecatedUse XExtensionManager.
  * @see thePackageManagerFactory
  * @since OOo 2.0
  */
trait XPackageManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster {
  /**
    * returns the underlying deployment context, that is, the name of the repository.
    * @returns underlying deployment context
    */
  val Context: java.lang.String
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: activexDashInteropLib.SafeArray[XPackageTypeInfo]
  /**
    * adds an UNO package.
    *
    * The properties argument is currently only used to suppress the license information for shared extensions.
    * @param url package URL, must be UCB conform
    * @param properties additional properties, for example, that the license is to be suppressed (if supported by the extension)
    * @param mediaType media-type of package, empty string if to be detected
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def addPackage(
    url: java.lang.String,
    properties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    mediaType: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /**
    * checks if the extension can be used.
    *
    * The extension must be managed by this package manager, that is, it must be recorded in its database. The package manager calls {@link
    * XPackage.checkPrerequisites} and updates its data base with the result. The result, which is from {@link Prerequisites} will be returned.
    */
  def checkPrerequisites(
    extension: XPackage,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Double
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel
  /**
    * returns the underlying deployment context, that is, the name of the repository.
    * @returns underlying deployment context
    */
  def getContext(): java.lang.String
  /**
    * gets a deployed package.
    * @param identifier package identifier
    * @param fileName package file name
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def getDeployedPackage(
    identifier: java.lang.String,
    fileName: java.lang.String,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /**
    * gets all currently deployed packages.
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns all currently deployed packages
    */
  def getDeployedPackages(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashInteropLib.SafeArray[XPackage]
  /**
    * returns all extensions which are currently not in use because the user did not accept the license.
    *
    * The function will not return any object for the user repository, because a user extension will not be kept in the user repository if its license is
    * declined. Only extensions which are registered at start-up of OOo, that is, shared and bundled extensions, can be returned.
    *
    * Extensions which allow the license to be suppressed, that is, it does not need to be displayed, and which are installed with the corresponding option,
    * are also not returned.
    */
  def getExtensionsWithUnacceptedLicenses(xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment): activexDashInteropLib.SafeArray[XPackage]
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): activexDashInteropLib.SafeArray[XPackageTypeInfo]
  /**
    * adds an extension.
    *
    * This copies the extension. If it was from the same repository, which is represented by this {@link XPackageManager} interface, then nothing happens.
    * @param extension
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} handle
    */
  def importExtension(
    extension: XPackage,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /**
    * indicates that this implementation cannot be used for tasks which require write access to the location where the extensions are installed.
    *
    * Normally one would call a method and handle the exception if writing failed. However, a GUI interface may need to know beforehand if writing is
    * allowed. For example, the Extension Manager dialog needs to enable / disable the Add button depending if the user has write permission. Only the
    * {@link XPackageManager} implementation knows the location of the installed extensions. Therefore it is not possible to check "externally" for write
    * permission.
    */
  def isReadOnly(): scala.Boolean
  /**
    * Expert feature: erases the underlying registry cache and reinstalls all previously added packages. Please keep in mind that all registration status
    * get lost.
    *
    * Please use this in case of suspected cache inconsistencies only.
    * @param force set to true when called during soffice bootstrap after cleaning old extension cache
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    */
  def reinstallDeployedPackages(
    force: scala.Boolean,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * removes an UNO package.
    * @param identifier package identifier
    * @param fileName package file name
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def removePackage(
    identifier: java.lang.String,
    fileName: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * synchronizes the extension database with the contents of the extensions folder.
    *
    * Added extensions will be added to the database and removed extensions will be removed from the database.
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    * @returns If true - then at least one extension was removed or added. Otherwise nothing was changed.
    */
  def synchronize(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Boolean
}

