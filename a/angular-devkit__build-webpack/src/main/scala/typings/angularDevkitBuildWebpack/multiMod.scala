package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.apiMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/analytics/multi", "MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends StObject
       with Analytics {
    def this(_backends: js.Array[Analytics]) = this()
    
    /* protected */ var _backends: js.Array[Analytics] = js.native
    
    def push(backend: Analytics*): Unit = js.native
  }
}
