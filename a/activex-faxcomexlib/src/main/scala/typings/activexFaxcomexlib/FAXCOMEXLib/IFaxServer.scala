package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxServer interface */
trait IFaxServer extends js.Object {
  /** Version of the fax server API */
  val APIVersion: FAX_SERVER_APIVERSION_ENUM
  /** The fax server activity status object */
  val Activity: FaxActivity
  /** Is fax server built in debug environment */
  val Debug: Boolean
  /** The fax folders object */
  val Folders: FaxFolders
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting
  /** The logging options configuration object */
  val LoggingOptions: FaxLoggingOptions
  /** The major part of the fax server's build number */
  val MajorBuild: Double
  /** The major part of the fax server's version number */
  val MajorVersion: Double
  /** The minor part of the fax server's build number */
  val MinorBuild: Double
  /** The minor part of the fax server's version number */
  val MinorVersion: Double
  /** The outbound routing configuration object */
  val OutboundRouting: FaxOutboundRouting
  /** The receipt options configuration object */
  val ReceiptOptions: FaxReceiptOptions
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM
  /** The security configuration object */
  val Security: FaxSecurity
  /** The name of the fax server */
  val ServerName: String
  /** Connect to the fax server */
  def Connect(bstrServerName: String): Unit
  /** Disconnect from the fax server */
  def Disconnect(): Unit
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders
  /** The collection of all available devices */
  def GetDevices(): FaxDevices
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: String): js.Any
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit
  /** Register device provider */
  def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit
  /** Register inbound routing extension */
  def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: js.Any): Unit
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: String): Unit
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit
}

object IFaxServer {
  @scala.inline
  def apply(
    APIVersion: FAX_SERVER_APIVERSION_ENUM,
    Activity: FaxActivity,
    Connect: String => Unit,
    Debug: Boolean,
    Disconnect: () => Unit,
    Folders: FaxFolders,
    GetDeviceProviders: () => FaxDeviceProviders,
    GetDevices: () => FaxDevices,
    GetExtensionProperty: String => js.Any,
    InboundRouting: FaxInboundRouting,
    ListenToServerEvents: FAX_SERVER_EVENTS_TYPE_ENUM => Unit,
    LoggingOptions: FaxLoggingOptions,
    MajorBuild: Double,
    MajorVersion: Double,
    MinorBuild: Double,
    MinorVersion: Double,
    OutboundRouting: FaxOutboundRouting,
    ReceiptOptions: FaxReceiptOptions,
    RegisterDeviceProvider: (String, String, String, String, Double) => Unit,
    RegisterInboundRoutingExtension: (String, String, String, js.Any) => Unit,
    RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM,
    Security: FaxSecurity,
    ServerName: String,
    SetExtensionProperty: (String, SafeArray[_]) => Unit,
    UnregisterDeviceProvider: String => Unit,
    UnregisterInboundRoutingExtension: String => Unit
  ): IFaxServer = {
    val __obj = js.Dynamic.literal(APIVersion = APIVersion.asInstanceOf[js.Any], Activity = Activity.asInstanceOf[js.Any], Connect = js.Any.fromFunction1(Connect), Debug = Debug.asInstanceOf[js.Any], Disconnect = js.Any.fromFunction0(Disconnect), Folders = Folders.asInstanceOf[js.Any], GetDeviceProviders = js.Any.fromFunction0(GetDeviceProviders), GetDevices = js.Any.fromFunction0(GetDevices), GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), InboundRouting = InboundRouting.asInstanceOf[js.Any], ListenToServerEvents = js.Any.fromFunction1(ListenToServerEvents), LoggingOptions = LoggingOptions.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], OutboundRouting = OutboundRouting.asInstanceOf[js.Any], ReceiptOptions = ReceiptOptions.asInstanceOf[js.Any], RegisterDeviceProvider = js.Any.fromFunction5(RegisterDeviceProvider), RegisterInboundRoutingExtension = js.Any.fromFunction4(RegisterInboundRoutingExtension), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), UnregisterDeviceProvider = js.Any.fromFunction1(UnregisterDeviceProvider), UnregisterInboundRoutingExtension = js.Any.fromFunction1(UnregisterInboundRoutingExtension))
    __obj.asInstanceOf[IFaxServer]
  }
}

