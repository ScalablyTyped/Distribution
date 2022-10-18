package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStackResourcesOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackResourceSummaries] = js.undefined
}
object ListStackResourcesOutput {
  
  inline def apply(): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
  
  extension [Self <: ListStackResourcesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackResourceSummaries(value: StackResourceSummaries): Self = StObject.set(x, "StackResourceSummaries", value.asInstanceOf[js.Any])
    
    inline def setStackResourceSummariesUndefined: Self = StObject.set(x, "StackResourceSummaries", js.undefined)
    
    inline def setStackResourceSummariesVarargs(value: StackResourceSummary*): Self = StObject.set(x, "StackResourceSummaries", js.Array(value*))
  }
}
