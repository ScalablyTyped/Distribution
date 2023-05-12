package typings.atlaskitTokens.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token[TValue, Group /* <: Groups */] extends StObject {
  
  var attributes: typings.atlaskitTokens.anon.Replacement[Group]
  
  var value: TValue
}
object Token {
  
  inline def apply[TValue, Group /* <: Groups */](attributes: typings.atlaskitTokens.anon.Replacement[Group], value: TValue): Token[TValue, Group] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[TValue, Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token[?, ?], TValue, Group /* <: Groups */] (val x: Self & (Token[TValue, Group])) extends AnyVal {
    
    inline def setAttributes(value: typings.atlaskitTokens.anon.Replacement[Group]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
