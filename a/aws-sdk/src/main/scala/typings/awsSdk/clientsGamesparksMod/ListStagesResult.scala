package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStagesResult extends StObject {
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
  
  /**
    *  A list of stage summaries. You can use the stage names in the UpdateStage and GetStage actions. 
    */
  var Stages: js.UndefOr[StageSummaryList] = js.undefined
}
object ListStagesResult {
  
  inline def apply(): ListStagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStagesResult]
  }
  
  extension [Self <: ListStagesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStages(value: StageSummaryList): Self = StObject.set(x, "Stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "Stages", js.undefined)
    
    inline def setStagesVarargs(value: StageSummary*): Self = StObject.set(x, "Stages", js.Array(value*))
  }
}
