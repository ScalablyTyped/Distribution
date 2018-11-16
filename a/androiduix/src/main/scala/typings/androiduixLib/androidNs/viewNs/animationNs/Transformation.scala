package typings
package androiduixLib.androidNs.viewNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.Transformation")
@js.native
class Transformation () extends js.Object {
  var mAlpha: scala.Double = js.native
  var mMatrix: androiduixLib.androidNs.graphicsNs.Matrix = js.native
  var mTransformationType: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def compose(t: Transformation): scala.Unit = js.native
  def getAlpha(): scala.Double = js.native
  def getMatrix(): androiduixLib.androidNs.graphicsNs.Matrix = js.native
  def getTransformationType(): scala.Double = js.native
  def postCompose(t: Transformation): scala.Unit = js.native
  def set(t: Transformation): scala.Unit = js.native
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  def setTransformationType(transformationType: scala.Double): scala.Unit = js.native
  def toShortString(): scala.Unit = js.native
  def toShortString(sb: androiduixLib.javaNs.langNs.StringBuilder): scala.Unit = js.native
}

@JSGlobal("android.view.animation.Transformation")
@js.native
object Transformation extends js.Object {
  var TYPE_ALPHA: scala.Double = js.native
  var TYPE_BOTH: scala.Double = js.native
  var TYPE_IDENTITY: scala.Double = js.native
  var TYPE_MATRIX: scala.Double = js.native
}

