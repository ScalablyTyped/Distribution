package typings.antdMobileRn

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverPropsTypeMod {
  
  trait PopoverPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    var overlay: ReactNode
  }
  object PopoverPropsType {
    
    inline def apply(): PopoverPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverPropsType]
    }
    
    extension [Self <: PopoverPropsType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
