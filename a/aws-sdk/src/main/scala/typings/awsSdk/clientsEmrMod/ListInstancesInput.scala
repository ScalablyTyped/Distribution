package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesInput extends StObject {
  
  /**
    * The identifier of the cluster for which to list the instances.
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceFleetId] = js.undefined
  
  /**
    * The node type of the instance fleet. For example MASTER, CORE, or TASK.
    */
  var InstanceFleetType: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceFleetType] = js.undefined
  
  /**
    * The identifier of the instance group for which to list the instances.
    */
  var InstanceGroupId: js.UndefOr[typings.awsSdk.clientsEmrMod.InstanceGroupId] = js.undefined
  
  /**
    * The type of instance group for which to list the instances.
    */
  var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined
  
  /**
    * A list of instance states that will filter the instances returned with this request.
    */
  var InstanceStates: js.UndefOr[InstanceStateList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListInstancesInput {
  
  inline def apply(ClusterId: ClusterId): ListInstancesInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstancesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstancesInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleetIdUndefined: Self = StObject.set(x, "InstanceFleetId", js.undefined)
    
    inline def setInstanceFleetType(value: InstanceFleetType): Self = StObject.set(x, "InstanceFleetType", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleetTypeUndefined: Self = StObject.set(x, "InstanceFleetType", js.undefined)
    
    inline def setInstanceGroupId(value: InstanceGroupId): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
    
    inline def setInstanceGroupTypes(value: InstanceGroupTypeList): Self = StObject.set(x, "InstanceGroupTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupTypesUndefined: Self = StObject.set(x, "InstanceGroupTypes", js.undefined)
    
    inline def setInstanceGroupTypesVarargs(value: InstanceGroupType*): Self = StObject.set(x, "InstanceGroupTypes", js.Array(value*))
    
    inline def setInstanceStates(value: InstanceStateList): Self = StObject.set(x, "InstanceStates", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatesUndefined: Self = StObject.set(x, "InstanceStates", js.undefined)
    
    inline def setInstanceStatesVarargs(value: InstanceState*): Self = StObject.set(x, "InstanceStates", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
