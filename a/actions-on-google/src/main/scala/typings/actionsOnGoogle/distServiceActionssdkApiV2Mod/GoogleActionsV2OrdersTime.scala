package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersTime extends StObject {
  
  /**
    * ISO 8601 representation of time indicator: could be a duration, date or
    * exact datetime.
    */
  var timeIso8601: js.UndefOr[String] = js.undefined
  
  /**
    * Type of time indicator.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersTimeType] = js.undefined
}
object GoogleActionsV2OrdersTime {
  
  inline def apply(): GoogleActionsV2OrdersTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersTime] (val x: Self) extends AnyVal {
    
    inline def setTimeIso8601(value: String): Self = StObject.set(x, "timeIso8601", value.asInstanceOf[js.Any])
    
    inline def setTimeIso8601Undefined: Self = StObject.set(x, "timeIso8601", js.undefined)
    
    inline def setType(value: GoogleActionsV2OrdersTimeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
