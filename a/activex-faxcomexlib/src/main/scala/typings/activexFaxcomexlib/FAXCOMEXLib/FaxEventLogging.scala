package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxEventLogging Class */
trait FaxEventLogging extends StObject {
  
  /* private */ @JSName("FAXCOMEXLib.FaxEventLogging_typekey")
  var FAXCOMEXLibDotFaxEventLogging_typekey: FaxEventLogging
  
  /** Detail level of event logs for general (other) events */
  var GeneralEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for inbound fax events */
  var InboundEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for initialization events */
  var InitEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Detail level of event logs for outbound fax events */
  var OutboundEventsLevel: FAX_LOG_LEVEL_ENUM
  
  /** Refresh the object */
  def Refresh(): Unit
  
  /** Save the object */
  def Save(): Unit
}
object FaxEventLogging {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FaxEventLogging] (val x: Self) extends AnyVal {
    
    inline def setFAXCOMEXLibDotFaxEventLogging_typekey(value: FaxEventLogging): Self = StObject.set(x, "FAXCOMEXLib.FaxEventLogging_typekey", value.asInstanceOf[js.Any])
    
    inline def setGeneralEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "GeneralEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setInboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InboundEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setInitEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "InitEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setOutboundEventsLevel(value: FAX_LOG_LEVEL_ENUM): Self = StObject.set(x, "OutboundEventsLevel", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
