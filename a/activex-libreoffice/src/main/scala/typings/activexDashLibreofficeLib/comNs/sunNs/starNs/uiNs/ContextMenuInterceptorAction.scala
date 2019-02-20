package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextMenuInterceptorAction extends js.Object

/** determines the action that is requested from the {@link XContextMenuInterceptor} . */
@JSGlobal("com.sun.star.ui.ContextMenuInterceptorAction")
@js.native
object ContextMenuInterceptorAction extends js.Object {
  /** the context menu must not be executed. The next registered {@link XContextMenuInterceptor} should not be notified. */
  @js.native
  sealed trait CANCELLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ContextMenuInterceptorAction
  
  /** the menu has been modified and the next registered {@link XContextMenuInterceptor} should be notified. */
  @js.native
  sealed trait CONTINUE_MODIFIED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ContextMenuInterceptorAction
  
  /** the menu has been modified and should be executed without notifying the next registered {@link XContextMenuInterceptor} . */
  @js.native
  sealed trait EXECUTE_MODIFIED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ContextMenuInterceptorAction
  
  /** the {@link XContextMenuInterceptor} has ignored the call. The next registered {@link XContextMenuInterceptor} should be notified. */
  @js.native
  sealed trait IGNORED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ContextMenuInterceptorAction
  
  /* 1 */ val CANCELLED: CANCELLED with scala.Double = js.native
  /* 3 */ val CONTINUE_MODIFIED: CONTINUE_MODIFIED with scala.Double = js.native
  /* 2 */ val EXECUTE_MODIFIED: EXECUTE_MODIFIED with scala.Double = js.native
  /* 0 */ val IGNORED: IGNORED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ContextMenuInterceptorAction with scala.Double
  ] = js.native
}

