package typings
package athenajsLib.athenajsMod

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
  def Dom(): _Dom[stdLib.HTMLElement] = js.native
  def Dom(sel: java.lang.String): _Dom[stdLib.HTMLElement] = js.native
  def Dom(sel: stdLib.HTMLElement): _Dom[stdLib.HTMLElement] = js.native
}

