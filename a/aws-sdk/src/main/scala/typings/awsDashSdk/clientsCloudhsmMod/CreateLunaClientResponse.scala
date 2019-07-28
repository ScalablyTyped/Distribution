package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLunaClientResponse extends js.Object {
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ClientArn] = js.undefined
}

object CreateLunaClientResponse {
  @scala.inline
  def apply(ClientArn: ClientArn = null): CreateLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn)
    __obj.asInstanceOf[CreateLunaClientResponse]
  }
}

