package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Time extends StObject {
  
  /**
    * Represents an order-event time like reservation time, delivery time and so
    * on. Could be a duration (start & end time), just the date, date time etc.
    * Refer https://en.wikipedia.org/wiki/ISO_8601 for all supported formats.
    */
  var timeIso8601: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3Time {
  
  inline def apply(): GoogleActionsOrdersV3Time = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Time]
  }
  
  extension [Self <: GoogleActionsOrdersV3Time](x: Self) {
    
    inline def setTimeIso8601(value: String): Self = StObject.set(x, "timeIso8601", value.asInstanceOf[js.Any])
    
    inline def setTimeIso8601Undefined: Self = StObject.set(x, "timeIso8601", js.undefined)
  }
}
