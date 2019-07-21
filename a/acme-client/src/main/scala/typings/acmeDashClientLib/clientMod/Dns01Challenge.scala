package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dns01Challenge extends Challenge {
  var token: java.lang.String
  @JSName("type")
  var type_Dns01Challenge: acmeDashClientLib.acmeDashClientLibStrings.`dns-01`
}

object Dns01Challenge {
  @scala.inline
  def apply(
    status: java.lang.String,
    token: java.lang.String,
    `type`: acmeDashClientLib.acmeDashClientLibStrings.`dns-01`,
    url: java.lang.String,
    error: js.Object = null,
    validated: java.lang.String = null
  ): Dns01Challenge = {
    val __obj = js.Dynamic.literal(status = status, token = token, url = url)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (validated != null) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[Dns01Challenge]
  }
}

