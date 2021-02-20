package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLogPatternRequest extends StObject {
  
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
  implicit class UpdateLogPatternRequestMutableBuilder[Self <: UpdateLogPatternRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
    
    @scala.inline
    def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
