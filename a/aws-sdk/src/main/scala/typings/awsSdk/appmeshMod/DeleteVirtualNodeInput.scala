package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualNodeInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual node in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual node to delete.
    */
  var virtualNodeName: ResourceName = js.native
}

object DeleteVirtualNodeInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualNodeName: ResourceName): DeleteVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVirtualNodeInput]
  }
}

