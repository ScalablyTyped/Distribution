package typings.antdMobile

import typings.antdMobile.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexMod {
  
  @JSImport("antd-mobile/lib/flex", JSImport.Default)
  @js.native
  class default ()
    extends typings.antdMobile.flexFlexMod.default
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/flex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/flex", "default.Item")
    @js.native
    def Item: js.Any = js.native
    inline def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/flex", "default.defaultProps")
    @js.native
    def defaultProps: Align = js.native
    inline def defaultProps_=(x: Align): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
