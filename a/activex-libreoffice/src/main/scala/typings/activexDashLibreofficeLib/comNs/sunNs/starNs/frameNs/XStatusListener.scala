package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events when the state of a feature changes.
  *
  * Nobody guarantee any notification. Use combination of {@link XNotifyingDispatch} and {@link XDispatchResultListener} for that.
  * @see XDispatch
  * @see XNotifyingDispatch
  * @see XDispatchResultListener
  */
trait XStatusListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when the status of the feature changes.
    * @param State provides information about changes of the requested feature
    */
  def statusChanged(State: FeatureStateEvent): scala.Unit
}

object XStatusListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    statusChanged: FeatureStateEvent => scala.Unit
  ): XStatusListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), statusChanged = js.Any.fromFunction1(statusChanged))
  
    __obj.asInstanceOf[XStatusListener]
  }
}

