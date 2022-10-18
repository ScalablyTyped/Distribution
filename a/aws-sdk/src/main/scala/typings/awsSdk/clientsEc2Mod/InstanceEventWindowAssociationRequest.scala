package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindowAssociationRequest extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts to associate with the event window.
    */
  var DedicatedHostIds: js.UndefOr[DedicatedHostIdList] = js.undefined
  
  /**
    * The IDs of the instances to associate with the event window. If the instance is on a Dedicated Host, you can't specify the Instance ID parameter; you must use the Dedicated Host ID parameter.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  
  /**
    * The instance tags to associate with the event window. Any instances associated with the tags will be associated with the event window.
    */
  var InstanceTags: js.UndefOr[TagList] = js.undefined
}
object InstanceEventWindowAssociationRequest {
  
  inline def apply(): InstanceEventWindowAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindowAssociationRequest]
  }
  
  extension [Self <: InstanceEventWindowAssociationRequest](x: Self) {
    
    inline def setDedicatedHostIds(value: DedicatedHostIdList): Self = StObject.set(x, "DedicatedHostIds", value.asInstanceOf[js.Any])
    
    inline def setDedicatedHostIdsUndefined: Self = StObject.set(x, "DedicatedHostIds", js.undefined)
    
    inline def setDedicatedHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "DedicatedHostIds", js.Array(value*))
    
    inline def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setInstanceTags(value: TagList): Self = StObject.set(x, "InstanceTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagsUndefined: Self = StObject.set(x, "InstanceTags", js.undefined)
    
    inline def setInstanceTagsVarargs(value: Tag*): Self = StObject.set(x, "InstanceTags", js.Array(value*))
  }
}
