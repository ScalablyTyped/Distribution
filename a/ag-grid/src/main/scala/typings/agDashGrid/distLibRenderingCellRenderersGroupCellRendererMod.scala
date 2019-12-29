package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRenderer
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRenderers/groupCellRenderer", JSImport.Namespace)
@js.native
object distLibRenderingCellRenderersGroupCellRendererMod extends js.Object {
  @js.native
  class GroupCellRenderer ()
    extends Component
       with ICellRenderer {
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
    def init_MGroupCellRenderer(params: GroupCellRendererParams): Unit = js.native
    /* private */ def isEmbeddedRowMismatch(): js.Any = js.native
    /* private */ def isExpandable(): js.Any = js.native
    /* private */ def isUserWantsSelected(): js.Any = js.native
    /* private */ def onAllChildrenCountChanged(): js.Any = js.native
    def onCellDblClicked(mouseEvent: MouseEvent): Unit = js.native
    def onExpandClicked(mouseEvent: MouseEvent): Unit = js.native
    def onExpandOrContract(): Unit = js.native
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
    def refresh(): Boolean = js.native
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    /* CompleteClass */
    override def refresh(params: js.Any): Boolean = js.native
    /* private */ def setIndent(): js.Any = js.native
    /* private */ def setPaddingDeprecatedWay(paddingCount: js.Any, padding: js.Any): js.Any = js.native
    /* private */ def setupDragOpenParents(): js.Any = js.native
    /* private */ def setupIndent(): js.Any = js.native
    /* private */ def showExpandAndContractIcons(): js.Any = js.native
    /* private */ def updateChildCount(): js.Any = js.native
  }
  
  @js.native
  trait GroupCellRendererParams extends ICellRendererParams {
    var actualValue: String = js.native
    var checkbox: js.Any = js.native
    var footerValueGetter: js.Any = js.native
    var fullWidth: Boolean = js.native
    var padding: Double = js.native
    var pinned: String = js.native
    var scope: js.Any = js.native
    var suppressCount: Boolean = js.native
    var suppressDoubleClickExpand: Boolean = js.native
    var suppressPadding: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GroupCellRenderer extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

