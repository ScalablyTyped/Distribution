package typings.atlaskitTokens.distTypesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightScaleTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var fontWeight: Record[ScaleValues, TypographySchemaValue]
}
object FontWeightScaleTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](fontWeight: Record[ScaleValues, TypographySchemaValue]): FontWeightScaleTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightScaleTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontWeightScaleTokenSchema[?], ScaleValues /* <: String */] (val x: Self & FontWeightScaleTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setFontWeight(value: Record[ScaleValues, TypographySchemaValue]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
