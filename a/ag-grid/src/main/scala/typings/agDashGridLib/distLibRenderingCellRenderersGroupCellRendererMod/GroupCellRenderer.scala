package typings
package agDashGridLib.distLibRenderingCellRenderersGroupCellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
@js.native
class GroupCellRenderer ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component
     with agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRenderer {
  var cellIsBlank: js.Any = js.native
  var cellRendererService: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var displayedGroup: js.Any = js.native
  var draggedFromHideOpenParents: js.Any = js.native
  var eCheckbox: js.Any = js.native
  var eChildCount: js.Any = js.native
  var eContracted: js.Any = js.native
  var eExpanded: js.Any = js.native
  var eValue: js.Any = js.native
  var eventService: js.Any = js.native
  var expressionService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var indentClass: js.Any = js.native
  var innerCellRenderer: js.Any = js.native
  var mouseEventService: js.Any = js.native
  var params: js.Any = js.native
  var valueFormatterService: js.Any = js.native
  /* private */ def addCheckboxIfNeeded(): js.Any = js.native
  /* private */ def addChildCount(): js.Any = js.native
  /* private */ def addExpandAndContract(): js.Any = js.native
  /* private */ def addValueElement(): js.Any = js.native
  /* private */ def assignBlankValueToGroupFooterCell(params: js.Any): js.Any = js.native
  /* private */ def createFooterCell(): js.Any = js.native
  /* private */ def createGroupCell(): js.Any = js.native
  /* private */ def createLeafCell(): js.Any = js.native
  @JSName("init")
  def init_MGroupCellRenderer(params: GroupCellRendererParams): scala.Unit = js.native
  /* private */ def isEmbeddedRowMismatch(): js.Any = js.native
  /* private */ def isExpandable(): js.Any = js.native
  /* private */ def isUserWantsSelected(): js.Any = js.native
  /* private */ def onAllChildrenCountChanged(): js.Any = js.native
  def onCellDblClicked(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onExpandClicked(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onExpandOrContract(): scala.Unit = js.native
  /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  def refresh(): scala.Boolean = js.native
  /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
    * then the grid will refresh the cell for you. */
  /* CompleteClass */
  override def refresh(params: js.Any): scala.Boolean = js.native
  /* private */ def setIndent(): js.Any = js.native
  /* private */ def setPaddingDeprecatedWay(paddingCount: js.Any, padding: js.Any): js.Any = js.native
  /* private */ def setupDragOpenParents(): js.Any = js.native
  /* private */ def setupIndent(): js.Any = js.native
  /* private */ def showExpandAndContractIcons(): js.Any = js.native
  /* private */ def updateChildCount(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
@js.native
object GroupCellRenderer extends js.Object {
  var TEMPLATE: js.Any = js.native
}

