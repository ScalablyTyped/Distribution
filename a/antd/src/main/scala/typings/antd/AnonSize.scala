package typings.antd

import typings.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[AnonLang] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(bordered: js.UndefOr[Boolean] = js.undefined, locale: AnonLang = null, size: SizeType = null): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

