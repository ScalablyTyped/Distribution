package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsOutput extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmsapMod.NextToken] = js.undefined
  
  /**
    * List of operations performed by AWS Systems Manager for SAP.
    */
  var Operations: js.UndefOr[OperationList] = js.undefined
}
object ListOperationsOutput {
  
  inline def apply(): ListOperationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOperationsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "Operations", js.Array(value*))
  }
}
