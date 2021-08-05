package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedQueryExecutionId extends StObject {
  
  /**
    * The error code returned when the query execution failed to process, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.undefined
  
  /**
    * The error message returned when the query execution failed to process, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.undefined
  
  /**
    * The unique identifier of the query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.undefined
}
object UnprocessedQueryExecutionId {
  
  inline def apply(): UnprocessedQueryExecutionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedQueryExecutionId]
  }
  
  extension [Self <: UnprocessedQueryExecutionId](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
  }
}
