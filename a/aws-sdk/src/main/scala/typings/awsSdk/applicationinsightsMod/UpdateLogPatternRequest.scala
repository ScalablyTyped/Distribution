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
    ResourceGroupName: ResourceGroupName
  ): UpdateLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLogPatternRequest]
  }
  @scala.inline
  implicit class UpdateLogPatternRequestOps[Self <: UpdateLogPatternRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPatternName(value: LogPatternName): Self = this.set("PatternName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = this.set("PatternSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: LogPatternRegex): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("Pattern", js.undefined)
    @scala.inline
    def setRank(value: LogPatternRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("Rank", js.undefined)
  }
  
}

