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

