package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Criterion extends StObject {
  
  /**
    * A "contains" operator to match for the filter used to create the rule.
    */
  var contains: js.UndefOr[ValueList] = js.undefined
  
  /**
    * An "equals" operator to match for the filter used to create the rule.
    */
  @JSName("eq")
  var eq_FCriterion: js.UndefOr[ValueList] = js.undefined
  
  /**
    * An "exists" operator to match for the filter used to create the rule. 
    */
  var exists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A "not equals" operator to match for the filter used to create the rule.
    */
  var neq: js.UndefOr[ValueList] = js.undefined
}
object Criterion {
  
  inline def apply(): Criterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Criterion]
  }
  
  extension [Self <: Criterion](x: Self) {
    
    inline def setContains(value: ValueList): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContainsVarargs(value: String*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setEq_(value: ValueList): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setEq_Varargs(value: String*): Self = StObject.set(x, "eq", js.Array(value*))
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setNeq(value: ValueList): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    inline def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    inline def setNeqVarargs(value: String*): Self = StObject.set(x, "neq", js.Array(value*))
  }
}
