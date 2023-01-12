package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubsetDimension extends StObject {
  
  /**
    * The computed extent or ranges for the given dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#SubsetDimension)
    */
  var extent: js.Array[Double]
  
  /**
    * The dimension name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#SubsetDimension)
    */
  var name: String
}
object SubsetDimension {
  
  inline def apply(extent: js.Array[Double], name: String): SubsetDimension = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsetDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubsetDimension] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: js.Array[Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
