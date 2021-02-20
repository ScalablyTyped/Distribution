package typings.antdMobile

import org.scalablytyped.runtime.NumberDictionary
import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.sliderPropsTypeMod.SliderPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("antd-mobile/lib/slider", JSImport.Default)
  @js.native
  class default () extends Slider
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/slider", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Slider
    extends Component[SliderProps, js.Any, js.Any]
  
  @js.native
  trait SliderProps extends SliderPropsType {
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var handleStyle: js.UndefOr[CSSProperties] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[NumberDictionary[String]] = js.native
    
    var maximumTrackStyle: js.UndefOr[CSSProperties] = js.native
    
    var minimumTrackStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var railStyle: js.UndefOr[CSSProperties] = js.native
    
    var trackStyle: js.UndefOr[CSSProperties] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setMarks(value: NumberDictionary[String]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMaximumTrackStyle(value: CSSProperties): Self = StObject.set(x, "maximumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackStyleUndefined: Self = StObject.set(x, "maximumTrackStyle", js.undefined)
      
      @scala.inline
      def setMinimumTrackStyle(value: CSSProperties): Self = StObject.set(x, "minimumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumTrackStyleUndefined: Self = StObject.set(x, "minimumTrackStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    }
  }
}
