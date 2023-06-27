package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RouteInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RouteInfo")
@js.native
/**
		 * A RouteInfo contains information about a solved route including the routes geometry and overall distance and time.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html)
		 */
open class RouteInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.RouteInfo {
  def this(properties: RouteInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RouteInfo {
  
  @JSGlobal("__esri.RouteInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [RouteInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteInfo.html#fromGraphic)
  		 */
  inline def fromGraphic(): typings.arcgisJsApi.esri.RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[typings.arcgisJsApi.esri.RouteInfo]
  inline def fromGraphic(graphic: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteInfo]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RouteInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RouteInfo]
}
