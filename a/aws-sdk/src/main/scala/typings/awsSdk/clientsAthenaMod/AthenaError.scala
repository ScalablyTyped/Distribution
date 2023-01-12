package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaError extends StObject {
  
  /**
    * An integer value that specifies the category of a query failure error. The following list shows the category for each integer value.  1 - System  2 - User  3 - Other
    */
  var ErrorCategory: js.UndefOr[typings.awsSdk.clientsAthenaMod.ErrorCategory] = js.undefined
  
  /**
    * Contains a short description of the error that occurred.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * An integer value that provides specific information about an Athena query error. For the meaning of specific values, see the Error Type Reference in the Amazon Athena User Guide.
    */
  var ErrorType: js.UndefOr[typings.awsSdk.clientsAthenaMod.ErrorType] = js.undefined
  
  /**
    * True if the query might succeed if resubmitted.
    */
  var Retryable: js.UndefOr[Boolean] = js.undefined
}
object AthenaError {
  
  inline def apply(): AthenaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AthenaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AthenaError] (val x: Self) extends AnyVal {
    
    inline def setErrorCategory(value: ErrorCategory): Self = StObject.set(x, "ErrorCategory", value.asInstanceOf[js.Any])
    
    inline def setErrorCategoryUndefined: Self = StObject.set(x, "ErrorCategory", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: ErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
    
    inline def setRetryable(value: Boolean): Self = StObject.set(x, "Retryable", value.asInstanceOf[js.Any])
    
    inline def setRetryableUndefined: Self = StObject.set(x, "Retryable", js.undefined)
  }
}
