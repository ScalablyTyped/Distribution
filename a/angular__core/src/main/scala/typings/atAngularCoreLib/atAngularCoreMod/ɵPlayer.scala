package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵPlayer extends js.Object {
  var parent: js.UndefOr[ɵPlayer | scala.Null] = js.native
  var state: ɵPlayState = js.native
  def addEventListener(state: ɵPlayState, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def addEventListener(state: java.lang.String, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
}

