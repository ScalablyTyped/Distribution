package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.RotateAnimation")
@js.native
class RotateAnimation protected () extends Animation {
  def this(fromDegrees: Double, toDegrees: Double) = this()
  def this(fromDegrees: Double, toDegrees: Double, pivotXType: Double) = this()
  def this(fromDegrees: Double, toDegrees: Double, pivotXType: Double, pivotXValue: Double) = this()
  def this(
    fromDegrees: Double,
    toDegrees: Double,
    pivotXType: Double,
    pivotXValue: Double,
    pivotYType: Double
  ) = this()
  def this(
    fromDegrees: Double,
    toDegrees: Double,
    pivotXType: Double,
    pivotXValue: Double,
    pivotYType: Double,
    pivotYValue: Double
  ) = this()
  var mFromDegrees: js.Any = js.native
  var mPivotX: js.Any = js.native
  var mPivotXType: js.Any = js.native
  var mPivotXValue: js.Any = js.native
  var mPivotY: js.Any = js.native
  var mPivotYType: js.Any = js.native
  var mPivotYValue: js.Any = js.native
  var mToDegrees: js.Any = js.native
  /* private */ def initializePivotPoint(): js.Any = js.native
}

