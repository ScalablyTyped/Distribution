package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserHierarchyGroupRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the user hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName
  
  /**
    * The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
    */
  var ParentGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateUserHierarchyGroupRequest {
  
  inline def apply(InstanceId: InstanceId, Name: HierarchyGroupName): CreateUserHierarchyGroupRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserHierarchyGroupRequest]
  }
  
  extension [Self <: CreateUserHierarchyGroupRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParentGroupId(value: HierarchyGroupId): Self = StObject.set(x, "ParentGroupId", value.asInstanceOf[js.Any])
    
    inline def setParentGroupIdUndefined: Self = StObject.set(x, "ParentGroupId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
