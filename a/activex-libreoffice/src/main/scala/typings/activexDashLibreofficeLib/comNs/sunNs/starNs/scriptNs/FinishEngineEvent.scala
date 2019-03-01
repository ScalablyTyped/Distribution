package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * event contains the reasons and the data for the {@link XEngineListener.finished()} method.
  * @deprecated Deprecated
  */
trait FinishEngineEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: java.lang.String
  /** specifies why the script terminates. */
  var Finish: FinishReason
  /**
    * contains the return value.
    *
    * This field is only valid if {@link FinishEngineEvent.Finish} is FinishReason::OK.
    */
  var Return: js.Any
}

object FinishEngineEvent {
  @scala.inline
  def apply(
    ErrorMessage: java.lang.String,
    Finish: FinishReason,
    Return: js.Any,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): FinishEngineEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    __obj.updateDynamic("Finish")(Finish)
    __obj.updateDynamic("Return")(Return)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[FinishEngineEvent]
  }
}

