package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object literal containing at least one property defining an area on the map.
  */
trait CameraBoundaryDescription extends StObject {
  
  /**
    * A rectangular area on a two-dimensional map projection.
    */
  var mapRect: js.UndefOr[MapRect] = js.undefined
  
  /**
    * A rectangular area on a map, defined by coordinates of the rectangle's northeast and southwest corners.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}
object CameraBoundaryDescription {
  
  inline def apply(): CameraBoundaryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraBoundaryDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraBoundaryDescription] (val x: Self) extends AnyVal {
    
    inline def setMapRect(value: MapRect): Self = StObject.set(x, "mapRect", value.asInstanceOf[js.Any])
    
    inline def setMapRectUndefined: Self = StObject.set(x, "mapRect", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
