package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a criterion describing how an object must match some rules that specify (part of) a search. */
trait SearchCriterium extends StObject {
  
  /** a number of rule terms. */
  var Terms: SafeArray[RuleTerm]
}
object SearchCriterium {
  
  inline def apply(Terms: SafeArray[RuleTerm]): SearchCriterium = {
    val __obj = js.Dynamic.literal(Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriterium]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCriterium] (val x: Self) extends AnyVal {
    
    inline def setTerms(value: SafeArray[RuleTerm]): Self = StObject.set(x, "Terms", value.asInstanceOf[js.Any])
  }
}
