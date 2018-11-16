package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "BufferedProcess")
@js.native
class BufferedProcess protected () extends js.Object {
  def this(options: ProcessOptions) = this()
  val process: js.UndefOr[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  // Helper Methods
  /** Terminate the process. */
  def kill(): scala.Unit = js.native
  // Event Subscription
  /**
       *  Will call your callback when an error will be raised by the process. Usually
       *  this is due to the command not being available or not on the PATH. You can
       *  call handle() on the object passed to your callback to indicate that you
       *  have handled this error.
       */
  def onWillThrowError(callback: js.Function1[/* errorObject */ HandleableErrorEvent, scala.Unit]): Disposable = js.native
  /** Runs the process. */
  def start(): scala.Unit = js.native
}

