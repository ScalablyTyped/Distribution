package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
}

object AddTagsToResourceOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
}

