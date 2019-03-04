package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XExtensionManager} interface is used to manage extensions in the user, shared and bundled repository.
  * @see ExtensionManager
  * @since OOo 3.3
  */
trait XExtensionManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster {
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: activexDashInteropLib.SafeArray[XPackageTypeInfo]
  /**
    * adds an extension.
    *
    * The properties argument is currently only used to suppress the license information for shared extensions.
    * @param url package URL, must be UCB conform
    * @param properties additional properties, for example, that the license is to be suppressed (if supported by the extension)
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the adding process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns object representing the extension.
    */
  def addExtension(
    url: java.lang.String,
    properties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    repository: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /** check if all prerequisites for the extension are fulfilled and activates it, if possible. */
  def checkPrerequisitesAndEnable(
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
    * disable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be disabled
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def disableExtension(
    extension: XPackage,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * enable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be enabled.
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def enableExtension(
    extension: XPackage,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * returns a sequence containing all installed extensions.
    *
    * The members of the returned sequence correspond to an extension with a particular extension identifier. The members are also sequences which contain
    * as many elements as there are repositories. Those are ordered according to the priority of the repository. That is, the first member is the extension
    * from the user repository, the second is from the shared repository and the last is from the bundled repository.
    */
  def getAllExtensions(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[XPackage]]
  /**
    * gets an installed extensions.
    * @param repository the name of the repository
    * @param identifier extension identifier
    * @param fileName extension file name
    * @param xCmdEnv command environment for error and progress handling
    * @returns {@link XPackage} object
    */
  def getDeployedExtension(
    repository: java.lang.String,
    identifier: java.lang.String,
    fileName: java.lang.String,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): XPackage
  /**
    * gets all currently installed extensions, including disabled user extensions.
    * @param repository the repository from which the extensions are returned
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns all currently installed packages
    */
  def getDeployedExtensions(
    repository: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashInteropLib.SafeArray[XPackage]
  /**
    * gets all extensions with the same identifier from all repositories.
    *
    * The extension at the first position in the returned sequence represents the extension from the user repository. The next element is from the shared
    * and the last one is from the bundled repository. If one repository does not contain this extension, then the respective element is a null reference.
    */
  def getExtensionsWithSameIdentifier(
    identifier: java.lang.String,
    fileName: java.lang.String,
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
    *
    * Extensions returned by these functions are not returned by {@link XExtensionManager.getDeployedExtension()}{@link
    * XExtensionManager.getDeployedExtensions()}{@link XExtensionManager.getAllExtensions()}{@link XExtensionManager.getExtensionsWithSameIdentifier()}
    */
  def getExtensionsWithUnacceptedLicenses(
    repository: java.lang.String,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashInteropLib.SafeArray[XPackage]
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): activexDashInteropLib.SafeArray[XPackageTypeInfo]
  /** determines if the current user has write access to the extensions folder of the repository. */
  def isReadOnlyRepository(repository: java.lang.String): scala.Boolean
  /**
    * Expert feature: erases the underlying registry cache and reinstalls all previously added extensions. Please keep in mind that all registration status
    * get lost.
    *
    * Please use this in case of suspected cache inconsistencies only.
    * @param force set to true when called during soffice bootstrap after cleaning old extension cache
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the adding process
    * @param xCmdEnv command environment for error and progress handling
    */
  def reinstallDeployedExtensions(
    force: scala.Boolean,
    repository: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * removes an extension.
    * @param identifier package identifier
    * @param fileName package file name
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def removeExtension(
    identifier: java.lang.String,
    fileName: java.lang.String,
    repository: java.lang.String,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * synchronizes the extension database with the contents of the extensions folder of shared and bundled extensions.
    *
    * Added extensions will be added to the database and removed extensions will be removed from the database. The active extensions are determined. That
    * is, shared or bundled extensions are not necessaryly registered ( {@link XPackage.registerPackage()} ).
    * @returns If true - then at least one extension was removed or added. Otherwise nothing was changed.
    */
  def synchronize(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Boolean
}

object XExtensionManager {
  @scala.inline
  def apply(
    SupportedPackageTypes: activexDashInteropLib.SafeArray[XPackageTypeInfo],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addExtension: js.Function5[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      XPackage
    ],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    checkPrerequisitesAndEnable: js.Function3[
      XPackage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Double
    ],
    createAbortChannel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel],
    disableExtension: js.Function3[
      XPackage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    enableExtension: js.Function3[
      XPackage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    getAllExtensions: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[XPackage]]
    ],
    getDeployedExtension: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      XPackage
    ],
    getDeployedExtensions: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashInteropLib.SafeArray[XPackage]
    ],
    getExtensionsWithSameIdentifier: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashInteropLib.SafeArray[XPackage]
    ],
    getExtensionsWithUnacceptedLicenses: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashInteropLib.SafeArray[XPackage]
    ],
    getSupportedPackageTypes: js.Function0[activexDashInteropLib.SafeArray[XPackageTypeInfo]],
    isReadOnlyRepository: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    reinstallDeployedExtensions: js.Function4[
      scala.Boolean, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeExtension: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    synchronize: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Boolean
    ]
  ): XExtensionManager = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes, acquire = acquire, addEventListener = addEventListener, addExtension = addExtension, addModifyListener = addModifyListener, checkPrerequisitesAndEnable = checkPrerequisitesAndEnable, createAbortChannel = createAbortChannel, disableExtension = disableExtension, dispose = dispose, enableExtension = enableExtension, getAllExtensions = getAllExtensions, getDeployedExtension = getDeployedExtension, getDeployedExtensions = getDeployedExtensions, getExtensionsWithSameIdentifier = getExtensionsWithSameIdentifier, getExtensionsWithUnacceptedLicenses = getExtensionsWithUnacceptedLicenses, getSupportedPackageTypes = getSupportedPackageTypes, isReadOnlyRepository = isReadOnlyRepository, queryInterface = queryInterface, reinstallDeployedExtensions = reinstallDeployedExtensions, release = release, removeEventListener = removeEventListener, removeExtension = removeExtension, removeModifyListener = removeModifyListener, synchronize = synchronize)
  
    __obj.asInstanceOf[XExtensionManager]
  }
}

