package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to register for title changed events. */
trait XTitleChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Add a listener */
  def addTitleChangeListener(xListener: XTitleChangeListener): scala.Unit
  /** Remove a listener */
  def removeTitleChangeListener(xListener: XTitleChangeListener): scala.Unit
}

object XTitleChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addTitleChangeListener: XTitleChangeListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTitleChangeListener: XTitleChangeListener => scala.Unit
  ): XTitleChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addTitleChangeListener = js.Any.fromFunction1(addTitleChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTitleChangeListener = js.Any.fromFunction1(removeTitleChangeListener))
  
    __obj.asInstanceOf[XTitleChangeBroadcaster]
  }
}

