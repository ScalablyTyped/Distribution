package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualRouterInput extends js.Object {
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual router to describe.
    */
  var virtualRouterName: ResourceName = js.native
}

object DescribeVirtualRouterInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualRouterName: ResourceName): DescribeVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeVirtualRouterInput]
  }
}

