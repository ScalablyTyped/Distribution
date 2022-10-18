package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typings.antdMobileRn.antdMobileRnStrings.around
import typings.antdMobileRn.antdMobileRnStrings.baseline
import typings.antdMobileRn.antdMobileRnStrings.between
import typings.antdMobileRn.antdMobileRnStrings.center
import typings.antdMobileRn.antdMobileRnStrings.column
import typings.antdMobileRn.antdMobileRnStrings.end
import typings.antdMobileRn.antdMobileRnStrings.nowrap
import typings.antdMobileRn.antdMobileRnStrings.row
import typings.antdMobileRn.antdMobileRnStrings.start
import typings.antdMobileRn.antdMobileRnStrings.stretch
import typings.antdMobileRn.antdMobileRnStrings.wrap
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlexPropsTypeMod {
  
  trait FlexItemPropsType extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object FlexItemPropsType {
    
    inline def apply(): FlexItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexItemPropsType]
    }
    
    extension [Self <: FlexItemPropsType](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait FlexPropsType extends StObject {
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var justify: js.UndefOr[start | end | center | between | around] = js.undefined
    
    var wrap: js.UndefOr[nowrap | typings.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`] = js.undefined
  }
  object FlexPropsType {
    
    inline def apply(): FlexPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexPropsType]
    }
    
    extension [Self <: FlexPropsType](x: Self) {
      
      inline def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setJustify(value: start | end | center | between | around): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
