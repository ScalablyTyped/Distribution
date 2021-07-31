package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Ambiguous
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.beans.StringPair
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
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
  * Objects of this interface reflect a bound package and are issued by a {@link PackageRegistryBackend} .
  * @since OOo 2.0
  */
trait XPackage
  extends StObject
     with XComponent
     with XModifyBroadcaster {
  
  /**
    * returns a description string to describe the package.
    * @returns description
    */
  val Description: String
  
  /**
    * returns the display name of the package, e.g. for graphical user interfaces (GUI).
    * @returns display name of the package
    */
  val DisplayName: String
  
  /**
    * returns the unique extension identifier.
    * @returns the extension identifier (a `"org.openoffice.legacy."` one if the extension does not explicitly specify one), or an empty `Optional` if this pack
    */
  val Identifier: Optional[String]
  
  /**
    * returns a string containing the license text.
    * @returns license
    */
  val LicenseText: String
  
  /**
    * returns the file name of the package.
    * @returns file name of the package
    */
  val Name: String
  
  /**
    * returns the {@link XPackageTypeInfo} , e.g. media-type etc.
    * @returns media type of package
    */
  val PackageType: XPackageTypeInfo
  
  /**
    * returns the publisher info for the package, the strings might be empty, if there is no publisher
    *
    * {@link com.sun.star.beans.StringPair.First} represents the publisher name and {@link com.sun.star.beans.StringPair.Second} represents the URL to the
    * publisher.
    */
  val PublisherInfo: StringPair
  
  /**
    * return a URL to a directory which contains the registration data.
    *
    * This data may be created when calling {@link XPackage.registerPackage()} . If this is the case is indicated by
    * com::sun::star::beans::Optional::IsPresent of the return value. If registration data are created during registration, but the package is currently not
    * registered, for example after calling {@link XPackage.revokePackage()} , then com::sun::star::beans::Optional::IsPresent is `TRUE` and the
    * com::sun::star::beans::Optional::Value may be an empty string.
    */
  val RegistrationDataURL: Optional[String]
  
  /** returns the name of the repository where this object comes from. */
  val RepositoryName: String
  
  /**
    * returns the location of the package.
    * @returns location of package
    */
  val URL: String
  
  /**
    * returns a sequence of update information URLs.
    *
    * The sequence may be empty in case no update information is available. If the sequence contains more than one URL, the extra URLs must mirror the
    * information available at the first URL.
    * @returns update information URLs
    */
  val UpdateInformationURLs: SafeArray[String]
  
  /**
    * returns the textual version representation of the package.
    *
    * A textual version representation is a finite string following the BNF ;  version ::= [element ("." element)*] ;  element ::= ("0" | "1" | "2" | "3" |
    * "4" | "5" | "6" | "7" | "8" | "9")+
    * @returns the textual version representation
    */
  val Version: String
  
  /**
    * checks if the dependencies for this package are still satisfied
    *
    * After updating the OpenOffice.org, some dependencies for packages might no longer be satisfied.
    * @param xCmdEnv command environment for error handling and other interaction.
    * @returns `TRUE` - all dependencies are satisfied `FALSE` - at least one dependency failed.
    * @since OOo 3.2
    */
  def checkDependencies(xCmdEnv: XCommandEnvironment): Boolean
  
  /**
    * checks if the package can be installed.
    *
    * Only if the return value is `TRUE` the package is allowed to be installed. In case of `FALSE` or in case of an exception, the package must be removed
    * completely. After return of this function no code from the extension may be used anymore, so that the extension can be safely removed from the hard
    * disk.
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error handling and other interaction.
    * @param alreadyInstalled indicates that an extension with the same identifier is already installed.
    * @returns `NULL` - all prerequisites are met. Otherwise, a value from {@link Prerequisites} indicating what prerequisites are missing.
    */
  def checkPrerequisites(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment, alreadyInstalled: Boolean): Double
  
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): XAbortChannel
  
  /**
    * exports package to given destination URL.
    * @param destFolderURL package destination folder URL, must be UCB conforming
    * @param newTitle new package name
    * @param nameClashAction one of {@link com.sun.star.ucb.NameClash}
    * @param xCmdEnv command environment for error and progress handling
    */
  def exportTo(destFolderURL: String, newTitle: String, nameClashAction: Double, xCmdEnv: XCommandEnvironment): Unit
  
  /**
    * Gets packages of the bundle.
    *
    * If {@link isRemoved()} returns `TRUE` then getBundle may return an empty sequence in case the object is not registered.
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    * @returns set of packages enclosed in this package
    */
  def getBundle(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): SafeArray[XPackage]
  
  /**
    * returns a description string to describe the package.
    * @returns description
    */
  def getDescription(): String
  
  /**
    * returns the display name of the package, e.g. for graphical user interfaces (GUI).
    * @returns display name of the package
    */
  def getDisplayName(): String
  
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @returns the icon which should be used to represent the table in the database application window, or `NULL` if the default icon should be used.
    */
  def getIcon(highContrast: Boolean): XGraphic
  
  /**
    * returns the unique extension identifier.
    * @returns the extension identifier (a `"org.openoffice.legacy."` one if the extension does not explicitly specify one), or an empty `Optional` if this pack
    */
  def getIdentifier(): Optional[String]
  
  /**
    * returns a string containing the license text.
    * @returns license
    */
  def getLicenseText(): String
  
  /**
    * returns the file name of the package.
    * @returns file name of the package
    */
  def getName(): String
  
  /**
    * returns the {@link XPackageTypeInfo} , e.g. media-type etc.
    * @returns media type of package
    */
  def getPackageType(): XPackageTypeInfo
  
  /**
    * returns the publisher info for the package, the strings might be empty, if there is no publisher
    *
    * {@link com.sun.star.beans.StringPair.First} represents the publisher name and {@link com.sun.star.beans.StringPair.Second} represents the URL to the
    * publisher.
    */
  def getPublisherInfo(): StringPair
  
  /**
    * return a URL to a directory which contains the registration data.
    *
    * This data may be created when calling {@link XPackage.registerPackage()} . If this is the case is indicated by
    * com::sun::star::beans::Optional::IsPresent of the return value. If registration data are created during registration, but the package is currently not
    * registered, for example after calling {@link XPackage.revokePackage()} , then com::sun::star::beans::Optional::IsPresent is `TRUE` and the
    * com::sun::star::beans::Optional::Value may be an empty string.
    */
  def getRegistrationDataURL(): Optional[String]
  
  /** returns the name of the repository where this object comes from. */
  def getRepositoryName(): String
  
  /**
    * returns the location of the package.
    * @returns location of package
    */
  def getURL(): String
  
  /**
    * returns a sequence of update information URLs.
    *
    * The sequence may be empty in case no update information is available. If the sequence contains more than one URL, the extra URLs must mirror the
    * information available at the first URL.
    * @returns update information URLs
    */
  def getUpdateInformationURLs(): SafeArray[String]
  
  /**
    * returns the textual version representation of the package.
    *
    * A textual version representation is a finite string following the BNF ;  version ::= [element ("." element)*] ;  element ::= ("0" | "1" | "2" | "3" |
    * "4" | "5" | "6" | "7" | "8" | "9")+
    * @returns the textual version representation
    */
  def getVersion(): String
  
  /**
    * reflects whether this package is a bundle of one or more packages, e.g. a zip (legacy) package file or a document hosting script packages.
    * @returns `TRUE` if this package is a package bundle, `FALSE` otherwise
    */
  def isBundle(): Boolean
  
  /**
    * determines whether the package is currently registered, i.e. whether it is active.
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    * @returns status whether the package is registered ( `TRUE` , `FALSE` ) or the status is ambiguous. Additionally, a registration status may not apply, e.g.
    */
  def isRegistered(xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Optional[Ambiguous[Boolean]]
  
  /**
    * indicates if this object represents a removed extension or extension item. This is the case when it was created by providing `TRUE` for the `removed`
    * parameter in the function {@link XPackageRegistry.bindPackage()} .
    */
  def isRemoved(): Boolean
  
  /**
    * registers this {@link XPackage} .
    *
    * NEVER call this directly. This is done by the extension manager if necessary.
    * @param startup indicates that registration is adapted to the particular startup scenario. That is, it is set to `TRUE` , when called from {@link XExtens
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    */
  def registerPackage(startup: Boolean, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit
  
  /**
    * revokes this {@link XPackage} .
    *
    * NEVER call this directly. This is done by the extension manager if necessary.
    * @param startup indicates that registration is adapted to the particular startup scenario. That is, it is set to `TRUE` , when called from {@link XExtens
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    */
  def revokePackage(startup: Boolean, xAbortChannel: XAbortChannel, xCmdEnv: XCommandEnvironment): Unit
}
object XPackage {
  
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    Identifier: Optional[String],
    LicenseText: String,
    Name: String,
    PackageType: XPackageTypeInfo,
    PublisherInfo: StringPair,
    RegistrationDataURL: Optional[String],
    RepositoryName: String,
    URL: String,
    UpdateInformationURLs: SafeArray[String],
    Version: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    checkDependencies: XCommandEnvironment => Boolean,
    checkPrerequisites: (XAbortChannel, XCommandEnvironment, Boolean) => Double,
    createAbortChannel: () => XAbortChannel,
    dispose: () => Unit,
    exportTo: (String, String, Double, XCommandEnvironment) => Unit,
    getBundle: (XAbortChannel, XCommandEnvironment) => SafeArray[XPackage],
    getDescription: () => String,
    getDisplayName: () => String,
    getIcon: Boolean => XGraphic,
    getIdentifier: () => Optional[String],
    getLicenseText: () => String,
    getName: () => String,
    getPackageType: () => XPackageTypeInfo,
    getPublisherInfo: () => StringPair,
    getRegistrationDataURL: () => Optional[String],
    getRepositoryName: () => String,
    getURL: () => String,
    getUpdateInformationURLs: () => SafeArray[String],
    getVersion: () => String,
    isBundle: () => Boolean,
    isRegistered: (XAbortChannel, XCommandEnvironment) => Optional[Ambiguous[Boolean]],
    isRemoved: () => Boolean,
    queryInterface: `type` => js.Any,
    registerPackage: (Boolean, XAbortChannel, XCommandEnvironment) => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    revokePackage: (Boolean, XAbortChannel, XCommandEnvironment) => Unit
  ): XPackage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], LicenseText = LicenseText.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PackageType = PackageType.asInstanceOf[js.Any], PublisherInfo = PublisherInfo.asInstanceOf[js.Any], RegistrationDataURL = RegistrationDataURL.asInstanceOf[js.Any], RepositoryName = RepositoryName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UpdateInformationURLs = UpdateInformationURLs.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), checkDependencies = js.Any.fromFunction1(checkDependencies), checkPrerequisites = js.Any.fromFunction3(checkPrerequisites), createAbortChannel = js.Any.fromFunction0(createAbortChannel), dispose = js.Any.fromFunction0(dispose), exportTo = js.Any.fromFunction4(exportTo), getBundle = js.Any.fromFunction2(getBundle), getDescription = js.Any.fromFunction0(getDescription), getDisplayName = js.Any.fromFunction0(getDisplayName), getIcon = js.Any.fromFunction1(getIcon), getIdentifier = js.Any.fromFunction0(getIdentifier), getLicenseText = js.Any.fromFunction0(getLicenseText), getName = js.Any.fromFunction0(getName), getPackageType = js.Any.fromFunction0(getPackageType), getPublisherInfo = js.Any.fromFunction0(getPublisherInfo), getRegistrationDataURL = js.Any.fromFunction0(getRegistrationDataURL), getRepositoryName = js.Any.fromFunction0(getRepositoryName), getURL = js.Any.fromFunction0(getURL), getUpdateInformationURLs = js.Any.fromFunction0(getUpdateInformationURLs), getVersion = js.Any.fromFunction0(getVersion), isBundle = js.Any.fromFunction0(isBundle), isRegistered = js.Any.fromFunction2(isRegistered), isRemoved = js.Any.fromFunction0(isRemoved), queryInterface = js.Any.fromFunction1(queryInterface), registerPackage = js.Any.fromFunction3(registerPackage), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), revokePackage = js.Any.fromFunction3(revokePackage))
    __obj.asInstanceOf[XPackage]
  }
  
  @scala.inline
  implicit class XPackageMutableBuilder[Self <: XPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckDependencies(value: XCommandEnvironment => Boolean): Self = StObject.set(x, "checkDependencies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckPrerequisites(value: (XAbortChannel, XCommandEnvironment, Boolean) => Double): Self = StObject.set(x, "checkPrerequisites", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateAbortChannel(value: () => XAbortChannel): Self = StObject.set(x, "createAbortChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTo(value: (String, String, Double, XCommandEnvironment) => Unit): Self = StObject.set(x, "exportTo", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetBundle(value: (XAbortChannel, XCommandEnvironment) => SafeArray[XPackage]): Self = StObject.set(x, "getBundle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayName(value: () => String): Self = StObject.set(x, "getDisplayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIcon(value: Boolean => XGraphic): Self = StObject.set(x, "getIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIdentifier(value: () => Optional[String]): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLicenseText(value: () => String): Self = StObject.set(x, "getLicenseText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPackageType(value: () => XPackageTypeInfo): Self = StObject.set(x, "getPackageType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPublisherInfo(value: () => StringPair): Self = StObject.set(x, "getPublisherInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRegistrationDataURL(value: () => Optional[String]): Self = StObject.set(x, "getRegistrationDataURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRepositoryName(value: () => String): Self = StObject.set(x, "getRepositoryName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdateInformationURLs(value: () => SafeArray[String]): Self = StObject.set(x, "getUpdateInformationURLs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdentifier(value: Optional[String]): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundle(value: () => Boolean): Self = StObject.set(x, "isBundle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRegistered(value: (XAbortChannel, XCommandEnvironment) => Optional[Ambiguous[Boolean]]): Self = StObject.set(x, "isRegistered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsRemoved(value: () => Boolean): Self = StObject.set(x, "isRemoved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLicenseText(value: String): Self = StObject.set(x, "LicenseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageType(value: XPackageTypeInfo): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherInfo(value: StringPair): Self = StObject.set(x, "PublisherInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterPackage(value: (Boolean, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "registerPackage", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegistrationDataURL(value: Optional[String]): Self = StObject.set(x, "RegistrationDataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: String): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokePackage(value: (Boolean, XAbortChannel, XCommandEnvironment) => Unit): Self = StObject.set(x, "revokePackage", js.Any.fromFunction3(value))
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInformationURLs(value: SafeArray[String]): Self = StObject.set(x, "UpdateInformationURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
