package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to receive callbacks from an asynchronous frame loader.
  * @see XFrameLoader
  */
trait XLoadEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when a frame load is canceled or failed.
    * @param Loader the source of this event
    */
  def loadCancelled(Loader: XFrameLoader): scala.Unit
  /**
    * is called when a new component is loaded into a frame successfully.
    * @param Loader the source of this event
    */
  def loadFinished(Loader: XFrameLoader): scala.Unit
}

