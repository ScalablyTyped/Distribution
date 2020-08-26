package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * event contains the reasons and the data for the {@link XEngineListener.finished()} method.
  * @deprecated Deprecated
  */
@js.native
trait FinishEngineEvent extends EventObject {
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String = js.native
  /** specifies why the script terminates. */
  var Finish: FinishReason = js.native
  /**
    * contains the return value.
    *
    * This field is only valid if {@link FinishEngineEvent.Finish} is FinishReason::OK.
    */
  var Return: js.Any = js.native
}

object FinishEngineEvent {
  @scala.inline
  def apply(ErrorMessage: String, Finish: FinishReason, Return: js.Any, Source: XInterface): FinishEngineEvent = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Finish = Finish.asInstanceOf[js.Any], Return = Return.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishEngineEvent]
  }
  @scala.inline
  implicit class FinishEngineEventOps[Self <: FinishEngineEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: FinishReason): Self = this.set("Finish", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturn(value: js.Any): Self = this.set("Return", value.asInstanceOf[js.Any])
  }
  
}

