package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RouteParameters")
@js.native
/**
		 * Input parameters for [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html)
		 */
open class RouteParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteParameters {
  def this(properties: RouteParametersProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RouteParameters {
  
  @JSGlobal("__esri.RouteParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RouteParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteParameters]
}
