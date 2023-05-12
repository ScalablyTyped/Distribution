package typings.atlaskitTokens.distTypesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeScaleTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var fontSize: Record[ScaleValues, TypographySchemaValue]
}
object FontSizeScaleTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](fontSize: Record[ScaleValues, TypographySchemaValue]): FontSizeScaleTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeScaleTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizeScaleTokenSchema[?], ScaleValues /* <: String */] (val x: Self & FontSizeScaleTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setFontSize(value: Record[ScaleValues, TypographySchemaValue]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
