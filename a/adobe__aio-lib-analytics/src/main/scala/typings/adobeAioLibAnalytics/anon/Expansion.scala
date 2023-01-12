package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expansion extends StObject {
  
  var expansion: Any
  
  var locale: Any
}
object Expansion {
  
  inline def apply(expansion: Any, locale: Any): Expansion = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expansion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expansion] (val x: Self) extends AnyVal {
    
    inline def setExpansion(value: Any): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
