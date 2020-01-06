package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualRouterInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the service mesh to create the virtual router in.
    */
  var meshName: ResourceName = js.native
  /**
    * The virtual router specification to apply.
    */
  var spec: VirtualRouterSpec = js.native
  /**
    * Optional metadata that you can apply to the virtual router to assist with categorization
    and organization. Each tag consists of a key and an optional value, both of which you
    define. Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The name to use for the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}

object CreateVirtualRouterInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualRouterSpec,
    virtualRouterName: ResourceName,
    clientToken: String = null,
    tags: TagList = null
  ): CreateVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualRouterInput]
  }
}

