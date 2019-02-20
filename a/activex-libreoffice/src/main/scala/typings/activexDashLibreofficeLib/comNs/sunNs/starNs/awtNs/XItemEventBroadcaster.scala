package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
trait XItemEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
}

