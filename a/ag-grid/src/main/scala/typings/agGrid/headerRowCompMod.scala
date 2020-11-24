package typings.agGrid

import org.scalablytyped.runtime.TopLevel
import typings.agGrid.componentMod.Component
import typings.agGrid.dragAndDropServiceMod.DropTarget
import typings.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/headerRowComp", JSImport.Namespace)
@js.native
object headerRowCompMod extends js.Object {
  
  @js.native
  class HeaderRowComp protected () extends Component {
    def this(dept: Double, `type`: HeaderRowType, pinned: String, dropTarget: DropTarget) = this()
    
    var columnController: js.Any = js.native
    
    var componentRecipes: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createFloatingFilterParams[M, F](column: js.Any): js.Any = js.native
    
    /* private */ def createFloatingFilterWrapper(column: js.Any): js.Any = js.native
    
    /* private */ def createHeaderComp(columnGroupChild: js.Any): js.Any = js.native
    
    var dept: js.Any = js.native
    
    var dropTarget: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var filterManager: js.Any = js.native
    
    def forEachHeaderElement(callback: js.Function1[/* comp */ IComponent[_], Unit]): Unit = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var headerComps: js.Any = js.native
    
    @JSName("init")
    /* private */ def init_MHeaderRowComp(): js.Any = js.native
    
    /* private */ def onColumnResized(): js.Any = js.native
    
    /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
    
    /* private */ def onGridColumnsChanged(): js.Any = js.native
    
    /* private */ def onRowHeightChanged(): js.Any = js.native
    
    /* private */ def onVirtualColumnsChanged(): js.Any = js.native
    
    var pinned: js.Any = js.native
    
    /* private */ def removeAndDestroyAllChildComponents(): js.Any = js.native
    
    /* private */ def removeAndDestroyChildComponents(idsToDestroy: js.Any): js.Any = js.native
    
    /* private */ def setWidth(): js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  
  @js.native
  sealed trait HeaderRowType extends js.Object
  @js.native
  object HeaderRowType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HeaderRowType with Double] = js.native
    
    @js.native
    sealed trait COLUMN extends HeaderRowType
    /* 1 */ @js.native
    object COLUMN extends TopLevel[COLUMN with Double]
    
    @js.native
    sealed trait COLUMN_GROUP extends HeaderRowType
    /* 0 */ @js.native
    object COLUMN_GROUP extends TopLevel[COLUMN_GROUP with Double]
    
    @js.native
    sealed trait FLOATING_FILTER extends HeaderRowType
    /* 2 */ @js.native
    object FLOATING_FILTER extends TopLevel[FLOATING_FILTER with Double]
  }
}
