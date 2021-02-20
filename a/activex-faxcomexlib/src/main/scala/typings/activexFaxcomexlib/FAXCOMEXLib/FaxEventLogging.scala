package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxEventLogging Class */
@js.native
trait FaxEventLogging extends StObject {
  
  @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging = js.native
  
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM = js.native
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
}
object FaxEventLogging {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging,
    GeneralEventsLevel: FAX_LOG_LEVEL_ENUM,
    InboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    InitEventsLevel: FAX_LOG_LEVEL_ENUM,
    OutboundEventsLevel: FAX_LOG_LEVEL_ENUM,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxEventLogging = {
    val __obj = js.Dynamic.literal(GeneralEventsLevel = GeneralEventsLevel.asInstanceOf[js.Any], InboundEventsLevel = InboundEventsLevel.asInstanceOf[js.Any], InitEventsLevel = InitEventsLevel.asInstanceOf[js.Any], OutboundEventsLevel = OutboundEventsLevel.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxEventLogging_typekey")(FAXCOMEXLibDotFaxEventLogging_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxEventLogging]
  }
  
  @scala.inline
  implicit class FaxEventLoggingMutableBuilder[Self <: FaxEventLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxEventLogging_typekey(value: FaxEventLogging): Self = StObject.set(x, "FAXCOMEXLib.FaxEventLogging_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "GeneralEventsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InboundEventsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InitEventsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "OutboundEventsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
