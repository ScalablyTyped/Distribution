package typings.antdMobile

import org.scalablytyped.runtime.NumberDictionary
import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.sliderPropsTypeMod.SliderPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Slider
    extends Component[SliderProps, js.Any, js.Any]
  
  trait SliderProps
    extends StObject
       with SliderPropsType {
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var handleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[NumberDictionary[String]] = js.undefined
    
    var maximumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var minimumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var railStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setMarks(value: NumberDictionary[String]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMaximumTrackStyle(value: CSSProperties): Self = StObject.set(x, "maximumTrackStyle", value.asInstanceOf[js.Any])
      
      inline def setMaximumTrackStyleUndefined: Self = StObject.set(x, "maximumTrackStyle", js.undefined)
      
      inline def setMinimumTrackStyle(value: CSSProperties): Self = StObject.set(x, "minimumTrackStyle", value.asInstanceOf[js.Any])
      
      inline def setMinimumTrackStyleUndefined: Self = StObject.set(x, "minimumTrackStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      inline def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
    }
  }
}
