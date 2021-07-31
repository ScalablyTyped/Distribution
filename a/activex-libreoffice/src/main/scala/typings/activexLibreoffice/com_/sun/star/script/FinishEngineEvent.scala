package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * event contains the reasons and the data for the {@link XEngineListener.finished()} method.
  * @deprecated Deprecated
  */
trait FinishEngineEvent
  extends StObject
     with EventObject {
  
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
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Finish = Finish.asInstanceOf[js.Any], Return = Return.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishEngineEvent]
  }
  
  @scala.inline
  implicit class FinishEngineEventMutableBuilder[Self <: FinishEngineEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: FinishReason): Self = StObject.set(x, "Finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn(value: js.Any): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
  }
}
