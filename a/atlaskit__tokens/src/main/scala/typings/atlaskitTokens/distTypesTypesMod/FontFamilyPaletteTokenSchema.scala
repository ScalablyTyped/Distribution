package typings.atlaskitTokens.distTypesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyPaletteTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var fontFamily: Record[ScaleValues, TypographySchemaValue]
}
object FontFamilyPaletteTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](fontFamily: Record[ScaleValues, TypographySchemaValue]): FontFamilyPaletteTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyPaletteTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamilyPaletteTokenSchema[?], ScaleValues /* <: String */] (val x: Self & FontFamilyPaletteTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setFontFamily(value: Record[ScaleValues, TypographySchemaValue]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
  }
}
