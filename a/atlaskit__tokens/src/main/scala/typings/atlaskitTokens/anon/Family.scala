package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  var family: Monospace
}
object Family {
  
  inline def apply(family: Monospace): Family = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: Monospace): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
  }
}
