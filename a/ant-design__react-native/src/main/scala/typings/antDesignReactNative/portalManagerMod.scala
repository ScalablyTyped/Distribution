package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ChildrenReactNode
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalManagerMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-manager", JSImport.Default)
  @js.native
  open class default () extends PortalManager
  
  @js.native
  trait PortalManager
    extends PureComponent[js.Object, PortalManagerState, Any] {
    
    def mount(key: Double, children: ReactNode): Unit = js.native
    
    @JSName("state")
    var state_PortalManager: State = js.native
    
    def unmount(key: Double): Unit = js.native
    
    def update(key: Double, children: ReactNode): Unit = js.native
  }
  
  trait PortalManagerState extends StObject {
    
    var portals: js.Array[Any]
  }
  object PortalManagerState {
    
    inline def apply(portals: js.Array[Any]): PortalManagerState = {
      val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalManagerState]
    }
    
    extension [Self <: PortalManagerState](x: Self) {
      
      inline def setPortals(value: js.Array[Any]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
      
      inline def setPortalsVarargs(value: Any*): Self = StObject.set(x, "portals", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    var portals: js.Array[ChildrenReactNode]
  }
  object State {
    
    inline def apply(portals: js.Array[ChildrenReactNode]): State = {
      val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPortals(value: js.Array[ChildrenReactNode]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
      
      inline def setPortalsVarargs(value: ChildrenReactNode*): Self = StObject.set(x, "portals", js.Array(value*))
    }
  }
}
