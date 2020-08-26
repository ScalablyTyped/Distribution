package typings.agGrid.componentResolverMod

import typings.agGrid.anon.InstantiableA
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentResolver")
@js.native
class ComponentResolver () extends js.Object {
  var agComponentUtils: js.Any = js.native
  var componentMetadataProvider: js.Any = js.native
  var componentProvider: js.Any = js.native
  var context: js.Any = js.native
  var frameworkComponentWrapper: js.Any = js.native
  var gridOptions: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
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

