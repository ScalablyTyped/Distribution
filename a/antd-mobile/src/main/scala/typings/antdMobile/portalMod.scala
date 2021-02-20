package typings.antdMobile

import typings.react.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  @JSImport("antd-mobile/lib/input-item/Portal", JSImport.Default)
  @js.native
  class default protected () extends Portal {
    def this(props: PortalProps) = this()
  }
  
  @js.native
  trait Portal
    extends Component[PortalProps, js.Any, js.Any] {
    
    var container: Element = js.native
  }
  
  @js.native
  trait PortalProps extends StObject {
    
    def getContainer(): Element = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(getContainer: () => Element): PortalProps = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContainer(value: () => Element): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    }
  }
}
