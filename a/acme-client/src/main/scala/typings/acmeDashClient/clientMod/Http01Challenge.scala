package typings.acmeDashClient.clientMod

import typings.acmeDashClient.acmeDashClientStrings.`http-01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http01Challenge extends Challenge {
  var token: String
  @JSName("type")
  var type_Http01Challenge: `http-01`
}

object Http01Challenge {
  @scala.inline
  def apply(
    status: String,
    token: String,
    `type`: `http-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): Http01Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http01Challenge]
  }
}

