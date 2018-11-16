package typings
package antdLib.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageType extends js.Object {
  var promise: stdLib.Promise[_] = js.native
  def apply(): scala.Unit = js.native
  def `then`(fill: ThenableArgument, reject: ThenableArgument): stdLib.Promise[_] = js.native
}

