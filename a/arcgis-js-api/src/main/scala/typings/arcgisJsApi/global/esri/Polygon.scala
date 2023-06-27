package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolygonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Polygon")
@js.native
/**
		 * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
		 */
open class Polygon ()
  extends StObject
     with typings.arcgisJsApi.esri.Polygon {
  def this(properties: PolygonProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Polygon {
  
  @JSGlobal("__esri.Polygon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Converts the given Extent to a Polygon instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
  		 */
  inline def fromExtent(extent: typings.arcgisJsApi.esri.Extent): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
}
