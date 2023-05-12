package typings.atlaskitTokens

import typings.atlaskitTokens.anon.PartialActiveThemeState
import typings.atlaskitTokens.anon.PartialThemeState
import typings.atlaskitTokens.distTypesSetGlobalThemeMod.ThemeStyles
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeColorModes_
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeConfig
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.Record
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
    extends typings.atlaskitTokens.distTypesThemeMutationObserverMod.ThemeMutationObserver {
    def this(callback: js.Function1[/* theme */ PartialActiveThemeState, Any]) = this()
  }
  
  inline def getGlobalTheme(): PartialActiveThemeState = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalTheme")().asInstanceOf[PartialActiveThemeState]
  
  inline def getSSRAutoScript(colorMode: ThemeColorModes_): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSRAutoScript")(colorMode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getThemeHtmlAttrs(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeHtmlAttrs")().asInstanceOf[Record[String, String]]
  inline def getThemeHtmlAttrs(param0: PartialThemeState): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeHtmlAttrs")(param0.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def getThemeStyles(): js.Promise[js.Array[ThemeStyles]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeStyles")().asInstanceOf[js.Promise[js.Array[ThemeStyles]]]
  inline def getThemeStyles(param0: PartialThemeState): js.Promise[js.Array[ThemeStyles]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ThemeStyles]]]
  
  /**
    * Takes a dot-separated token name and and an optional fallback, and returns the current computed CSS value for the
    * resulting CSS Custom Property.
    * This should be used for when the CSS cascade isn't available, eg. `<canvas>` elements, JS charting libraries, etc.
    *
    * Note: these values change depending on the theme so consider pairing them with `useThemeObserver` in React, or the
    * `ThemeMutationObserver` class elsewhere.
    *
    * @param {string} path - A dot-separated token name (example: `'color.background.brand'` or `'spacing.scale.100'`).
    * @param {string} [fallback] - The fallback value that should render when token CSS is not present in your app.
    *
    * @example
    * ```
    * const theme = useThemeObserver();
    *
    * useEffect(() => {
    *  const lineColor = getTokenValue('color.background.accent.blue.subtle', B400);
    * }, [theme]);
    * ```
    *
    */
  inline def getTokenValue[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token-value.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 329, starting with typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot050, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot100, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot200 */ Any */](tokenId: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenValue")(tokenId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTokenValue[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token-value.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 329, starting with typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot050, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot100, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot200 */ Any */](tokenId: T, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenValue")(tokenId.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Sets the theme globally at runtime. This updates the `data-theme` and `data-color-mode` attributes on your page's <html> tag.
    *
    * @param {Object<string, string>} themeState The themes and color mode that should be applied.
    * @param {string} themeState.colorMode Determines which color theme is applied. If set to `auto`, the theme applied will be determined by the OS setting.
    * @param {string} themeState.dark The color theme to be applied when the color mode resolves to 'dark'.
    * @param {string} themeState.light The color theme to be applied when the color mode resolves to 'light'.
    * @param {string} themeState.spacing The spacing theme to be applied.
    * @param {string} themeState.typography The typography theme to be applied.
    *
    * @returns A Promise of an unbind function, that can be used to stop listening for changes to system theme.
    *
    * @example
    * ```
    * setGlobalTheme({colorMode: 'auto', light: 'light', dark: 'dark', spacing: 'spacing'});
    * ```
    */
  inline def setGlobalTheme(): js.Promise[UnbindFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalTheme")().asInstanceOf[js.Promise[UnbindFn]]
  inline def setGlobalTheme(param0: PartialThemeState): js.Promise[UnbindFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalTheme")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UnbindFn]]
  
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
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-shape")
    @js.native
    def atlassianShape: ThemeConfig = js.native
    
    inline def atlassianShape_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-shape")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-spacing")
    @js.native
    def atlassianSpacing: ThemeConfig = js.native
    
    inline def atlassianSpacing_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-spacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens", "themeConfig.atlassian-typography")
    @js.native
    def atlassianTypography: ThemeConfig = js.native
    
    inline def atlassianTypography_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-typography")(x.asInstanceOf[js.Any])
  }
  
  inline def themeObjectToString(themeState: PartialThemeState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("themeObjectToString")(themeState.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def themeStringToObject(themeState: String): PartialThemeState = ^.asInstanceOf[js.Dynamic].applyDynamic("themeStringToObject")(themeState.asInstanceOf[js.Any]).asInstanceOf[PartialThemeState]
  
  /**
    * Takes a dot-separated token name and an optional fallback, and returns the CSS custom property for the corresponding token.
    * This should be used to implement design decisions throughout your application.
    *
    * Note: With `@atlaskit/babel-plugin-tokens`, this function can be pre-compiled and a fallback value automatically inserted.
    *
    * @param {string} path - A dot-separated token name (example: `'color.background.brand'` or `'spacing.scale.100'`).
    * @param {string} [fallback] - The fallback value that should render when token CSS is not present in your app.
    *
    * @example
    * ```
    * <div
    *   css={{
    *     backgroundColor: token('elevation.surface.raised', N0),
    *     boxShadow: token('elevation.shadow.raised', `0 20px 32px -8px ${N50A}, 0 0 1px ${N60A}`),
    *     padding: token('spacing.scale.100', '8px'),
    *     fontWeight: token('font.weight.regular', '400'),
    *   }}
    * />
    * ```
    *
    */
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 329, starting with typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot050, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot100, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot200 */ Any */](path: T): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 329, starting with typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot050, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot100, typings.atlaskitTokens.atlaskitTokensStrings.borderDotradiusDot200 */ Any */](path: T, fallback: String): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  
  inline def useThemeObserver(): PartialActiveThemeState = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeObserver")().asInstanceOf[PartialActiveThemeState]
}
