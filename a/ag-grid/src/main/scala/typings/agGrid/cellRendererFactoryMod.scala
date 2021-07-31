package typings.agGrid

import typings.agGrid.anon.InstantiableICellRenderer
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellRendererFactoryMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory")
  @js.native
  class CellRendererFactory () extends StObject {
    
    def addCellRenderer(key: String, cellRenderer: InstantiableICellRenderer): Unit = js.native
    def addCellRenderer(key: String, cellRenderer: ICellRendererFunc): Unit = js.native
    
    var cellRendererMap: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var expressionService: js.Any = js.native
    
    def getCellRenderer(key: String): InstantiableICellRenderer | ICellRendererFunc = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
  }
  /* static members */
  object CellRendererFactory {
    
    @JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory.ANIMATE_SHOW_CHANGE")
    @js.native
    def ANIMATE_SHOW_CHANGE: String = js.native
    @scala.inline
    def ANIMATE_SHOW_CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATE_SHOW_CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory.ANIMATE_SLIDE")
    @js.native
    def ANIMATE_SLIDE: String = js.native
    @scala.inline
    def ANIMATE_SLIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATE_SLIDE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory.GROUP")
    @js.native
    def GROUP: String = js.native
    @scala.inline
    def GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP")(x.asInstanceOf[js.Any])
  }
}
