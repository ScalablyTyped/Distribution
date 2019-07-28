package typings.athenajs.athenajsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AudioManager: _AudioManager = js.native
  val FX: FXInstance = js.native
  val InputManager: _InputManager = js.native
  val NotificationManager: _NotificationManager = js.native
  val ResourceManager: _ResourceManager = js.native
  def Dom(): _Dom[HTMLElement] = js.native
  def Dom(sel: String): _Dom[HTMLElement] = js.native
  def Dom(sel: HTMLElement): _Dom[HTMLElement] = js.native
}

