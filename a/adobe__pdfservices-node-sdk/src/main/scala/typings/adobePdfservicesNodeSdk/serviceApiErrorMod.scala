package typings.adobePdfservicesNodeSdk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceApiErrorMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/error/service-api-error", "ServiceApiError")
  @js.native
  open class ServiceApiError protected ()
    extends StObject
       with Error {
    def this(message: Any, requestTrackingId: Any, statusCode: Any, errorCode: Any) = this()
    
    var errorCode: Any = js.native
    
    /**
      * Returns the Error code or {@link DEFAULT_ERROR_CODE} if the error code doesn't adequately represent the error.
      */
    def getErrorCode(): String = js.native
    
    /**
      * Returns the detailed message of this error.
      */
    def getMessage(): String = js.native
    
    /**
      * Returns the Request ID (the value of the X-Request-ID header).
      */
    def getRequestTrackingId(): String = js.native
    
    /**
      * Returns the HTTP Status code or {@link DEFAULT_STATUS_CODE} if the status code doesn't adequately represent the error.
      */
    def getStatusCode(): Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var requestTrackingId: Any = js.native
    
    var statusCode: Any = js.native
  }
}
