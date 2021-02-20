package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleProperties extends PolygonProperties {
  
  /**
    * The center point of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center)
    */
  var center: js.UndefOr[PointProperties] = js.native
  
  /**
    * Applicable when the spatial reference of the center point is either set to Web Mercator (wkid: 3857) or geographic/geodesic (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  /**
    * This value defines the number of points along the curve of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#numberOfPoints)
    */
  var numberOfPoints: js.UndefOr[Double] = js.native
  
  /**
    * The radius of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius)
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * Unit of the radius.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radiusUnit)
    */
  var radiusUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}
object CircleProperties {
  
  @scala.inline
  def apply(): CircleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleProperties]
  }
  
  @scala.inline
  implicit class CirclePropertiesMutableBuilder[Self <: CircleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: PointProperties): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    @scala.inline
    def setNumberOfPoints(value: Double): Self = StObject.set(x, "numberOfPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPointsUndefined: Self = StObject.set(x, "numberOfPoints", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRadiusUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "radiusUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUnitUndefined: Self = StObject.set(x, "radiusUnit", js.undefined)
  }
}
