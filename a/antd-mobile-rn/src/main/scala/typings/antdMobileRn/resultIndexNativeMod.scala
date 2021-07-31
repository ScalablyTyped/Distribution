package typings.antdMobileRn

import typings.antdMobileRn.anon.ButtonClick
import typings.antdMobileRn.resultPropsTypeMod.ResultPropsType
import typings.antdMobileRn.resultStyleIndexNativeMod.IResultStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/result/index.native", JSImport.Default)
  @js.native
  class default () extends Result
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/result/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/result/index.native", "default.defaultProps")
    @js.native
    def defaultProps: ButtonClick = js.native
    @scala.inline
    def defaultProps_=(x: ButtonClick): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Result
    extends Component[ResultNativeProps, js.Any, js.Any]
  
  trait ResultNativeProps
    extends StObject
       with ResultPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[IResultStyle] = js.undefined
  }
  object ResultNativeProps {
    
    @scala.inline
    def apply(): ResultNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultNativeProps]
    }
    
    @scala.inline
    implicit class ResultNativePropsMutableBuilder[Self <: ResultNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: IResultStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
