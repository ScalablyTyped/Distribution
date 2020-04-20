package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsType extends js.Object {
  /**
    * One or more tags.
    */
  var Tags: typings.awsSdk.autoscalingMod.Tags = js.native
}

object DeleteTagsType {
  @scala.inline
  def apply(Tags: Tags): DeleteTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsType]
  }
}

