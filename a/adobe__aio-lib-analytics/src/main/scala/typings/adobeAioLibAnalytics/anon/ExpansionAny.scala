package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionAny extends StObject {
  
  var expansion: Any
}
object ExpansionAny {
  
  inline def apply(expansion: Any): ExpansionAny = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpansionAny] (val x: Self) extends AnyVal {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
  }
}
