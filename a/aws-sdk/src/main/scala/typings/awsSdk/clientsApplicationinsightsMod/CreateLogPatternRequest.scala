package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLogPatternRequest extends StObject {
  
  /**
    * The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference constructions are not supported.
    */
  var Pattern: LogPatternRegex
  
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName
  
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName
  
  /**
    * Rank of the log pattern. Must be a value between 1 and 1,000,000. The patterns are sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of rank 1 will be the first to get matched to a log line. A pattern of rank 1,000,000 will be last to get matched. When you configure custom log patterns from the console, a Low severity pattern translates to a 750,000 rank. A Medium severity pattern translates to a 500,000 rank. And a High severity pattern translates to a 250,000 rank. Rank values less than 1 or greater than 1,000,000 are reserved for AWS-provided patterns. 
    */
  var Rank: LogPatternRank
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
}
object CreateLogPatternRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CreateLogPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    inline def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    inline def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
