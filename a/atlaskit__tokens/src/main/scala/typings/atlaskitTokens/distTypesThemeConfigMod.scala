package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Mode
import typings.atlaskitTokens.anon.Type
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
    
    @JSImport("@atlaskit/tokens/dist/types/theme-config", "default.atlassian-spacing")
    @js.native
    def atlassianSpacing: ThemeConfig = js.native
    
    inline def atlassianSpacing_=(x: ThemeConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-spacing")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette
    - typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette
    - typings.atlaskitTokens.atlaskitTokensStrings.spacingScale
  */
  trait Palettes extends StObject
  object Palettes {
    
    inline def defaultPalette: typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette = "defaultPalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.defaultPalette]
    
    inline def legacyPalette: typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette = "legacyPalette".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.legacyPalette]
    
    inline def spacingScale: typings.atlaskitTokens.atlaskitTokensStrings.spacingScale = "spacingScale".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.spacingScale]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.light
    - typings.atlaskitTokens.atlaskitTokensStrings.dark
  */
  trait ThemeColorModes extends StObject
  object ThemeColorModes {
    
    inline def dark: typings.atlaskitTokens.atlaskitTokensStrings.dark = "dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.dark]
    
    inline def light: typings.atlaskitTokens.atlaskitTokensStrings.light = "light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.light]
  }
  
  /**
    * ThemeConfig: the source of truth for all theme meta-data.
    * This object should be used whenever interfacing with themes.
    */
  trait ThemeConfig extends StObject {
    
    var attributes: Mode | Type
    
    var displayName: String
    
    var id: ThemeIds
    
    var palette: Palettes
  }
  object ThemeConfig {
    
    inline def apply(attributes: Mode | Type, displayName: String, id: ThemeIds, palette: Palettes): ThemeConfig = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeConfig]
    }
    
    extension [Self <: ThemeConfig](x: Self) {
      
      inline def setAttributes(value: Mode | Type): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: ThemeIds): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
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
  */
  trait ThemeIds extends StObject
  object ThemeIds {
    
    inline def dark: typings.atlaskitTokens.atlaskitTokensStrings.dark = "dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.dark]
    
    inline def `legacy-dark`: typings.atlaskitTokens.atlaskitTokensStrings.`legacy-dark` = "legacy-dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`legacy-dark`]
    
    inline def `legacy-light`: typings.atlaskitTokens.atlaskitTokensStrings.`legacy-light` = "legacy-light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`legacy-light`]
    
    inline def light: typings.atlaskitTokens.atlaskitTokensStrings.light = "light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.light]
    
    inline def spacing: typings.atlaskitTokens.atlaskitTokensStrings.spacing = "spacing".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.spacing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.color
    - typings.atlaskitTokens.atlaskitTokensStrings.spacing
  */
  trait ThemeKinds extends StObject
  object ThemeKinds {
    
    inline def color: typings.atlaskitTokens.atlaskitTokensStrings.color = "color".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.color]
    
    inline def spacing: typings.atlaskitTokens.atlaskitTokensStrings.spacing = "spacing".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.spacing]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark`
    - typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing`
  */
  trait Themes extends StObject
  object Themes {
    
    inline def `atlassian-dark`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark` = "atlassian-dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-dark`]
    
    inline def `atlassian-legacy-dark`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark` = "atlassian-legacy-dark".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-dark`]
    
    inline def `atlassian-legacy-light`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light` = "atlassian-legacy-light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-legacy-light`]
    
    inline def `atlassian-light`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light` = "atlassian-light".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-light`]
    
    inline def `atlassian-spacing`: typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing` = "atlassian-spacing".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.`atlassian-spacing`]
  }
}
