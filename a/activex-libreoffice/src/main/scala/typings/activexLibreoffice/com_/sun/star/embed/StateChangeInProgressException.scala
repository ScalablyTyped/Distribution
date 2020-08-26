package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception can be thrown in case the object does not allow to call requested functionality currently because the object is changing state. */
@js.native
trait StateChangeInProgressException extends Exception {
  /**
    * contains the target state the object tries to reach currently.
    *
    * Contains a value from {@link EmbedStates} constant set.
    */
  var TargetState: Double = js.native
}

object StateChangeInProgressException {
  @scala.inline
  def apply(Context: XInterface, Message: String, TargetState: Double): StateChangeInProgressException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TargetState = TargetState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeInProgressException]
  }
  @scala.inline
  implicit class StateChangeInProgressExceptionOps[Self <: StateChangeInProgressException] (val x: Self) extends AnyVal {
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
    def setTargetState(value: Double): Self = this.set("TargetState", value.asInstanceOf[js.Any])
  }
  
}

