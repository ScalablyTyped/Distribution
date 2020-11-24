package typings.agGrid.groupCellRendererMod

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellRendererMod.ICellRenderer
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
@js.native
class GroupCellRenderer ()
  extends Component
     with ICellRenderer {
  
  /* private */ def addCheckboxIfNeeded(): js.Any = js.native
  
  /* private */ def addChildCount(): js.Any = js.native
  
  /* private */ def addExpandAndContract(): js.Any = js.native
  
  /* private */ def addValueElement(): js.Any = js.native
  
  /* private */ def assignBlankValueToGroupFooterCell(params: js.Any): js.Any = js.native
  
  var cellIsBlank: js.Any = js.native
  
  var cellRendererService: js.Any = js.native
  
  var columnController: js.Any = js.native
  
  var context: js.Any = js.native
  
  /* private */ def createFooterCell(): js.Any = js.native
  
  /* private */ def createGroupCell(): js.Any = js.native
  
  /* private */ def createLeafCell(): js.Any = js.native
  
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
  
  @JSName("init")
  def init_MGroupCellRenderer(params: GroupCellRendererParams): Unit = js.native
  
  var innerCellRenderer: js.Any = js.native
  
  /* private */ def isEmbeddedRowMismatch(): js.Any = js.native
  
  /* private */ def isExpandable(): js.Any = js.native
  
  /* private */ def isUserWantsSelected(): js.Any = js.native
  
  var mouseEventService: js.Any = js.native
  
  /* private */ def onAllChildrenCountChanged(): js.Any = js.native
  
  def onCellDblClicked(mouseEvent: MouseEvent): Unit = js.native
  
  def onExpandClicked(mouseEvent: MouseEvent): Unit = js.native
  
  def onExpandOrContract(): Unit = js.native
  
  /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  
  var params: js.Any = js.native
  
  def refresh(): Boolean = js.native
  
  /* private */ def setIndent(): js.Any = js.native
  
  /* private */ def setPaddingDeprecatedWay(paddingCount: js.Any, padding: js.Any): js.Any = js.native
  
  /* private */ def setupDragOpenParents(): js.Any = js.native
  
  /* private */ def setupIndent(): js.Any = js.native
  
  /* private */ def showExpandAndContractIcons(): js.Any = js.native
  
  /* private */ def updateChildCount(): js.Any = js.native
  
  var valueFormatterService: js.Any = js.native
}
/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", "GroupCellRenderer")
@js.native
object GroupCellRenderer extends js.Object {
  
  var TEMPLATE: js.Any = js.native
}
