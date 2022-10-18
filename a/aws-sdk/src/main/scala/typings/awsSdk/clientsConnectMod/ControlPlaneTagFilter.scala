package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPlaneTagFilter extends StObject {
  
  /**
    * A list of conditions which would be applied together with an AND condition.
    */
  var AndConditions: js.UndefOr[TagAndConditionList] = js.undefined
  
  /**
    * A list of conditions which would be applied together with an OR condition. 
    */
  var OrConditions: js.UndefOr[TagOrConditionList] = js.undefined
  
  /**
    * A leaf node condition which can be used to specify a tag condition. 
    */
  var TagCondition: js.UndefOr[typings.awsSdk.clientsConnectMod.TagCondition] = js.undefined
}
object ControlPlaneTagFilter {
  
  inline def apply(): ControlPlaneTagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPlaneTagFilter]
  }
  
  extension [Self <: ControlPlaneTagFilter](x: Self) {
    
    inline def setAndConditions(value: TagAndConditionList): Self = StObject.set(x, "AndConditions", value.asInstanceOf[js.Any])
    
    inline def setAndConditionsUndefined: Self = StObject.set(x, "AndConditions", js.undefined)
    
    inline def setAndConditionsVarargs(value: TagCondition*): Self = StObject.set(x, "AndConditions", js.Array(value*))
    
    inline def setOrConditions(value: TagOrConditionList): Self = StObject.set(x, "OrConditions", value.asInstanceOf[js.Any])
    
    inline def setOrConditionsUndefined: Self = StObject.set(x, "OrConditions", js.undefined)
    
    inline def setOrConditionsVarargs(value: TagAndConditionList*): Self = StObject.set(x, "OrConditions", js.Array(value*))
    
    inline def setTagCondition(value: TagCondition): Self = StObject.set(x, "TagCondition", value.asInstanceOf[js.Any])
    
    inline def setTagConditionUndefined: Self = StObject.set(x, "TagCondition", js.undefined)
  }
}
