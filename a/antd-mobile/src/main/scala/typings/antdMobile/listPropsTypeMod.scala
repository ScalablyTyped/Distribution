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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPropsTypeMod {
  
  @js.native
  trait BriefProps extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object BriefProps {
    
    @scala.inline
    def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    @scala.inline
    implicit class BriefPropsMutableBuilder[Self <: BriefProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ListItemPropsType extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties] = js.native
    
    var align: js.UndefOr[top | middle | bottom] = js.native
    
    var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var multipleLine: js.UndefOr[Boolean] = js.native
    
    var platform: js.UndefOr[android | ios] = js.native
    
    var thumb: js.UndefOr[ReactNode | Null] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object ListItemPropsType {
    
    @scala.inline
    def apply(): ListItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemPropsType]
    }
    
    @scala.inline
    implicit class ListItemPropsTypeMutableBuilder[Self <: ListItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setAlign(value: top | middle | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrow(value: horizontal | down | up | empty | _empty): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setMultipleLine(value: Boolean): Self = StObject.set(x, "multipleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleLineUndefined: Self = StObject.set(x, "multipleLine", js.undefined)
      
      @scala.inline
      def setPlatform(value: android | ios): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait ListPropsType extends StObject {
    
    var renderFooter: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.native
    
    var renderHeader: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.native
  }
  object ListPropsType {
    
    @scala.inline
    def apply(): ListPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPropsType]
    }
    
    @scala.inline
    implicit class ListPropsTypeMutableBuilder[Self <: ListPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderFooter(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderFooterFunction0(value: () => ReactNode): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "renderHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderHeaderFunction0(value: () => ReactNode): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    }
  }
}
