package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteFeaturedResultsSetError extends StObject {
  
  /**
    * The error code for why the set of featured results couldn't be removed from the index.
    */
  var ErrorCode: typings.awsSdk.clientsKendraMod.ErrorCode
  
  /**
    * An explanation for why the set of featured results couldn't be removed from the index.
    */
  var ErrorMessage: typings.awsSdk.clientsKendraMod.ErrorMessage
  
  /**
    * The identifier of the set of featured results that couldn't be removed from the index.
    */
  var Id: FeaturedResultsSetId
}
object BatchDeleteFeaturedResultsSetError {
  
  inline def apply(ErrorCode: ErrorCode, ErrorMessage: ErrorMessage, Id: FeaturedResultsSetId): BatchDeleteFeaturedResultsSetError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteFeaturedResultsSetError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteFeaturedResultsSetError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setId(value: FeaturedResultsSetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
