package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutomationStepExecutionsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * A list of details about the current state of all steps that make up an execution.
    */
  var StepExecutions: js.UndefOr[StepExecutionList] = js.undefined
}
object DescribeAutomationStepExecutionsResult {
  
  inline def apply(): DescribeAutomationStepExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationStepExecutionsResult]
  }
  
  extension [Self <: DescribeAutomationStepExecutionsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStepExecutions(value: StepExecutionList): Self = StObject.set(x, "StepExecutions", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionsUndefined: Self = StObject.set(x, "StepExecutions", js.undefined)
    
    inline def setStepExecutionsVarargs(value: StepExecution*): Self = StObject.set(x, "StepExecutions", js.Array(value*))
  }
}
