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
  
  extension [Self <: Scale[?], ScaleValues /* <: String */](x: Self & Scale[ScaleValues]) {
    
    inline def setScale(value: Record[ScaleValues, ScaleToken]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
