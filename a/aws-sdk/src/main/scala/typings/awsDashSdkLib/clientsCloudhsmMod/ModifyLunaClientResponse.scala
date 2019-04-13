package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLunaClientResponse extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[ClientArn] = js.undefined
}

object ModifyLunaClientResponse {
  @scala.inline
  def apply(ClientArn: ClientArn = null): ModifyLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn)
    __obj.asInstanceOf[ModifyLunaClientResponse]
  }
}

