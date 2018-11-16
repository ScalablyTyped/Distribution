package typings
package androiduixLib.androidNs.contentNs.resNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.res.ColorStateList")
@js.native
class ColorStateList protected () extends js.Object {
  def this(states: js.Array[js.Array[scala.Double]], colors: js.Array[scala.Double]) = this()
  var mColors: js.Array[scala.Double] = js.native
  var mDefaultColor: scala.Double = js.native
  var mStateSpecs: js.Array[js.Array[scala.Double]] = js.native
  def getColorForState(stateSet: js.Array[scala.Double], defaultColor: scala.Double): scala.Double = js.native
  def getDefaultColor(): scala.Double = js.native
  def isStateful(): scala.Boolean = js.native
  def withAlpha(alpha: scala.Double): ColorStateList = js.native
}

@JSGlobal("android.content.res.ColorStateList")
@js.native
object ColorStateList extends js.Object {
  var EMPTY: js.Any = js.native
  var sCache: js.Any = js.native
  def createFromXml(r: androiduixLib.androidNs.contentNs.resNs.Resources, parser: stdLib.HTMLElement): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
  def valueOf(color: scala.Double): androiduixLib.androidNs.contentNs.resNs.ColorStateList = js.native
}

