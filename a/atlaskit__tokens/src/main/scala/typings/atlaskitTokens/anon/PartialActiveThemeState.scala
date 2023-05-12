package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.auto
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeColorModes_
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeIds_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@atlaskit/tokens.@atlaskit/tokens/dist/types/set-global-theme.ActiveThemeState> */
trait PartialActiveThemeState extends StObject {
  
  var colorMode: js.UndefOr[Exclude[ThemeColorModes_, auto]] = js.undefined
  
  var dark: js.UndefOr[ThemeIds_] = js.undefined
  
  var light: js.UndefOr[ThemeIds_] = js.undefined
  
  var spacing: js.UndefOr[ThemeIds_] = js.undefined
  
  var typography: js.UndefOr[ThemeIds_] = js.undefined
}
object PartialActiveThemeState {
  
  inline def apply(): PartialActiveThemeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialActiveThemeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialActiveThemeState] (val x: Self) extends AnyVal {
    
    inline def setColorMode(value: Exclude[ThemeColorModes_, auto]): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
    
    inline def setDark(value: ThemeIds_): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setLight(value: ThemeIds_): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setSpacing(value: ThemeIds_): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTypography(value: ThemeIds_): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}
