package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageFilterCondition extends StObject {
  
  /**
    * Represents an equal condition that is applied to a single field while retrieving the coverage details.
    */
  var Equals: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Equals] = js.undefined
  
  /**
    * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
    */
  var NotEquals: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.NotEquals] = js.undefined
}
object CoverageFilterCondition {
  
  inline def apply(): CoverageFilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageFilterCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageFilterCondition] (val x: Self) extends AnyVal {
    
    inline def setEquals(value: Equals): Self = StObject.set(x, "Equals", value.asInstanceOf[js.Any])
    
    inline def setEqualsUndefined: Self = StObject.set(x, "Equals", js.undefined)
    
    inline def setEqualsVarargs(value: String*): Self = StObject.set(x, "Equals", js.Array(value*))
    
    inline def setNotEquals(value: NotEquals): Self = StObject.set(x, "NotEquals", value.asInstanceOf[js.Any])
    
    inline def setNotEqualsUndefined: Self = StObject.set(x, "NotEquals", js.undefined)
    
    inline def setNotEqualsVarargs(value: String*): Self = StObject.set(x, "NotEquals", js.Array(value*))
  }
}
