package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a scripting engine.
  * @deprecated Deprecated
  */
trait XEngineListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** gets fired when the script execution has finished. */
  def finished(Evt: FinishEngineEvent): scala.Unit
  /**
    * gets fired when an interrupt occurs during the script execution.
    *
    * If you call the method, the execution stops. So in this situation, the stack and variable values are still available by using the appropriate {@link
    * XDebugging} methods.
    */
  def interrupt(Evt: InterruptEngineEvent): scala.Unit
  /** gets fired when the script gets into execution state. */
  def running(Evt: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XEngineListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    finished: js.Function1[FinishEngineEvent, scala.Unit],
    interrupt: js.Function1[InterruptEngineEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    running: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XEngineListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("finished")(finished)
    __obj.updateDynamic("interrupt")(interrupt)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("running")(running)
    __obj.asInstanceOf[XEngineListener]
  }
}

