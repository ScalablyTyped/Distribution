package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipointProperties
  extends StObject
     with GeometryProperties {
  
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}
object MultipointProperties {
  
  inline def apply(): MultipointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipointProperties]
  }
  
  extension [Self <: MultipointProperties](x: Self) {
    
    inline def setPoints(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
