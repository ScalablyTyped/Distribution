package typings.antvG2plot

import typings.antvG2plot.anon.Active
import typings.antvG2plot.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesButtonMod {
  
  trait ButtonCfg extends StObject {
    
    /**
      * @title 按钮样式
      * @description 自定义按钮样式
      */
    var buttonStyle: js.UndefOr[Active] = js.undefined
    
    /**
      * @title 间距
      * @description 文本与按钮边缘的间距
      */
    var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * @title 文本
      * @description 按钮文本
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * @title 文本样式
      * @title 自定义文本样式
      */
    var textStyle: js.UndefOr[Default] = js.undefined
  }
  object ButtonCfg {
    
    inline def apply(): ButtonCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonCfg] (val x: Self) extends AnyVal {
      
      inline def setButtonStyle(value: Active): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextStyle(value: Default): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
