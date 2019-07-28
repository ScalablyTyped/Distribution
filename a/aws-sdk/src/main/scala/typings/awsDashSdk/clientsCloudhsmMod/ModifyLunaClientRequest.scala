package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLunaClientRequest extends js.Object {
  /**
    * The new certificate for the client.
    */
  var Certificate: typings.awsDashSdk.clientsCloudhsmMod.Certificate
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsDashSdk.clientsCloudhsmMod.ClientArn
}

object ModifyLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate, ClientArn = ClientArn)
  
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
}

