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

