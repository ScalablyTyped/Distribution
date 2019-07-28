package typings.antd

import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.danger
import typings.antd.antdStrings.dashed
import typings.antd.antdStrings.default
import typings.antd.antdStrings.focus
import typings.antd.antdStrings.ghost
import typings.antd.antdStrings.hover
import typings.antd.antdStrings.left
import typings.antd.antdStrings.leftBottom
import typings.antd.antdStrings.leftTop
import typings.antd.antdStrings.link
import typings.antd.antdStrings.primary
import typings.antd.antdStrings.right
import typings.antd.antdStrings.rightBottom
import typings.antd.antdStrings.rightTop
import typings.antd.antdStrings.top
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var disabled: Boolean
  var icon: Element
  var okType: js.UndefOr[link | default | dashed | primary | ghost | danger] = js.undefined
  var placement: js.UndefOr[
    left | right | top | bottom | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[click | focus | contextMenu | hover] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: Element,
    transitionName: String,
    okType: link | default | dashed | primary | ghost | danger = null,
    placement: left | right | top | bottom | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: click | focus | contextMenu | hover = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(disabled = disabled, icon = icon, transitionName = transitionName)
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

