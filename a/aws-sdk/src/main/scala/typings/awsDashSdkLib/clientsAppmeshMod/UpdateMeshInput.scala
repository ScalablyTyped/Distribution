package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMeshInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh to update.
    */
  var meshName: ResourceName
  /**
    * The service mesh specification to apply.
    */
  var spec: js.UndefOr[MeshSpec] = js.undefined
}

object UpdateMeshInput {
  @scala.inline
  def apply(meshName: ResourceName, clientToken: String = null, spec: MeshSpec = null): UpdateMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[UpdateMeshInput]
  }
}

