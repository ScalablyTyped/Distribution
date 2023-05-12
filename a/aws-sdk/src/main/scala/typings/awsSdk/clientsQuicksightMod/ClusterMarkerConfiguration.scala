package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMarkerConfiguration extends StObject {
  
  /**
    * The cluster marker that is a part of the cluster marker configuration
    */
  var ClusterMarker: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ClusterMarker] = js.undefined
}
object ClusterMarkerConfiguration {
  
  inline def apply(): ClusterMarkerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMarkerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterMarkerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClusterMarker(value: ClusterMarker): Self = StObject.set(x, "ClusterMarker", value.asInstanceOf[js.Any])
    
    inline def setClusterMarkerUndefined: Self = StObject.set(x, "ClusterMarker", js.undefined)
  }
}
