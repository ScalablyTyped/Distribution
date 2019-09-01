package typings.awsDashSdk.clientsApigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  /**
    * The source IP address of the TCP connection making the request to API Gateway.
    */
  var SourceIp: __string
  /**
    * The User Agent of the API caller.
    */
  var UserAgent: __string
}

object Identity {
  @scala.inline
  def apply(SourceIp: __string, UserAgent: __string): Identity = {
    val __obj = js.Dynamic.literal(SourceIp = SourceIp, UserAgent = UserAgent)
  
    __obj.asInstanceOf[Identity]
  }
}

