package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxLoggingOptions Class */
@js.native
trait FaxLoggingOptions extends StObject {
  
  /** Activity logging configuration object */
  val ActivityLogging: FaxActivityLogging = js.native
  
  /** Event logging configuration object */
  val EventLogging: FaxEventLogging = js.native
  
  @JSName("FAXCOMEXLib.FaxLoggingOptions_typekey")
  var FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions = js.native
}
object FaxLoggingOptions {
  
  @scala.inline
  def apply(
    ActivityLogging: FaxActivityLogging,
    EventLogging: FaxEventLogging,
    FAXCOMEXLibDotFaxLoggingOptions_typekey: FaxLoggingOptions
  ): FaxLoggingOptions = {
    val __obj = js.Dynamic.literal(ActivityLogging = ActivityLogging.asInstanceOf[js.Any], EventLogging = EventLogging.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxLoggingOptions_typekey")(FAXCOMEXLibDotFaxLoggingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxLoggingOptions]
  }
  
  @scala.inline
  implicit class FaxLoggingOptionsMutableBuilder[Self <: FaxLoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityLogging(value: FaxActivityLogging): Self = StObject.set(x, "ActivityLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLogging(value: FaxEventLogging): Self = StObject.set(x, "EventLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxLoggingOptions_typekey(value: FaxLoggingOptions): Self = StObject.set(x, "FAXCOMEXLib.FaxLoggingOptions_typekey", value.asInstanceOf[js.Any])
  }
}
