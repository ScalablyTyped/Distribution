package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileSearchCriteria extends StObject {
  
  /**
    * A list of conditions which would be applied together with an AND condition.
    */
  var AndConditions: js.UndefOr[RoutingProfileSearchConditionList] = js.undefined
  
  /**
    * A list of conditions which would be applied together with an OR condition.
    */
  var OrConditions: js.UndefOr[RoutingProfileSearchConditionList] = js.undefined
  
  var StringCondition: js.UndefOr[typings.awsSdk.clientsConnectMod.StringCondition] = js.undefined
}
object RoutingProfileSearchCriteria {
  
  inline def apply(): RoutingProfileSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfileSearchCriteria]
  }
  
  extension [Self <: RoutingProfileSearchCriteria](x: Self) {
    
    inline def setAndConditions(value: RoutingProfileSearchConditionList): Self = StObject.set(x, "AndConditions", value.asInstanceOf[js.Any])
    
    inline def setAndConditionsUndefined: Self = StObject.set(x, "AndConditions", js.undefined)
    
    inline def setAndConditionsVarargs(value: RoutingProfileSearchCriteria*): Self = StObject.set(x, "AndConditions", js.Array(value*))
    
    inline def setOrConditions(value: RoutingProfileSearchConditionList): Self = StObject.set(x, "OrConditions", value.asInstanceOf[js.Any])
    
    inline def setOrConditionsUndefined: Self = StObject.set(x, "OrConditions", js.undefined)
    
    inline def setOrConditionsVarargs(value: RoutingProfileSearchCriteria*): Self = StObject.set(x, "OrConditions", js.Array(value*))
    
    inline def setStringCondition(value: StringCondition): Self = StObject.set(x, "StringCondition", value.asInstanceOf[js.Any])
    
    inline def setStringConditionUndefined: Self = StObject.set(x, "StringCondition", js.undefined)
  }
}
