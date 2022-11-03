package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Interaction18
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionColorTokenSchema[BaseToken] extends StObject {
  
  var color: Interaction18[BaseToken]
}
object InteractionColorTokenSchema {
  
  inline def apply[BaseToken](color: Interaction18[BaseToken]): InteractionColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: InteractionColorTokenSchema[?], BaseToken](x: Self & InteractionColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: Interaction18[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
