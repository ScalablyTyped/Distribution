package typings
package androiduixLib.androidNs.graphicsNs.drawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  def isRunning(): scala.Boolean
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Animatable {
  @scala.inline
  def apply(isRunning: () => scala.Boolean, start: () => scala.Unit, stop: () => scala.Unit): Animatable = {
    val __obj = js.Dynamic.literal(isRunning = js.Any.fromFunction0(isRunning), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Animatable]
  }
}

