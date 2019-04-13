package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVirtualServiceInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh to create the virtual service in.
    */
  var meshName: ResourceName
  /**
    * The virtual service specification to apply.
    */
  var spec: VirtualServiceSpec
  /**
    * Optional metadata that you can apply to the virtual service to assist with categorization and organization.
    Each tag consists of a key and an optional value, both of which you define.
    Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The name to use for the virtual service.
    */
  var virtualServiceName: ServiceName
}

object CreateVirtualServiceInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualServiceSpec,
    virtualServiceName: ServiceName,
    clientToken: String = null,
    tags: TagList = null
  ): CreateVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, spec = spec, virtualServiceName = virtualServiceName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateVirtualServiceInput]
  }
}

