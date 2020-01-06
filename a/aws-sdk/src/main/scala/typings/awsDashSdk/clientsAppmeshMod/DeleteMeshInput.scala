package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMeshInput extends js.Object {
  /**
    * The name of the service mesh to delete.
    */
  var meshName: ResourceName = js.native
}

object DeleteMeshInput {
  @scala.inline
  def apply(meshName: ResourceName): DeleteMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMeshInput]
  }
}

