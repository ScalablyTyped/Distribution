package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsOutput extends js.Object {
  /**
    * A list of tags associated with the Amazon SageMaker resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object AddTagsOutput {
  @scala.inline
  def apply(Tags: TagList = null): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[AddTagsOutput]
  }
}

