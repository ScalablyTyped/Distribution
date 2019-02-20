package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners which are called whenever an accessibility event (see {@link AccessibleEventObject} ) occurs.
  * @see AccessibleEventObject
  * @see XAccessibleEventListener
  * @since OOo 1.1.2
  */
trait XAccessibleEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers the given {@link XAccessibleEventListener} . */
  def addAccessibleEventListener(xListener: XAccessibleEventListener): scala.Unit
  /** unregisters the given {@link XAccessibleEventListener} . */
  def removeAccessibleEventListener(xListener: XAccessibleEventListener): scala.Unit
}

