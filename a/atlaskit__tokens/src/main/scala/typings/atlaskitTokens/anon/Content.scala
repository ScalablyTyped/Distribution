package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content[BaseToken] extends StObject {
  
  var component: `24`[BaseToken]
  
  var container: `48`[BaseToken]
  
  var content: `1216`[BaseToken]
}
object Content {
  
  inline def apply[BaseToken](component: `24`[BaseToken], container: `48`[BaseToken], content: `1216`[BaseToken]): Content[BaseToken] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[BaseToken]]
  }
  
  extension [Self <: Content[?], BaseToken](x: Self & Content[BaseToken]) {
    
    inline def setComponent(value: `24`[BaseToken]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: `48`[BaseToken]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContent(value: `1216`[BaseToken]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
