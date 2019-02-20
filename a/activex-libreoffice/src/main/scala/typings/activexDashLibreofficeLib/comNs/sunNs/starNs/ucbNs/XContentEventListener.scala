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

