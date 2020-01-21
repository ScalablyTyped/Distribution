package typings.antd.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectLocale extends js.Object {
  var notFoundContent: js.UndefOr[String] = js.undefined
}

object SelectLocale {
  @scala.inline
  def apply(notFoundContent: String = null): SelectLocale = {
    val __obj = js.Dynamic.literal()
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectLocale]
  }
}

