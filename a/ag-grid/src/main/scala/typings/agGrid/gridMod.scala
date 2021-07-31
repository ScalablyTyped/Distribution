package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.gridOptionsMod.GridOptions
import typings.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("ag-grid/dist/lib/grid", "Grid")
  @js.native
  class Grid protected () extends StObject {
    def this(eGridDiv: HTMLElement, gridOptions: GridOptions) = this()
    def this(eGridDiv: HTMLElement, gridOptions: GridOptions, params: GridParams) = this()
    
    var context: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ def dispatchGridReadyEvent(gridOptions: js.Any): js.Any = js.native
    
    /* private */ def getRowModelClass(gridOptions: js.Any): js.Any = js.native
    
    /* private */ def setColumnsAndData(): js.Any = js.native
  }
  /* static members */
  object Grid {
    
    @JSImport("ag-grid/dist/lib/grid", "Grid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/grid", "Grid.RowModelClasses")
    @js.native
    def RowModelClasses: js.Any = js.native
    @scala.inline
    def RowModelClasses_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RowModelClasses")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/grid", "Grid.enterpriseBeans")
    @js.native
    def enterpriseBeans: js.Any = js.native
    @scala.inline
    def enterpriseBeans_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterpriseBeans")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/grid", "Grid.enterpriseComponents")
    @js.native
    def enterpriseComponents: js.Any = js.native
    @scala.inline
    def enterpriseComponents_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterpriseComponents")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/grid", "Grid.frameworkBeans")
    @js.native
    def frameworkBeans: js.Any = js.native
    @scala.inline
    def frameworkBeans_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameworkBeans")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseBeans(enterpriseBeans: js.Array[js.Any], rowModelClasses: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnterpriseBeans")(enterpriseBeans.asInstanceOf[js.Any], rowModelClasses.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setEnterpriseComponents(components: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnterpriseComponents")(components.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setFrameworkBeans(frameworkBeans: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFrameworkBeans")(frameworkBeans.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait GridParams extends StObject {
    
    @JSName("$compile")
    var $compile: js.UndefOr[js.Any] = js.undefined
    
    @JSName("$scope")
    var $scope: js.UndefOr[js.Any] = js.undefined
    
    var frameworkFactory: js.UndefOr[IFrameworkFactory] = js.undefined
    
    var globalEventListener: js.UndefOr[js.Function] = js.undefined
    
    var quickFilterOnScope: js.UndefOr[js.Any] = js.undefined
    
    var seedBeanInstances: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object GridParams {
    
    @scala.inline
    def apply(): GridParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridParams]
    }
    
    @scala.inline
    implicit class GridParamsMutableBuilder[Self <: GridParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$compile(value: js.Any): Self = StObject.set(x, "$compile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$compileUndefined: Self = StObject.set(x, "$compile", js.undefined)
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
      
      @scala.inline
      def setFrameworkFactory(value: IFrameworkFactory): Self = StObject.set(x, "frameworkFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkFactoryUndefined: Self = StObject.set(x, "frameworkFactory", js.undefined)
      
      @scala.inline
      def setGlobalEventListener(value: js.Function): Self = StObject.set(x, "globalEventListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalEventListenerUndefined: Self = StObject.set(x, "globalEventListener", js.undefined)
      
      @scala.inline
      def setQuickFilterOnScope(value: js.Any): Self = StObject.set(x, "quickFilterOnScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickFilterOnScopeUndefined: Self = StObject.set(x, "quickFilterOnScope", js.undefined)
      
      @scala.inline
      def setSeedBeanInstances(value: StringDictionary[js.Any]): Self = StObject.set(x, "seedBeanInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedBeanInstancesUndefined: Self = StObject.set(x, "seedBeanInstances", js.undefined)
    }
  }
}
