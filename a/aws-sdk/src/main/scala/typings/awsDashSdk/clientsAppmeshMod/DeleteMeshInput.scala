package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMeshInput extends js.Object {
  /**
    * The name of the service mesh to delete.
    */
  var meshName: ResourceName
}

object DeleteMeshInput {
  @scala.inline
  def apply(meshName: ResourceName): DeleteMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
  
    __obj.asInstanceOf[DeleteMeshInput]
  }
}

