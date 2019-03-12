package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface enables the object to be registered as interceptor to change context menus or prevent them from being executed. */
trait XContextMenuInterceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * notifies the interceptor about the request to execute a ContextMenu. The interceptor has to decide whether the menu should be executed with or without
    * being modified or may ignore the call.
    */
  def notifyContextMenuExecute(aEvent: ContextMenuExecuteEvent): ContextMenuInterceptorAction
}

object XContextMenuInterceptor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    notifyContextMenuExecute: ContextMenuExecuteEvent => ContextMenuInterceptorAction,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XContextMenuInterceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), notifyContextMenuExecute = js.Any.fromFunction1(notifyContextMenuExecute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContextMenuInterceptor]
  }
}

