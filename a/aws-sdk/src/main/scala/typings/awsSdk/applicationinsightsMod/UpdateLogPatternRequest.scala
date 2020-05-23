package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLogPatternRequest extends js.Object {
  /**
    * The log pattern.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.native
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName = js.native
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName = js.native
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object UpdateLogPatternRequest {
  @scala.inline
  def apply(
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    ResourceGroupName: ResourceGroupName,
    Pattern: LogPatternRegex = null,
    Rank: js.UndefOr[LogPatternRank] = js.undefined
  ): UpdateLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(Rank)) __obj.updateDynamic("Rank")(Rank.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLogPatternRequest]
  }
}

