package typings.antdMobile

import typings.antdMobile.anon.FocusOnUpDown
import typings.antdMobile.stepperPropsTypeMod.StepPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("antd-mobile/lib/stepper", JSImport.Default)
  @js.native
  class default () extends Stepper
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/stepper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/stepper", "default.defaultProps")
    @js.native
    def defaultProps: FocusOnUpDown = js.native
    @scala.inline
    def defaultProps_=(x: FocusOnUpDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StepProps extends StepPropsType {
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showNumber: js.UndefOr[Boolean] = js.native
  }
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class StepPropsMutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
    }
  }
  
  @js.native
  trait Stepper
    extends Component[StepProps, js.Any, js.Any] {
    
    var stepperRef: typings.rmcInputNumber.mod.default | Null = js.native
  }
}
