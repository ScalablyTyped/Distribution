package typings.antDesignPro.tagSelectOptionMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSelectOptionProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String | Double, /* state */ Boolean, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TagSelectOptionProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* value */ String | Double, /* state */ Boolean) => Unit = null,
    style: CSSProperties = null,
    value: String | Double = null
  ): TagSelectOptionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSelectOptionProps]
  }
}

