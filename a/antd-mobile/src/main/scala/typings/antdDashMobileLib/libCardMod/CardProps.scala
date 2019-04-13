package typings
package antdDashMobileLib.libCardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement]
     with antdDashMobileLib.libCardPropsTypeMod.CardPropsType {
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    CardPropsType: antdDashMobileLib.libCardPropsTypeMod.CardPropsType = null,
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    prefixCls: java.lang.String = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CardPropsType)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardProps]
  }
}

