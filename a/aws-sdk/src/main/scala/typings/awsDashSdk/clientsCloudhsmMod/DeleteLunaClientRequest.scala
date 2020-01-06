package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLunaClientRequest extends js.Object {
  /**
    * The ARN of the client to delete.
    */
  var ClientArn: typings.awsDashSdk.clientsCloudhsmMod.ClientArn = js.native
}

object DeleteLunaClientRequest {
  @scala.inline
  def apply(ClientArn: ClientArn): DeleteLunaClientRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLunaClientRequest]
  }
}

