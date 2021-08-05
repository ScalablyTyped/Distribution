package typings.antdMobile

import typings.antdMobile.antdMobileStrings._empty
import typings.antdMobile.antdMobileStrings.android
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.down
import typings.antdMobile.antdMobileStrings.empty
import typings.antdMobile.antdMobileStrings.horizontal
import typings.antdMobile.antdMobileStrings.ios
import typings.antdMobile.antdMobileStrings.middle
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.antdMobileStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPropsTypeMod {
  
  trait BriefProps extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    extension [Self <: BriefProps](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait ListItemPropsType extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var align: js.UndefOr[top | middle | bottom] = js.undefined
    
    var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
    
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
      
      inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
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
    
    var renderFooter: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
    
    var renderHeader: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.undefined
  }
  object ListPropsType {
    
    inline def apply(): ListPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPropsType]
    }
    
    extension [Self <: ListPropsType](x: Self) {
      
      inline def setRenderFooter(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
      
      inline def setRenderFooterFunction0(value: () => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
      
      inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      inline def setRenderHeader(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
      
      inline def setRenderHeaderFunction0(value: () => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
      
      inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    }
  }
}
