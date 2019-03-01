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
    acquire: js.Function0[scala.Unit],
    notifyContextMenuExecute: js.Function1[ContextMenuExecuteEvent, ContextMenuInterceptorAction],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContextMenuInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("notifyContextMenuExecute")(notifyContextMenuExecute)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XContextMenuInterceptor]
  }
}

