package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentPolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component whose policy you wish to retrieve. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
}

object GetComponentPolicyRequest {
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn): GetComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetComponentPolicyRequest]
  }
}

