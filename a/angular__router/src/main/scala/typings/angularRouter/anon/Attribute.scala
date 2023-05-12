package typings.angularRouter.anon

import typings.angularRouter.angularRouterStrings.tabindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var attribute: tabindex
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal(attribute = "tabindex")
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: tabindex): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
  }
}
