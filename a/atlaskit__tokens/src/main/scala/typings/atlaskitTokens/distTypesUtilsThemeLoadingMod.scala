package typings.atlaskitTokens

import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds_
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeOverrideIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsThemeLoadingMod {
  
  @JSImport("@atlaskit/tokens/dist/types/utils/theme-loading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadAndAppendThemeCss(themeId: ThemeIds_): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndAppendThemeCss")(themeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def loadAndAppendThemeCss(themeId: ThemeOverrideIds): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndAppendThemeCss")(themeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadThemeCss(themeId: ThemeIds_): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadThemeCss")(themeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def loadThemeCss(themeId: ThemeOverrideIds): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadThemeCss")(themeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
