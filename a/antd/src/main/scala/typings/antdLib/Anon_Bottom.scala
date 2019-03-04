package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var icon: reactLib.reactMod.Global.JSXNs.Element
  var okType: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger
  ]
  var placement: js.UndefOr[
    antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.leftTop | antdLib.antdLibStrings.leftBottom | antdLib.antdLibStrings.rightTop | antdLib.antdLibStrings.rightBottom
  ]
  var transitionName: java.lang.String
  var trigger: js.UndefOr[
    antdLib.antdLibStrings.click | antdLib.antdLibStrings.focus | antdLib.antdLibStrings.contextMenu | antdLib.antdLibStrings.hover
  ]
}

object Anon_Bottom {
  @scala.inline
  def apply(
    icon: reactLib.reactMod.Global.JSXNs.Element,
    transitionName: java.lang.String,
    okType: antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger = null,
    placement: antdLib.antdLibStrings.left | antdLib.antdLibStrings.right | antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.leftTop | antdLib.antdLibStrings.leftBottom | antdLib.antdLibStrings.rightTop | antdLib.antdLibStrings.rightBottom = null,
    trigger: antdLib.antdLibStrings.click | antdLib.antdLibStrings.focus | antdLib.antdLibStrings.contextMenu | antdLib.antdLibStrings.hover = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(icon = icon, transitionName = transitionName)
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

