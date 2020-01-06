package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogPatternRequest extends js.Object {
  /**
    * The log pattern.
    */
  var Pattern: LogPatternRegex = js.native
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
  var Rank: LogPatternRank = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName = js.native
}

object CreateLogPatternRequest {
  @scala.inline
  def apply(
    Pattern: LogPatternRegex,
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    Rank: LogPatternRank,
    ResourceGroupName: ResourceGroupName
  ): CreateLogPatternRequest = {
    val __obj = js.Dynamic.literal(Pattern = Pattern.asInstanceOf[js.Any], PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], Rank = Rank.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateLogPatternRequest]
  }
}

