package typings.awsSdk.clientsQldbsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementRequest extends StObject {
  
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.undefined
  
  /**
    * Specifies the statement of the request.
    */
  var Statement: typings.awsSdk.clientsQldbsessionMod.Statement
  
  /**
    * Specifies the transaction ID of the request.
    */
  var TransactionId: typings.awsSdk.clientsQldbsessionMod.TransactionId
}
object ExecuteStatementRequest {
  
  inline def apply(Statement: Statement, TransactionId: TransactionId): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: StatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: ValueHolder*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: TransactionId): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
