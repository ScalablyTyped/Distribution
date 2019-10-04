package typings.antd.esGridRowMod

import typings.antd.PartialRecordBreakpointnumber
import typings.antd.antdStrings.`space-around`
import typings.antd.antdStrings.`space-between`
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.flex
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.start
import typings.antd.antdStrings.stretch
import typings.antd.antdStrings.top
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends HTMLAttributes[HTMLDivElement] {
  var align: js.UndefOr[top | middle | bottom | stretch] = js.undefined
  var gutter: js.UndefOr[Double | PartialRecordBreakpointnumber] = js.undefined
  var justify: js.UndefOr[start | end | center | `space-around` | `space-between`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[flex] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    align: top | middle | bottom | stretch = null,
    gutter: Double | PartialRecordBreakpointnumber = null,
    justify: start | end | center | `space-around` | `space-between` = null,
    prefixCls: String = null,
    `type`: flex = null
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

