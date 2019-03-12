package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to page through the document in steps of the displayed size. */
trait XScreenCursor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** scrolls the view forward by one visible page. */
  def screenDown(): scala.Boolean
  /** scrolls the view backward by one visible page. */
  def screenUp(): scala.Boolean
}

object XScreenCursor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    screenDown: () => scala.Boolean,
    screenUp: () => scala.Boolean
  ): XScreenCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), screenDown = js.Any.fromFunction0(screenDown), screenUp = js.Any.fromFunction0(screenUp))
  
    __obj.asInstanceOf[XScreenCursor]
  }
}

