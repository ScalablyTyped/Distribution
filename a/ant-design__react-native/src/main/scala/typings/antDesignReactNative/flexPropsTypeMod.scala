package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.around
import typings.antDesignReactNative.antDesignReactNativeStrings.baseline
import typings.antDesignReactNative.antDesignReactNativeStrings.between
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.column
import typings.antDesignReactNative.antDesignReactNativeStrings.end
import typings.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typings.antDesignReactNative.antDesignReactNativeStrings.row
import typings.antDesignReactNative.antDesignReactNativeStrings.start
import typings.antDesignReactNative.antDesignReactNativeStrings.stretch
import typings.antDesignReactNative.antDesignReactNativeStrings.wrap
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexPropsTypeMod {
  
  trait FlexItemPropsType extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
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
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait FlexPropsType extends StObject {
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var justify: js.UndefOr[start | end | center | between | around] = js.undefined
    
    var wrap: js.UndefOr[
        nowrap | typings.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
      ] = js.undefined
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
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
