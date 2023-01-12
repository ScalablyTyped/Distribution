package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ScaleToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale[ScaleValues /* <: String */] extends StObject {
  
  var scale: Record[ScaleValues, ScaleToken]
}
object Scale {
  
  inline def apply[ScaleValues /* <: String */](scale: Record[ScaleValues, ScaleToken]): Scale[ScaleValues] = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale[ScaleValues]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale[?], ScaleValues /* <: String */] (val x: Self & Scale[ScaleValues]) extends AnyVal {
    
    inline def setScale(value: Record[ScaleValues, ScaleToken]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
