package typings.androiduix.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  def isRunning(): Boolean
  def start(): Unit
  def stop(): Unit
}

object Animatable {
  @scala.inline
  def apply(isRunning: () => Boolean, start: () => Unit, stop: () => Unit): Animatable = {
    val __obj = js.Dynamic.literal(isRunning = js.Any.fromFunction0(isRunning), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Animatable]
  }
}

