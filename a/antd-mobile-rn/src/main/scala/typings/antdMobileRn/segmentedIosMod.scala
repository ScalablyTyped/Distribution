package typings.antdMobileRn

import typings.antdMobileRn.anon.SelectedIndex
import typings.antdMobileRn.segmentedControlPropsTypeMod.SegmentedControlPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedIosMod {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.ios", JSImport.Default)
  @js.native
  class default () extends SegmentedControl
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/segmented-control/segmented.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/segmented-control/segmented.ios", "default.defaultProps")
    @js.native
    def defaultProps: SelectedIndex = js.native
    @scala.inline
    def defaultProps_=(x: SelectedIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SegmentedControl
    extends Component[SegmentedControlProps, js.Any, js.Any]
  
  @js.native
  trait SegmentedControlProps extends SegmentedControlPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
  }
  object SegmentedControlProps {
    
    @scala.inline
    def apply(): SegmentedControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    @scala.inline
    implicit class SegmentedControlPropsMutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
