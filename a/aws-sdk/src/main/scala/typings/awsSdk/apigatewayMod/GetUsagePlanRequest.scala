package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsagePlanRequest extends StObject {
  
  /**
    * [Required] The identifier of the UsagePlan resource to be retrieved.
    */
  var usagePlanId: String = js.native
}
object GetUsagePlanRequest {
  
  @scala.inline
  def apply(usagePlanId: String): GetUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsagePlanRequest]
  }
  
  @scala.inline
  implicit class GetUsagePlanRequestMutableBuilder[Self <: GetUsagePlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
