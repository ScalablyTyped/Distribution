package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStacksResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the stacks.
    */
  var Stacks: js.UndefOr[StackList] = js.undefined
}
object DescribeStacksResult {
  
  inline def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  
  extension [Self <: DescribeStacksResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStacks(value: StackList): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    inline def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    inline def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value*))
  }
}
