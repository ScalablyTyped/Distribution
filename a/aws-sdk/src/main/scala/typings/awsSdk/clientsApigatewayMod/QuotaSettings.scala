package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuotaSettings extends StObject {
  
  /**
    * The target maximum number of requests that can be made in a given time period.
    */
  var limit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: js.UndefOr[QuotaPeriodType] = js.undefined
}
object QuotaSettings {
  
  inline def apply(): QuotaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuotaSettings] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPeriod(value: QuotaPeriodType): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
