package typings.antdMobileRn.indexNativeMod

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionHeader extends js.Object {
  var content: ReactElement
  var style: StyleProp[ViewStyle]
  var title: String
}

object AccordionHeader {
  @scala.inline
  def apply(
    content: ReactElement,
    title: String,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): AccordionHeader = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionHeader]
  }
}

