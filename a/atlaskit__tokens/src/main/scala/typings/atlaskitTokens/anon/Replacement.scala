package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacement extends StObject {
  
  var description: String
  
  var group: String
  
  var introduced: String
  
  var replacement: String
  
  var state: String
  
  var suggest: Unit
}
object Replacement {
  
  inline def apply(
    description: String,
    group: String,
    introduced: String,
    replacement: String,
    state: String,
    suggest: Unit
  ): Replacement = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  
  extension [Self <: Replacement](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuggest(value: Unit): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
  }
}
