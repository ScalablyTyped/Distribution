package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureReductionClusterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureReductionCluster")
@js.native
/**
		 * This class configures clustering as a means of reducing and summarizing point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html), or [OGCFeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html)
		 */
open class FeatureReductionCluster ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureReductionCluster {
  def this(properties: FeatureReductionClusterProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FeatureReductionCluster {
  
  @JSGlobal("__esri.FeatureReductionCluster")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FeatureReductionCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FeatureReductionCluster]
}
