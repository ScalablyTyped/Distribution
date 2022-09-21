package typings.antdMobileRn

import typings.antdMobileRn.anon.Styles
import typings.antdMobileRn.checkboxPropsTypeMod.CheckboxPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/checkbox/index.native", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.antdMobileRn.checkboxNativeMod.default {
    def this(props: CheckboxPropsType, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/checkbox/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/checkbox/index.native", "default.AgreeItem")
    @js.native
    def AgreeItem: Any = js.native
    inline def AgreeItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AgreeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/index.native", "default.CheckboxItem")
    @js.native
    def CheckboxItem: Any = js.native
    inline def CheckboxItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/checkbox/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
