package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMarker extends StObject {
  
  /**
    * The simple cluster marker of the cluster marker.
    */
  var SimpleClusterMarker: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SimpleClusterMarker] = js.undefined
}
object ClusterMarker {
  
  inline def apply(): ClusterMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterMarker] (val x: Self) extends AnyVal {
    
    inline def setSimpleClusterMarker(value: SimpleClusterMarker): Self = StObject.set(x, "SimpleClusterMarker", value.asInstanceOf[js.Any])
    
    inline def setSimpleClusterMarkerUndefined: Self = StObject.set(x, "SimpleClusterMarker", js.undefined)
  }
}
