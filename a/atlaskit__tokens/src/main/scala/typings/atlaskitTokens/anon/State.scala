package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var description: String
  
  var group: String
  
  var introduced: String
  
  var pixelValue: String
  
  var state: String
  
  var suggest: js.Array[String]
}
object State {
  
  inline def apply(
    description: String,
    group: String,
    introduced: String,
    pixelValue: String,
    state: String,
    suggest: js.Array[String]
  ): State = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], introduced = introduced.asInstanceOf[js.Any], pixelValue = pixelValue.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
    
    inline def setPixelValue(value: String): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuggest(value: js.Array[String]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestVarargs(value: String*): Self = StObject.set(x, "suggest", js.Array(value*))
  }
}
