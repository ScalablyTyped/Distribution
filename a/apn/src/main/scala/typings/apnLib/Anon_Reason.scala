package typings
package apnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reason extends js.Object {
  var reason: java.lang.String
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Reason {
  @scala.inline
  def apply(reason: java.lang.String, timestamp: java.lang.String = null): Anon_Reason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Anon_Reason]
  }
}

