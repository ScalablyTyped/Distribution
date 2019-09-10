package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRetryPolicy extends js.Object {
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
  var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.undefined
  /**
    * The maximum number of retry attempts. If no value is specified, the default is 1.
    */
  var maxRetries: MaxRetries
  /**
    * An object that represents the retry duration.
    */
  var perRetryTimeout: Duration
  /**
    * Specify a valid value.
    */
  var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.undefined
}

object HttpRetryPolicy {
  @scala.inline
  def apply(
    maxRetries: MaxRetries,
    perRetryTimeout: Duration,
    httpRetryEvents: HttpRetryPolicyEvents = null,
    tcpRetryEvents: TcpRetryPolicyEvents = null
  ): HttpRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries, perRetryTimeout = perRetryTimeout)
    if (httpRetryEvents != null) __obj.updateDynamic("httpRetryEvents")(httpRetryEvents)
    if (tcpRetryEvents != null) __obj.updateDynamic("tcpRetryEvents")(tcpRetryEvents)
    __obj.asInstanceOf[HttpRetryPolicy]
  }
}

