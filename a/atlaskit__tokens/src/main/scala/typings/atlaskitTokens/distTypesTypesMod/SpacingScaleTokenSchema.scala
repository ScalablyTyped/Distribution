package typings.atlaskitTokens.distTypesTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingScaleTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var space: Record[ScaleValues, SpacingSchemaValue]
}
object SpacingScaleTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](space: Record[ScaleValues, SpacingSchemaValue]): SpacingScaleTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingScaleTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpacingScaleTokenSchema[?], ScaleValues /* <: String */] (val x: Self & SpacingScaleTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setSpace(value: Record[ScaleValues, SpacingSchemaValue]): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
