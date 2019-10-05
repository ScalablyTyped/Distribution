package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCallbacks extends ConnectionBase {
  def ping(): Unit = js.native
  def ping(callback: js.Function2[/* error */ ErrorInfo, /* responseTime */ Double, Unit]): Unit = js.native
  def whenState(targetState: ConnectionState, callback: connectionEventCallback): Unit = js.native
}

