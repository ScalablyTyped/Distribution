package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var CloudFormationStackARN: js.UndefOr[XmlString] = js.native
  /**
    * A set of tags (up to 50).
    */
  var TagFilters: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.TagFilters] = js.native
}

object ApplicationSource {
  @scala.inline
  def apply(CloudFormationStackARN: XmlString = null, TagFilters: TagFilters = null): ApplicationSource = {
    val __obj = js.Dynamic.literal()
    if (CloudFormationStackARN != null) __obj.updateDynamic("CloudFormationStackARN")(CloudFormationStackARN.asInstanceOf[js.Any])
    if (TagFilters != null) __obj.updateDynamic("TagFilters")(TagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSource]
  }
}

