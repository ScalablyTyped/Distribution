package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindowDisassociationRequest extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts to disassociate from the event window.
    */
  var DedicatedHostIds: js.UndefOr[DedicatedHostIdList] = js.undefined
  
  /**
    * The IDs of the instances to disassociate from the event window.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  
  /**
    * The instance tags to disassociate from the event window. Any instances associated with the tags will be disassociated from the event window.
    */
  var InstanceTags: js.UndefOr[TagList] = js.undefined
}
object InstanceEventWindowDisassociationRequest {
  
  inline def apply(): InstanceEventWindowDisassociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindowDisassociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceEventWindowDisassociationRequest] (val x: Self) extends AnyVal {
    
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
