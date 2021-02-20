package typings.agGrid

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.componentMod.Component
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    var columnController: js.Any = js.native
    
    var eCloseIcon: js.Any = js.native
    
    var eOpenIcon: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MHeaderGroupComp(params: IHeaderGroupParams): Unit = js.native
    
    var params: js.Any = js.native
    
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
    @scala.inline
    def TEMPLATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IHeaderGroup extends StObject
  
  @js.native
  trait IHeaderGroupComp
    extends IHeaderGroup
       with IComponent[IHeaderGroupParams]
  object IHeaderGroupComp {
    
    @scala.inline
    def apply(getGui: () => HTMLElement): IHeaderGroupComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
      __obj.asInstanceOf[IHeaderGroupComp]
    }
  }
  
  @js.native
  trait IHeaderGroupParams extends StObject {
    
    var api: GridApi = js.native
    
    var columnApi: ColumnApi = js.native
    
    var columnGroup: ColumnGroup = js.native
    
    var context: js.Any = js.native
    
    var displayName: String = js.native
    
    def setExpanded(expanded: Boolean): Unit = js.native
  }
  object IHeaderGroupParams {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IHeaderGroupParamsMutableBuilder[Self <: IHeaderGroupParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGroup(value: ColumnGroup): Self = StObject.set(x, "columnGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetExpanded(value: Boolean => Unit): Self = StObject.set(x, "setExpanded", js.Any.fromFunction1(value))
    }
  }
}
