package typings
package antdDashMobileLib.esCardCardBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] {
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    prefixCls: java.lang.String = null
  ): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardBodyProps]
  }
}

