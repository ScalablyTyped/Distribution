package typings
package atAngularCoreLib.srcRender3InterfacesPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
  var parent: js.UndefOr[Player | scala.Null] = js.native
  var state: PlayState = js.native
  def addEventListener(state: PlayState, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def addEventListener(state: java.lang.String, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
}

