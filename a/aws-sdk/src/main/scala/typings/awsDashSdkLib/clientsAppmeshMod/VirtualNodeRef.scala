package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual node.
    */
  var arn: Arn
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName
}

object VirtualNodeRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualNodeName: ResourceName): VirtualNodeRef = {
    val __obj = js.Dynamic.literal(arn = arn, meshName = meshName, virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[VirtualNodeRef]
  }
}

