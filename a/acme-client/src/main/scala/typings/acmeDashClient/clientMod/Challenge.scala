package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Challenge extends HasStatus {
  var error: js.UndefOr[js.Object] = js.undefined
  @JSName("status")
  var status_Challenge: String
  var `type`: String
  var url: String
  var validated: js.UndefOr[String] = js.undefined
}

object Challenge {
  @scala.inline
  def apply(status: String, `type`: String, url: String, error: js.Object = null, validated: String = null): Challenge = {
    val __obj = js.Dynamic.literal(status = status, url = url)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (validated != null) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[Challenge]
  }
}

