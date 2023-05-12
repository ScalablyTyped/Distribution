package typings.atlaskitTokens

import typings.atlaskitTokens.anon.DisplayName
import typings.atlaskitTokens.anon.typeExtractThemeKindsspac
import typings.atlaskitTokens.anon.typecolormodeDataColorMod
import typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark-iteration`
import typings.atlaskitTokens.atlaskitTokensStrings.`dark-iteration`
import typings.atlaskitTokens.atlaskitTokensStrings.`legacy-dark`
import typings.atlaskitTokens.atlaskitTokensStrings.`legacy-light`
import typings.atlaskitTokens.atlaskitTokensStrings.auto
import typings.atlaskitTokens.atlaskitTokensStrings.dark
import typings.atlaskitTokens.atlaskitTokensStrings.light
import typings.atlaskitTokens.atlaskitTokensStrings.shape
import typings.atlaskitTokens.atlaskitTokensStrings.spacing
import typings.atlaskitTokens.atlaskitTokensStrings.typography
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemeConfigMod {
  
  /* Inlined std.Record<@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.Themes, @atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.ThemeConfig> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-dark")
    @js.native
    def atlassianDark: ThemeConfig = js.native
    
    inline def atlassianDark_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-legacy-dark")
    @js.native
    def atlassianLegacyDark: ThemeConfig = js.native
    
    inline def atlassianLegacyDark_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-legacy-light")
    @js.native
    def atlassianLegacyLight: ThemeConfig = js.native
    
    inline def atlassianLegacyLight_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-light")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-light")
    @js.native
    def atlassianLight: ThemeConfig = js.native
    
    inline def atlassianLight_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-light")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-shape")
    @js.native
    def atlassianShape: ThemeConfig = js.native
    
    inline def atlassianShape_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-shape")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-spacing")
    @js.native
    def atlassianSpacing: ThemeConfig = js.native
    
    inline def atlassianSpacing_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-spacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-typography")
    @js.native
    def atlassianTypography: ThemeConfig = js.native
    
    inline def atlassianTypography_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-typography")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@atlaskit/tokens/dist/types/theme-config", "themeColorModes")
  @js.native
  val themeColorModes: js.Tuple3[light, dark, auto] = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/theme-config", "themeIds")
  @js.native
  val themeIds: js.Tuple7[light, dark, `legacy-light`, `legacy-dark`, spacing, typography, shape] = js.native
  
  object themeOverrideConfig {
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "themeOverrideConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "themeOverrideConfig.atlassian-dark-iteration")
    @js.native
    def atlassianDarkIteration: DisplayName = js.native
    
    inline def atlassianDarkIteration_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-dark-iteration")(x.asInstanceOf[js.Any])
  }
  
  type DataColorModes = Exclude[ThemeColorModes_, auto]
  
  type ExtensionThemeId = ThemeIds_
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette
    - typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingScale
    - typings.atlaskitTokens.atlaskitTokensStrings.shapePalette
    - typings.atlaskitTokens.atlaskitTokensStrings.typographyPalette
  */
  trait Palettes extends StObject
  object Palettes {
    
    inline def defaultPalette: typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette = "defaultPalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette]
    
    inline def legacyPalette: typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette = "legacyPalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette]
    
    inline def shapePalette: typings.atlaskitTokens.atlaskitTokensStrings.shapePalette = "shapePalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.shapePalette]
    
    inline def spacingScale: typings.atlaskitTokens.atlaskitTokensStrings.spacingScale = "spacingScale".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.spacingScale]
    
    inline def typographyPalette: typings.atlaskitTokens.atlaskitTokensStrings.typographyPalette = "typographyPalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.typographyPalette]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.light
    - typings.atlaskitTokens.atlaskitTokensStrings.dark
    - typings.atlaskitTokens.atlaskitTokensStrings.auto
  */
  trait ThemeColorModes_ extends StObject
  
  /**
    * ThemeConfig: the source of truth for all theme meta-data.
    * This object should be used whenever interfacing with themes.
    */
  trait ThemeConfig extends StObject {
    
    var attributes: typecolormodeDataColorMod | typeExtractThemeKindsspac
    
    var displayName: String
    
    var id: ThemeIds_
    
    var palette: Palettes
  }
  object ThemeConfig {
    
    inline def apply(
      attributes: typecolormodeDataColorMod | typeExtractThemeKindsspac,
      displayName: String,
      id: ThemeIds_,
      palette: Palettes
    ): ThemeConfig = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeConfig] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: typecolormodeDataColorMod | typeExtractThemeKindsspac): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: ThemeIds_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: Palettes): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemeFileNames = Themes
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.light
    - typings.atlaskitTokens.atlaskitTokensStrings.dark
    - typings.atlaskitTokens.atlaskitTokensStrings.`legacy-light`
    - typings.atlaskitTokens.atlaskitTokensStrings.`legacy-dark`
    - typings.atlaskitTokens.atlaskitTokensStrings.spacing
    - typings.atlaskitTokens.atlaskitTokensStrings.typography
    - typings.atlaskitTokens.atlaskitTokensStrings.shape
  */
  trait ThemeIds_ extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.color
    - typings.atlaskitTokens.atlaskitTokensStrings.spacing
    - typings.atlaskitTokens.atlaskitTokensStrings.typography
    - typings.atlaskitTokens.atlaskitTokensStrings.shape
  */
  trait ThemeKinds extends StObject
  object ThemeKinds {
    
    inline def color: typings.atlaskitTokens.atlaskitTokensStrings.color = "color".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.color]
    
    inline def shape: typings.atlaskitTokens.atlaskitTokensStrings.shape = "shape".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.shape]
    
    inline def spacing: typings.atlaskitTokens.atlaskitTokensStrings.spacing = "spacing".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.spacing]
    
    inline def typography: typings.atlaskitTokens.atlaskitTokensStrings.typography = "typography".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.typography]
  }
  
  type ThemeOverrideIds = `dark-iteration`
  
  type ThemeOverrides = `atlassian-dark-iteration`
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-shape`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-typography`
  */
  trait Themes extends StObject
  object Themes {
    
    inline def `atlassian-dark`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark` = "atlassian-dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark`]
    
    inline def `atlassian-legacy-dark`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark` = "atlassian-legacy-dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark`]
    
    inline def `atlassian-legacy-light`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light` = "atlassian-legacy-light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light`]
    
    inline def `atlassian-light`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light` = "atlassian-light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light`]
    
    inline def `atlassian-shape`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-shape` = "atlassian-shape".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-shape`]
    
    inline def `atlassian-spacing`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing` = "atlassian-spacing".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing`]
    
    inline def `atlassian-typography`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-typography` = "atlassian-typography".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-typography`]
  }
}
