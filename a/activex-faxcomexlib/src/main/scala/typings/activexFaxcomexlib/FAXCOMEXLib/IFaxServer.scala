package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IFaxServer interface */
@js.native
trait IFaxServer extends js.Object {
  
  /** Version of the fax server API */
  val APIVersion: FAX_SERVER_APIVERSION_ENUM = js.native
  
  /** The fax server activity status object */
  val Activity: FaxActivity = js.native
  
  /** Connect to the fax server */
  def Connect(bstrServerName: String): Unit = js.native
  
  /** Is fax server built in debug environment */
  val Debug: Boolean = js.native
  
  /** Disconnect from the fax server */
  def Disconnect(): Unit = js.native
  
  /** The fax folders object */
  val Folders: FaxFolders = js.native
  
  /** The collection of device providers */
  def GetDeviceProviders(): FaxDeviceProviders = js.native
  
  /** The collection of all available devices */
  def GetDevices(): FaxDevices = js.native
  
  /** Return server level extention property */
  def GetExtensionProperty(bstrGUID: String): js.Any = js.native
  
  /** The inbound routing configuration object */
  val InboundRouting: FaxInboundRouting = js.native
  
  /** Set bit-wise combination of events the fax server listens to */
  def ListenToServerEvents(EventTypes: FAX_SERVER_EVENTS_TYPE_ENUM): Unit = js.native
  
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
  
  /** Events the fax Server is listening to */
  val RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM = js.native
  
  /** The security configuration object */
  val Security: FaxSecurity = js.native
  
  /** The name of the fax server */
  val ServerName: String = js.native
  
  /** Set server level extention property */
  def SetExtensionProperty(bstrGUID: String, vProperty: SafeArray[_]): Unit = js.native
  
  /** Unregister device provider */
  def UnregisterDeviceProvider(bstrUniqueName: String): Unit = js.native
  
  /** Unregister inbound routing extension */
  def UnregisterInboundRoutingExtension(bstrExtensionUniqueName: String): Unit = js.native
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
  
  @scala.inline
  implicit class IFaxServerOps[Self <: IFaxServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAPIVersion(value: FAX_SERVER_APIVERSION_ENUM): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivity(value: FaxActivity): Self = this.set("Activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect(value: String => Unit): Self = this.set("Connect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("Debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("Disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFolders(value: FaxFolders): Self = this.set("Folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeviceProviders(value: () => FaxDeviceProviders): Self = this.set("GetDeviceProviders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDevices(value: () => FaxDevices): Self = this.set("GetDevices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtensionProperty(value: String => js.Any): Self = this.set("GetExtensionProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInboundRouting(value: FaxInboundRouting): Self = this.set("InboundRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenToServerEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM => Unit): Self = this.set("ListenToServerEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggingOptions(value: FaxLoggingOptions): Self = this.set("LoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorBuild(value: Double): Self = this.set("MajorBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("MajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorBuild(value: Double): Self = this.set("MinorBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundRouting(value: FaxOutboundRouting): Self = this.set("OutboundRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptOptions(value: FaxReceiptOptions): Self = this.set("ReceiptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterDeviceProvider(value: (String, String, String, String, Double) => Unit): Self = this.set("RegisterDeviceProvider", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRegisterInboundRoutingExtension(value: (String, String, String, js.Any) => Unit): Self = this.set("RegisterInboundRoutingExtension", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRegisteredEvents(value: FAX_SERVER_EVENTS_TYPE_ENUM): Self = this.set("RegisteredEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity(value: FaxSecurity): Self = this.set("Security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExtensionProperty(value: (String, SafeArray[_]) => Unit): Self = this.set("SetExtensionProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregisterDeviceProvider(value: String => Unit): Self = this.set("UnregisterDeviceProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterInboundRoutingExtension(value: String => Unit): Self = this.set("UnregisterInboundRoutingExtension", js.Any.fromFunction1(value))
  }
}
