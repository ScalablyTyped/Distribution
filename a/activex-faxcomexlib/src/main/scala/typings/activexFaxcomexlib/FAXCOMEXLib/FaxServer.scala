package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxServer Class */
trait FaxServer
  extends StObject
     with IFaxServer {
  
  /** Fax server configuration */
  val Configuration: FaxConfiguration
  
  /** FaxAccount for the current connection */
  val CurrentAccount: FaxAccount
  
  /* private */ @JSName("FAXCOMEXLib.FaxServer_typekey")
  var FAXCOMEXLibDotFaxServer_typekey: FaxServer
  
  /** The FaxAccountSet configuration object */
  val FaxAccountSet: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountSet
  
  /** The security configuration object */
  val Security2: FaxSecurity2
}
object FaxServer {
  
  inline def apply(
    APIVersion: FAX_SERVER_APIVERSION_ENUM,
    Activity: FaxActivity,
    Configuration: FaxConfiguration,
    Connect: String => Unit,
    CurrentAccount: FaxAccount,
    Debug: Boolean,
    Disconnect: () => Unit,
    FAXCOMEXLibDotFaxServer_typekey: FaxServer,
    FaxAccountSet: FaxAccountSet,
    Folders: FaxFolders,
    GetDeviceProviders: () => FaxDeviceProviders,
    GetDevices: () => FaxDevices,
    GetExtensionProperty: String => Any,
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
    RegisterInboundRoutingExtension: (String, String, String, Any) => Unit,
    RegisteredEvents: FAX_SERVER_EVENTS_TYPE_ENUM,
    Security: FaxSecurity,
    Security2: FaxSecurity2,
    ServerName: String,
    SetExtensionProperty: (String, SafeArray[Any]) => Unit,
    UnregisterDeviceProvider: String => Unit,
    UnregisterInboundRoutingExtension: String => Unit
  ): FaxServer = {
    val __obj = js.Dynamic.literal(APIVersion = APIVersion.asInstanceOf[js.Any], Activity = Activity.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Connect = js.Any.fromFunction1(Connect), CurrentAccount = CurrentAccount.asInstanceOf[js.Any], Debug = Debug.asInstanceOf[js.Any], Disconnect = js.Any.fromFunction0(Disconnect), FaxAccountSet = FaxAccountSet.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], GetDeviceProviders = js.Any.fromFunction0(GetDeviceProviders), GetDevices = js.Any.fromFunction0(GetDevices), GetExtensionProperty = js.Any.fromFunction1(GetExtensionProperty), InboundRouting = InboundRouting.asInstanceOf[js.Any], ListenToServerEvents = js.Any.fromFunction1(ListenToServerEvents), LoggingOptions = LoggingOptions.asInstanceOf[js.Any], MajorBuild = MajorBuild.asInstanceOf[js.Any], MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorBuild = MinorBuild.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], OutboundRouting = OutboundRouting.asInstanceOf[js.Any], ReceiptOptions = ReceiptOptions.asInstanceOf[js.Any], RegisterDeviceProvider = js.Any.fromFunction5(RegisterDeviceProvider), RegisterInboundRoutingExtension = js.Any.fromFunction4(RegisterInboundRoutingExtension), RegisteredEvents = RegisteredEvents.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], Security2 = Security2.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], SetExtensionProperty = js.Any.fromFunction2(SetExtensionProperty), UnregisterDeviceProvider = js.Any.fromFunction1(UnregisterDeviceProvider), UnregisterInboundRoutingExtension = js.Any.fromFunction1(UnregisterInboundRoutingExtension))
    __obj.updateDynamic("FAXCOMEXLib.FaxServer_typekey")(FAXCOMEXLibDotFaxServer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxServer]
  }
  
  extension [Self <: FaxServer](x: Self) {
    
    inline def setConfiguration(value: FaxConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setCurrentAccount(value: FaxAccount): Self = StObject.set(x, "CurrentAccount", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxServer_typekey(value: FaxServer): Self = StObject.set(x, "FAXCOMEXLib.FaxServer_typekey", value.asInstanceOf[js.Any])
    
    inline def setFaxAccountSet(value: FaxAccountSet): Self = StObject.set(x, "FaxAccountSet", value.asInstanceOf[js.Any])
    
    inline def setSecurity2(value: FaxSecurity2): Self = StObject.set(x, "Security2", value.asInstanceOf[js.Any])
  }
}
