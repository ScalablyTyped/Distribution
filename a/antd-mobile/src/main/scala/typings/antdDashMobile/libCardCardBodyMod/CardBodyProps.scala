package typings.antdDashMobile.libCardCardBodyMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends HTMLProps[HTMLDivElement] {
  var prefixCls: js.UndefOr[String] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[HTMLDivElement] = null, prefixCls: String = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardBodyProps]
  }
}

