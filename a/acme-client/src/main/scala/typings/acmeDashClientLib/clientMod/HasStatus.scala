package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasStatus extends js.Object {
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object HasStatus {
  @scala.inline
  def apply(status: java.lang.String = null): HasStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[HasStatus]
  }
}

