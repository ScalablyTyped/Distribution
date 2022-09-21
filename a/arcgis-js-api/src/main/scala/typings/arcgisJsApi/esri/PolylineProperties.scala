package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineProperties
  extends StObject
     with GeometryProperties {
  
  /**
    * An array of paths, or line segments, that make up the polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths)
    */
  var paths: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
}
object PolylineProperties {
  
  inline def apply(): PolylineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineProperties]
  }
  
  extension [Self <: PolylineProperties](x: Self) {
    
    inline def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
