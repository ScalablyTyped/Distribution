package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStatementsResponse extends StObject {
  
  /**
    * A continuation token, if not all statements have yet been returned.
    */
  var NextToken: js.UndefOr[OrchestrationToken] = js.undefined
  
  /**
    * Returns the list of statements.
    */
  var Statements: js.UndefOr[StatementList] = js.undefined
}
object ListStatementsResponse {
  
  inline def apply(): ListStatementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStatementsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStatementsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: OrchestrationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatements(value: StatementList): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "Statements", js.undefined)
    
    inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
