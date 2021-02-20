package typings.antdMobileRn

import typings.antdMobileRn.anon.Direction
import typings.antdMobileRn.antdMobileRnStrings.horizontal
import typings.antdMobileRn.antdMobileRnStrings.vertical
import typings.antdMobileRn.stepsPropsTypeMod.StepsPropsType
import typings.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/steps/index.native", JSImport.Default)
  @js.native
  class default protected () extends Steps {
    def this(props: StepsNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", "default.Step")
    @js.native
    def Step: js.Any = js.native
    @scala.inline
    def Step_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/steps/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    @scala.inline
    def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Steps
    extends Component[StepsNativeProps, js.Any, js.Any] {
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  @js.native
  trait StepsNativeProps extends StepsProps {
    
    @JSName("styles")
    var styles_StepsNativeProps: js.UndefOr[IStepsStyle] = js.native
  }
  object StepsNativeProps {
    
    @scala.inline
    def apply(children: js.Array[ReactElement]): StepsNativeProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsNativeProps]
    }
    
    @scala.inline
    implicit class StepsNativePropsMutableBuilder[Self <: StepsNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IStepsStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait StepsProps extends StepsPropsType {
    
    @JSName("children")
    var children_StepsProps: js.Array[ReactElement] = js.native
    
    var direction: js.UndefOr[vertical | horizontal] = js.native
    
    var finishIcon: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(children: js.Array[ReactElement]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class StepsPropsMutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFinishIcon(value: String): Self = StObject.set(x, "finishIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishIconUndefined: Self = StObject.set(x, "finishIcon", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
