package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * An array of key:value pairs that are assigned to the container.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(Tags: TagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

