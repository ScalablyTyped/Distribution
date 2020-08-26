package typings.androiduix.global.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.TypedValue")
@js.native
class TypedValue ()
  extends typings.androiduix.android.util.TypedValue

/* static members */
@JSGlobal("android.util.TypedValue")
@js.native
object TypedValue extends js.Object {
  var COMPLEX_UNIT_DIP: String = js.native
  var COMPLEX_UNIT_DP: String = js.native
  var COMPLEX_UNIT_EM: String = js.native
  var COMPLEX_UNIT_FRACTION: String = js.native
  var COMPLEX_UNIT_IN: String = js.native
  var COMPLEX_UNIT_MM: String = js.native
  var COMPLEX_UNIT_PT: String = js.native
  var COMPLEX_UNIT_PX: String = js.native
  var COMPLEX_UNIT_REM: String = js.native
  var COMPLEX_UNIT_SP: String = js.native
  var COMPLEX_UNIT_VH: String = js.native
  var COMPLEX_UNIT_VW: String = js.native
  var UNIT_SCALE_MAP: js.Any = js.native
  def applyDimension(unit: String, size: Double, dm: typings.androiduix.android.util.DisplayMetrics): Double = js.native
  def complexToDimension(valueWithUnit: String): Double = js.native
  def complexToDimension(
    valueWithUnit: String,
    baseValue: js.UndefOr[scala.Nothing],
    metrics: typings.androiduix.android.util.DisplayMetrics
  ): Double = js.native
  def complexToDimension(valueWithUnit: String, baseValue: Double): Double = js.native
  def complexToDimension(valueWithUnit: String, baseValue: Double, metrics: typings.androiduix.android.util.DisplayMetrics): Double = js.native
  def complexToDimensionPixelOffset(valueWithUnit: String): Double = js.native
  def complexToDimensionPixelOffset(
    valueWithUnit: String,
    baseValue: js.UndefOr[scala.Nothing],
    metrics: typings.androiduix.android.util.DisplayMetrics
  ): Double = js.native
  def complexToDimensionPixelOffset(valueWithUnit: String, baseValue: Double): Double = js.native
  def complexToDimensionPixelOffset(valueWithUnit: String, baseValue: Double, metrics: typings.androiduix.android.util.DisplayMetrics): Double = js.native
  def complexToDimensionPixelSize(valueWithUnit: String): Double = js.native
  def complexToDimensionPixelSize(
    valueWithUnit: String,
    baseValue: js.UndefOr[scala.Nothing],
    metrics: typings.androiduix.android.util.DisplayMetrics
  ): Double = js.native
  def complexToDimensionPixelSize(valueWithUnit: String, baseValue: Double): Double = js.native
  def complexToDimensionPixelSize(valueWithUnit: String, baseValue: Double, metrics: typings.androiduix.android.util.DisplayMetrics): Double = js.native
  /* private */ def initUnit(): js.Any = js.native
  def isDynamicUnitValue(valueWithUnit: String): Boolean = js.native
}

