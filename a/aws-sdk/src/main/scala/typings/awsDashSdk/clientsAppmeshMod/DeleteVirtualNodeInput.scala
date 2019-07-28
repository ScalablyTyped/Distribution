package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualNodeInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual node in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual node to delete.
    */
  var virtualNodeName: ResourceName
}

object DeleteVirtualNodeInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualNodeName: ResourceName): DeleteVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[DeleteVirtualNodeInput]
  }
}

