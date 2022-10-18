package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * A path in a policy, represented as a sequence of path elements.
    */
  var path: PathElementList
  
  /**
    * A span in a policy.
    */
  var span: Span
}
object Location {
  
  inline def apply(path: PathElementList, span: Span): Location = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setPath(value: PathElementList): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: PathElement*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
