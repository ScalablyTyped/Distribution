package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.TypedValue")
@js.native
class TypedValue () extends js.Object

@JSGlobal("android.util.TypedValue")
@js.native
object TypedValue extends js.Object {
  var COMPLEX_UNIT_DIP: java.lang.String = js.native
  var COMPLEX_UNIT_DP: java.lang.String = js.native
  var COMPLEX_UNIT_EM: java.lang.String = js.native
  var COMPLEX_UNIT_FRACTION: java.lang.String = js.native
  var COMPLEX_UNIT_IN: java.lang.String = js.native
  var COMPLEX_UNIT_MM: java.lang.String = js.native
  var COMPLEX_UNIT_PT: java.lang.String = js.native
  var COMPLEX_UNIT_PX: java.lang.String = js.native
  var COMPLEX_UNIT_REM: java.lang.String = js.native
  var COMPLEX_UNIT_SP: java.lang.String = js.native
  var COMPLEX_UNIT_VH: java.lang.String = js.native
  var COMPLEX_UNIT_VW: java.lang.String = js.native
  var UNIT_SCALE_MAP: js.Any = js.native
  def applyDimension(unit: java.lang.String, size: scala.Double, dm: androiduixLib.androidNs.utilNs.DisplayMetrics): scala.Double = js.native
  def complexToDimension(valueWithUnit: java.lang.String): scala.Double = js.native
  def complexToDimension(valueWithUnit: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def complexToDimension(
    valueWithUnit: java.lang.String,
    baseValue: scala.Double,
    metrics: androiduixLib.androidNs.utilNs.DisplayMetrics
  ): scala.Double = js.native
  def complexToDimensionPixelOffset(valueWithUnit: java.lang.String): scala.Double = js.native
  def complexToDimensionPixelOffset(valueWithUnit: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def complexToDimensionPixelOffset(
    valueWithUnit: java.lang.String,
    baseValue: scala.Double,
    metrics: androiduixLib.androidNs.utilNs.DisplayMetrics
  ): scala.Double = js.native
  def complexToDimensionPixelSize(valueWithUnit: java.lang.String): scala.Double = js.native
  def complexToDimensionPixelSize(valueWithUnit: java.lang.String, baseValue: scala.Double): scala.Double = js.native
  def complexToDimensionPixelSize(
    valueWithUnit: java.lang.String,
    baseValue: scala.Double,
    metrics: androiduixLib.androidNs.utilNs.DisplayMetrics
  ): scala.Double = js.native
  /* private */ def initUnit(): js.Any = js.native
  def isDynamicUnitValue(valueWithUnit: java.lang.String): scala.Boolean = js.native
}

