package typings.aframe.aframeMod

import org.scalablytyped.runtime.Instantiable0
import typings.tweenDotJs.TWEENNs.Tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenLib extends js.Object {
  var Easing: typings.tweenDotJs.Easing = js.native
  var Group: Instantiable0[typings.tweenDotJs.atTweenjsTweenDotJsMod.Group] = js.native
  var Interpolation: typings.tweenDotJs.Interpolation = js.native
  var Tween: Instantiable0[typings.tweenDotJs.atTweenjsTweenDotJsMod.Tween] = js.native
  def add(tween: Tween): Unit = js.native
  def getAll(): js.Array[Tween] = js.native
  def now(): Double = js.native
  def remove(tween: Tween): Unit = js.native
  def removeAll(): Unit = js.native
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

