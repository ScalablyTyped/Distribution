package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraints extends StObject {
  
  var constraints: Any
  
  var distances: Any
}
object Constraints {
  
  inline def apply(constraints: Any, distances: Any): Constraints = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], distances = distances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Constraints] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: Any): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setDistances(value: Any): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
  }
}
