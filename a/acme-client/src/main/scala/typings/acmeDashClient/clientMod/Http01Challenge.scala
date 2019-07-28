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
    val __obj = js.Dynamic.literal(status = status, token = token, url = url)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (validated != null) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[Http01Challenge]
  }
}

