package typings
package autoDashBindLib.autoDashBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBindModule[selfT] extends AutoBindFunction[selfT] {
  @JSName("react")
  var react_Original: AutoBindFunction[selfT] = js.native
  def react(self: selfT): selfT = js.native
  def react(self: selfT, options: AutoBindOptions): selfT = js.native
}

