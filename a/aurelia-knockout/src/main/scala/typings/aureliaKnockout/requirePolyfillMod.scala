package typings.aureliaKnockout

import typings.aureliaLoader.mod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requirePolyfillMod {
  
  @JSImport("aurelia-knockout/dist/commonjs/require-polyfill", "RequirePolyfill")
  @js.native
  class RequirePolyfill protected () extends StObject {
    def this(loader: Loader) = this()
    
    var loader: Loader = js.native
    
    /**
      * Registers the `require` function if not set.
      */
    def register(): Unit = js.native
  }
}
