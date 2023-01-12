package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.GroupGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseToken[TValue, Group /* <: Groups */]
  extends StObject
     with Token[TValue, Group] {
  
  @JSName("attributes")
  var attributes_BaseToken: GroupGroup[Group]
}
object BaseToken {
  
  inline def apply[TValue, Group /* <: Groups */](attributes: GroupGroup[Group], value: TValue): BaseToken[TValue, Group] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseToken[TValue, Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseToken[?, ?], TValue, Group /* <: Groups */] (val x: Self & (BaseToken[TValue, Group])) extends AnyVal {
    
    inline def setAttributes(value: GroupGroup[Group]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
