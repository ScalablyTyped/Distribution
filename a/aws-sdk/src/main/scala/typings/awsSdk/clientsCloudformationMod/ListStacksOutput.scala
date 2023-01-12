package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStacksOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackSummary structures containing information about the specified stacks.
    */
  var StackSummaries: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSummaries] = js.undefined
}
object ListStacksOutput {
  
  inline def apply(): ListStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStacksOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackSummaries(value: StackSummaries): Self = StObject.set(x, "StackSummaries", value.asInstanceOf[js.Any])
    
    inline def setStackSummariesUndefined: Self = StObject.set(x, "StackSummaries", js.undefined)
    
    inline def setStackSummariesVarargs(value: StackSummary*): Self = StObject.set(x, "StackSummaries", js.Array(value*))
  }
}
