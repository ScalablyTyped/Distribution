package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceFleetsInput extends StObject {
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.clientsEmrMod.Marker] = js.undefined
}
object ListInstanceFleetsInput {
  
  inline def apply(ClusterId: ClusterId): ListInstanceFleetsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceFleetsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceFleetsInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
