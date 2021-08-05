package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLogPatternRequest extends StObject {
  
  /**
    * The log pattern.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.undefined
  
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName
  
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName
  
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
}
object UpdateLogPatternRequest {
  
  inline def apply(
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    ResourceGroupName: ResourceGroupName
  ): UpdateLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLogPatternRequest]
  }
  
  extension [Self <: UpdateLogPatternRequest](x: Self) {
    
    inline def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    inline def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
    
    inline def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
