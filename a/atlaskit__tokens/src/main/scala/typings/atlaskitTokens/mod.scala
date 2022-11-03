package typings.atlaskitTokens

import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeConfig
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/tokens", "ThemeMutationObserver")
  @js.native
  open class ThemeMutationObserver protected ()
    extends typings.atlaskitTokens.distTypesThemeChangeObserverMod.ThemeMutationObserver {
    def this(callback: js.Function1[/* theme */ ThemeIds | Null, Any]) = this()
  }
  
  inline def setGlobalTheme(themeId: ThemeIds): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalTheme")(themeId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setGlobalTheme(themeId: ThemeIds, shouldMatchSystem: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalTheme")(themeId.asInstanceOf[js.Any], shouldMatchSystem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Record<@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.Themes, @atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.ThemeConfig> */
  object themeConfig {
    
    @JSImport("@atlaskit/tokens", "themeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-dark")
    @js.native
    def atlassianDark: ThemeConfig = js.native
    
    inline def atlassianDark_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-legacy-dark")
    @js.native
    def atlassianLegacyDark: ThemeConfig = js.native
    
    inline def atlassianLegacyDark_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-legacy-light")
    @js.native
    def atlassianLegacyLight: ThemeConfig = js.native
    
    inline def atlassianLegacyLight_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-light")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-light")
    @js.native
    def atlassianLight: ThemeConfig = js.native
    
    inline def atlassianLight_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-light")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-spacing")
    @js.native
    def atlassianSpacing: ThemeConfig = js.native
    
    inline def atlassianSpacing_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-spacing")(x.asInstanceOf[js.Any])
  }
  
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367, starting with typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot0, typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot100, typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot150 */ Any */](path: T): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367, starting with typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot0, typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot100, typings.atlaskitTokens.atlaskitTokensStrings.spacingDotscaleDot150 */ Any */](path: T, fallback: String): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  
  inline def useThemeObserver(): ThemeIds | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeObserver")().asInstanceOf[ThemeIds | Null]
}
