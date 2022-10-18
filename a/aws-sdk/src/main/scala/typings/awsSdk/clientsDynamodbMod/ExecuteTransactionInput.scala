package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteTransactionInput extends StObject {
  
  /**
    * Set this value to get remaining results, if NextToken was returned in the statement response.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientRequestToken] = js.undefined
  
  /**
    * Determines the level of detail about either provisioned or on-demand throughput consumption that is returned in the response. For more information, see TransactGetItems and TransactWriteItems.
    */
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  
  /**
    * The list of PartiQL statements representing the transaction to run.
    */
  var TransactStatements: ParameterizedStatements
}
object ExecuteTransactionInput {
  
  inline def apply(TransactStatements: ParameterizedStatements): ExecuteTransactionInput = {
    val __obj = js.Dynamic.literal(TransactStatements = TransactStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteTransactionInput]
  }
  
  extension [Self <: ExecuteTransactionInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setTransactStatements(value: ParameterizedStatements): Self = StObject.set(x, "TransactStatements", value.asInstanceOf[js.Any])
    
    inline def setTransactStatementsVarargs(value: ParameterizedStatement*): Self = StObject.set(x, "TransactStatements", js.Array(value*))
  }
}
