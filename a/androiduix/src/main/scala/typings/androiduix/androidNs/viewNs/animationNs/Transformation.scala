package typings.androiduix.androidNs.viewNs.animationNs

import typings.androiduix.androidNs.graphicsNs.Matrix
import typings.androiduix.javaNs.langNs.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.Transformation")
@js.native
class Transformation () extends js.Object {
  var mAlpha: Double = js.native
  var mMatrix: Matrix = js.native
  var mTransformationType: Double = js.native
  def clear(): Unit = js.native
  def compose(t: Transformation): Unit = js.native
  def getAlpha(): Double = js.native
  def getMatrix(): Matrix = js.native
  def getTransformationType(): Double = js.native
  def postCompose(t: Transformation): Unit = js.native
  def set(t: Transformation): Unit = js.native
  def setAlpha(alpha: Double): Unit = js.native
  def setTransformationType(transformationType: Double): Unit = js.native
  def toShortString(): Unit = js.native
  def toShortString(sb: StringBuilder): Unit = js.native
}

/* static members */
@JSGlobal("android.view.animation.Transformation")
@js.native
object Transformation extends js.Object {
  var TYPE_ALPHA: Double = js.native
  var TYPE_BOTH: Double = js.native
  var TYPE_IDENTITY: Double = js.native
  var TYPE_MATRIX: Double = js.native
}

