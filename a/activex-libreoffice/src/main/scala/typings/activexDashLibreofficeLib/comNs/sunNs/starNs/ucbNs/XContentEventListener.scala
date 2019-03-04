package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a listener for events related to XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called whenever a content wishes to notify changes.
    * @param evt the event.
    */
  def contentEvent(evt: ContentEvent): scala.Unit
}

object XContentEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    contentEvent: js.Function1[ContentEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, contentEvent = contentEvent, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContentEventListener]
  }
}

