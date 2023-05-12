package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgPlural extends StObject {
  
  var ngPlural: `22`
}
object NgPlural {
  
  inline def apply(ngPlural: `22`): NgPlural = {
    val __obj = js.Dynamic.literal(ngPlural = ngPlural.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgPlural]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgPlural] (val x: Self) extends AnyVal {
    
    inline def setNgPlural(value: `22`): Self = StObject.set(x, "ngPlural", value.asInstanceOf[js.Any])
  }
}
