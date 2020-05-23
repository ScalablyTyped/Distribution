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
trait DispatchResultEvent extends EventObject {
  /** describes result for given **State** */
  var Result: js.Any
  /** describes state of dispatch */
  var State: Double
}

object DispatchResultEvent {
  @scala.inline
  def apply(Result: js.Any, Source: XInterface, State: Double): DispatchResultEvent = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchResultEvent]
  }
}

