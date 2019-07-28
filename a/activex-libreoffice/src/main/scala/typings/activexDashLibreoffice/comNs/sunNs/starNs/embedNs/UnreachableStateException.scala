package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception can be thrown in case specified state can not be reached. */
trait UnreachableStateException extends Exception {
  /** The current state of the object. */
  var CurrentState: Double
  /** The state that could not be reached. */
  var NextState: Double
}

object UnreachableStateException {
  @scala.inline
  def apply(Context: XInterface, CurrentState: Double, Message: String, NextState: Double): UnreachableStateException = {
    val __obj = js.Dynamic.literal(Context = Context, CurrentState = CurrentState, Message = Message, NextState = NextState)
  
    __obj.asInstanceOf[UnreachableStateException]
  }
}

