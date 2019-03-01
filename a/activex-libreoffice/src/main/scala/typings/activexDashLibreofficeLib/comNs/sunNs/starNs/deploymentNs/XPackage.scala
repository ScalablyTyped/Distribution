package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.deploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects of this interface reflect a bound package and are issued by a {@link PackageRegistryBackend} .
  * @since OOo 2.0
  */
trait XPackage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster {
  /**
    * returns a description string to describe the package.
    * @returns description
    */
  val Description: java.lang.String
  /**
    * returns the display name of the package, e.g. for graphical user interfaces (GUI).
    * @returns display name of the package
    */
  val DisplayName: java.lang.String
  /**
    * returns the unique extension identifier.
    * @returns the extension identifier (a `"org.openoffice.legacy."` one if the extension does not explicitly specify one), or an empty `Optional` if this pack
    */
  val Identifier: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
  /**
    * returns a string containing the license text.
    * @returns license
    */
  val LicenseText: java.lang.String
  /**
    * returns the file name of the package.
    * @returns file name of the package
    */
  val Name: java.lang.String
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
  val PublisherInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair
  /**
    * return a URL to a directory which contains the registration data.
    *
    * This data may be created when calling {@link XPackage.registerPackage()} . If this is the case is indicated by
    * com::sun::star::beans::Optional::IsPresent of the return value. If registration data are created during registration, but the package is currently not
    * registered, for example after calling {@link XPackage.revokePackage()} , then com::sun::star::beans::Optional::IsPresent is `TRUE` and the
    * com::sun::star::beans::Optional::Value may be an empty string.
    */
  val RegistrationDataURL: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
  /** returns the name of the repository where this object comes from. */
  val RepositoryName: java.lang.String
  /**
    * returns the location of the package.
    * @returns location of package
    */
  val URL: java.lang.String
  /**
    * returns a sequence of update information URLs.
    *
    * The sequence may be empty in case no update information is available. If the sequence contains more than one URL, the extra URLs must mirror the
    * information available at the first URL.
    * @returns update information URLs
    */
  val UpdateInformationURLs: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns the textual version representation of the package.
    *
    * A textual version representation is a finite string following the BNF ;  version ::= [element ("." element)*] ;  element ::= ("0" | "1" | "2" | "3" |
    * "4" | "5" | "6" | "7" | "8" | "9")+
    * @returns the textual version representation
    */
  val Version: java.lang.String
  /**
    * checks if the dependencies for this package are still satisfied
    *
    * After updating the OpenOffice.org, some dependencies for packages might no longer be satisfied.
    * @param xCmdEnv command environment for error handling and other interaction.
    * @returns `TRUE` - all dependencies are satisfied `FALSE` - at least one dependency failed.
    * @since OOo 3.2
    */
  def checkDependencies(xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment): scala.Boolean
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
  def checkPrerequisites(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment,
    alreadyInstalled: scala.Boolean
  ): scala.Double
  /**
    * creates a command channel to be used to asynchronously abort a command.
    * @returns abort channel
    */
  def createAbortChannel(): activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel
  /**
    * exports package to given destination URL.
    * @param destFolderURL package destination folder URL, must be UCB conforming
    * @param newTitle new package name
    * @param nameClashAction one of {@link com.sun.star.ucb.NameClash}
    * @param xCmdEnv command environment for error and progress handling
    */
  def exportTo(
    destFolderURL: java.lang.String,
    newTitle: java.lang.String,
    nameClashAction: scala.Double,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * Gets packages of the bundle.
    *
    * If {@link isRemoved()} returns `TRUE` then getBundle may return an empty sequence in case the object is not registered.
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    * @returns set of packages enclosed in this package
    */
  def getBundle(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashInteropLib.SafeArray[XPackage]
  /**
    * returns a description string to describe the package.
    * @returns description
    */
  def getDescription(): java.lang.String
  /**
    * returns the display name of the package, e.g. for graphical user interfaces (GUI).
    * @returns display name of the package
    */
  def getDisplayName(): java.lang.String
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @returns the icon which should be used to represent the table in the database application window, or `NULL` if the default icon should be used.
    */
  def getIcon(highContrast: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /**
    * returns the unique extension identifier.
    * @returns the extension identifier (a `"org.openoffice.legacy."` one if the extension does not explicitly specify one), or an empty `Optional` if this pack
    */
  def getIdentifier(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
  /**
    * returns a string containing the license text.
    * @returns license
    */
  def getLicenseText(): java.lang.String
  /**
    * returns the file name of the package.
    * @returns file name of the package
    */
  def getName(): java.lang.String
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
  def getPublisherInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair
  /**
    * return a URL to a directory which contains the registration data.
    *
    * This data may be created when calling {@link XPackage.registerPackage()} . If this is the case is indicated by
    * com::sun::star::beans::Optional::IsPresent of the return value. If registration data are created during registration, but the package is currently not
    * registered, for example after calling {@link XPackage.revokePackage()} , then com::sun::star::beans::Optional::IsPresent is `TRUE` and the
    * com::sun::star::beans::Optional::Value may be an empty string.
    */
  def getRegistrationDataURL(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]
  /** returns the name of the repository where this object comes from. */
  def getRepositoryName(): java.lang.String
  /**
    * returns the location of the package.
    * @returns location of package
    */
  def getURL(): java.lang.String
  /**
    * returns a sequence of update information URLs.
    *
    * The sequence may be empty in case no update information is available. If the sequence contains more than one URL, the extra URLs must mirror the
    * information available at the first URL.
    * @returns update information URLs
    */
  def getUpdateInformationURLs(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns the textual version representation of the package.
    *
    * A textual version representation is a finite string following the BNF ;  version ::= [element ("." element)*] ;  element ::= ("0" | "1" | "2" | "3" |
    * "4" | "5" | "6" | "7" | "8" | "9")+
    * @returns the textual version representation
    */
  def getVersion(): java.lang.String
  /**
    * reflects whether this package is a bundle of one or more packages, e.g. a zip (legacy) package file or a document hosting script packages.
    * @returns `TRUE` if this package is a package bundle, `FALSE` otherwise
    */
  def isBundle(): scala.Boolean
  /**
    * determines whether the package is currently registered, i.e. whether it is active.
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    * @returns status whether the package is registered ( `TRUE` , `FALSE` ) or the status is ambiguous. Additionally, a registration status may not apply, e.g.
    */
  def isRegistered(
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Ambiguous[scala.Boolean]]
  /**
    * indicates if this object represents a removed extension or extension item. This is the case when it was created by providing `TRUE` for the `removed`
    * parameter in the function {@link XPackageRegistry.bindPackage()} .
    */
  def isRemoved(): scala.Boolean
  /**
    * registers this {@link XPackage} .
    *
    * NEVER call this directly. This is done by the extension manager if necessary.
    * @param startup indicates that registration is adapted to the particular startup scenario. That is, it is set to `TRUE` , when called from {@link XExtens
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    */
  def registerPackage(
    startup: scala.Boolean,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
  /**
    * revokes this {@link XPackage} .
    *
    * NEVER call this directly. This is done by the extension manager if necessary.
    * @param startup indicates that registration is adapted to the particular startup scenario. That is, it is set to `TRUE` , when called from {@link XExtens
    * @param xAbortChannel abort channel to asynchronously abort the registration process, or `NULL`
    * @param xCmdEnv command environment for error and progress handling
    */
  def revokePackage(
    startup: scala.Boolean,
    xAbortChannel: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel,
    xCmdEnv: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
  ): scala.Unit
}

object XPackage {
  @scala.inline
  def apply(
    Description: java.lang.String,
    DisplayName: java.lang.String,
    Identifier: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String],
    LicenseText: java.lang.String,
    Name: java.lang.String,
    PackageType: XPackageTypeInfo,
    PublisherInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair,
    RegistrationDataURL: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String],
    RepositoryName: java.lang.String,
    URL: java.lang.String,
    UpdateInformationURLs: activexDashInteropLib.SafeArray[java.lang.String],
    Version: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    checkDependencies: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Boolean
    ],
    checkPrerequisites: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Boolean, 
      scala.Double
    ],
    createAbortChannel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel],
    dispose: js.Function0[scala.Unit],
    exportTo: js.Function4[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    getBundle: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashInteropLib.SafeArray[XPackage]
    ],
    getDescription: js.Function0[java.lang.String],
    getDisplayName: js.Function0[java.lang.String],
    getIcon: js.Function1[scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic],
    getIdentifier: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]],
    getLicenseText: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getPackageType: js.Function0[XPackageTypeInfo],
    getPublisherInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair],
    getRegistrationDataURL: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[java.lang.String]],
    getRepositoryName: js.Function0[java.lang.String],
    getURL: js.Function0[java.lang.String],
    getUpdateInformationURLs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getVersion: js.Function0[java.lang.String],
    isBundle: js.Function0[scala.Boolean],
    isRegistered: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Optional[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Ambiguous[scala.Boolean]]
    ],
    isRemoved: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerPackage: js.Function3[
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    revokePackage: js.Function3[
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XAbortChannel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      scala.Unit
    ]
  ): XPackage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("Identifier")(Identifier)
    __obj.updateDynamic("LicenseText")(LicenseText)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PackageType")(PackageType)
    __obj.updateDynamic("PublisherInfo")(PublisherInfo)
    __obj.updateDynamic("RegistrationDataURL")(RegistrationDataURL)
    __obj.updateDynamic("RepositoryName")(RepositoryName)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("UpdateInformationURLs")(UpdateInformationURLs)
    __obj.updateDynamic("Version")(Version)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("checkDependencies")(checkDependencies)
    __obj.updateDynamic("checkPrerequisites")(checkPrerequisites)
    __obj.updateDynamic("createAbortChannel")(createAbortChannel)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("exportTo")(exportTo)
    __obj.updateDynamic("getBundle")(getBundle)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getDisplayName")(getDisplayName)
    __obj.updateDynamic("getIcon")(getIcon)
    __obj.updateDynamic("getIdentifier")(getIdentifier)
    __obj.updateDynamic("getLicenseText")(getLicenseText)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPackageType")(getPackageType)
    __obj.updateDynamic("getPublisherInfo")(getPublisherInfo)
    __obj.updateDynamic("getRegistrationDataURL")(getRegistrationDataURL)
    __obj.updateDynamic("getRepositoryName")(getRepositoryName)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("getUpdateInformationURLs")(getUpdateInformationURLs)
    __obj.updateDynamic("getVersion")(getVersion)
    __obj.updateDynamic("isBundle")(isBundle)
    __obj.updateDynamic("isRegistered")(isRegistered)
    __obj.updateDynamic("isRemoved")(isRemoved)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerPackage")(registerPackage)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("revokePackage")(revokePackage)
    __obj.asInstanceOf[XPackage]
  }
}

