package typings.agDashGrid.distLibHeaderRenderingHeaderRowCompMod

import typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DropTarget
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/headerRowComp", "HeaderRowComp")
@js.native
class HeaderRowComp protected () extends Component {
  def this(dept: Double, `type`: HeaderRowType, pinned: String, dropTarget: DropTarget) = this()
  var columnController: js.Any = js.native
  var componentRecipes: js.Any = js.native
  var context: js.Any = js.native
  var dept: js.Any = js.native
  var dropTarget: js.Any = js.native
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var headerComps: js.Any = js.native
  var pinned: js.Any = js.native
  var `type`: js.Any = js.native
  /* private */ def createFloatingFilterParams[M, F](column: js.Any): js.Any = js.native
  /* private */ def createFloatingFilterWrapper(column: js.Any): js.Any = js.native
  /* private */ def createHeaderComp(columnGroupChild: js.Any): js.Any = js.native
  def forEachHeaderElement(callback: js.Function1[/* comp */ IComponent[_], Unit]): Unit = js.native
  @JSName("init")
  /* private */ def init_MHeaderRowComp(): js.Any = js.native
  /* private */ def onColumnResized(): js.Any = js.native
  /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
  /* private */ def onGridColumnsChanged(): js.Any = js.native
  /* private */ def onRowHeightChanged(): js.Any = js.native
  /* private */ def onVirtualColumnsChanged(): js.Any = js.native
  /* private */ def removeAndDestroyAllChildComponents(): js.Any = js.native
  /* private */ def removeAndDestroyChildComponents(idsToDestroy: js.Any): js.Any = js.native
  /* private */ def setWidth(): js.Any = js.native
}

