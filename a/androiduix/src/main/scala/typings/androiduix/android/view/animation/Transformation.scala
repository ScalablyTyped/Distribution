package typings.androiduix.android.view.animation

import typings.androiduix.android.graphics.Matrix
import typings.androiduix.java_.lang.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformation extends js.Object {
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

