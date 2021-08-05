package typings.agGrid

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.componentMod.Component
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerGroupCompMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.headerGroupCompMod.IHeaderGroupComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupComp", "HeaderGroupComp")
  @js.native
  class HeaderGroupComp ()
    extends Component
       with IHeaderGroup {
    
    /* private */ def addGroupExpandIcon(): js.Any = js.native
    
    /* private */ def addInIcon(iconName: js.Any, refName: js.Any): js.Any = js.native
    
    /* private */ def addTouchAndClickListeners(eElement: js.Any, action: js.Any): js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var eCloseIcon: js.Any = js.native
    
    /* private */ var eOpenIcon: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MHeaderGroupComp(params: IHeaderGroupParams): Unit = js.native
    
    /* private */ var params: js.Any = js.native
    
    /* private */ def setupExpandIcons(): js.Any = js.native
    
    /* private */ def setupLabel(): js.Any = js.native
    
    /* private */ def updateIconVisibility(): js.Any = js.native
  }
  /* static members */
  object HeaderGroupComp {
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupComp", "HeaderGroupComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupComp", "HeaderGroupComp.TEMPLATE")
    @js.native
    def TEMPLATE: String = js.native
    inline def TEMPLATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  trait IHeaderGroup extends StObject
  
  trait IHeaderGroupComp
    extends StObject
       with IHeaderGroup
       with IComponent[IHeaderGroupParams]
  object IHeaderGroupComp {
    
    inline def apply(getGui: () => HTMLElement): IHeaderGroupComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
      __obj.asInstanceOf[IHeaderGroupComp]
    }
  }
  
  trait IHeaderGroupParams extends StObject {
    
    var api: GridApi
    
    var columnApi: ColumnApi
    
    var columnGroup: ColumnGroup
    
    var context: js.Any
    
    var displayName: String
    
    def setExpanded(expanded: Boolean): Unit
  }
  object IHeaderGroupParams {
    
    inline def apply(
      api: GridApi,
      columnApi: ColumnApi,
      columnGroup: ColumnGroup,
      context: js.Any,
      displayName: String,
      setExpanded: Boolean => Unit
    ): IHeaderGroupParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded))
      __obj.asInstanceOf[IHeaderGroupParams]
    }
    
    extension [Self <: IHeaderGroupParams](x: Self) {
      
      inline def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      inline def setColumnGroup(value: ColumnGroup): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setSetExpanded(value: Boolean => Unit): Self = StObject.set(x, "setExpanded", js.Any.fromFunction1(value))
    }
  }
}
