package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ChildrenReactNode
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalManagerMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-manager", JSImport.Default)
  @js.native
  class default () extends PortalManager
  
  @js.native
  trait PortalManager
    extends PureComponent[js.Object, PortalManagerState, js.Any] {
    
    def mount(key: Double, children: ReactNode): Unit = js.native
    
    @JSName("state")
    var state_PortalManager: State = js.native
    
    def unmount(key: Double): Unit = js.native
    
    def update(key: Double, children: ReactNode): Unit = js.native
  }
  
  @js.native
  trait PortalManagerState extends StObject {
    
    var portals: js.Array[_] = js.native
  }
  object PortalManagerState {
    
    @scala.inline
    def apply(portals: js.Array[_]): PortalManagerState = {
      val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalManagerState]
    }
    
    @scala.inline
    implicit class PortalManagerStateMutableBuilder[Self <: PortalManagerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPortals(value: js.Array[_]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalsVarargs(value: js.Any*): Self = StObject.set(x, "portals", js.Array(value :_*))
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var portals: js.Array[ChildrenReactNode] = js.native
  }
  object State {
    
    @scala.inline
    def apply(portals: js.Array[ChildrenReactNode]): State = {
      val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPortals(value: js.Array[ChildrenReactNode]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalsVarargs(value: ChildrenReactNode*): Self = StObject.set(x, "portals", js.Array(value :_*))
    }
  }
}
