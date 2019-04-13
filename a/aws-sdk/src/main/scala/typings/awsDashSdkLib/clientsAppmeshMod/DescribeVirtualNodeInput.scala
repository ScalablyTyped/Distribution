package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVirtualNodeInput extends js.Object {
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual node to describe.
    */
  var virtualNodeName: ResourceName
}

object DescribeVirtualNodeInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualNodeName: ResourceName): DescribeVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[DescribeVirtualNodeInput]
  }
}

