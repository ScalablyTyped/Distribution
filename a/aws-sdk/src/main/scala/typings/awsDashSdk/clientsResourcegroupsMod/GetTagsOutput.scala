package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsOutput extends js.Object {
  /**
    * The ARN of the tagged resource group.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The tags associated with the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Tags] = js.native
}

object GetTagsOutput {
  @scala.inline
  def apply(Arn: GroupArn = null, Tags: Tags = null): GetTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsOutput]
  }
}

