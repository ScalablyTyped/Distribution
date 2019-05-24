package typings
package antdLib.libGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  var align: js.UndefOr[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.bottom
  ] = js.undefined
  var gutter: js.UndefOr[scala.Double | antdLib.PartialRecordBreakpointnumber] = js.undefined
  var justify: js.UndefOr[
    antdLib.antdLibStrings.start | antdLib.antdLibStrings.end | antdLib.antdLibStrings.center | antdLib.antdLibStrings.`space-around` | antdLib.antdLibStrings.`space-between`
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[antdLib.antdLibStrings.flex] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    align: antdLib.antdLibStrings.top | antdLib.antdLibStrings.middle | antdLib.antdLibStrings.bottom = null,
    gutter: scala.Double | antdLib.PartialRecordBreakpointnumber = null,
    justify: antdLib.antdLibStrings.start | antdLib.antdLibStrings.end | antdLib.antdLibStrings.center | antdLib.antdLibStrings.`space-around` | antdLib.antdLibStrings.`space-between` = null,
    prefixCls: java.lang.String = null,
    `type`: antdLib.antdLibStrings.flex = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowProps]
  }
}

