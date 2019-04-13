package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * The list of tag keys and values associated with the resource you specified.
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

