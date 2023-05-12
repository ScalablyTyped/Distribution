package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.color
import typings.atlaskitTokens.distTypesThemeConfigMod.DataColorModes
import typings.atlaskitTokens.distTypesThemeConfigMod.ExtensionThemeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'color',   mode :@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.DataColorModes} & {  extends :@atlaskit/tokens.@atlaskit/tokens/dist/types/theme-config.ExtensionThemeId | undefined} */
trait typecolormodeDataColorMod extends StObject {
  
  var `extends`: js.UndefOr[ExtensionThemeId] = js.undefined
  
  var mode: DataColorModes
  
  var `type`: color
}
object typecolormodeDataColorMod {
  
  inline def apply(mode: DataColorModes): typecolormodeDataColorMod = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[typecolormodeDataColorMod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typecolormodeDataColorMod] (val x: Self) extends AnyVal {
    
    inline def setExtends(value: ExtensionThemeId): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setMode(value: DataColorModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
