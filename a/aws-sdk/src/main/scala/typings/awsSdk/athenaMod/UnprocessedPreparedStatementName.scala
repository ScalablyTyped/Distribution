package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedPreparedStatementName extends StObject {
  
  /**
    * The error code returned when the request for the prepared statement failed.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.undefined
  
  /**
    * The error message containing the reason why the prepared statement could not be returned. The following error messages are possible:    INVALID_INPUT - The name of the prepared statement that was provided is not valid (for example, the name is too long).    STATEMENT_NOT_FOUND - A prepared statement with the name provided could not be found.    UNAUTHORIZED - The requester does not have permission to access the workgroup that contains the prepared statement.  
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.undefined
  
  /**
    * The name of a prepared statement that could not be returned due to an error.
    */
  var StatementName: js.UndefOr[typings.awsSdk.athenaMod.StatementName] = js.undefined
}
object UnprocessedPreparedStatementName {
  
  inline def apply(): UnprocessedPreparedStatementName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedPreparedStatementName]
  }
  
  extension [Self <: UnprocessedPreparedStatementName](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setStatementName(value: StatementName): Self = StObject.set(x, "StatementName", value.asInstanceOf[js.Any])
    
    inline def setStatementNameUndefined: Self = StObject.set(x, "StatementName", js.undefined)
  }
}
