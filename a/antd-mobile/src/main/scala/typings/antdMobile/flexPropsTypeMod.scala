package typings.antdMobile

import typings.antdMobile.antdMobileStrings.`column-reverse`
import typings.antdMobile.antdMobileStrings.`row-reverse`
import typings.antdMobile.antdMobileStrings.`wrap-reverse`
import typings.antdMobile.antdMobileStrings.around
import typings.antdMobile.antdMobileStrings.baseline
import typings.antdMobile.antdMobileStrings.between
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.column
import typings.antdMobile.antdMobileStrings.end
import typings.antdMobile.antdMobileStrings.nowrap
import typings.antdMobile.antdMobileStrings.row
import typings.antdMobile.antdMobileStrings.start
import typings.antdMobile.antdMobileStrings.stretch
import typings.antdMobile.antdMobileStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexPropsTypeMod {
  
  trait FlexItemPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object FlexItemPropsType {
    
    @scala.inline
    def apply(): FlexItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemPropsType]
    }
    
    @scala.inline
    implicit class FlexItemPropsTypeMutableBuilder[Self <: FlexItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait FlexPropsType extends StObject {
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
    
    var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var justify: js.UndefOr[start | end | center | between | around] = js.undefined
    
    var wrap: js.UndefOr[nowrap | typings.antdMobile.antdMobileStrings.wrap | `wrap-reverse`] = js.undefined
  }
  object FlexPropsType {
    
    @scala.inline
    def apply(): FlexPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexPropsType]
    }
    
    @scala.inline
    implicit class FlexPropsTypeMutableBuilder[Self <: FlexPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setJustify(value: start | end | center | between | around): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
