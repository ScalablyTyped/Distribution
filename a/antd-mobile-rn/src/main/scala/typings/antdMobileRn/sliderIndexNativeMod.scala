package typings.antdMobileRn

import typings.antdMobileRn.anon.DefaultValue
import typings.antdMobileRn.sliderPropsTypeMod.SliderPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/slider/index.native", JSImport.Default)
  @js.native
  class default () extends SliderAntm
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/slider/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/slider/index.native", "default.defaultProps")
    @js.native
    def defaultProps: DefaultValue = js.native
    @scala.inline
    def defaultProps_=(x: DefaultValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SliderAntm
    extends Component[SliderProps, js.Any, js.Any]
  
  trait SliderProps
    extends StObject
       with SliderPropsType {
    
    var maximumTrackTintColor: js.UndefOr[String] = js.undefined
    
    var minimumTrackTintColor: js.UndefOr[String] = js.undefined
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
      def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
      
      @scala.inline
      def setMinimumTrackTintColor(value: String): Self = StObject.set(x, "minimumTrackTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumTrackTintColorUndefined: Self = StObject.set(x, "minimumTrackTintColor", js.undefined)
    }
  }
}
