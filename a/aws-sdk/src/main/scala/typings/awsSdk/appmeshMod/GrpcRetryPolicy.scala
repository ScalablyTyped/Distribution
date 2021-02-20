package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcRetryPolicy extends StObject {
  
  /**
    * Specify at least one of the valid values.
    */
  var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents] = js.native
  
  /**
    * Specify at least one of the following values.    server-error – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511    gateway-error – HTTP status codes 502, 503, and 504    client-error – HTTP status code 409    stream-error – Retry on refused stream  
    */
  var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.native
  
  /**
    * The maximum number of retry attempts.
    */
  var maxRetries: MaxRetries = js.native
  
  /**
    * The timeout for each retry attempt.
    */
  var perRetryTimeout: Duration = js.native
  
  /**
    * Specify a valid value. The event occurs before any processing of a request has started and is encountered when the upstream is temporarily or permanently unavailable.
    */
  var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.native
}
object GrpcRetryPolicy {
  
  @scala.inline
  def apply(maxRetries: MaxRetries, perRetryTimeout: Duration): GrpcRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRetryPolicy]
  }
  
  @scala.inline
  implicit class GrpcRetryPolicyMutableBuilder[Self <: GrpcRetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcRetryEvents(value: GrpcRetryPolicyEvents): Self = StObject.set(x, "grpcRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcRetryEventsUndefined: Self = StObject.set(x, "grpcRetryEvents", js.undefined)
    
    @scala.inline
    def setGrpcRetryEventsVarargs(value: GrpcRetryPolicyEvent*): Self = StObject.set(x, "grpcRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setHttpRetryEvents(value: HttpRetryPolicyEvents): Self = StObject.set(x, "httpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRetryEventsUndefined: Self = StObject.set(x, "httpRetryEvents", js.undefined)
    
    @scala.inline
    def setHttpRetryEventsVarargs(value: HttpRetryPolicyEvent*): Self = StObject.set(x, "httpRetryEvents", js.Array(value :_*))
    
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRetryTimeout(value: Duration): Self = StObject.set(x, "perRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRetryEvents(value: TcpRetryPolicyEvents): Self = StObject.set(x, "tcpRetryEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpRetryEventsUndefined: Self = StObject.set(x, "tcpRetryEvents", js.undefined)
    
    @scala.inline
    def setTcpRetryEventsVarargs(value: TcpRetryPolicyEvent*): Self = StObject.set(x, "tcpRetryEvents", js.Array(value :_*))
  }
}
