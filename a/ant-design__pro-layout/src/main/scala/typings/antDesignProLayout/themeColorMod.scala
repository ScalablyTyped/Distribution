package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Color
import typings.antDesignProLayout.anon.DefaultMessage
import typings.react.mod.ForwardRefRenderFunction
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeColorMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/ThemeColor", "ThemeColor")
  @js.native
  val ThemeColor: ForwardRefRenderFunction[HTMLDivElement, ThemeColorProps] = js.native
  
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
    
    var colorList: js.UndefOr[js.Array[Color]] = js.undefined
    
    def formatMessage(data: DefaultMessage): String
    
    var hashId: String
    
    def onChange(color: String): Unit
    
    var prefixCls: String
    
    var value: String
  }
  object ThemeColorProps {
    
    inline def apply(
      formatMessage: DefaultMessage => String,
      hashId: String,
      onChange: String => Unit,
      prefixCls: String,
      value: String
    ): ThemeColorProps = {
      val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), hashId = hashId.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeColorProps]
    }
    
    extension [Self <: ThemeColorProps](x: Self) {
      
      inline def setColorList(value: js.Array[Color]): Self = StObject.set(x, "colorList", value.asInstanceOf[js.Any])
      
      inline def setColorListUndefined: Self = StObject.set(x, "colorList", js.undefined)
      
      inline def setColorListVarargs(value: Color*): Self = StObject.set(x, "colorList", js.Array(value*))
      
      inline def setFormatMessage(value: DefaultMessage => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
