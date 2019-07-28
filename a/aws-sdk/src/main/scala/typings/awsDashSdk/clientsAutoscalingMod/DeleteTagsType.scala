package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsType extends js.Object {
  /**
    * One or more tags.
    */
  var Tags: typings.awsDashSdk.clientsAutoscalingMod.Tags
}

object DeleteTagsType {
  @scala.inline
  def apply(Tags: Tags): DeleteTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags)
  
    __obj.asInstanceOf[DeleteTagsType]
  }
}

