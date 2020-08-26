package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the result of the dispatch action, if State is set to SUCCESS
  *
  * The type of the result is dispatch action dependent. The member State can be set to one of the values defined in {@link DispatchResultState} . If
  * State is set to {@link DispatchResultState.FAILURE} , Result may specify the reason (or is empty). The type is also dispatch action dependent. If
  * State is set to {@link DispatchResultState.DONTKNOW} , Result is empty.
  * @see DispatchResultState
  */
@js.native
trait DispatchResultEvent extends EventObject {
  /** describes result for given **State** */
  var Result: js.Any = js.native
  /** describes state of dispatch */
  var State: Double = js.native
}

object DispatchResultEvent {
  @scala.inline
  def apply(Result: js.Any, Source: XInterface, State: Double): DispatchResultEvent = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchResultEvent]
  }
  @scala.inline
  implicit class DispatchResultEventOps[Self <: DispatchResultEvent] (val x: Self) extends AnyVal {
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
    def setResult(value: js.Any): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("State", value.asInstanceOf[js.Any])
  }
  
}

