package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.radioNativeMod.RadioNativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/radio/index.native", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.antdMobileRn.radioNativeMod.default {
    def this(props: RadioNativeProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/radio/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/radio/index.native", "default.RadioItem")
    @js.native
    def RadioItem: js.Any = js.native
    inline def RadioItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadioItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/radio/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
