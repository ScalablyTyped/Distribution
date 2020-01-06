package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualNodeInput extends js.Object {
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual node to describe.
    */
  var virtualNodeName: ResourceName = js.native
}

object DescribeVirtualNodeInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualNodeName: ResourceName): DescribeVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeVirtualNodeInput]
  }
}

