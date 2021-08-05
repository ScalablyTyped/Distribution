package typings.agGrid

import typings.agGrid.anon.InstantiableA
import typings.agGrid.anon.InstantiableB
import typings.agGrid.anon.`0`
import typings.agGrid.componentResolverMod.ComponentType
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentProviderMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/componentProvider", "ComponentProvider")
  @js.native
  class ComponentProvider () extends StObject {
    
    /* private */ var agDeprecatedNames: js.Any = js.native
    
    /* private */ var agGridDefaults: js.Any = js.native
    
    /* private */ var frameworkComponents: js.Any = js.native
    
    /* private */ var gridOptions: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* private */ var jsComponents: js.Any = js.native
    
    def registerComponent[A /* <: IComponent[js.Any] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
    
    def registerDefaultComponent[A /* <: IComponent[js.Any] */](rawName: String, component: AgGridRegisteredComponentInput[A]): Unit = js.native
    def registerDefaultComponent[A /* <: IComponent[js.Any] */](rawName: String, component: AgGridRegisteredComponentInput[A], overridable: Boolean): Unit = js.native
    
    /**
      * B the business interface (ie IHeader)
      * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
      */
    def registerFwComponent[A /* <: IComponent[js.Any] & B */, B](rawName: String, component: `0`[B]): Unit = js.native
    
    /**
      * B the business interface (ie IHeader)
      * A the agGridComponent interface (ie IHeaderComp). The final object acceptable by ag-grid
      */
    def retrieve[A /* <: IComponent[js.Any] & B */, B](rawName: String): RegisteredComponent[A, B] = js.native
    
    /* private */ def translateIfDeprecated(raw: js.Any): js.Any = js.native
  }
  
  @js.native
  sealed trait RegisteredComponentSource extends StObject
  @JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
  @js.native
  object RegisteredComponentSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RegisteredComponentSource & Double] = js.native
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with RegisteredComponentSource
    /* 0 */ val DEFAULT: typings.agGrid.componentProviderMod.RegisteredComponentSource.DEFAULT & Double = js.native
    
    @js.native
    sealed trait REGISTERED
      extends StObject
         with RegisteredComponentSource
    /* 1 */ val REGISTERED: typings.agGrid.componentProviderMod.RegisteredComponentSource.REGISTERED & Double = js.native
  }
  
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, String | HTMLElement]
  
  type AgGridRegisteredComponentInput[A /* <: IComponent[js.Any] */] = AgGridComponentFunctionInput | InstantiableA[A]
  
  trait DeprecatedComponentName extends StObject {
    
    var newComponentName: String
    
    var propertyHolder: String
  }
  object DeprecatedComponentName {
    
    inline def apply(newComponentName: String, propertyHolder: String): DeprecatedComponentName = {
      val __obj = js.Dynamic.literal(newComponentName = newComponentName.asInstanceOf[js.Any], propertyHolder = propertyHolder.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeprecatedComponentName]
    }
    
    extension [Self <: DeprecatedComponentName](x: Self) {
      
      inline def setNewComponentName(value: String): Self = StObject.set(x, "newComponentName", value.asInstanceOf[js.Any])
      
      inline def setPropertyHolder(value: String): Self = StObject.set(x, "propertyHolder", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredComponent[A /* <: IComponent[js.Any] & B */, B] extends StObject {
    
    var component: RegisteredComponentInput[A, B]
    
    var source: RegisteredComponentSource
    
    var `type`: ComponentType
  }
  object RegisteredComponent {
    
    inline def apply[A /* <: IComponent[js.Any] & B */, B](
      component: RegisteredComponentInput[A, B],
      source: RegisteredComponentSource,
      `type`: ComponentType
    ): RegisteredComponent[A, B] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredComponent[A, B]]
    }
    
    extension [Self <: RegisteredComponent[?, ?], A /* <: IComponent[js.Any] & B */, B](x: Self & (RegisteredComponent[A, B])) {
      
      inline def setComponent(value: RegisteredComponentInput[A, B]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentFunction1(value: /* params */ js.Any => String | HTMLElement): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setSource(value: RegisteredComponentSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisteredComponentInput[A /* <: IComponent[js.Any] & B */, B] = AgGridRegisteredComponentInput[A] | InstantiableB[B]
}
