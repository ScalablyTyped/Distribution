package typings.antvG2plot

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreGlobalMod {
  
  @JSImport("@antv/g2plot/lib/core/global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GLOBAL {
    
    @JSImport("@antv/g2plot/lib/core/global", "GLOBAL")
    @js.native
    val ^ : js.Any = js.native
    
    /** 全局语言 */
    @JSImport("@antv/g2plot/lib/core/global", "GLOBAL.locale")
    @js.native
    def locale: String = js.native
    inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
  }
  
  inline def setGlobal(datum: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(datum.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
