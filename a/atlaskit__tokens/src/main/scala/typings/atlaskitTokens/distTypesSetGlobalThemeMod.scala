package typings.atlaskitTokens

import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetGlobalThemeMod {
  
  @JSImport("@atlaskit/tokens/dist/types/set-global-theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(themeId: ThemeIds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(themeId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(themeId: ThemeIds, shouldMatchSystem: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(themeId.asInstanceOf[js.Any], shouldMatchSystem.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
