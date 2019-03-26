package typings
package agDashGridLib.distLibGridCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridCore", "GridCore")
@js.native
class GridCore ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var doingVirtualPaging: js.Any = js.native
  var eGridDiv: js.Any = js.native
  var eRootWrapperBody: js.Any = js.native
  var enterprise: js.Any = js.native
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var finished: js.Any = js.native
  var focusedCellController: js.Any = js.native
  var frameworkFactory: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptions: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var logger: js.Any = js.native
  var loggerFactory: agDashGridLib.distLibLoggerMod.LoggerFactory = js.native
  var pivotCompFactory: js.Any = js.native
  var popupService: js.Any = js.native
  var quickFilterOnScope: js.Any = js.native
  var rowGroupCompFactory: js.Any = js.native
  var rowModel: js.Any = js.native
  var rowRenderer: js.Any = js.native
  var statusBar: js.Any = js.native
  var toolPanelComp: js.Any = js.native
  /* private */ def addRtlSupport(): js.Any = js.native
  def ensureNodeVisible(comparator: js.Any): scala.Unit = js.native
  def ensureNodeVisible(comparator: js.Any, position: java.lang.String): scala.Unit = js.native
  def getPreferredWidth(): scala.Double = js.native
  def getRootGui(): stdLib.HTMLElement = js.native
  @JSName("init")
  def init_MGridCore(): scala.Unit = js.native
  def isToolPanelShowing(): scala.Boolean = js.native
  /* private */ def onGridSizeChanged(): js.Any = js.native
  def showToolPanel(show: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/gridCore", "GridCore")
@js.native
object GridCore extends js.Object {
  var TEMPLATE_ENTERPRISE: js.Any = js.native
  var TEMPLATE_NORMAL: js.Any = js.native
}

