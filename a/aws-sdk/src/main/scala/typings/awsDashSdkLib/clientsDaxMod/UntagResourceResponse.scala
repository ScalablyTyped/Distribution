package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceResponse extends js.Object {
  /**
    * The tag keys that have been removed from the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object UntagResourceResponse {
  @scala.inline
  def apply(Tags: TagList = null): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UntagResourceResponse]
  }
}

