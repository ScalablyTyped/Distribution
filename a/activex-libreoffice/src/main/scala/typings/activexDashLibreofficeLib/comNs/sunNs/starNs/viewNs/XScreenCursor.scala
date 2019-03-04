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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    screenDown: js.Function0[scala.Boolean],
    screenUp: js.Function0[scala.Boolean]
  ): XScreenCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, screenDown = screenDown, screenUp = screenUp)
  
    __obj.asInstanceOf[XScreenCursor]
  }
}

