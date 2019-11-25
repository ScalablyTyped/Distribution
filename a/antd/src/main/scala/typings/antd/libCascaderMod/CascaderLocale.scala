package typings.antd.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderLocale extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
}

object CascaderLocale {
  @scala.inline
  def apply(placeholder: String = null): CascaderLocale = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderLocale]
  }
}

