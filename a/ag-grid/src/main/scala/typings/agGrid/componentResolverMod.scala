package typings.agGrid

import typings.agGrid.anon.InstantiableA
import typings.agGrid.anon.InstantiableB
import typings.agGrid.anon.`1`
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentResolverMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentResolver")
  @js.native
  class ComponentResolver () extends StObject {
    
    var agComponentUtils: js.Any = js.native
    
    var componentMetadataProvider: js.Any = js.native
    
    var componentProvider: js.Any = js.native
    
    var context: js.Any = js.native
    
    /**
      * This method creates a component given everything needed to guess what sort of component needs to be instantiated
      * It takes
      *  @param holderOpt: This is the context for which this component needs to be created, it can be gridOptions
      *      (global) or columnDef mostly.
      *  @param agGridParams: Params to be passed to the component and passed by ag-Grid. This will get merged with any params
      *      specified by the user in the configuration
      *  @param propertyName: The name of the property used in ag-grid as a convention to refer to the component, it can be:
      *      'floatingFilter', 'cellRenderer', is used to find if the user is specifying a custom component
      *  @param dynamicComponentParams: Params to be passed to the dynamic component function in case it needs to be
      *      invoked
      *  @param defaultComponentName: The actual name of the component to instantiate, this is usually the same as propertyName, but in
      *      some cases is not, like floatingFilter, if it is the same is not necessary to specify
      *  @param mandatory: Handy method to tell if this should return a component ALWAYS. if that is the case, but there is no
      *      component found, it throws an error, by default all components are MANDATORY
      *  @param customInitParamsCb: A chance to customise the params passed to the init method. It receives what the current
      *  params are and the component that init is about to get called for
      */
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: js.UndefOr[scala.Nothing],
      mandatory: js.UndefOr[scala.Nothing],
      customInitParamsCb: js.Function2[/* params */ js.Any, /* component */ A, _]
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: js.UndefOr[scala.Nothing],
      mandatory: Boolean
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: js.UndefOr[scala.Nothing],
      mandatory: Boolean,
      customInitParamsCb: js.Function2[/* params */ js.Any, /* component */ A, _]
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: String
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: String,
      mandatory: js.UndefOr[scala.Nothing],
      customInitParamsCb: js.Function2[/* params */ js.Any, /* component */ A, _]
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: String,
      mandatory: Boolean
    ): Promise[A] = js.native
    def createAgGridComponent[A /* <: IComponent[_] */](
      holderOpt: ComponentHolder,
      agGridParams: js.Any,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: String,
      mandatory: Boolean,
      customInitParamsCb: js.Function2[/* params */ js.Any, /* component */ A, _]
    ): Promise[A] = js.native
    
    /**
      * This method creates a component given everything needed to guess what sort of component needs to be instantiated
      * It takes
      *  @param clazz: The class to instantiate,
      *  @param agGridParams: Params to be passed to the component and passed by ag-Grid. This will get merged with any params
      *      specified by the user in the configuration
      *  @param customInitParamsCb: A chance to customise the params passed to the init method. It receives what the current
      *  params are and the component that init is about to get called for
      */
    def createInternalAgGridComponent[A /* <: IComponent[_] */](clazz: InstantiableA[A], agGridParams: js.Any): A = js.native
    def createInternalAgGridComponent[A /* <: IComponent[_] */](
      clazz: InstantiableA[A],
      agGridParams: js.Any,
      customInitParamsCb: js.Function2[/* params */ js.Any, /* component */ A, _]
    ): A = js.native
    
    var frameworkComponentWrapper: js.Any = js.native
    
    /**
      * This method returns the underlying representation of the component to be created. ie for Javascript the
      * underlying function where we should be calling new into. In case of the frameworks, the framework class
      * object that represents the component to be created.
      *
      * This method is handy for different reasons, for example if you want to check if a component has a particular
      * method implemented without having to create the component, just by inspecting the source component
      *
      * It takes
      *  @param holder: This is the context for which this component needs to be created, it can be gridOptions
      *      (global) or columnDef mostly.
      *  @param propertyName: The name of the property used in ag-grid as a convention to refer to the component, it can be:
      *      'floatingFilter', 'cellRenderer', is used to find if the user is specifying a custom component
      *  @param dynamicComponentParams: Params to be passed to the dynamic component function in case it needs to be
      *      invoked
      *  @param defaultComponentName: The name of the component to load if there is no component specified
      */
    def getComponentToUse[A /* <: IComponent[_] with B */, B](holder: ComponentHolder, propertyName: String, dynamicComponentParams: DynamicComponentParams): ResolvedComponent[A, B] = js.native
    def getComponentToUse[A /* <: IComponent[_] with B */, B](
      holder: ComponentHolder,
      propertyName: String,
      dynamicComponentParams: DynamicComponentParams,
      defaultComponentName: String
    ): ResolvedComponent[A, B] = js.native
    
    var gridOptions: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def initialiseComponent[A](component: js.Any, agGridParams: js.Any, customInitParamsCb: js.Any): js.Any = js.native
    
    /**
      * Useful to check what would be the resultant params for a given object
      *  @param holder: This is the context for which this component needs to be created, it can be gridOptions
      *      (global) or columnDef mostly.
      *  @param propertyName: The name of the property used in ag-grid as a convention to refer to the component, it can be:
      *      'floatingFilter', 'cellRenderer', is used to find if the user is specifying a custom component
      *  @param agGridParams: Params to be passed to the component and passed by ag-Grid. This will get merged with any params
      *      specified by the user in the configuration
      * @returns {any} It merges the user agGridParams with the actual params specified by the user.
      */
    def mergeParams(holder: ComponentHolder, propertyName: String, agGridParams: js.Any, dynamicCustomParams: js.Any): js.Any = js.native
    def mergeParams(
      holder: ComponentHolder,
      propertyName: String,
      agGridParams: js.Any,
      dynamicCustomParams: js.Any,
      dynamicParams: js.Any
    ): js.Any = js.native
    
    /* private */ def newAgGridComponent[A, B](
      holder: js.Any,
      propertyName: js.Any,
      dynamicComponentParams: js.Any,
      defaultComponentName: js.Any,
      mandatory: js.Any
    ): js.Any = js.native
    
    /* private */ def resolveByName[A, B](propertyName: js.Any, componentNameOpt: js.Any): js.Any = js.native
  }
  
  @js.native
  sealed trait ComponentSource extends StObject
  @JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentSource")
  @js.native
  object ComponentSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComponentSource with Double] = js.native
    
    @js.native
    sealed trait DEFAULT extends ComponentSource
    /* 0 */ val DEFAULT: typings.agGrid.componentResolverMod.ComponentSource.DEFAULT with Double = js.native
    
    @js.native
    sealed trait HARDCODED extends ComponentSource
    /* 2 */ val HARDCODED: typings.agGrid.componentResolverMod.ComponentSource.HARDCODED with Double = js.native
    
    @js.native
    sealed trait REGISTERED_BY_NAME extends ComponentSource
    /* 1 */ val REGISTERED_BY_NAME: typings.agGrid.componentResolverMod.ComponentSource.REGISTERED_BY_NAME with Double = js.native
  }
  
  @js.native
  sealed trait ComponentType extends StObject
  @JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentType")
  @js.native
  object ComponentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
    
    @js.native
    sealed trait AG_GRID extends ComponentType
    /* 0 */ val AG_GRID: typings.agGrid.componentResolverMod.ComponentType.AG_GRID with Double = js.native
    
    @js.native
    sealed trait FRAMEWORK extends ComponentType
    /* 1 */ val FRAMEWORK: typings.agGrid.componentResolverMod.ComponentType.FRAMEWORK with Double = js.native
  }
  
  type AgComponentPropertyInput[A /* <: IComponent[_] */] = AgGridRegisteredComponentInput[A] | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.agGrid.gridOptionsMod.GridOptions
    - typings.agGrid.colDefMod.ColDef
    - typings.agGrid.colDefMod.ColGroupDef
    - typings.agGrid.iSetFilterParamsMod.ISetFilterParams
    - typings.agGrid.iRichCellEditorParamsMod.IRichCellEditorParams
  */
  trait ComponentHolder extends StObject
  
  @js.native
  trait DynamicComponentDef extends StObject {
    
    var component: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
  }
  object DynamicComponentDef {
    
    @scala.inline
    def apply(): DynamicComponentDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicComponentDef]
    }
    
    @scala.inline
    implicit class DynamicComponentDefMutableBuilder[Self <: DynamicComponentDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  @js.native
  trait DynamicComponentParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.UndefOr[js.Any] = js.native
    
    var api: GridApi = js.native
    
    var colDef: js.UndefOr[ColDef] = js.native
    
    var column: js.UndefOr[Column] = js.native
    
    var columnApi: ColumnApi = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var node: js.UndefOr[RowNode] = js.native
    
    var rowIndex: js.UndefOr[Double] = js.native
  }
  object DynamicComponentParams {
    
    @scala.inline
    def apply(api: GridApi, columnApi: ColumnApi): DynamicComponentParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicComponentParams]
    }
    
    @scala.inline
    implicit class DynamicComponentParamsMutableBuilder[Self <: DynamicComponentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDefUndefined: Self = StObject.set(x, "colDef", js.undefined)
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  @js.native
  trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends StObject {
    
    var component: (`1`[A, B]) | InstantiableB[B] = js.native
    
    var dynamicParams: js.Any = js.native
    
    var source: ComponentSource = js.native
    
    var `type`: ComponentType = js.native
  }
  object ResolvedComponent {
    
    @scala.inline
    def apply[A /* <: IComponent[_] with B */, B](
      component: (`1`[A, B]) | InstantiableB[B],
      dynamicParams: js.Any,
      source: ComponentSource,
      `type`: ComponentType
    ): ResolvedComponent[A, B] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedComponent[A, B]]
    }
    
    @scala.inline
    implicit class ResolvedComponentMutableBuilder[Self <: ResolvedComponent[_, _], A /* <: IComponent[_] with B */, B] (val x: Self with (ResolvedComponent[A, B])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: (`1`[A, B]) | InstantiableB[B]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicParams(value: js.Any): Self = StObject.set(x, "dynamicParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: ComponentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
