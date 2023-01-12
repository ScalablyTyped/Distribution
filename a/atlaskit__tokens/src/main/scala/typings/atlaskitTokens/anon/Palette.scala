package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaletteToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Palette[PaletteValues /* <: String */] extends StObject {
  
  var palette: Record[PaletteValues, PaletteToken]
}
object Palette {
  
  inline def apply[PaletteValues /* <: String */](palette: Record[PaletteValues, PaletteToken]): Palette[PaletteValues] = {
    val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[Palette[PaletteValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Palette[?], PaletteValues /* <: String */] (val x: Self & Palette[PaletteValues]) extends AnyVal {
    
    inline def setPalette(value: Record[PaletteValues, PaletteToken]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
  }
}
