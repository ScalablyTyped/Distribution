package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  /**
    * A list of predicates to combine logically.
    */
  var and: js.UndefOr[PredicateList] = js.undefined
  
  /**
    * The field to query.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The value to use when performing the evaluation.
    */
  var operand: js.UndefOr[String] = js.undefined
  
  /**
    * The operator to use to perform the evaluation.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * A list of predicates to combine logically.
    */
  var or: js.UndefOr[PredicateList] = js.undefined
}
object Predicate {
  
  inline def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  
  extension [Self <: Predicate](x: Self) {
    
    inline def setAnd(value: PredicateList): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setAndVarargs(value: Predicate*): Self = StObject.set(x, "and", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOperand(value: String): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    inline def setOperandUndefined: Self = StObject.set(x, "operand", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setOr(value: PredicateList): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    inline def setOrVarargs(value: Predicate*): Self = StObject.set(x, "or", js.Array(value*))
  }
}
