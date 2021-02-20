package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternatives extends StObject {
  
  /**
    * The explain query match alternatives.
    */
  var alternatives: js.Array[Length] = js.native
}
object Alternatives {
  
  @scala.inline
  def apply(alternatives: js.Array[Length]): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
  
  @scala.inline
  implicit class AlternativesMutableBuilder[Self <: Alternatives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[Length]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: Length*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
  }
}
