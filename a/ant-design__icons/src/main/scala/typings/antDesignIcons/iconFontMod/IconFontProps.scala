package typings.antDesignIcons.iconFontMod

import typings.antDesignIcons.iconMod.IconBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconFontProps extends IconBaseProps {
  @JSName("type")
  var type_IconFontProps: String
}

object IconFontProps {
  @scala.inline
  def apply(`type`: String, IconBaseProps: IconBaseProps = null): IconFontProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (IconBaseProps != null) js.Dynamic.global.Object.assign(__obj, IconBaseProps)
    __obj.asInstanceOf[IconFontProps]
  }
}

