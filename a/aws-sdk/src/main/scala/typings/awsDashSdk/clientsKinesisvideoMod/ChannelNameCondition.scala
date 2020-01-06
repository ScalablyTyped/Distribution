package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can only specify the BEGINS_WITH operator, which finds signaling channels whose names begin with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.ComparisonOperator] = js.native
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[ChannelName] = js.native
}

object ChannelNameCondition {
  @scala.inline
  def apply(ComparisonOperator: ComparisonOperator = null, ComparisonValue: ChannelName = null): ChannelNameCondition = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (ComparisonValue != null) __obj.updateDynamic("ComparisonValue")(ComparisonValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelNameCondition]
  }
}

