package typings.atlaskitTokens

import typings.atlaskitTokens.distTypesTypesMod.Themes
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeChangeObserverMod {
  
  @JSImport("@atlaskit/tokens/dist/types/theme-change-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/theme-change-observer", "ThemeMutationObserver")
  @js.native
  open class ThemeMutationObserver protected () extends StObject {
    def this(callback: js.Function1[/* theme */ Themes | Null, Any]) = this()
    
    /* private */ var callback: Any = js.native
    
    def disconnect(): Unit = js.native
    
    def observe(): Unit = js.native
    
    var observer: MutationObserver | Null = js.native
  }
  
  inline def useThemeObserver(): Themes | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeObserver")().asInstanceOf[Themes | Null]
}
