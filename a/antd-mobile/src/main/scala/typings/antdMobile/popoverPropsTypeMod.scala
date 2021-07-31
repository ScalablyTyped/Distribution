package typings.antdMobile

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
    
    @scala.inline
    def apply(): PopoverPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverPropsType]
    }
    
    @scala.inline
    implicit class PopoverPropsTypeMutableBuilder[Self <: PopoverPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
