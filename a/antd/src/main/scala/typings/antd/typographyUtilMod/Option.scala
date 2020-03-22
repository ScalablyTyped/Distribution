package typings.antd.typographyUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var rows: Double
  var suffix: js.UndefOr[String] = js.undefined
}

object Option {
  @scala.inline
  def apply(rows: Double, suffix: String = null): Option = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

