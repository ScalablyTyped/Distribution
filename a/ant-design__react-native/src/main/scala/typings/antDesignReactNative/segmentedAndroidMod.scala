package typings.antDesignReactNative

import typings.antDesignReactNative.anon.OnChange
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.segmentedControlPropsTypeMod.SegmentedControlPropsType
import typings.antDesignReactNative.segmentedControlStyleMod.SegmentControlStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedAndroidMod {
  
  @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  class default protected () extends SegmentedControl {
    def this(props: SegmentControlProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    @scala.inline
    def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait SegmentControlProps
    extends StObject
       with SegmentedControlPropsType
       with WithThemeStyles[SegmentControlStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object SegmentControlProps {
    
    @scala.inline
    def apply(): SegmentControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentControlProps]
    }
    
    @scala.inline
    implicit class SegmentControlPropsMutableBuilder[Self <: SegmentControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SegmentedControl
    extends Component[SegmentControlProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSegmentedControl(nextProps: SegmentControlProps): Unit = js.native
    
    def onPress(e: js.Any, index: Double, value: String): Unit = js.native
  }
}
