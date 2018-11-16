package typings
package autoDashBindLib.autoDashBindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoBindModule[selfT]
  extends autoDashBindLib.autoDashBindMod.autoBindNs.AutoBindFunction[selfT] {
  @JSName("react")
  var react_Original: autoDashBindLib.autoDashBindMod.autoBindNs.AutoBindFunction[selfT] = js.native
  def react(self: selfT): selfT = js.native
  def react(self: selfT, options: autoDashBindLib.autoDashBindMod.autoBindNs.AutoBindOptions): selfT = js.native
}

