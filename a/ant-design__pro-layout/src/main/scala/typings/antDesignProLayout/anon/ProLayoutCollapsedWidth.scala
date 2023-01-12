package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProLayoutCollapsedWidth extends StObject {
  
  var proLayoutCollapsedWidth: Double
}
object ProLayoutCollapsedWidth {
  
  inline def apply(proLayoutCollapsedWidth: Double): ProLayoutCollapsedWidth = {
    val __obj = js.Dynamic.literal(proLayoutCollapsedWidth = proLayoutCollapsedWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProLayoutCollapsedWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProLayoutCollapsedWidth] (val x: Self) extends AnyVal {
    
    inline def setProLayoutCollapsedWidth(value: Double): Self = StObject.set(x, "proLayoutCollapsedWidth", value.asInstanceOf[js.Any])
  }
}
