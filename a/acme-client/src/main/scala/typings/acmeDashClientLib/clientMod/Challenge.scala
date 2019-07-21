package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Challenge extends HasStatus {
  var error: js.UndefOr[js.Object] = js.undefined
  @JSName("status")
  var status_Challenge: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
  var validated: js.UndefOr[java.lang.String] = js.undefined
}

object Challenge {
  @scala.inline
  def apply(
    status: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    error: js.Object = null,
    validated: java.lang.String = null
  ): Challenge = {
    val __obj = js.Dynamic.literal(status = status, url = url)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (validated != null) __obj.updateDynamic("validated")(validated)
    __obj.asInstanceOf[Challenge]
  }
}

