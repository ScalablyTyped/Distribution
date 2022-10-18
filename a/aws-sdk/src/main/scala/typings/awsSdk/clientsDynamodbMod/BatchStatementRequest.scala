package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementRequest extends StObject {
  
  /**
    *  The read consistency of the PartiQL batch request. 
    */
  var ConsistentRead: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ConsistentRead] = js.undefined
  
  /**
    *  The parameters associated with a PartiQL statement in the batch request. 
    */
  var Parameters: js.UndefOr[PreparedStatementParameters] = js.undefined
  
  /**
    *  A valid PartiQL statement. 
    */
  var Statement: PartiQLStatement
}
object BatchStatementRequest {
  
  inline def apply(Statement: PartiQLStatement): BatchStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStatementRequest]
  }
  
  extension [Self <: BatchStatementRequest](x: Self) {
    
    inline def setConsistentRead(value: ConsistentRead): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setParameters(value: PreparedStatementParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: PartiQLStatement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}
