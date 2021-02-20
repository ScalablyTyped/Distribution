package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaSettings extends StObject {
  
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: js.UndefOr[Integer] = js.native
  
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Integer] = js.native
  
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: js.UndefOr[QuotaPeriodType] = js.native
}
object QuotaSettings {
  
  @scala.inline
  def apply(): QuotaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaSettings]
  }
  
  @scala.inline
  implicit class QuotaSettingsMutableBuilder[Self <: QuotaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPeriod(value: QuotaPeriodType): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
