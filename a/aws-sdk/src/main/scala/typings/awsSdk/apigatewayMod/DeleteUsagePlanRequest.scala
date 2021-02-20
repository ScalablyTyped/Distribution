package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUsagePlanRequest extends StObject {
  
  /**
    * [Required] The Id of the to-be-deleted usage plan.
    */
  var usagePlanId: String = js.native
}
object DeleteUsagePlanRequest {
  
  @scala.inline
  def apply(usagePlanId: String): DeleteUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsagePlanRequest]
  }
  
  @scala.inline
  implicit class DeleteUsagePlanRequestMutableBuilder[Self <: DeleteUsagePlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
