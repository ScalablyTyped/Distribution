package typings.androiduix.android.graphics.drawable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  def isRunning(): Boolean
  def start(): Unit
  def stop(): Unit
}

@JSGlobal("android.graphics.drawable.Animatable")
@js.native
object Animatable extends js.Object {
  def isImpl(obj: js.Any): js.Any = js.native
}

