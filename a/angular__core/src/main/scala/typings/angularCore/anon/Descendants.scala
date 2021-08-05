package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descendants extends StObject {
  
  var descendants: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[js.Any] = js.undefined
}
object Descendants {
  
  inline def apply(): Descendants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descendants]
  }
  
  extension [Self <: Descendants](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    inline def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
