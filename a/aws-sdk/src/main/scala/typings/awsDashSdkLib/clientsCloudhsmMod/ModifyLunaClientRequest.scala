package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLunaClientRequest extends js.Object {
  /**
    * The new certificate for the client.
    */
  var Certificate: awsDashSdkLib.clientsCloudhsmMod.Certificate
  /**
    * The ARN of the client.
    */
  var ClientArn: awsDashSdkLib.clientsCloudhsmMod.ClientArn
}

object ModifyLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate, ClientArn = ClientArn)
  
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
}

