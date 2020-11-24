package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
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
  
  @scala.inline
  implicit class CreateLogPatternRequestOps[Self <: CreateLogPatternRequest] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: LogPatternRegex): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = this.set("PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = this.set("PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: LogPatternRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
