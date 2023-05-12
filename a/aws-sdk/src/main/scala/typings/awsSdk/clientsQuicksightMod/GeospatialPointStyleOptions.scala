package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialPointStyleOptions extends StObject {
  
  /**
    * The cluster marker configuration of the geospatial point style.
    */
  var ClusterMarkerConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ClusterMarkerConfiguration] = js.undefined
  
  /**
    * The selected point styles (point, cluster) of the geospatial map.
    */
  var SelectedPointStyle: js.UndefOr[GeospatialSelectedPointStyle] = js.undefined
}
object GeospatialPointStyleOptions {
  
  inline def apply(): GeospatialPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialPointStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialPointStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setClusterMarkerConfiguration(value: ClusterMarkerConfiguration): Self = StObject.set(x, "ClusterMarkerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setClusterMarkerConfigurationUndefined: Self = StObject.set(x, "ClusterMarkerConfiguration", js.undefined)
    
    inline def setSelectedPointStyle(value: GeospatialSelectedPointStyle): Self = StObject.set(x, "SelectedPointStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedPointStyleUndefined: Self = StObject.set(x, "SelectedPointStyle", js.undefined)
  }
}
