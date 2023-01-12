package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedItemDetails extends StObject {
  
  /**
    * The status code of a failed item.
    */
  var failureCode: FailedItemErrorCode
  
  /**
    * Indicates whether you can immediately retry a request for this item for a specified resource.
    */
  var retryable: Bool
}
object FailedItemDetails {
  
  inline def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
    val __obj = js.Dynamic.literal(failureCode = failureCode.asInstanceOf[js.Any], retryable = retryable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedItemDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedItemDetails] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: FailedItemErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setRetryable(value: Bool): Self = StObject.set(x, "retryable", value.asInstanceOf[js.Any])
  }
}
