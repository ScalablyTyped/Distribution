package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUsagePlanRequest extends js.Object {
  
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
  implicit class DeleteUsagePlanRequestOps[Self <: DeleteUsagePlanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUsagePlanId(value: String): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
  }
}
