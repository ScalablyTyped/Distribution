package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRetryPolicy extends js.Object {
  /**
    * Specify at least one of the valid values.
    */
  var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents] = js.native
  /**
    * Specify at least one of the following values.
    
    
    
    server-error – HTTP status codes 500, 501,
    502, 503, 504, 505, 506, 507, 508, 510, and 511
    
    
    
    gateway-error – HTTP status codes 502,
    503, and 504
    
    
    
    client-error – HTTP status code 409
    
    
    
    stream-error – Retry on refused
    stream
    
    
    */
  var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.native
  /**
    * The maximum number of retry attempts.
    */
  var maxRetries: MaxRetries = js.native
  /**
    * An object that represents a duration of time.
    */
  var perRetryTimeout: Duration = js.native
  /**
    * Specify a valid value.
    */
  var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.native
}

object GrpcRetryPolicy {
  @scala.inline
  def apply(
    maxRetries: MaxRetries,
    perRetryTimeout: Duration,
    grpcRetryEvents: GrpcRetryPolicyEvents = null,
    httpRetryEvents: HttpRetryPolicyEvents = null,
    tcpRetryEvents: TcpRetryPolicyEvents = null
  ): GrpcRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    if (grpcRetryEvents != null) __obj.updateDynamic("grpcRetryEvents")(grpcRetryEvents.asInstanceOf[js.Any])
    if (httpRetryEvents != null) __obj.updateDynamic("httpRetryEvents")(httpRetryEvents.asInstanceOf[js.Any])
    if (tcpRetryEvents != null) __obj.updateDynamic("tcpRetryEvents")(tcpRetryEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRetryPolicy]
  }
}

