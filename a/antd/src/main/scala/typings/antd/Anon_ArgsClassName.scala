package typings.antd

import typings.moment.momentMod.Moment
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsClassName extends js.Object {
  var className: Requireable[String]
  var dateCellRender: Requireable[js.Function1[/* repeated */ _, _]]
  var dateFullCellRender: Requireable[js.Function1[/* repeated */ _, _]]
  var fullscreen: Requireable[Boolean]
  var headerRender: Requireable[js.Function1[/* repeated */ _, _]]
  var locale: Requireable[js.Object]
  var monthCellRender: Requireable[js.Function1[/* repeated */ _, _]]
  var monthFullCellRender: Requireable[js.Function1[/* repeated */ _, _]]
  var onChange: Requireable[js.Function1[/* repeated */ _, _]]
  var onPanelChange: Requireable[js.Function1[/* repeated */ _, _]]
  var onSelect: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
  var style: Requireable[js.Object]
  var value: Requireable[Moment]
}

object Anon_ArgsClassName {
  @scala.inline
  def apply(
    className: Requireable[String],
    dateCellRender: Requireable[js.Function1[/* repeated */ _, _]],
    dateFullCellRender: Requireable[js.Function1[/* repeated */ _, _]],
    fullscreen: Requireable[Boolean],
    headerRender: Requireable[js.Function1[/* repeated */ _, _]],
    locale: Requireable[js.Object],
    monthCellRender: Requireable[js.Function1[/* repeated */ _, _]],
    monthFullCellRender: Requireable[js.Function1[/* repeated */ _, _]],
    onChange: Requireable[js.Function1[/* repeated */ _, _]],
    onPanelChange: Requireable[js.Function1[/* repeated */ _, _]],
    onSelect: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String],
    style: Requireable[js.Object],
    value: Requireable[Moment]
  ): Anon_ArgsClassName = {
    val __obj = js.Dynamic.literal(className = className, dateCellRender = dateCellRender, dateFullCellRender = dateFullCellRender, fullscreen = fullscreen, headerRender = headerRender, locale = locale, monthCellRender = monthCellRender, monthFullCellRender = monthFullCellRender, onChange = onChange, onPanelChange = onPanelChange, onSelect = onSelect, prefixCls = prefixCls, style = style, value = value)
  
    __obj.asInstanceOf[Anon_ArgsClassName]
  }
}

