package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SliderProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[SliderValue] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var marks: js.UndefOr[SliderMarks] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ SliderValue, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tipFormatter: js.UndefOr[
    scala.Null | (js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var tooltipPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var tooltipVisible: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[SliderValue] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

