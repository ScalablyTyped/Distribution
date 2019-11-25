package typings.acmeDashClient.clientMod

import typings.acmeDashClient.acmeDashClientStrings.`dns-01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dns01Challenge extends Challenge {
  var token: String
  @JSName("type")
  var type_Dns01Challenge: `dns-01`
}

object Dns01Challenge {
  @scala.inline
  def apply(
    status: String,
    token: String,
    `type`: `dns-01`,
    url: String,
    error: js.Object = null,
    validated: String = null
  ): Dns01Challenge = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (validated != null) __obj.updateDynamic("validated")(validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dns01Challenge]
  }
}

