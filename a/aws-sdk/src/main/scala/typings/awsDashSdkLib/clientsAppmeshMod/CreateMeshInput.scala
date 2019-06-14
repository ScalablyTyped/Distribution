package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMeshInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name to use for the service mesh.
    */
  var meshName: ResourceName
  /**
    * The service mesh specification to apply.
    */
  var spec: js.UndefOr[MeshSpec] = js.undefined
  /**
    * Optional metadata that you can apply to the service mesh to assist with categorization
    and organization. Each tag consists of a key and an optional value, both of which you
    define. Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateMeshInput {
  @scala.inline
  def apply(meshName: ResourceName, clientToken: String = null, spec: MeshSpec = null, tags: TagList = null): CreateMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (spec != null) __obj.updateDynamic("spec")(spec)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateMeshInput]
  }
}

