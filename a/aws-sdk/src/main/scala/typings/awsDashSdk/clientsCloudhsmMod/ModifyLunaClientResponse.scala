package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLunaClientResponse extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ClientArn] = js.native
}

object ModifyLunaClientResponse {
  @scala.inline
  def apply(ClientArn: ClientArn = null): ModifyLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLunaClientResponse]
  }
}

