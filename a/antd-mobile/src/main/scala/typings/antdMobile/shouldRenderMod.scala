package typings.antdMobile

import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shouldRenderMod {
  
  @JSImport("antd-mobile/es/utils/should-render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile/es/utils/should-render", "ShouldRender")
  @js.native
  val ShouldRender: FC[Props] = js.native
  
  inline def useShouldRender(active: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useShouldRender")(active.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useShouldRender(active: Boolean, forceRender: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useShouldRender")(active.asInstanceOf[js.Any], forceRender.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useShouldRender(active: Boolean, forceRender: Boolean, destroyOnClose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useShouldRender")(active.asInstanceOf[js.Any], forceRender.asInstanceOf[js.Any], destroyOnClose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useShouldRender(active: Boolean, forceRender: Unit, destroyOnClose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useShouldRender")(active.asInstanceOf[js.Any], forceRender.asInstanceOf[js.Any], destroyOnClose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Props extends StObject {
    
    var active: Boolean
    
    var children: ReactElement
    
    var destroyOnClose: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(active: Boolean, children: ReactElement): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    }
  }
}
