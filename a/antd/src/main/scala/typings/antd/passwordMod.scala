package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.inputInputMod.InputProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordMod extends Shortcut {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PasswordProps & RefAttributes[js.Any]] = js.native
  
  trait PasswordProps
    extends StObject
       with InputProps {
    
    val action: js.UndefOr[String] = js.undefined
    
    var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, ReactNode]] = js.undefined
    
    val inputPrefixCls: js.UndefOr[String] = js.undefined
    
    var visibilityToggle: js.UndefOr[Boolean] = js.undefined
  }
  object PasswordProps {
    
    inline def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    extension [Self <: PasswordProps](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIconRender(value: /* visible */ Boolean => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction1(value))
      
      inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      inline def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      inline def setVisibilityToggle(value: Boolean): Self = StObject.set(x, "visibilityToggle", value.asInstanceOf[js.Any])
      
      inline def setVisibilityToggleUndefined: Self = StObject.set(x, "visibilityToggle", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PasswordProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `passwordMod.foo` */
  override def _to: ForwardRefExoticComponent[PasswordProps & RefAttributes[js.Any]] = default
}
