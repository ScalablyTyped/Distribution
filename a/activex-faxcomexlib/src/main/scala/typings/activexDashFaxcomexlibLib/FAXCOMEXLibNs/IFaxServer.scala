package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

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
  val Debug: scala.Boolean = js.native
  /** The fax folders object */
  val Folders: FaxFolders = js.native
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting = js.native
  /** The logging options configuration object */
  val LoggingOptions: FaxLoggingOptions = js.native
  /** The major part of the fax server's build number */
  val MajorBuild: scala.Double = js.native
  /** The major part of the fax server's version number */
  val MajorVersion: scala.Double = js.native
  /** The minor part of the fax server's build number */
  val MinorBuild: scala.Double = js.native
  /** The minor part of the fax server's version number */
  val MinorVersion: scala.Double = js.native
  /** The outbound routing configuration object */
  val OutboundRouting: FaxOutboundRouting = js.native
  /** The receipt options configuration object */
  val ReceiptOptions: FaxReceiptOptions = js.native
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  /** The security configuration object */
  val Security: FaxSecurity = js.native
  /** The name of the fax server */
  val ServerName: java.lang.String = js.native
  /** Connect to the fax server */
  def Connect(bstrServerName: java.lang.String): scala.Unit = js.native
  /** Disconnect from the fax server */
  def Disconnect(): scala.Unit = js.native
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders = js.native
  /** The collection of all available devices */
  def GetDevices(): FaxDevices = js.native
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: java.lang.String): js.Any = js.native
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): scala.Unit = js.native
  /** Register device provider */
  def RegisterDeviceProvider(
    bstrGUID: java.lang.String,
    bstrFriendlyName: java.lang.String,
    bstrImageName: java.lang.String,
    TspName: java.lang.String,
    lFSPIVersion: scala.Double
  ): scala.Unit = js.native
  /** Register inbound routing extension */
  def RegisterInboundRoutingExtension(
    bstrExtensionName: java.lang.String,
    bstrFriendlyName: java.lang.String,
    bstrImageName: java.lang.String,
    vMethods: js.Any
  ): scala.Unit = js.native
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: java.lang.String, vProperty: stdLib.SafeArray[_]): scala.Unit = js.native
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: java.lang.String): scala.Unit = js.native
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: java.lang.String): scala.Unit = js.native
}

