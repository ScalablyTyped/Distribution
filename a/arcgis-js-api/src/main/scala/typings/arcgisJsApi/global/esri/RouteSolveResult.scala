package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RouteSolveResult")
@js.native
/**
		 * The results from [route.solve()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve) method.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteSolveResult.html)
		 */
open class RouteSolveResult ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteSolveResult {
  def this(properties: RouteSolveResultProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RouteSolveResult {
  
  @JSGlobal("__esri.RouteSolveResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RouteSolveResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteSolveResult]
}
