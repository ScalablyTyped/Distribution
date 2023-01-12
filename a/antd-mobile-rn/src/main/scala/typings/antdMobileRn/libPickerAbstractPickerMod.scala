package typings.antdMobileRn

import typings.antdMobileRn.anon.Format
import typings.antdMobileRn.libPickerPropsTypeMod.PickerData
import typings.antdMobileRn.libPickerPropsTypeMod.PickerPropsType
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerAbstractPickerMod {
  
  @JSImport("antd-mobile-rn/lib/picker/AbstractPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("antd-mobile-rn/lib/picker/AbstractPicker", JSImport.Default)
  @js.native
  open class default () extends AbstractPicker
  
  inline def getDefaultProps(): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")().asInstanceOf[Format]
  
  @js.native
  trait AbstractPicker extends Component[AbstractPickerProps, Any, Any] {
    
    def fixOnOk(cascader: Any): Unit = js.native
    
    def getPickerCol(): js.Array[Element] = js.native
    
    def getSel(): js.UndefOr[String] = js.native
    
    def onOk(v: Any): Unit = js.native
    
    def onPickerChange(v: Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    /* private */ var scrollValue: Any = js.native
    
    def setCasecadeScrollValue(v: Any): Unit = js.native
    
    def setScrollValue(v: Any): Unit = js.native
  }
  
  trait AbstractPickerProps
    extends StObject
       with PickerPropsType {
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
  }
  object AbstractPickerProps {
    
    inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): AbstractPickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractPickerProps] (val x: Self) extends AnyVal {
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
    }
  }
}
