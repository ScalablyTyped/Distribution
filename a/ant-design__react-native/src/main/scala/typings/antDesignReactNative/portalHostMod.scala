package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.mount
import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.antDesignReactNativeStrings.update
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalHostMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  class default () extends PortalHost
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ChildrenKey(key: Double, `type`: mount): typings.antDesignReactNative.anon.ChildrenKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antDesignReactNative.anon.ChildrenKey]
    }
    
    @scala.inline
    def KeyNumber(key: Double, `type`: unmount): typings.antDesignReactNative.anon.KeyNumber = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antDesignReactNative.anon.KeyNumber]
    }
    
    @scala.inline
    def KeyType(key: Double, `type`: update): typings.antDesignReactNative.anon.KeyType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antDesignReactNative.anon.KeyType]
    }
  }
  
  @js.native
  trait PortalGuard extends StObject {
    
    def add(e: ReactNode): Double = js.native
    
    var nextKey: js.Any = js.native
    
    def remove(key: Double): Unit = js.native
  }
  object PortalGuard {
    
    @scala.inline
    def apply(add: ReactNode => Double, nextKey: js.Any, remove: Double => Unit): PortalGuard = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[PortalGuard]
    }
    
    @scala.inline
    implicit class PortalGuardMutableBuilder[Self <: PortalGuard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: ReactNode => Double): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextKey(value: js.Any): Self = StObject.set(x, "nextKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PortalHost
    extends Component[PortalHostProps, js.Object, js.Any] {
    
    var _manager: js.UndefOr[typings.antDesignReactNative.portalManagerMod.default] = js.native
    
    def _mount(children: ReactNode): Double = js.native
    def _mount(children: ReactNode, _key: Double): Double = js.native
    
    var _nextKey: Double = js.native
    
    var _queue: js.Array[Operation] = js.native
    
    def _setManager(): Unit = js.native
    def _setManager(manager: js.Any): Unit = js.native
    
    def _unmount(key: Double): Unit = js.native
    
    def _update(key: Double, children: ReactNode): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalHost(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalHost(): Unit = js.native
  }
  
  @js.native
  trait PortalHostProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object PortalHostProps {
    
    @scala.inline
    def apply(): PortalHostProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalHostProps]
    }
    
    @scala.inline
    implicit class PortalHostPropsMutableBuilder[Self <: PortalHostProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait PortalMethods extends StObject {
    
    def mount(children: ReactNode): Double = js.native
    
    def unmount(key: Double): Unit = js.native
    
    def update(key: Double, children: ReactNode): Unit = js.native
  }
  object PortalMethods {
    
    @scala.inline
    def apply(mount: ReactNode => Double, unmount: Double => Unit, update: (Double, ReactNode) => Unit): PortalMethods = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[PortalMethods]
    }
    
    @scala.inline
    implicit class PortalMethodsMutableBuilder[Self <: PortalMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: ReactNode => Double): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnmount(value: Double => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: (Double, ReactNode) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
