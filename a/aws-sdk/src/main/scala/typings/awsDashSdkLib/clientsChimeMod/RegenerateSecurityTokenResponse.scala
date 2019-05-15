package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegenerateSecurityTokenResponse extends js.Object {
  var Bot: js.UndefOr[Bot] = js.undefined
}

object RegenerateSecurityTokenResponse {
  @scala.inline
  def apply(Bot: Bot = null): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Bot != null) __obj.updateDynamic("Bot")(Bot)
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
}

