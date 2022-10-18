package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesOutput extends StObject {
  
  /**
    * The list of instances for the cluster and given filters.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListInstancesOutput {
  
  inline def apply(): ListInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesOutput]
  }
  
  extension [Self <: ListInstancesOutput](x: Self) {
    
    inline def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
