package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedQueryExecutionId extends StObject {
  
  /**
    * The error code returned when the query execution failed to process, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.native
  
  /**
    * The error message returned when the query execution failed to process, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.native
  
  /**
    * The unique identifier of the query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.native
}
object UnprocessedQueryExecutionId {
  
  @scala.inline
  def apply(): UnprocessedQueryExecutionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedQueryExecutionId]
  }
  
  @scala.inline
  implicit class UnprocessedQueryExecutionIdMutableBuilder[Self <: UnprocessedQueryExecutionId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
  }
}
