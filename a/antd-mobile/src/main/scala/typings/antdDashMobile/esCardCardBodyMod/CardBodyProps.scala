package typings.antdDashMobile.esCardCardBodyMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var prefixCls: js.UndefOr[String] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    prefixCls: String = null
  ): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardBodyProps]
  }
}

