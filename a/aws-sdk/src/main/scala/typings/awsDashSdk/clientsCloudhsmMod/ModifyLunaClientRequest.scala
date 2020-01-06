package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLunaClientRequest extends js.Object {
  /**
    * The new certificate for the client.
    */
  var Certificate: typings.awsDashSdk.clientsCloudhsmMod.Certificate = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsDashSdk.clientsCloudhsmMod.ClientArn = js.native
}

object ModifyLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], ClientArn = ClientArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
}

