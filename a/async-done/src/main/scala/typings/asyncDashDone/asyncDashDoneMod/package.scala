package typings.asyncDashDone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashDoneMod {
  import typings.node.childUnderscoreProcessMod.ChildProcess
  import typings.node.eventsMod.EventEmitter
  import typings.node.streamMod.Stream
  import typings.std.Error

  type AsyncTask[R] = (js.Function1[(/* done */ Callback[R]) | (/* done */ VoidCallback), Unit]) | (js.Function0[ChildProcess | EventEmitter | Observable[R] | js.Thenable[R] | Stream])
  /**
    * Represents a callback function used to signal the completion of a
    * task without any result value.
    */
  type VoidCallback = js.Function1[/* err */ Error | Null, Unit]
}
