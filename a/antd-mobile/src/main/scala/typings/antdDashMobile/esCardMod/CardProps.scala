package typings.antdDashMobile.esCardMod

import typings.antdDashMobile.esCardPropsTypeMod.CardPropsType
import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps
  extends HTMLProps[HTMLDivElement]
     with CardPropsType {
  var prefixCls: js.UndefOr[String] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    CardPropsType: CardPropsType = null,
    HTMLProps: HTMLProps[HTMLDivElement] = null,
    prefixCls: String = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CardPropsType)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardProps]
  }
}

