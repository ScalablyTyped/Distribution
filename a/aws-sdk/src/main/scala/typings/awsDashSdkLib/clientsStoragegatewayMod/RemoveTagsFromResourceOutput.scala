package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that the tags were removed from.
    */
  var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
}

object RemoveTagsFromResourceOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null): RemoveTagsFromResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    __obj.asInstanceOf[RemoveTagsFromResourceOutput]
  }
}

