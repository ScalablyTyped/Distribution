package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that the tags were removed from.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.ResourceARN] = js.native
}

object RemoveTagsFromResourceOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null): RemoveTagsFromResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceOutput]
  }
}

