package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libInputInputMod.InputProps
import typings.rcInput.esInterfaceMod.InputRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputPasswordMod extends Shortcut {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = js.native
  
  trait PasswordProps
    extends StObject
       with InputProps {
    
    val action: js.UndefOr[String] = js.undefined
    
    var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, ReactNode]] = js.undefined
    
    val inputPrefixCls: js.UndefOr[String] = js.undefined
    
    var visibilityToggle: js.UndefOr[Boolean | VisibilityToggle] = js.undefined
  }
  object PasswordProps {
    
    inline def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasswordProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIconRender(value: /* visible */ Boolean => ReactNode): Self = StObject.set(x, "iconRender", js.Any.fromFunction1(value))
      
      inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      inline def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      inline def setVisibilityToggle(value: Boolean | VisibilityToggle): Self = StObject.set(x, "visibilityToggle", value.asInstanceOf[js.Any])
      
      inline def setVisibilityToggleUndefined: Self = StObject.set(x, "visibilityToggle", js.undefined)
    }
  }
  
  trait VisibilityToggle extends StObject {
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object VisibilityToggle {
    
    inline def apply(): VisibilityToggle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityToggle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisibilityToggle] (val x: Self) extends AnyVal {
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libInputPasswordMod.foo` */
  override def _to: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = default
}
