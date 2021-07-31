package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshVertex
  extends StObject
     with Object {
  
  /**
    * The distance parameter for this vertex; this only applies when tessellating polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var distance: Double
  
  /**
    * The `u`-coordinate for texture mapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var uTexcoord: Double
  
  /**
    * The `v`-coordinate for texture mapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var vTexcoord: Double
  
  /**
    * The `x`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var x: Double
  
  /**
    * The `x`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var xOffset: Double
  
  /**
    * The `y`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var y: Double
  
  /**
    * The `y`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var yOffset: Double
}
object MeshVertex {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    uTexcoord: Double,
    vTexcoord: Double,
    x: Double,
    xOffset: Double,
    y: Double,
    yOffset: Double
  ): MeshVertex = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), uTexcoord = uTexcoord.asInstanceOf[js.Any], vTexcoord = vTexcoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertex]
  }
  
  @scala.inline
  implicit class MeshVertexMutableBuilder[Self <: MeshVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUTexcoord(value: Double): Self = StObject.set(x, "uTexcoord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVTexcoord(value: Double): Self = StObject.set(x, "vTexcoord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
  }
}
