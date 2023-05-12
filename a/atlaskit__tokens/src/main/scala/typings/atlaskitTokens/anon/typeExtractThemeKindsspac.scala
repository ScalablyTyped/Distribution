package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.shape
import typings.atlaskitTokens.atlaskitTokensStrings.spacing
import typings.atlaskitTokens.atlaskitTokensStrings.typography
import typings.atlaskitTokens.distTypesThemeConfigMod.ExtensionThemeId
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeKinds
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :std.Extract<@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.ThemeKinds, 'spacing' | 'typography' | 'shape'>} & {  extends :@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.ExtensionThemeId | undefined} */
trait typeExtractThemeKindsspac extends StObject {
  
  var `extends`: js.UndefOr[ExtensionThemeId] = js.undefined
  
  var `type`: Extract[ThemeKinds, spacing | typography | shape]
}
object typeExtractThemeKindsspac {
  
  inline def apply(`type`: Extract[ThemeKinds, spacing | typography | shape]): typeExtractThemeKindsspac = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeExtractThemeKindsspac]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typeExtractThemeKindsspac] (val x: Self) extends AnyVal {
    
    inline def setExtends(value: ExtensionThemeId): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setType(value: Extract[ThemeKinds, spacing | typography | shape]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
