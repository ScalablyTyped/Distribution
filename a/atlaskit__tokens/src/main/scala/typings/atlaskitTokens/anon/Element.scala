package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element[BaseToken] extends StObject {
  
  var container: `1216`[BaseToken]
  
  var element: `24`[BaseToken]
  
  var layout: `64`[BaseToken]
}
object Element {
  
  inline def apply[BaseToken](container: `1216`[BaseToken], element: `24`[BaseToken], layout: `64`[BaseToken]): Element[BaseToken] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element[?], BaseToken] (val x: Self & Element[BaseToken]) extends AnyVal {
    
    inline def setContainer(value: `1216`[BaseToken]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setElement(value: `24`[BaseToken]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: `64`[BaseToken]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
