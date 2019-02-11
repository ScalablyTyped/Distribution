package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPromise extends ConnectionBase {
  def ping(): js.Promise[scala.Double] = js.native
  def whenState(targetState: ConnectionState): js.Promise[ConnectionStateChange] = js.native
}

