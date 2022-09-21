package typings.antDesignReactNative

import typings.antDesignReactNative.anon.SelectedIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentedControlMod {
  
  /* was `typeof SegmentedIOS` */
  @JSImport("@ant-design/react-native/lib/segmented-control", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antDesignReactNative.segmentedIosMod.default
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/segmented-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/segmented-control", "default.defaultProps")
    @js.native
    def defaultProps: SelectedIndex = js.native
    inline def defaultProps_=(x: SelectedIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof SegmentedIOS` */
  type _default = typings.antDesignReactNative.segmentedIosMod.default
}
