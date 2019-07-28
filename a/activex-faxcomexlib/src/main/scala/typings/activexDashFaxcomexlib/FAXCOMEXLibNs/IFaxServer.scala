package typings.activexDashFaxcomexlib.FAXCOMEXLibNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IFaxServer interface */
@JSGlobal("FAXCOMEXLib.IFaxServer")
@js.native
class IFaxServer () extends js.Object {
  /** Version of the fax server API */
  val APIVersion: FAX_SERVER_APIVERSION_ENUM = js.native
  /** The fax server activity status object */
  val Activity: FaxActivity = js.native
  /** Is fax server built in debug environment */
  val Debug: Boolean = js.native
  /** The fax folders object */
  val Folders: FaxFolders = js.native
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting = js.native
  /** The logging options configuration object */
  val LoggingOptions: FaxLoggingOptions = js.native
  /** The major part of the fax server's build number */
  val MajorBuild: Double = js.native
  /** The major part of the fax server's version number */
  val MajorVersion: Double = js.native
  /** The minor part of the fax server's build number */
  val MinorBuild: Double = js.native
  /** The minor part of the fax server's version number */
  val MinorVersion: Double = js.native
  /** The outbound routing configuration object */
  val OutboundRouting: FaxOutboundRouting = js.native
  /** The receipt options configuration object */
  val ReceiptOptions: FaxReceiptOptions = js.native
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  /** The security configuration object */
  val Security: FaxSecurity = js.native
  /** The name of the fax server */
  val ServerName: String = js.native
  /** Connect to the fax server */
  def Connect(bstrServerName: String): Unit = js.native
  /** Disconnect from the fax server */
  def Disconnect(): Unit = js.native
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders = js.native
  /** The collection of all available devices */
  def GetDevices(): FaxDevices = js.native
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: String): js.Any = js.native
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit = js.native
  /** Register device provider */
  def RegisterDeviceProvider(
    bstrGUID: String,
    bstrFriendlyName: String,
    bstrImageName: String,
    TspName: String,
    lFSPIVersion: Double
  ): Unit = js.native
  /** Register inbound routing extension */
  def RegisterInboundRoutingExtension(bstrExtensionName: String, bstrFriendlyName: String, bstrImageName: String, vMethods: js.Any): Unit = js.native
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: String): Unit = js.native
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit = js.native
}

