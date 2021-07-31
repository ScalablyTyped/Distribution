package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitTestResultResults
  extends StObject
     with Object {
  
  /**
    * A graphic representing a feature in the view that intersects the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var graphic: Graphic
  
  /**
    * The point geometry in the spatial reference of the view corresponding with the input screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var mapPoint: Point
}
object HitTestResultResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    graphic: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HitTestResultResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HitTestResultResults]
  }
  
  @scala.inline
  implicit class HitTestResultResultsMutableBuilder[Self <: HitTestResultResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphic(value: Graphic): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
  }
}
