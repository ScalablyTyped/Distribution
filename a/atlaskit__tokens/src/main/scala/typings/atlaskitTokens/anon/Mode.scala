package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.color
import typings.atlaskitTokens.distTypesThemeConfigMod.ThemeColorModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: ThemeColorModes
  
  var `type`: color
}
object Mode {
  
  inline def apply(mode: ThemeColorModes): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("color")
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: ThemeColorModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: color): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
