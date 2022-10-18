package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyGroupSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
  
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.undefined
}
object HierarchyGroupSummary {
  
  inline def apply(): HierarchyGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyGroupSummary]
  }
  
  extension [Self <: HierarchyGroupSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: HierarchyGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
