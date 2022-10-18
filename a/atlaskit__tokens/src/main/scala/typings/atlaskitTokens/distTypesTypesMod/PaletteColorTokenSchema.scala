package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.OpacityOpacity20
import typings.atlaskitTokens.anon.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteColorTokenSchema[PaletteValues /* <: String */] extends StObject {
  
  var color: Palette[PaletteValues]
  
  var value: OpacityOpacity20
}
object PaletteColorTokenSchema {
  
  inline def apply[PaletteValues /* <: String */](color: Palette[PaletteValues], value: OpacityOpacity20): PaletteColorTokenSchema[PaletteValues] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteColorTokenSchema[PaletteValues]]
  }
  
  extension [Self <: PaletteColorTokenSchema[?], PaletteValues /* <: String */](x: Self & PaletteColorTokenSchema[PaletteValues]) {
    
    inline def setColor(value: Palette[PaletteValues]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setValue(value: OpacityOpacity20): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
