package typings.antDesignReactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  @JSImport("@ant-design/react-native/lib/picker/cascader", JSImport.Default)
  @js.native
  class default ()
    extends typings.antDesignReactNative.cascaderCascaderMod.default
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/picker/cascader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/picker/cascader", "default.defaultProps.cols")
      @js.native
      def cols: Double = js.native
      inline def cols_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cols")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/picker/cascader", "default.defaultProps.data")
      @js.native
      def data: js.Array[scala.Nothing] = js.native
      inline def data_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/picker/cascader", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
  }
}
