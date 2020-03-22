package typings.antdMobileRn.listIndexNativeMod

import typings.antdMobileRn.AnonArrowV
import typings.antdMobileRn.antdMobileRnBooleans.`false`
import typings.antdMobileRn.listPropsTypeMod.ListPropsType
import typings.react.mod.ReactType
import typings.react.mod._Global_.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends ListPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[AnonArrowV] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonArrowV = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

