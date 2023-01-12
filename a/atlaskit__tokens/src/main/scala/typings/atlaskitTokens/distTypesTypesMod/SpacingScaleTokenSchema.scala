package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingScaleTokenSchema[ScaleValues /* <: String */] extends StObject {
  
  var spacing: Scale[ScaleValues]
}
object SpacingScaleTokenSchema {
  
  inline def apply[ScaleValues /* <: String */](spacing: Scale[ScaleValues]): SpacingScaleTokenSchema[ScaleValues] = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingScaleTokenSchema[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpacingScaleTokenSchema[?], ScaleValues /* <: String */] (val x: Self & SpacingScaleTokenSchema[ScaleValues]) extends AnyVal {
    
    inline def setSpacing(value: Scale[ScaleValues]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
