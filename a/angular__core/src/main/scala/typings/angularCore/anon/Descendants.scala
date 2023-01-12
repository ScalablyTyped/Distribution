package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descendants extends StObject {
  
  var descendants: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[Any] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object Descendants {
  
  inline def apply(): Descendants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descendants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Descendants] (val x: Self) extends AnyVal {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
