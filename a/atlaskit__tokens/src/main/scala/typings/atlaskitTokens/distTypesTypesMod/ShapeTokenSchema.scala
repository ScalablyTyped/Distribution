package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeTokenSchema extends StObject {
  
  var border: Radius
}
object ShapeTokenSchema {
  
  inline def apply(border: Radius): ShapeTokenSchema = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeTokenSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeTokenSchema] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Radius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
