package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usage extends StObject {
  
  /**
    * The ending date of the usage data.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The usage data, as daily logs of used and remaining quotas, over the specified time interval indexed over the API keys in a usage plan. For example, {..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}, where {api_key} stands for an API key value and the daily log entry is of the format [used quota, remaining quota].
    */
  var items: js.UndefOr[MapOfKeyUsages] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * The starting date of the usage data.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * The plan Id associated with this usage data.
    */
  var usagePlanId: js.UndefOr[String] = js.undefined
}
object Usage {
  
  @scala.inline
  def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  
  @scala.inline
  implicit class UsageMutableBuilder[Self <: Usage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setItems(value: MapOfKeyUsages): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePlanIdUndefined: Self = StObject.set(x, "usagePlanId", js.undefined)
  }
}
