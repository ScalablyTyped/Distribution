package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceGroupResponse extends js.Object {
  /**
    * The ARN that specifies the resource group that is created.
    */
  var resourceGroupArn: Arn
}

object CreateResourceGroupResponse {
  @scala.inline
  def apply(resourceGroupArn: Arn): CreateResourceGroupResponse = {
    val __obj = js.Dynamic.literal(resourceGroupArn = resourceGroupArn)
  
    __obj.asInstanceOf[CreateResourceGroupResponse]
  }
}

