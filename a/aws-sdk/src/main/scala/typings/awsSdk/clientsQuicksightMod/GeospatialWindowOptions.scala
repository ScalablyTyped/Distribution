package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialWindowOptions extends StObject {
  
  /**
    * The bounds options (north, south, west, east) of the geospatial window options.
    */
  var Bounds: js.UndefOr[GeospatialCoordinateBounds] = js.undefined
  
  /**
    * The map zoom modes (manual, auto) of the geospatial window options.
    */
  var MapZoomMode: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MapZoomMode] = js.undefined
}
object GeospatialWindowOptions {
  
  inline def apply(): GeospatialWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: GeospatialCoordinateBounds): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "Bounds", js.undefined)
    
    inline def setMapZoomMode(value: MapZoomMode): Self = StObject.set(x, "MapZoomMode", value.asInstanceOf[js.Any])
    
    inline def setMapZoomModeUndefined: Self = StObject.set(x, "MapZoomMode", js.undefined)
  }
}
