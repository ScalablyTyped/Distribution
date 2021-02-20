package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLogPatternRequest extends StObject {
  
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
  implicit class CreateLogPatternRequestMutableBuilder[Self <: CreateLogPatternRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
