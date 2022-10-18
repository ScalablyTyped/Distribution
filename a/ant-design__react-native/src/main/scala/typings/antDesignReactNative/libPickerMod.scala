package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Cascade
import typings.antDesignReactNative.anon.Cascader
import typings.antDesignReactNative.libPickerPropsTypeMod.PickerData
import typings.antDesignReactNative.libPickerPropsTypeMod.PickerPropsType
import typings.antDesignReactNative.libPickerStyleMod.PickerStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerMod {
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
  @js.native
  open class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/picker", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    inline def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getDefaultProps(): Cascade = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")().asInstanceOf[Cascade]
  
  @js.native
  trait Picker extends Component[PickerProps, Any, Any] {
    
    def fixOnOk(cascader: Any): Unit = js.native
    
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Boolean,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Double,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    def getCascade(
      cascade: Unit,
      data: js.Array[js.Array[PickerData] | PickerData],
      cols: Unit,
      itemStyle: Any,
      indicatorStyle: Any
    ): Cascader = js.native
    
    def getPickerCol(): js.Array[Element] = js.native
    
    def getSel(): js.UndefOr[String] = js.native
    
    def onOk(v: Any): Unit = js.native
    
    def onPickerChange(v: Any): Unit = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    /* private */ var scrollValue: Any = js.native
    
    def setCasecadeScrollValue(v: Any): Unit = js.native
    
    def setScrollValue(v: Any): Unit = js.native
  }
  
  trait PickerProps
    extends StObject
       with PickerPropsType
       with WithThemeStyles[PickerStyle] {
    
    var children: ReactNode
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var popupPrefixCls: js.UndefOr[String] = js.undefined
  }
  object PickerProps {
    
    inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPopupPrefixCls(value: String): Self = StObject.set(x, "popupPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPopupPrefixClsUndefined: Self = StObject.set(x, "popupPrefixCls", js.undefined)
    }
  }
}
