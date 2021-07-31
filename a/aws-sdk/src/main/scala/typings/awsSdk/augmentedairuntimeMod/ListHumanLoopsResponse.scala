package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHumanLoopsResponse extends StObject {
  
  /**
    * An array of objects that contain information about the human loops.
    */
  var HumanLoopSummaries: typings.awsSdk.augmentedairuntimeMod.HumanLoopSummaries
  
  /**
    * A token to display the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.NextToken] = js.undefined
}
object ListHumanLoopsResponse {
  
  @scala.inline
  def apply(HumanLoopSummaries: HumanLoopSummaries): ListHumanLoopsResponse = {
    val __obj = js.Dynamic.literal(HumanLoopSummaries = HumanLoopSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsResponse]
  }
  
  @scala.inline
  implicit class ListHumanLoopsResponseMutableBuilder[Self <: ListHumanLoopsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopSummaries(value: HumanLoopSummaries): Self = StObject.set(x, "HumanLoopSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopSummariesVarargs(value: HumanLoopSummary*): Self = StObject.set(x, "HumanLoopSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
