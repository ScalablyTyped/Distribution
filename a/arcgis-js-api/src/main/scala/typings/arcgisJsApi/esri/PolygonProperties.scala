package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonProperties
  extends StObject
     with GeometryProperties {
  
  /**
    * The centroid of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
    */
  var centroid: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
    */
  var isSelfIntersecting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of rings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
    */
  var rings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
}
object PolygonProperties {
  
  @scala.inline
  def apply(): PolygonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonProperties]
  }
  
  @scala.inline
  implicit class PolygonPropertiesMutableBuilder[Self <: PolygonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCentroid(value: PointProperties): Self = StObject.set(x, "centroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentroidUndefined: Self = StObject.set(x, "centroid", js.undefined)
    
    @scala.inline
    def setIsSelfIntersecting(value: Boolean): Self = StObject.set(x, "isSelfIntersecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfIntersectingUndefined: Self = StObject.set(x, "isSelfIntersecting", js.undefined)
    
    @scala.inline
    def setRings(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRingsUndefined: Self = StObject.set(x, "rings", js.undefined)
    
    @scala.inline
    def setRingsVarargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "rings", js.Array(value :_*))
  }
}
