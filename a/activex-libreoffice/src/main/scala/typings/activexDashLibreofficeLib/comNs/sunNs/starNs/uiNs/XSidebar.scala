package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of the sidebar that allows its elements like panels to eg request layouts. */
trait XSidebar extends js.Object {
  /**
    * Request layout of the sidebar. Call this method when one of the panels wants to change its size due to late initilization or different content after a
    * context change.
    */
  def requestLayout(): scala.Unit
}

object XSidebar {
  @scala.inline
  def apply(requestLayout: () => scala.Unit): XSidebar = {
    val __obj = js.Dynamic.literal(requestLayout = js.Any.fromFunction0(requestLayout))
  
    __obj.asInstanceOf[XSidebar]
  }
}

