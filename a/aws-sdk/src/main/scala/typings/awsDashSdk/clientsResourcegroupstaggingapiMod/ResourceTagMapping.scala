package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTagMapping extends js.Object {
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ResourceARN] = js.undefined
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ResourceTagMapping {
  @scala.inline
  def apply(ResourceARN: ResourceARN = null, Tags: TagList = null): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ResourceTagMapping]
  }
}

