package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
trait DispatchResultEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** describes result for given **State** */
  var Result: js.Any
  /** describes state of dispatch */
  var State: scala.Double
}

object DispatchResultEvent {
  @scala.inline
  def apply(
    Result: js.Any,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    State: scala.Double
  ): DispatchResultEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Result")(Result)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[DispatchResultEvent]
  }
}

