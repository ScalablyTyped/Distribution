package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  /**
    * The source IP address of the TCP connection making the request to API Gateway.
    */
  var SourceIp: string = js.native
  /**
    * The User Agent of the API caller.
    */
  var UserAgent: string = js.native
}

object Identity {
  @scala.inline
  def apply(SourceIp: string, UserAgent: string): Identity = {
    val __obj = js.Dynamic.literal(SourceIp = SourceIp.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Identity]
  }
}

