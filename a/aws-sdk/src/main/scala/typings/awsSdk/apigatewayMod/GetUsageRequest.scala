package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageRequest extends StObject {
  
  /**
    * [Required] The ending date (e.g., 2016-12-31) of the usage data.
    */
  var endDate: String
  
  /**
    * The Id of the API key associated with the resultant usage data.
    */
  var keyId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The starting date (e.g., 2016-01-01) of the usage data.
    */
  var startDate: String
  
  /**
    * [Required] The Id of the usage plan associated with the usage data.
    */
  var usagePlanId: String
}
object GetUsageRequest {
  
  @scala.inline
  def apply(endDate: String, startDate: String, usagePlanId: String): GetUsageRequest = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageRequest]
  }
  
  @scala.inline
  implicit class GetUsageRequestMutableBuilder[Self <: GetUsageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
