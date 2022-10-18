package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCommitsError extends StObject {
  
  /**
    * A commit ID that either could not be found or was not in a valid format.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * An error code that specifies whether the commit ID was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * An error message that provides detail about why the commit ID either was not found or was not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object BatchGetCommitsError {
  
  inline def apply(): BatchGetCommitsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCommitsError]
  }
  
  extension [Self <: BatchGetCommitsError](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
