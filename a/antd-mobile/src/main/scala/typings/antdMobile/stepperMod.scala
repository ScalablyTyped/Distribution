package typings.antdMobile

import typings.antdMobile.anon.FocusOnUpDown
import typings.antdMobile.stepperPropsTypeMod.StepPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def defaultProps_=(x: FocusOnUpDown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StepProps
    extends StObject
       with StepPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showNumber: js.UndefOr[Boolean] = js.undefined
  }
  object StepProps {
    
    inline def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    extension [Self <: StepProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      inline def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
    }
  }
  
  @js.native
  trait Stepper
    extends Component[StepProps, js.Any, js.Any] {
    
    var stepperRef: typings.rmcInputNumber.mod.default | Null = js.native
  }
}
