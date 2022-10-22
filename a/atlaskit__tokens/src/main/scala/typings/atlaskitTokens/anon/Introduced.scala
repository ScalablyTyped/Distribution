package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ActiveTokenState
import typings.atlaskitTokens.distTypesTypesMod.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Introduced[Group /* <: Groups */] extends StObject {
  
  var description: String
  
  var group: Group
  
  var introduced: String
  
  var state: ActiveTokenState
}
object Introduced {
  
  inline def apply[Group /* <: Groups */](description: String, group: Group, introduced: String, state: ActiveTokenState): Introduced[Group] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Introduced[Group]]
  }
  
  extension [Self <: Introduced[?], Group /* <: Groups */](x: Self & Introduced[Group]) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setState(value: ActiveTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
