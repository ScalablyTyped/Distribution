package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RouteResult")
@js.native
/**
  * The route result from [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) as part of a [RouteSolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteResult.html)
  */
open class RouteResult ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteResult {
  def this(properties: RouteResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RouteResult {
  
  @JSGlobal("__esri.RouteResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RouteResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteResult]
}
