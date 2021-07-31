package typings.antDesignPro

import typings.antDesignPro.antDesignProStrings.down
import typings.antDesignPro.antDesignProStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInfoMod {
  
  @JSImport("ant-design-pro/lib/NumberInfo", JSImport.Default)
  @js.native
  class default ()
    extends Component[NumberInfoProps, js.Any, js.Any]
  
  type NumberInfo = Component[NumberInfoProps, js.Any, js.Any]
  
  trait NumberInfoProps extends StObject {
    
    var gap: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[up | down] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode | String] = js.undefined
    
    var subTotal: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[ReactNode | String] = js.undefined
    
    var total: js.UndefOr[ReactNode | String] = js.undefined
  }
  object NumberInfoProps {
    
    @scala.inline
    def apply(): NumberInfoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInfoProps]
    }
    
    @scala.inline
    implicit class NumberInfoPropsMutableBuilder[Self <: NumberInfoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setStatus(value: up | down): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactNode | String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setSubTotal(value: Double): Self = StObject.set(x, "subTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTotalUndefined: Self = StObject.set(x, "subTotal", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTotal(value: ReactNode | String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
