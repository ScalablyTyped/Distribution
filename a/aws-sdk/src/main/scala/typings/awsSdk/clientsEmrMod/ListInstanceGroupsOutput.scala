package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceGroupsOutput extends StObject {
  
  /**
    * The list of instance groups for the cluster and given filters.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListInstanceGroupsOutput {
  
  inline def apply(): ListInstanceGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceGroupsOutput]
  }
  
  extension [Self <: ListInstanceGroupsOutput](x: Self) {
    
    inline def setInstanceGroups(value: InstanceGroupList): Self = StObject.set(x, "InstanceGroups", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupsUndefined: Self = StObject.set(x, "InstanceGroups", js.undefined)
    
    inline def setInstanceGroupsVarargs(value: InstanceGroup*): Self = StObject.set(x, "InstanceGroups", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
