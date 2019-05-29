package typings
package asyncDashDoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object asyncDashDoneMod {
  type AsyncTask[R] = (js.Function1[(/* done */ Callback[R]) | (/* done */ VoidCallback), scala.Unit]) | (js.Function0[
    nodeLib.childUnderscoreProcessMod.ChildProcess | nodeLib.eventsMod.EventEmitter | Observable[R] | js.Thenable[R] | nodeLib.streamMod.Stream
  ])
  /**
    * Represents a callback function used to signal the completion of a
    * task without any result value.
    */
  type VoidCallback = js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
}
