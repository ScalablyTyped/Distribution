package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserHierarchyGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group. 
    */
  var HierarchyGroupArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
}
object CreateUserHierarchyGroupResponse {
  
  inline def apply(): CreateUserHierarchyGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserHierarchyGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserHierarchyGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setHierarchyGroupArn(value: ARN): Self = StObject.set(x, "HierarchyGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupArnUndefined: Self = StObject.set(x, "HierarchyGroupArn", js.undefined)
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
  }
}
