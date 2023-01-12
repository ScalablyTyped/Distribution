package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.task.XAbortChannel
import typings.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XExtensionManager} interface is used to manage extensions in the user, shared and bundled repository.
  * @see ExtensionManager
  * @since OOo 3.3
  */
trait XExtensionManager
  extends StObject
     with XComponent
     with XModifyBroadcaster {
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  val SupportedPackageTypes: SafeArray[XPackageTypeInfo]
  
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
    url: String,
    properties: SeqEquiv[NamedValue],
    repository: String,
    xAbortChannel: XAbortChannel,
    xCmdEnv: XCommandEnvironment
  ): XPackage
  
  /** check if all prerequisites for the extension are fulfilled and activates it, if possible. */
  def checkPrerequisitesAndEnable(`extension`: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Double
  
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): XAbortChannel
  
  /**
    * disable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be disabled
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def disableExtension(`extension`: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit
  
  /**
    * enable an extension.
    *
    * If the extension is not from the user repository then an IllegalArgumentException is thrown.
    * @param extension the extension which is to be enabled.
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def enableExtension(`extension`: XPackage, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit
  
  /**
    * returns a sequence containing all installed extensions.
    *
    * The members of the returned sequence correspond to an extension with a particular extension identifier. The members are also sequences which contain
    * as many elements as there are repositories. Those are ordered according to the priority of the repository. That is, the first member is the extension
    * from the user repository, the second is from the shared repository and the last is from the bundled repository.
    */
  def getAllExtensions(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[SafeArray[XPackage]]
  
  /**
    * gets an installed extensions.
    * @param repository the name of the repository
    * @param identifier extension identifier
    * @param fileName extension file name
    * @param xCmdEnv command environment for error and progress handling
    * @returns object
    */
  def getDeployedExtension(repository: String, identifier: String, fileName: String, xCmdEnv: XCommandEnvironment): XPackage
  
  /**
    * gets all currently installed extensions, including disabled user extensions.
    * @param repository the repository from which the extensions are returned
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    * @returns all currently installed packages
    */
  def getDeployedExtensions(repository: String, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[XPackage]
  
  /**
    * gets all extensions with the same identifier from all repositories.
    *
    * The extension at the first position in the returned sequence represents the extension from the user repository. The next element is from the shared
    * and the last one is from the bundled repository. If one repository does not contain this extension, then the respective element is a null reference.
    */
  def getExtensionsWithSameIdentifier(identifier: String, fileName: String, xCmdEnv: XCommandEnvironment): SafeArray[XPackage]
  
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
  def getExtensionsWithUnacceptedLicenses(repository: String, xCmdEnv: XCommandEnvironment): SafeArray[XPackage]
  
  /**
    * gets the supported XPackageTypeInfos.
    * @returns supported XPackageTypeInfos.
    */
  def getSupportedPackageTypes(): SafeArray[XPackageTypeInfo]
  
  /** determines if the current user has write access to the extensions folder of the repository. */
  def isReadOnlyRepository(repository: String): Boolean
  
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
  def reinstallDeployedExtensions(force: Boolean, repository: String, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit
  
  /**
    * removes an extension.
    * @param identifier package identifier
    * @param fileName package file name
    * @param repository the name of the repository
    * @param xAbortChannel abort channel to asynchronously abort the removing process, or null
    * @param xCmdEnv command environment for error and progress handling
    */
  def removeExtension(
    identifier: String,
    fileName: String,
    repository: String,
    xAbortChannel: XAbortChannel,
    xCmdEnv: XCommandEnvironment
  ): Unit
  
  /**
    * synchronizes the extension database with the contents of the extensions folder of shared and bundled extensions.
    *
    * Added extensions will be added to the database and removed extensions will be removed from the database. The active extensions are determined. That
    * is, shared or bundled extensions are not necessaryly registered ( {@link XPackage.registerPackage()} ).
    * @returns If true - then at least one extension was removed or added. Otherwise nothing was changed.
    */
  def synchronize(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Boolean
}
object XExtensionManager {
  
  inline def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addExtension: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage,
    addModifyListener: XModifyListener => Unit,
    checkPrerequisitesAndEnable: (XPackage, XAbortChannel, XCommandEnvironment) => Double,
    createAbortChannel: () => XAbortChannel,
    disableExtension: (XPackage, XAbortChannel, XCommandEnvironment) => Unit,
    dispose: () => Unit,
    enableExtension: (XPackage, XAbortChannel, XCommandEnvironment) => Unit,
    getAllExtensions: (XAbortChannel, XCommandEnvironment) => SafeArray[SafeArray[XPackage]],
    getDeployedExtension: (String, String, String, XCommandEnvironment) => XPackage,
    getDeployedExtensions: (String, XAbortChannel, XCommandEnvironment) => SafeArray[XPackage],
    getExtensionsWithSameIdentifier: (String, String, XCommandEnvironment) => SafeArray[XPackage],
    getExtensionsWithUnacceptedLicenses: (String, XCommandEnvironment) => SafeArray[XPackage],
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    isReadOnlyRepository: String => Boolean,
    queryInterface: `type` => Any,
    reinstallDeployedExtensions: (Boolean, String, XAbortChannel, XCommandEnvironment) => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeExtension: (String, String, String, XAbortChannel, XCommandEnvironment) => Unit,
    removeModifyListener: XModifyListener => Unit,
    synchronize: (XAbortChannel, XCommandEnvironment) => Boolean
  ): XExtensionManager = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addExtension = js.Any.fromFunction5(addExtension), addModifyListener = js.Any.fromFunction1(addModifyListener), checkPrerequisitesAndEnable = js.Any.fromFunction3(checkPrerequisitesAndEnable), createAbortChannel = js.Any.fromFunction0(createAbortChannel), disableExtension = js.Any.fromFunction3(disableExtension), dispose = js.Any.fromFunction0(dispose), enableExtension = js.Any.fromFunction3(enableExtension), getAllExtensions = js.Any.fromFunction2(getAllExtensions), getDeployedExtension = js.Any.fromFunction4(getDeployedExtension), getDeployedExtensions = js.Any.fromFunction3(getDeployedExtensions), getExtensionsWithSameIdentifier = js.Any.fromFunction3(getExtensionsWithSameIdentifier), getExtensionsWithUnacceptedLicenses = js.Any.fromFunction2(getExtensionsWithUnacceptedLicenses), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), isReadOnlyRepository = js.Any.fromFunction1(isReadOnlyRepository), queryInterface = js.Any.fromFunction1(queryInterface), reinstallDeployedExtensions = js.Any.fromFunction4(reinstallDeployedExtensions), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeExtension = js.Any.fromFunction5(removeExtension), removeModifyListener = js.Any.fromFunction1(removeModifyListener), synchronize = js.Any.fromFunction2(synchronize))
    __obj.asInstanceOf[XExtensionManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XExtensionManager] (val x: Self) extends AnyVal {
    
    inline def setAddExtension(value: (String, SeqEquiv[NamedValue], String, XAbortChannel, XCommandEnvironment) => XPackage): Self = StObject.set(x, "addExtension", js.Any.fromFunction5(value))
    
    inline def setCheckPrerequisitesAndEnable(value: (XPackage, XAbortChannel, XCommandEnvironment) => Double): Self = StObject.set(x, "checkPrerequisitesAndEnable", js.Any.fromFunction3(value))
    
    inline def setCreateAbortChannel(value: () => XAbortChannel): Self = StObject.set(x, "createAbortChannel", js.Any.fromFunction0(value))
    
    inline def setDisableExtension(value: (XPackage, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "disableExtension", js.Any.fromFunction3(value))
    
    inline def setEnableExtension(value: (XPackage, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "enableExtension", js.Any.fromFunction3(value))
    
    inline def setGetAllExtensions(value: (XAbortChannel, XCommandEnvironment) => SafeArray[SafeArray[XPackage]]): Self = StObject.set(x, "getAllExtensions", js.Any.fromFunction2(value))
    
    inline def setGetDeployedExtension(value: (String, String, String, XCommandEnvironment) => XPackage): Self = StObject.set(x, "getDeployedExtension", js.Any.fromFunction4(value))
    
    inline def setGetDeployedExtensions(value: (String, XAbortChannel, XCommandEnvironment) => SafeArray[XPackage]): Self = StObject.set(x, "getDeployedExtensions", js.Any.fromFunction3(value))
    
    inline def setGetExtensionsWithSameIdentifier(value: (String, String, XCommandEnvironment) => SafeArray[XPackage]): Self = StObject.set(x, "getExtensionsWithSameIdentifier", js.Any.fromFunction3(value))
    
    inline def setGetExtensionsWithUnacceptedLicenses(value: (String, XCommandEnvironment) => SafeArray[XPackage]): Self = StObject.set(x, "getExtensionsWithUnacceptedLicenses", js.Any.fromFunction2(value))
    
    inline def setGetSupportedPackageTypes(value: () => SafeArray[XPackageTypeInfo]): Self = StObject.set(x, "getSupportedPackageTypes", js.Any.fromFunction0(value))
    
    inline def setIsReadOnlyRepository(value: String => Boolean): Self = StObject.set(x, "isReadOnlyRepository", js.Any.fromFunction1(value))
    
    inline def setReinstallDeployedExtensions(value: (Boolean, String, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "reinstallDeployedExtensions", js.Any.fromFunction4(value))
    
    inline def setRemoveExtension(value: (String, String, String, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "removeExtension", js.Any.fromFunction5(value))
    
    inline def setSupportedPackageTypes(value: SafeArray[XPackageTypeInfo]): Self = StObject.set(x, "SupportedPackageTypes", value.asInstanceOf[js.Any])
    
    inline def setSynchronize(value: (XAbortChannel, XCommandEnvironment) => Boolean): Self = StObject.set(x, "synchronize", js.Any.fromFunction2(value))
  }
}
