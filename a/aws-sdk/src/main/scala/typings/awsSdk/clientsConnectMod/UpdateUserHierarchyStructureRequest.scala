package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserHierarchyStructureRequest extends StObject {
  
  /**
    * The hierarchy levels to update.
    */
  var HierarchyStructure: HierarchyStructureUpdate
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object UpdateUserHierarchyStructureRequest {
  
  inline def apply(HierarchyStructure: HierarchyStructureUpdate, InstanceId: InstanceId): UpdateUserHierarchyStructureRequest = {
    val __obj = js.Dynamic.literal(HierarchyStructure = HierarchyStructure.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyStructureRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUserHierarchyStructureRequest] (val x: Self) extends AnyVal {
    
    inline def setHierarchyStructure(value: HierarchyStructureUpdate): Self = StObject.set(x, "HierarchyStructure", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
