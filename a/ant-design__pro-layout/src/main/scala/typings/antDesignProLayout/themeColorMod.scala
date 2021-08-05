package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.Color
import typings.antDesignProLayout.anon.DefaultMessage
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeColorMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/ThemeColor", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ThemeColorProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TagProps extends StObject {
    
    var check: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: String
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object TagProps {
    
    inline def apply(check: Boolean, color: String): TagProps = {
      val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait ThemeColorProps extends StObject {
    
    var colors: js.UndefOr[js.Array[Color]] = js.undefined
    
    def formatMessage(data: DefaultMessage): String
    
    def onChange(color: String): Unit
    
    var value: String
  }
  object ThemeColorProps {
    
    inline def apply(formatMessage: DefaultMessage => String, onChange: String => Unit, value: String): ThemeColorProps = {
      val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeColorProps]
    }
    
    extension [Self <: ThemeColorProps](x: Self) {
      
      inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setFormatMessage(value: DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[ThemeColorProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `themeColorMod.foo` */
  override def _to: ForwardRefExoticComponent[ThemeColorProps & RefAttributes[HTMLDivElement]] = default
}
