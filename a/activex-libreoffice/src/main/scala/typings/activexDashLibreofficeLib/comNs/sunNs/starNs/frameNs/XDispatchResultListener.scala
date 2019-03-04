package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * listener for results of {@link XNotifyingDispatch.dispatchWithNotification()}
  * @see XNotifyingDispatch
  */
trait XDispatchResultListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * indicates finished dispatch
    * @param Result contains the result of the dispatch action
    * @see DispatchResultEvent
    */
  def dispatchFinished(Result: DispatchResultEvent): scala.Unit
}

object XDispatchResultListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    dispatchFinished: js.Function1[DispatchResultEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDispatchResultListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, dispatchFinished = dispatchFinished, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDispatchResultListener]
  }
}

