package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnBooleans.`false`
import typings.antdMobileRn.antdMobileRnStrings._empty
import typings.antdMobileRn.antdMobileRnStrings.android
import typings.antdMobileRn.antdMobileRnStrings.bottom
import typings.antdMobileRn.antdMobileRnStrings.down
import typings.antdMobileRn.antdMobileRnStrings.empty
import typings.antdMobileRn.antdMobileRnStrings.horizontal
import typings.antdMobileRn.antdMobileRnStrings.ios
import typings.antdMobileRn.antdMobileRnStrings.middle
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.antdMobileRn.antdMobileRnStrings.up
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListPropsTypeMod {
  
  trait BriefProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    extension [Self <: BriefProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait ListItemPropsType extends StObject {
    
    var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var align: js.UndefOr[top | middle | bottom] = js.undefined
    
    var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var multipleLine: js.UndefOr[Boolean] = js.undefined
    
    var platform: js.UndefOr[android | ios] = js.undefined
    
    var thumb: js.UndefOr[ReactNode | Null] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemPropsType {
    
    inline def apply(): ListItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemPropsType]
    }
    
    extension [Self <: ListItemPropsType](x: Self) {
      
      inline def setActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleNull: Self = StObject.set(x, "activeStyle", null)
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setMultipleLine(value: Boolean): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
      
      inline def setMultipleLineUndefined: Self = StObject.set(x, "multipleLine", js.undefined)
      
      inline def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait ListPropsType extends StObject {
    
    var children: js.UndefOr[`false` | Element | js.Array[Element]] = js.undefined
    
    var renderFooter: js.UndefOr[
        (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]) | String | Element
      ] = js.undefined
    
    var renderHeader: js.UndefOr[
        (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]) | String | Element
      ] = js.undefined
  }
  object ListPropsType {
    
    inline def apply(): ListPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPropsType]
    }
    
    extension [Self <: ListPropsType](x: Self) {
      
      inline def setChildren(value: `false` | Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setRenderFooter(
        value: (js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
            ]) | String | Element
      ): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
      
      inline def setRenderFooterFunction0(
        value: () => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setRenderHeader(
        value: (js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
            ]) | String | Element
      ): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
      
      inline def setRenderHeaderFunction0(
        value: () => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
      
      inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    }
  }
}
