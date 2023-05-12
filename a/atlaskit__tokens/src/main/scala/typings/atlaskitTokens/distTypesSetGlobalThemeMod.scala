package typings.atlaskitTokens

import typings.atlaskitTokens.anon.PartialThemeState
import typings.atlaskitTokens.atlaskitTokensStrings.auto
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeColorModes_
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds_
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetGlobalThemeMod {
  
  @JSImport("@atlaskit/tokens/dist/types/set-global-theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def default(): js.Promise[UnbindFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[UnbindFn]]
  inline def default(param0: PartialThemeState): js.Promise[UnbindFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UnbindFn]]
  
  inline def getSSRAutoScript(colorMode: ThemeColorModes_): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSRAutoScript")(colorMode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getThemeHtmlAttrs(): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeHtmlAttrs")().asInstanceOf[Record[String, String]]
  inline def getThemeHtmlAttrs(param0: PartialThemeState): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeHtmlAttrs")(param0.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def getThemeStyles(): js.Promise[js.Array[ThemeStyles]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeStyles")().asInstanceOf[js.Promise[js.Array[ThemeStyles]]]
  inline def getThemeStyles(param0: PartialThemeState): js.Promise[js.Array[ThemeStyles]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ThemeStyles]]]
  
  trait ActiveThemeState
    extends StObject
       with ThemeState {
    
    @JSName("colorMode")
    var colorMode_ActiveThemeState: Exclude[ThemeColorModes_, auto]
  }
  object ActiveThemeState {
    
    inline def apply(colorMode: Exclude[ThemeColorModes_, auto], dark: ThemeIds_, light: ThemeIds_): ActiveThemeState = {
      val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveThemeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveThemeState] (val x: Self) extends AnyVal {
      
      inline def setColorMode(value: Exclude[ThemeColorModes_, auto]): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeState extends StObject {
    
    var colorMode: ThemeColorModes_
    
    var dark: ThemeIds_
    
    var light: ThemeIds_
    
    var spacing: js.UndefOr[ThemeIds_] = js.undefined
    
    var typography: js.UndefOr[ThemeIds_] = js.undefined
  }
  object ThemeState {
    
    inline def apply(colorMode: ThemeColorModes_, dark: ThemeIds_, light: ThemeIds_): ThemeState = {
      val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeState] (val x: Self) extends AnyVal {
      
      inline def setColorMode(value: ThemeColorModes_): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
      
      inline def setDark(value: ThemeIds_): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setLight(value: ThemeIds_): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: ThemeIds_): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTypography(value: ThemeIds_): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
    }
  }
  
  trait ThemeStyles extends StObject {
    
    var attrs: Record[String, String]
    
    var css: String
    
    var id: ThemeIds_
  }
  object ThemeStyles {
    
    inline def apply(attrs: Record[String, String], css: String, id: ThemeIds_): ThemeStyles = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeStyles] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Record[String, String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setId(value: ThemeIds_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
