package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Cascader
import typings.antDesignReactNative.anon.Format
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.pickerPropsTypeMod.PickerData
import typings.antDesignReactNative.pickerPropsTypeMod.PickerPropsType
import typings.antDesignReactNative.pickerStyleMod.PickerStyle
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
  @js.native
  class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/picker", "default.defaultProps")
    @js.native
    def defaultProps: Format = js.native
    inline def defaultProps_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultProps(): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")().asInstanceOf[Format]
  
  @js.native
  trait Picker
    extends Component[PickerProps, js.Any, js.Any] {
    
    def fixOnOk(cascader: js.Any): Unit = js.native
    
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: js.Any,
      indicatorStyle: js.Any
    ): Cascader = js.native
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: js.Any,
      indicatorStyle: js.Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: js.Any,
      indicatorStyle: js.Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: js.Any,
      indicatorStyle: js.Any
    ): Cascader = js.native
    
    def getPickerCol(): js.Array[Element] = js.native
    
    def getSel(): js.UndefOr[String] = js.native
    
    def onOk(v: js.Any): Unit = js.native
    
    def onPickerChange(v: js.Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    /* private */ var scrollValue: js.Any = js.native
    
    def setCasecadeScrollValue(v: js.Any): Unit = js.native
    
    def setScrollValue(v: js.Any): Unit = js.native
  }
  
  trait PickerProps
    extends StObject
       with PickerPropsType
       with WithThemeStyles[PickerStyle] {
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
  }
  object PickerProps {
    
    inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
    }
  }
}
