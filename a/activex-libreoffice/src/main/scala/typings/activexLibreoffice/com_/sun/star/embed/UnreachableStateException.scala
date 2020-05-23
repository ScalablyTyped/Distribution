package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], CurrentState = CurrentState.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextState = NextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnreachableStateException]
  }
}

