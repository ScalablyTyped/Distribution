package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disabledContextMod extends Shortcut {
  
  @JSImport("antd/lib/config-provider/DisabledContext", JSImport.Default)
  @js.native
  val default: Context[DisabledType] = js.native
  
  @JSImport("antd/lib/config-provider/DisabledContext", "DisabledContextProvider")
  @js.native
  val DisabledContextProvider: FC[DisabledContextProps] = js.native
  
  trait DisabledContextProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[DisabledType] = js.undefined
  }
  object DisabledContextProps {
    
    inline def apply(): DisabledContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledContextProps]
    }
    
    extension [Self <: DisabledContextProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: DisabledType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdBooleans.`true`
    - typings.antd.antdBooleans.`false`
    - scala.Unit
  */
  type DisabledType = js.UndefOr[_DisabledType]
  
  trait _DisabledType extends StObject
  
  type _To = Context[DisabledType]
  
  /* This means you don't have to write `default`, but can instead just say `disabledContextMod.foo` */
  override def _to: Context[DisabledType] = default
}
