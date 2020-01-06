package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOutput extends js.Object {
  /**
    * The ARN of the tagged resource.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The tags that have been added to the specified resource.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Tags] = js.native
}

object TagOutput {
  @scala.inline
  def apply(Arn: GroupArn = null, Tags: Tags = null): TagOutput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOutput]
  }
}

