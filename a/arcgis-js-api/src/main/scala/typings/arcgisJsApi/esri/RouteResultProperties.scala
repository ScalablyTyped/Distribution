package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteResultProperties extends js.Object {
  
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
  implicit class RouteResultPropertiesOps[Self <: RouteResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirections(value: DirectionsFeatureSetProperties): Self = this.set("directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    
    @scala.inline
    def setRoute(value: GraphicProperties): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteName: Self = this.set("routeName", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: GraphicProperties*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[GraphicProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
  }
}
