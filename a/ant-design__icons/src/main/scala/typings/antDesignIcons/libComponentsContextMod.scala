package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIcons.anon.Nonce
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextMod extends Shortcut {
  
  @JSImport("@ant-design/icons/lib/components/Context", JSImport.Default)
  @js.native
  val default: Context[IconContextProps] = js.native
  
  trait IconContextProps extends StObject {
    
    var csp: js.UndefOr[Nonce] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
  }
  object IconContextProps {
    
    inline def apply(): IconContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconContextProps] (val x: Self) extends AnyVal {
      
      inline def setCsp(value: Nonce): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    }
  }
  
  type _To = Context[IconContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsContextMod.foo` */
  override def _to: Context[IconContextProps] = default
}
