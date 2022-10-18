package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Eq] = js.undefined
  
  /**
    * Represents an equal  condition to be applied to a single field when querying for findings.
    */
  var Equals: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Equals] = js.undefined
  
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.undefined
  
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.undefined
  
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.undefined
  
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.undefined
  
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.undefined
  
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.undefined
  
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.undefined
  
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.undefined
  
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Neq] = js.undefined
  
  /**
    * Represents a not equal  condition to be applied to a single field when querying for findings.
    */
  var NotEquals: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.NotEquals] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setEq(value: Eq): Self = StObject.set(x, "Eq", value.asInstanceOf[js.Any])
    
    inline def setEqUndefined: Self = StObject.set(x, "Eq", js.undefined)
    
    inline def setEqVarargs(value: String*): Self = StObject.set(x, "Eq", js.Array(value*))
    
    inline def setEquals(value: Equals): Self = StObject.set(x, "Equals", value.asInstanceOf[js.Any])
    
    inline def setEqualsUndefined: Self = StObject.set(x, "Equals", js.undefined)
    
    inline def setEqualsVarargs(value: String*): Self = StObject.set(x, "Equals", js.Array(value*))
    
    inline def setGreaterThan(value: Long): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEqual(value: Long): Self = StObject.set(x, "GreaterThanOrEqual", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEqualUndefined: Self = StObject.set(x, "GreaterThanOrEqual", js.undefined)
    
    inline def setGreaterThanUndefined: Self = StObject.set(x, "GreaterThan", js.undefined)
    
    inline def setGt(value: Integer): Self = StObject.set(x, "Gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "Gt", js.undefined)
    
    inline def setGte(value: Integer): Self = StObject.set(x, "Gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "Gte", js.undefined)
    
    inline def setLessThan(value: Long): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEqual(value: Long): Self = StObject.set(x, "LessThanOrEqual", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEqualUndefined: Self = StObject.set(x, "LessThanOrEqual", js.undefined)
    
    inline def setLessThanUndefined: Self = StObject.set(x, "LessThan", js.undefined)
    
    inline def setLt(value: Integer): Self = StObject.set(x, "Lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "Lt", js.undefined)
    
    inline def setLte(value: Integer): Self = StObject.set(x, "Lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "Lte", js.undefined)
    
    inline def setNeq(value: Neq): Self = StObject.set(x, "Neq", value.asInstanceOf[js.Any])
    
    inline def setNeqUndefined: Self = StObject.set(x, "Neq", js.undefined)
    
    inline def setNeqVarargs(value: String*): Self = StObject.set(x, "Neq", js.Array(value*))
    
    inline def setNotEquals(value: NotEquals): Self = StObject.set(x, "NotEquals", value.asInstanceOf[js.Any])
    
    inline def setNotEqualsUndefined: Self = StObject.set(x, "NotEquals", js.undefined)
    
    inline def setNotEqualsVarargs(value: String*): Self = StObject.set(x, "NotEquals", js.Array(value*))
  }
}
