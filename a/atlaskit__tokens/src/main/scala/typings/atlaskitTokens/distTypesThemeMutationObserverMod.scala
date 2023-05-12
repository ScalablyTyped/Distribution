package typings.atlaskitTokens

import typings.atlaskitTokens.anon.PartialActiveThemeState
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeMutationObserverMod {
  
  @JSImport("@atlaskit/tokens/dist/types/theme-mutation-observer", "ThemeMutationObserver")
  @js.native
  open class ThemeMutationObserver protected () extends StObject {
    def this(callback: js.Function1[/* theme */ PartialActiveThemeState, Any]) = this()
    
    /* private */ var callback: Any = js.native
    
    def disconnect(): Unit = js.native
    
    var mediaObserver: Any = js.native
    
    def observe(): Unit = js.native
    
    var observer: MutationObserver | Null = js.native
  }
}
