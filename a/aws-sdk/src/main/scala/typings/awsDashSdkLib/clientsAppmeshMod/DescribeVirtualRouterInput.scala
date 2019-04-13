package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualRouterInput extends js.Object {
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual router to describe.
    */
  var virtualRouterName: ResourceName
}

object DescribeVirtualRouterInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualRouterName: ResourceName): DescribeVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[DescribeVirtualRouterInput]
  }
}

