package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsagePlanKeysRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A query parameter specifying the name of the to-be-returned usage plan keys.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String
}
object GetUsagePlanKeysRequest {
  
  @scala.inline
  def apply(usagePlanId: String): GetUsagePlanKeysRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsagePlanKeysRequest]
  }
  
  @scala.inline
  implicit class GetUsagePlanKeysRequestMutableBuilder[Self <: GetUsagePlanKeysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNameQuery(value: String): Self = StObject.set(x, "nameQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameQueryUndefined: Self = StObject.set(x, "nameQuery", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
