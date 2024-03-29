package typings.antDesignReactNative

import typings.antDesignReactNative.libPortalPortalHostMod.PortalMethods
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalPortalConsumerMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  open class default () extends PortalConsumer
  
  @js.native
  trait PortalConsumer
    extends Component[PortalConsumerProps, js.Object, Any] {
    
    var _key: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalConsumer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalConsumer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalConsumer(): Unit = js.native
  }
  
  trait PortalConsumerProps extends StObject {
    
    var children: ReactNode
    
    var manager: PortalMethods
  }
  object PortalConsumerProps {
    
    inline def apply(manager: PortalMethods): PortalConsumerProps = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalConsumerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalConsumerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setManager(value: PortalMethods): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
}
