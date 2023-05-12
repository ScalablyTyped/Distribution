package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaOfInterestGeometry extends StObject {
  
  /**
    * The structure representing the MultiPolygon Geometry.
    */
  var MultiPolygonGeometry: js.UndefOr[MultiPolygonGeometryInput] = js.undefined
  
  /**
    * The structure representing Polygon Geometry.
    */
  var PolygonGeometry: js.UndefOr[PolygonGeometryInput] = js.undefined
}
object AreaOfInterestGeometry {
  
  inline def apply(): AreaOfInterestGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaOfInterestGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaOfInterestGeometry] (val x: Self) extends AnyVal {
    
    inline def setMultiPolygonGeometry(value: MultiPolygonGeometryInput): Self = StObject.set(x, "MultiPolygonGeometry", value.asInstanceOf[js.Any])
    
    inline def setMultiPolygonGeometryUndefined: Self = StObject.set(x, "MultiPolygonGeometry", js.undefined)
    
    inline def setPolygonGeometry(value: PolygonGeometryInput): Self = StObject.set(x, "PolygonGeometry", value.asInstanceOf[js.Any])
    
    inline def setPolygonGeometryUndefined: Self = StObject.set(x, "PolygonGeometry", js.undefined)
  }
}
