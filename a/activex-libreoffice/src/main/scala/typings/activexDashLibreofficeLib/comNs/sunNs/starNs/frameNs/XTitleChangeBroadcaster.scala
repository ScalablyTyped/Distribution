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

