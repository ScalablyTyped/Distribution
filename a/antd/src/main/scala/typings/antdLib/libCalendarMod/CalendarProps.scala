package typings
package antdLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dateCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var dateFullCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean]] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var monthCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var monthFullCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Unit]
  ] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], 
      /* mode */ js.UndefOr[CalendarMode], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var validRange: js.UndefOr[
    js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment]
  ] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

