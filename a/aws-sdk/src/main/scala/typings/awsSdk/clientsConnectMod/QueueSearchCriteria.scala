package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueSearchCriteria extends StObject {
  
  /**
    * A list of conditions which would be applied together with an AND condition.
    */
  var AndConditions: js.UndefOr[QueueSearchConditionList] = js.undefined
  
  /**
    * A list of conditions which would be applied together with an OR condition.
    */
  var OrConditions: js.UndefOr[QueueSearchConditionList] = js.undefined
  
  /**
    * The type of queue.
    */
  var QueueTypeCondition: js.UndefOr[SearchableQueueType] = js.undefined
  
  var StringCondition: js.UndefOr[typings.awsSdk.clientsConnectMod.StringCondition] = js.undefined
}
object QueueSearchCriteria {
  
  inline def apply(): QueueSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSearchCriteria]
  }
  
  extension [Self <: QueueSearchCriteria](x: Self) {
    
    inline def setAndConditions(value: QueueSearchConditionList): Self = StObject.set(x, "AndConditions", value.asInstanceOf[js.Any])
    
    inline def setAndConditionsUndefined: Self = StObject.set(x, "AndConditions", js.undefined)
    
    inline def setAndConditionsVarargs(value: QueueSearchCriteria*): Self = StObject.set(x, "AndConditions", js.Array(value*))
    
    inline def setOrConditions(value: QueueSearchConditionList): Self = StObject.set(x, "OrConditions", value.asInstanceOf[js.Any])
    
    inline def setOrConditionsUndefined: Self = StObject.set(x, "OrConditions", js.undefined)
    
    inline def setOrConditionsVarargs(value: QueueSearchCriteria*): Self = StObject.set(x, "OrConditions", js.Array(value*))
    
    inline def setQueueTypeCondition(value: SearchableQueueType): Self = StObject.set(x, "QueueTypeCondition", value.asInstanceOf[js.Any])
    
    inline def setQueueTypeConditionUndefined: Self = StObject.set(x, "QueueTypeCondition", js.undefined)
    
    inline def setStringCondition(value: StringCondition): Self = StObject.set(x, "StringCondition", value.asInstanceOf[js.Any])
    
    inline def setStringConditionUndefined: Self = StObject.set(x, "StringCondition", js.undefined)
  }
}
