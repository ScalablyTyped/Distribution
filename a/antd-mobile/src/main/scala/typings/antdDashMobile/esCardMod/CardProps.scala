package typings.antdDashMobile.esCardMod

import typings.antdDashMobile.esCardPropsTypeMod.CardPropsType
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps
  extends AllHTMLAttributes[HTMLDivElement]
     with CardPropsType
     with ClassAttributes[HTMLDivElement] {
  var prefixCls: js.UndefOr[String] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    CardPropsType: CardPropsType = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    prefixCls: String = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, CardPropsType)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardProps]
  }
}

