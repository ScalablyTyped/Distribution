package typings.alt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.alt.AltJS.Alt
import typings.alt.AltJS.AltStore
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object altContainerMod extends Shortcut {
  
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[ContainerProps, ComponentState]) = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  open class Class protected () extends Component[ContainerProps, ComponentState, Any] {
    def this(props: ContainerProps) = this()
    def this(props: ContainerProps, context: Any) = this()
  }
  
  type AltContainer = ReactElement
  
  trait ContainerProps extends StObject {
    
    var actions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
    
    var component: js.UndefOr[Component[Any, js.Object, Any]] = js.undefined
    
    var flux: js.UndefOr[Alt] = js.undefined
    
    var inject: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* repeated */ Any, ReactElement]] = js.undefined
    
    var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ Any, Boolean]] = js.undefined
    
    var store: js.UndefOr[AltStore[Any]] = js.undefined
    
    var stores: js.UndefOr[js.Array[AltStore[Any]]] = js.undefined
    
    var transform: js.UndefOr[js.Function2[/* store */ AltStore[Any], /* actions */ Any, Any]] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: StringDictionary[js.Object]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setComponent(value: Component[Any, js.Object, Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFlux(value: Alt): Self = StObject.set(x, "flux", value.asInstanceOf[js.Any])
      
      inline def setFluxUndefined: Self = StObject.set(x, "flux", js.undefined)
      
      inline def setInject(value: StringDictionary[Any]): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setRender(value: /* repeated */ Any => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setShouldComponentUpdate(value: /* props */ Any => Boolean): Self = StObject.set(x, "shouldComponentUpdate", js.Any.fromFunction1(value))
      
      inline def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
      
      inline def setStore(value: AltStore[Any]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStores(value: js.Array[AltStore[Any]]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setStoresVarargs(value: AltStore[Any]*): Self = StObject.set(x, "stores", js.Array(value*))
      
      inline def setTransform(value: (/* store */ AltStore[Any], /* actions */ Any) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = js.Object & (ComponentClass[ContainerProps, ComponentState])
  
  /* This means you don't have to write `^`, but can instead just say `altContainerMod.foo` */
  override def _to: js.Object & (ComponentClass[ContainerProps, ComponentState]) = ^
}
