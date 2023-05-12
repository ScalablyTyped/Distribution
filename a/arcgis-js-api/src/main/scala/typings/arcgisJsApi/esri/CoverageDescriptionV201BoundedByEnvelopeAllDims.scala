package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201BoundedByEnvelopeAllDims extends StObject {
  
  /**
    * Spatial extent min x and y.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var maxs: js.Array[Double]
  
  /**
    * Spatial extent min x and y.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
    */
  var mins: js.Array[Double]
}
object CoverageDescriptionV201BoundedByEnvelopeAllDims {
  
  inline def apply(maxs: js.Array[Double], mins: js.Array[Double]): CoverageDescriptionV201BoundedByEnvelopeAllDims = {
    val __obj = js.Dynamic.literal(maxs = maxs.asInstanceOf[js.Any], mins = mins.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201BoundedByEnvelopeAllDims]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201BoundedByEnvelopeAllDims] (val x: Self) extends AnyVal {
    
    inline def setMaxs(value: js.Array[Double]): Self = StObject.set(x, "maxs", value.asInstanceOf[js.Any])
    
    inline def setMaxsVarargs(value: Double*): Self = StObject.set(x, "maxs", js.Array(value*))
    
    inline def setMins(value: js.Array[Double]): Self = StObject.set(x, "mins", value.asInstanceOf[js.Any])
    
    inline def setMinsVarargs(value: Double*): Self = StObject.set(x, "mins", js.Array(value*))
  }
}
