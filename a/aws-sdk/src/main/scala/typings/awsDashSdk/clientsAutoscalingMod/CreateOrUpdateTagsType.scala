package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrUpdateTagsType extends js.Object {
  /**
    * One or more tags.
    */
  var Tags: typings.awsDashSdk.clientsAutoscalingMod.Tags
}

object CreateOrUpdateTagsType {
  @scala.inline
  def apply(Tags: Tags): CreateOrUpdateTagsType = {
    val __obj = js.Dynamic.literal(Tags = Tags)
  
    __obj.asInstanceOf[CreateOrUpdateTagsType]
  }
}

