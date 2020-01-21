package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual node.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName = js.native
}

object VirtualNodeRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualNodeName: ResourceName): VirtualNodeRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeRef]
  }
}

