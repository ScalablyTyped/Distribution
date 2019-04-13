package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceResponse extends js.Object {
  /**
    * The identifier of the new resource.
    */
  var ResourceId: js.UndefOr[ResourceId] = js.undefined
}

object CreateResourceResponse {
  @scala.inline
  def apply(ResourceId: ResourceId = null): CreateResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[CreateResourceResponse]
  }
}

