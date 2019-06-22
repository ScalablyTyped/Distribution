package typings
package antdLib.esMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageType extends js.Object {
  var promise: js.Promise[scala.Unit] = js.native
  def apply(): scala.Unit = js.native
  def `then`(fill: ThenableArgument, reject: ThenableArgument): js.Promise[scala.Unit] = js.native
}

