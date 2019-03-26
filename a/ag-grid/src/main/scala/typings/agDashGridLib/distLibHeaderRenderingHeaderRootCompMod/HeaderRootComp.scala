package typings
package agDashGridLib.distLibHeaderRenderingHeaderRootCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", "HeaderRootComp")
@js.native
class HeaderRootComp ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var autoWidthCalculator: js.Any = js.native
  var centerContainer: js.Any = js.native
  var childContainers: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var eHeaderContainer: js.Any = js.native
  var eHeaderViewport: js.Any = js.native
  var ePinnedLeftHeader: js.Any = js.native
  var ePinnedRightHeader: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var pinnedLeftContainer: js.Any = js.native
  var pinnedRightContainer: js.Any = js.native
  var scrollVisibleService: js.Any = js.native
  /* private */ def addPreventHeaderScroll(): js.Any = js.native
  def forEachHeaderElement(
    callback: js.Function1[
      /* renderedHeaderElement */ agDashGridLib.distLibWidgetsComponentMod.Component, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* private */ def onPivotModeChanged(): js.Any = js.native
  /* private */ def postConstruct(): js.Any = js.native
  def refreshHeader(): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setHorizontalScroll(offset: scala.Double): scala.Unit = js.native
  def setLeftVisible(visible: scala.Boolean): scala.Unit = js.native
  def setRightVisible(visible: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/headerRendering/headerRootComp", "HeaderRootComp")
@js.native
object HeaderRootComp extends js.Object {
  var TEMPLATE: js.Any = js.native
}

