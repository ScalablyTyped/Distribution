package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProLayoutCls extends StObject {
  
  var proLayoutCls: String
}
object ProLayoutCls {
  
  inline def apply(proLayoutCls: String): ProLayoutCls = {
    val __obj = js.Dynamic.literal(proLayoutCls = proLayoutCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProLayoutCls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProLayoutCls] (val x: Self) extends AnyVal {
    
    inline def setProLayoutCls(value: String): Self = StObject.set(x, "proLayoutCls", value.asInstanceOf[js.Any])
  }
}
