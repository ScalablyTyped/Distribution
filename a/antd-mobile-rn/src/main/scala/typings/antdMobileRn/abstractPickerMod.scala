package typings.antdMobileRn

import typings.antdMobileRn.anon.Format
import typings.antdMobileRn.pickerPropsTypeMod.PickerData
import typings.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractPickerMod {
  
  @JSImport("antd-mobile-rn/lib/picker/AbstractPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn/lib/picker/AbstractPicker", JSImport.Default)
  @js.native
  abstract class default () extends AbstractPicker
  
  @scala.inline
  def getDefaultProps(): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")().asInstanceOf[Format]
  
  @js.native
  trait AbstractPicker
    extends Component[AbstractPickerProps, js.Any, js.Any] {
    
    def fixOnOk(cascader: js.Any): Unit = js.native
    
    def getPickerCol(): js.Array[Element] = js.native
    
    def getSel(): js.UndefOr[String] = js.native
    
    def onOk(v: js.Any): Unit = js.native
    
    def onPickerChange(v: js.Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    var scrollValue: js.Any = js.native
    
    def setCasecadeScrollValue(v: js.Any): Unit = js.native
    
    def setScrollValue(v: js.Any): Unit = js.native
  }
  
  trait AbstractPickerProps
    extends StObject
       with PickerPropsType {
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
  }
  object AbstractPickerProps {
    
    @scala.inline
    def apply(data: js.Array[js.Array[PickerData] | PickerData]): AbstractPickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractPickerProps]
    }
    
    @scala.inline
    implicit class AbstractPickerPropsMutableBuilder[Self <: AbstractPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
    }
  }
}
