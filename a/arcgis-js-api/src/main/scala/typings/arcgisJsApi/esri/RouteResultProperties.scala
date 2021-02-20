package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResultProperties extends StObject {
  
  /**
    * Route directions are returned if `RouteParameters.returnDirections = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.native
  
  /**
    * The Route graphic that is returned if `RouteParameters.returnRoutes = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#route)
    */
  var route: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * The name of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.native
  
  /**
    * Array of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html#stops)
    */
  var stops: js.UndefOr[js.Array[GraphicProperties]] = js.native
}
object RouteResultProperties {
  
  @scala.inline
  def apply(): RouteResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResultProperties]
  }
  
  @scala.inline
  implicit class RouteResultPropertiesMutableBuilder[Self <: RouteResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(value: DirectionsFeatureSetProperties): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    @scala.inline
    def setRoute(value: GraphicProperties): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[GraphicProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: GraphicProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
