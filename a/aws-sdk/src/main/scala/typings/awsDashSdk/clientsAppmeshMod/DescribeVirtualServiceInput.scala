package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual service to describe.
    */
  var virtualServiceName: ServiceName = js.native
}

object DescribeVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DescribeVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeVirtualServiceInput]
  }
}

