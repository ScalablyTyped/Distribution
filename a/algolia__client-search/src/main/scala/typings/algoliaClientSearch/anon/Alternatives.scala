package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternatives extends StObject {
  
  /**
    * The explain query match alternatives.
    */
  var alternatives: js.Array[Length]
}
object Alternatives {
  
  inline def apply(alternatives: js.Array[Length]): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
  
  extension [Self <: Alternatives](x: Self) {
    
    inline def setAlternatives(value: js.Array[Length]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: Length*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
  }
}
