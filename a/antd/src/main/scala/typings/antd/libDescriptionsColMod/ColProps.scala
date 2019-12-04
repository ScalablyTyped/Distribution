package typings.antd.libDescriptionsColMod

import typings.antd.antdStrings.content
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.label
import typings.antd.antdStrings.vertical
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps extends js.Object {
  var bordered: Boolean
  var child: ReactElement
  var colon: Boolean
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var `type`: js.UndefOr[label | content] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    bordered: Boolean,
    child: ReactElement,
    colon: Boolean,
    layout: horizontal | vertical = null,
    `type`: label | content = null
  ): ColProps = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

