package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual service to describe.
    */
  var virtualServiceName: ServiceName
}

object DescribeVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DescribeVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualServiceName = virtualServiceName)
  
    __obj.asInstanceOf[DescribeVirtualServiceInput]
  }
}

