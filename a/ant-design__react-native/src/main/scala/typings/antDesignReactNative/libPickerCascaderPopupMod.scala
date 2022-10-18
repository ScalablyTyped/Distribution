package typings.antDesignReactNative

import typings.antDesignReactNative.libPickerCascaderCascaderTypesMod.CascaderValue
import typings.antDesignReactNative.libPickerPopupPickerTypesMod.PopupPickerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerCascaderPopupMod {
  
  @JSImport("@ant-design/react-native/lib/picker/cascader/Popup", JSImport.Default)
  @js.native
  open class default () extends PopupCascader
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Popup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Popup", "default.defaultProps.pickerValueChangeProp")
      @js.native
      def pickerValueChangeProp: String = js.native
      inline def pickerValueChangeProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueChangeProp")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Popup", "default.defaultProps.pickerValueProp")
      @js.native
      def pickerValueProp: String = js.native
      inline def pickerValueProp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerValueProp")(x.asInstanceOf[js.Any])
    }
  }
  
  trait IPopupCascaderProps
    extends StObject
       with PopupPickerProps {
    
    var cascader: ReactElement
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.undefined
  }
  object IPopupCascaderProps {
    
    inline def apply(cascader: ReactElement): IPopupCascaderProps = {
      val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopupCascaderProps]
    }
    
    extension [Self <: IPopupCascaderProps](x: Self) {
      
      inline def setCascader(value: ReactElement): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  @js.native
  trait PopupCascader extends Component[IPopupCascaderProps, Any, Any] {
    
    def onOk(v: Any): Unit = js.native
  }
}
