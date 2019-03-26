package typings
package agDashGridLib.distLibInterfacesIToolPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolPanel
  extends agDashGridLib.distLibInterfacesIComponentMod.IComponent[js.Any] {
  def getPreferredWidth(): scala.Double
  def isToolPanelShowing(): scala.Boolean
  def refresh(): scala.Unit
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit
  def showToolPanel(show: scala.Boolean): scala.Unit
}

object IToolPanel {
  @scala.inline
  def apply(
    getGui: () => stdLib.HTMLElement,
    getPreferredWidth: () => scala.Double,
    isToolPanelShowing: () => scala.Boolean,
    refresh: () => scala.Unit,
    registerGridComp: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel => scala.Unit,
    showToolPanel: scala.Boolean => scala.Unit,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    init: js.Any => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null
  ): IToolPanel = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getPreferredWidth = js.Any.fromFunction0(getPreferredWidth), isToolPanelShowing = js.Any.fromFunction0(isToolPanelShowing), refresh = js.Any.fromFunction0(refresh), registerGridComp = js.Any.fromFunction1(registerGridComp), showToolPanel = js.Any.fromFunction1(showToolPanel))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IToolPanel]
  }
}

