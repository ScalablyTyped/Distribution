package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http01Challenge extends Challenge {
  var token: java.lang.String
  @JSName("type")
  var type_Http01Challenge: acmeDashClientLib.acmeDashClientLibStrings.`http-01`
}

object Http01Challenge {
  @scala.inline
  def apply(
    status: java.lang.String,
    token: java.lang.String,
    `type`: acmeDashClientLib.acmeDashClientLibStrings.`http-01`,
    url: java.lang.String,
    error: js.Object = null,
    validated: java.lang.String = null
  ): Http01Challenge = {
    val __obj = js.Dynamic.literal(status = status, token = token, url = url)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (validated != null) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[Http01Challenge]
  }
}

