package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCallbacks extends ConnectionBase {
  def ping(): scala.Unit = js.native
  def ping(callback: js.Function2[/* error */ ErrorInfo, /* responseTime */ scala.Double, scala.Unit]): scala.Unit = js.native
  def whenState(targetState: ConnectionState, callback: connectionEventCallback): scala.Unit = js.native
}

