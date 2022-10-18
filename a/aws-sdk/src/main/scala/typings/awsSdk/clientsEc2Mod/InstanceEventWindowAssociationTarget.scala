package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindowAssociationTarget extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts associated with the event window.
    */
  var DedicatedHostIds: js.UndefOr[DedicatedHostIdList] = js.undefined
  
  /**
    * The IDs of the instances associated with the event window.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
  
  /**
    * The instance tags associated with the event window. Any instances associated with the tags will be associated with the event window.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object InstanceEventWindowAssociationTarget {
  
  inline def apply(): InstanceEventWindowAssociationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindowAssociationTarget]
  }
  
  extension [Self <: InstanceEventWindowAssociationTarget](x: Self) {
    
    inline def setDedicatedHostIds(value: DedicatedHostIdList): Self = StObject.set(x, "DedicatedHostIds", value.asInstanceOf[js.Any])
    
    inline def setDedicatedHostIdsUndefined: Self = StObject.set(x, "DedicatedHostIds", js.undefined)
    
    inline def setDedicatedHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "DedicatedHostIds", js.Array(value*))
    
    inline def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
