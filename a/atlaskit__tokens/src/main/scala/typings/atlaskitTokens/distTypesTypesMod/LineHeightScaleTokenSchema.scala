package typings.atlaskitTokens.distTypesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightScaleTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var lineHeight: Record[ScaleValues, TypographySchemaValue]
}
object LineHeightScaleTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](lineHeight: Record[ScaleValues, TypographySchemaValue]): LineHeightScaleTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeightScaleTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeightScaleTokenSchema[?], ScaleValues /* <: String */] (val x: Self & LineHeightScaleTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setLineHeight(value: Record[ScaleValues, TypographySchemaValue]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
