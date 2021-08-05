package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxLoggingOptions Class */
trait FaxLoggingOptions extends StObject {
  
  /** Activity logging configuration object */
  val ActivityLogging: FaxActivityLogging
  
  /** Event logging configuration object */
  val EventLogging: FaxEventLogging
  
  /* private */ @JSName("FAXCOMEXLib.FaxLoggingOptions_typekey")
  var FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions
}
object FaxLoggingOptions {
  
  inline def apply(
    ActivityLogging: FaxActivityLogging,
    EventLogging: FaxEventLogging,
    FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions
  ): FaxLoggingOptions = {
    val __obj = js.Dynamic.literal(ActivityLogging = ActivityLogging.asInstanceOf[js.Any], EventLogging = EventLogging.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxLoggingOptions_typekey")(FAXCOMEXLibDotFaxLoggingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxLoggingOptions]
  }
  
  extension [Self <: FaxLoggingOptions](x: Self) {
    
    inline def setActivityLogging(value: FaxActivityLogging): Self = StObject.set(x, "ActivityLogging", value.asInstanceOf[js.Any])
    
    inline def setEventLogging(value: FaxEventLogging): Self = StObject.set(x, "EventLogging", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxLoggingOptions_typekey(value: FaxLoggingOptions): Self = StObject.set(x, "FAXCOMEXLib.FaxLoggingOptions_typekey", value.asInstanceOf[js.Any])
  }
}
