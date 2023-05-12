package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.`025`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingTokenSchema extends StObject {
  
  var space: `025`
}
object SpacingTokenSchema {
  
  inline def apply(space: `025`): SpacingTokenSchema = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingTokenSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpacingTokenSchema] (val x: Self) extends AnyVal {
    
    inline def setSpace(value: `025`): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
