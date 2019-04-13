package typings
package antdLib.libGridColMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var lg: js.UndefOr[ColSpanType | ColSize] = js.undefined
  var md: js.UndefOr[ColSpanType | ColSize] = js.undefined
  var offset: js.UndefOr[ColSpanType] = js.undefined
  var order: js.UndefOr[ColSpanType] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var pull: js.UndefOr[ColSpanType] = js.undefined
  var push: js.UndefOr[ColSpanType] = js.undefined
  var sm: js.UndefOr[ColSpanType | ColSize] = js.undefined
  var span: js.UndefOr[ColSpanType] = js.undefined
  var xl: js.UndefOr[ColSpanType | ColSize] = js.undefined
  var xs: js.UndefOr[ColSpanType | ColSize] = js.undefined
  var xxl: js.UndefOr[ColSpanType | ColSize] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    lg: ColSpanType | ColSize = null,
    md: ColSpanType | ColSize = null,
    offset: ColSpanType = null,
    order: ColSpanType = null,
    prefixCls: java.lang.String = null,
    pull: ColSpanType = null,
    push: ColSpanType = null,
    sm: ColSpanType | ColSize = null,
    span: ColSpanType = null,
    xl: ColSpanType | ColSize = null,
    xs: ColSpanType | ColSize = null,
    xxl: ColSpanType | ColSize = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xxl != null) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

