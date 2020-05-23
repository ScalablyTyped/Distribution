package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var `1`: String
  var `2`: js.UndefOr[String] = js.undefined
  var `3`: js.UndefOr[String] = js.undefined
}

object `1` {
  @scala.inline
  def apply(`1`: String, `2`: String = null, `3`: String = null): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

