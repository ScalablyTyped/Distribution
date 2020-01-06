package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUri extends js.Object {
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsGlueMod.ResourceType] = js.native
  /**
    * The URI for accessing the resource.
    */
  var Uri: js.UndefOr[URI] = js.native
}

object ResourceUri {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Uri: URI = null): ResourceUri = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Uri != null) __obj.updateDynamic("Uri")(Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUri]
  }
}

