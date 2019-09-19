package typings.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var `1`: String
  var `2`: js.UndefOr[String] = js.undefined
  var `3`: js.UndefOr[String] = js.undefined
}

object Anon_1 {
  @scala.inline
  def apply(`1`: String, `2`: String = null, `3`: String = null): Anon_1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`)
    if (`2` != null) __obj.updateDynamic("2")(`2`)
    if (`3` != null) __obj.updateDynamic("3")(`3`)
    __obj.asInstanceOf[Anon_1]
  }
}

