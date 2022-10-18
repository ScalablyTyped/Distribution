package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyGroupCondition extends StObject {
  
  /**
    * The type of hierarchy group match.
    */
  var HierarchyGroupMatchType: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupMatchType] = js.undefined
  
  /**
    * The value in the hierarchy group condition.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object HierarchyGroupCondition {
  
  inline def apply(): HierarchyGroupCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroupCondition]
  }
  
  extension [Self <: HierarchyGroupCondition](x: Self) {
    
    inline def setHierarchyGroupMatchType(value: HierarchyGroupMatchType): Self = StObject.set(x, "HierarchyGroupMatchType", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupMatchTypeUndefined: Self = StObject.set(x, "HierarchyGroupMatchType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
