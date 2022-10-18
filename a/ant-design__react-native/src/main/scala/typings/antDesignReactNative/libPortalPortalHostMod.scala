package typings.antDesignReactNative

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.reactNative.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalPortalHostMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  open class default () extends PortalHost
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", "PortalContext")
  @js.native
  val PortalContext: Context[PortalMethods] = js.native
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", "portal")
  @js.native
  val portal: PortalGuard = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignReactNative.anon.ChildrenKey
    - typings.antDesignReactNative.anon.KeyType
    - typings.antDesignReactNative.anon.KeyNumber
  */
  trait Operation extends StObject
  object Operation {
    
    inline def ChildrenKey(key: Double): typings.antDesignReactNative.anon.ChildrenKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("mount")
      __obj.asInstanceOf[typings.antDesignReactNative.anon.ChildrenKey]
    }
    
    inline def KeyNumber(key: Double): typings.antDesignReactNative.anon.KeyNumber = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unmount")
      __obj.asInstanceOf[typings.antDesignReactNative.anon.KeyNumber]
    }
    
    inline def KeyType(key: Double): typings.antDesignReactNative.anon.KeyType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.antDesignReactNative.anon.KeyType]
    }
  }
  
  trait PortalGuard extends StObject {
    
    def add(e: ReactNode): Double
    
    /* private */ var nextKey: Any
    
    def remove(key: Double): Unit
  }
  object PortalGuard {
    
    inline def apply(add: ReactNode => Double, nextKey: Any, remove: Double => Unit): PortalGuard = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[PortalGuard]
    }
    
    extension [Self <: PortalGuard](x: Self) {
      
      inline def setAdd(value: ReactNode => Double): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setNextKey(value: Any): Self = StObject.set(x, "nextKey", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PortalHost
    extends Component[PortalHostProps, js.Object, Any] {
    
    var _addType: EventSubscription = js.native
    
    var _manager: js.UndefOr[typings.antDesignReactNative.libPortalPortalManagerMod.default] = js.native
    
    def _mount(children: ReactNode): Double = js.native
    def _mount(children: ReactNode, _key: Double): Double = js.native
    
    var _nextKey: Double = js.native
    
    var _queue: js.Array[Operation] = js.native
    
    var _removeType: EventSubscription = js.native
    
    def _setManager(): Unit = js.native
    def _setManager(manager: Any): Unit = js.native
    
    def _unmount(key: Double): Unit = js.native
    
    def _update(key: Double, children: ReactNode): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalHost(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalHost(): Unit = js.native
  }
  
  trait PortalHostProps extends StObject {
    
    var children: ReactNode
  }
  object PortalHostProps {
    
    inline def apply(): PortalHostProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalHostProps]
    }
    
    extension [Self <: PortalHostProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait PortalMethods extends StObject {
    
    def mount(children: ReactNode): Double
    
    def unmount(key: Double): Unit
    
    def update(key: Double, children: ReactNode): Unit
  }
  object PortalMethods {
    
    inline def apply(mount: ReactNode => Double, unmount: Double => Unit, update: (Double, ReactNode) => Unit): PortalMethods = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[PortalMethods]
    }
    
    extension [Self <: PortalMethods](x: Self) {
      
      inline def setMount(value: ReactNode => Double): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: Double => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (Double, ReactNode) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
