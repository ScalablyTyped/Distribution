package typings.atom.mod

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atom", "BufferedProcess")
@js.native
class BufferedProcess protected () extends StObject {
  def this(options: ProcessOptions) = this()
  
  // Helper Methods
  /** Terminate the process. */
  def kill(): Unit = js.native
  
  // Event Subscription
  /**
    *  Will call your callback when an error will be raised by the process. Usually
    *  this is due to the command not being available or not on the PATH. You can
    *  call handle() on the object passed to your callback to indicate that you
    *  have handled this error.
    */
  def onWillThrowError(callback: js.Function1[/* errorObject */ HandleableErrorEvent, Unit]): Disposable = js.native
  
  val process: js.UndefOr[ChildProcess] = js.native
  
  /** Runs the process. */
  def start(): Unit = js.native
}
