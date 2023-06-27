package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AggregatedGeometryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AggregatedGeometry")
@js.native
/**
		 * A class that defines an aggregation of geometries.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html)
		 */
open class AggregatedGeometry ()
  extends StObject
     with typings.arcgisJsApi.esri.AggregatedGeometry {
  def this(properties: AggregatedGeometryProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AggregatedGeometry {
  
  @JSGlobal("__esri.AggregatedGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AggregatedGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AggregatedGeometry]
}
