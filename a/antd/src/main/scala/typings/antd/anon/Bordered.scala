package typings.antd.anon

import typings.antd.generatePickerMod.PickerLocale
import typings.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bordered extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[PickerLocale] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object Bordered {
  @scala.inline
  def apply(bordered: js.UndefOr[Boolean] = js.undefined, locale: PickerLocale = null, size: SizeType = null): Bordered = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bordered]
  }
}

