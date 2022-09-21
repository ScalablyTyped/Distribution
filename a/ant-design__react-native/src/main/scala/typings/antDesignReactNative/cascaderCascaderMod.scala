package typings.antDesignReactNative

import typings.antDesignReactNative.anon.DataValue
import typings.antDesignReactNative.anon.ValueArray
import typings.antDesignReactNative.cascaderTypesMod.CascaderProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderCascaderMod {
  
  @JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", JSImport.Default)
  @js.native
  open class default () extends Cascader
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", "default.defaultProps.cols")
      @js.native
      def cols: Double = js.native
      inline def cols_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cols")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", "default.defaultProps.data")
      @js.native
      def data: js.Array[scala.Nothing] = js.native
      inline def data_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cascader extends Component[CascaderProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCascader(nextProps: DataValue): Unit = js.native
    
    def getCols(): js.Array[Element] = js.native
    
    def getValue(d: Any, `val`: Any): js.Array[Any] = js.native
    
    def onValueChange(value: Any, index: Any): Unit = js.native
    
    @JSName("state")
    var state_Cascader: ValueArray = js.native
  }
}
