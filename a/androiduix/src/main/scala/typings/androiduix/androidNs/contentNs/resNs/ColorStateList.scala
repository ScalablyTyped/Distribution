package typings.androiduix.androidNs.contentNs.resNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res.ColorStateList")
@js.native
class ColorStateList protected () extends js.Object {
  def this(states: js.Array[js.Array[Double]], colors: js.Array[Double]) = this()
  var mColors: js.Array[Double] = js.native
  var mDefaultColor: Double = js.native
  var mStateSpecs: js.Array[js.Array[Double]] = js.native
  def getColorForState(stateSet: js.Array[Double], defaultColor: Double): Double = js.native
  def getDefaultColor(): Double = js.native
  def isStateful(): Boolean = js.native
  def withAlpha(alpha: Double): ColorStateList = js.native
}

/* static members */
@JSGlobal("android.content.res.ColorStateList")
@js.native
object ColorStateList extends js.Object {
  var EMPTY: js.Any = js.native
  var sCache: js.Any = js.native
  def createFromXml(r: Resources, parser: HTMLElement): ColorStateList = js.native
  def valueOf(color: Double): ColorStateList = js.native
}

