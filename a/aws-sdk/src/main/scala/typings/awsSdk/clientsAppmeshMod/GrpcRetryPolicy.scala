package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRetryPolicy extends StObject {
  
  /**
    * Specify at least one of the valid values.
    */
  var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents] = js.undefined
  
  /**
    * Specify at least one of the following values.    server-error – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511    gateway-error – HTTP status codes 502, 503, and 504    client-error – HTTP status code 409    stream-error – Retry on refused stream  
    */
  var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.undefined
  
  /**
    * The maximum number of retry attempts.
    */
  var maxRetries: MaxRetries
  
  /**
    * The timeout for each retry attempt.
    */
  var perRetryTimeout: Duration
  
  /**
    * Specify a valid value. The event occurs before any processing of a request has started and is encountered when the upstream is temporarily or permanently unavailable.
    */
  var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.undefined
}
object GrpcRetryPolicy {
  
  inline def apply(maxRetries: MaxRetries, perRetryTimeout: Duration): GrpcRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRetryPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrpcRetryPolicy] (val x: Self) extends AnyVal {
    
    inline def setGrpcRetryEvents(value: GrpcRetryPolicyEvents): Self = StObject.set(x, "grpcRetryEvents", value.asInstanceOf[js.Any])
    
    inline def setGrpcRetryEventsUndefined: Self = StObject.set(x, "grpcRetryEvents", js.undefined)
    
    inline def setGrpcRetryEventsVarargs(value: GrpcRetryPolicyEvent*): Self = StObject.set(x, "grpcRetryEvents", js.Array(value*))
    
    inline def setHttpRetryEvents(value: HttpRetryPolicyEvents): Self = StObject.set(x, "httpRetryEvents", value.asInstanceOf[js.Any])
    
    inline def setHttpRetryEventsUndefined: Self = StObject.set(x, "httpRetryEvents", js.undefined)
    
    inline def setHttpRetryEventsVarargs(value: HttpRetryPolicyEvent*): Self = StObject.set(x, "httpRetryEvents", js.Array(value*))
    
    inline def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setPerRetryTimeout(value: Duration): Self = StObject.set(x, "perRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setTcpRetryEvents(value: TcpRetryPolicyEvents): Self = StObject.set(x, "tcpRetryEvents", value.asInstanceOf[js.Any])
    
    inline def setTcpRetryEventsUndefined: Self = StObject.set(x, "tcpRetryEvents", js.undefined)
    
    inline def setTcpRetryEventsVarargs(value: TcpRetryPolicyEvent*): Self = StObject.set(x, "tcpRetryEvents", js.Array(value*))
  }
}
