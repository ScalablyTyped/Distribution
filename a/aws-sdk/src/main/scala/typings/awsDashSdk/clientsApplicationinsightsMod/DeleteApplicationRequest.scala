package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationRequest extends js.Object {
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
}

object DeleteApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName)
  
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
}

