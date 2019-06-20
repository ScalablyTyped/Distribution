package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** determines the action that is requested from the {@link XContextMenuInterceptor} . */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ContextMenuInterceptorAction extends js.Object

object ContextMenuInterceptorAction {
  /** the context menu must not be executed. The next registered {@link XContextMenuInterceptor} should not be notified. */
  @scala.inline
  def CANCELLED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** the menu has been modified and the next registered {@link XContextMenuInterceptor} should be notified. */
  @scala.inline
  def CONTINUE_MODIFIED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** the menu has been modified and should be executed without notifying the next registered {@link XContextMenuInterceptor} . */
  @scala.inline
  def EXECUTE_MODIFIED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** the {@link XContextMenuInterceptor} has ignored the call. The next registered {@link XContextMenuInterceptor} should be notified. */
  @scala.inline
  def IGNORED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

