package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to receive callbacks from an asynchronous frame loader.
  * @see XFrameLoader
  */
trait XLoadEventListener extends XEventListener {
  /**
    * is called when a frame load is canceled or failed.
    * @param Loader the source of this event
    */
  def loadCancelled(Loader: XFrameLoader): Unit
  /**
    * is called when a new component is loaded into a frame successfully.
    * @param Loader the source of this event
    */
  def loadFinished(Loader: XFrameLoader): Unit
}

object XLoadEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    loadCancelled: XFrameLoader => Unit,
    loadFinished: XFrameLoader => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLoadEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), loadCancelled = js.Any.fromFunction1(loadCancelled), loadFinished = js.Any.fromFunction1(loadFinished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLoadEventListener]
  }
}

