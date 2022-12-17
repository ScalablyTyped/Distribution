package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token[TValue, Group /* <: Groups */] extends StObject {
  
  var attributes: State[Group]
  
  var value: TValue
}
object Token {
  
  inline def apply[TValue, Group /* <: Groups */](attributes: State[Group], value: TValue): Token[TValue, Group] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[TValue, Group]]
  }
  
  extension [Self <: Token[?, ?], TValue, Group /* <: Groups */](x: Self & (Token[TValue, Group])) {
    
    inline def setAttributes(value: State[Group]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
