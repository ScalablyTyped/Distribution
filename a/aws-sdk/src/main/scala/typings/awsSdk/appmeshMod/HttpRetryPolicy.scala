package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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

object HttpRetryPolicy {
  @scala.inline
  def apply(maxRetries: MaxRetries, perRetryTimeout: Duration): HttpRetryPolicy = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], perRetryTimeout = perRetryTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRetryPolicy]
  }
  @scala.inline
  implicit class HttpRetryPolicyOps[Self <: HttpRetryPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxRetries(value: MaxRetries): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerRetryTimeout(value: Duration): Self = this.set("perRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpRetryEventsVarargs(value: HttpRetryPolicyEvent*): Self = this.set("httpRetryEvents", js.Array(value :_*))
    @scala.inline
    def setHttpRetryEvents(value: HttpRetryPolicyEvents): Self = this.set("httpRetryEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpRetryEvents: Self = this.set("httpRetryEvents", js.undefined)
    @scala.inline
    def setTcpRetryEventsVarargs(value: TcpRetryPolicyEvent*): Self = this.set("tcpRetryEvents", js.Array(value :_*))
    @scala.inline
    def setTcpRetryEvents(value: TcpRetryPolicyEvents): Self = this.set("tcpRetryEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpRetryEvents: Self = this.set("tcpRetryEvents", js.undefined)
  }
  
}

