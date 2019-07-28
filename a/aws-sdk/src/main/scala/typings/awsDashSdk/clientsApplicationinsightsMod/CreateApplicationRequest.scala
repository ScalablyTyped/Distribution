package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationRequest extends js.Object {
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
}

object CreateApplicationRequest {
  @scala.inline
  def apply(ResourceGroupName: ResourceGroupName): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName)
  
    __obj.asInstanceOf[CreateApplicationRequest]
  }
}

