package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
trait XEngineListener extends XEventListener {
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): Unit
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): Unit
  /** gets fired when the script gets into execution state. */
  def running(Evt: EventObject): Unit
}

object XEngineListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    finished: FinishEngineEvent => Unit,
    interrupt: InterruptEngineEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    running: EventObject => Unit
  ): XEngineListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), interrupt = js.Any.fromFunction1(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), running = js.Any.fromFunction1(running))
  
    __obj.asInstanceOf[XEngineListener]
  }
}

