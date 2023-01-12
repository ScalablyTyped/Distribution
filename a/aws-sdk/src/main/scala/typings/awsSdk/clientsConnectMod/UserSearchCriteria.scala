package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSearchCriteria extends StObject {
  
  /**
    * A list of conditions which would be applied together with an AND condition. 
    */
  var AndConditions: js.UndefOr[UserSearchConditionList] = js.undefined
  
  /**
    * A leaf node condition which can be used to specify a hierarchy group condition.
    */
  var HierarchyGroupCondition: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupCondition] = js.undefined
  
  /**
    * A list of conditions which would be applied together with an OR condition.
    */
  var OrConditions: js.UndefOr[UserSearchConditionList] = js.undefined
  
  /**
    * A leaf node condition which can be used to specify a string condition.
    */
  var StringCondition: js.UndefOr[typings.awsSdk.clientsConnectMod.StringCondition] = js.undefined
}
object UserSearchCriteria {
  
  inline def apply(): UserSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSearchCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSearchCriteria] (val x: Self) extends AnyVal {
    
    inline def setAndConditions(value: UserSearchConditionList): Self = StObject.set(x, "AndConditions", value.asInstanceOf[js.Any])
    
    inline def setAndConditionsUndefined: Self = StObject.set(x, "AndConditions", js.undefined)
    
    inline def setAndConditionsVarargs(value: UserSearchCriteria*): Self = StObject.set(x, "AndConditions", js.Array(value*))
    
    inline def setHierarchyGroupCondition(value: HierarchyGroupCondition): Self = StObject.set(x, "HierarchyGroupCondition", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupConditionUndefined: Self = StObject.set(x, "HierarchyGroupCondition", js.undefined)
    
    inline def setOrConditions(value: UserSearchConditionList): Self = StObject.set(x, "OrConditions", value.asInstanceOf[js.Any])
    
    inline def setOrConditionsUndefined: Self = StObject.set(x, "OrConditions", js.undefined)
    
    inline def setOrConditionsVarargs(value: UserSearchCriteria*): Self = StObject.set(x, "OrConditions", js.Array(value*))
    
    inline def setStringCondition(value: StringCondition): Self = StObject.set(x, "StringCondition", value.asInstanceOf[js.Any])
    
    inline def setStringConditionUndefined: Self = StObject.set(x, "StringCondition", js.undefined)
  }
}
