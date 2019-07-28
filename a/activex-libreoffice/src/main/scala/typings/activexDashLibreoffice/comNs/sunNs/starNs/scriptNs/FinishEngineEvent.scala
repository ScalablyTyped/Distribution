package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * event contains the reasons and the data for the {@link XEngineListener.finished()} method.
  * @deprecated Deprecated
  */
trait FinishEngineEvent extends EventObject {
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String
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
  def apply(ErrorMessage: String, Finish: FinishReason, Return: js.Any, Source: XInterface): FinishEngineEvent = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage, Finish = Finish, Return = Return, Source = Source)
  
    __obj.asInstanceOf[FinishEngineEvent]
  }
}

