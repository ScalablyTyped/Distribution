package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsStrings.edit
import typings.antDesignProUtils.antDesignProUtilsStrings.read
import typings.antd.libPopoverMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  
  var mode: js.UndefOr[read | edit] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* color */ String, Unit]] = js.undefined
  
  var popoverProps: js.UndefOr[PopoverProps] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Colors {
  
  inline def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setMode(value: read | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnChange(value: /* color */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPopoverProps(value: PopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
