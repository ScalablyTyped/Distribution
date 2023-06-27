package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureFilter
import typings.arcgisJsApi.esri.FeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportFeatureFilterMod {
  
  @JSImport("esri/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  /**
  		 * This class defines parameters for setting a client-side filter on a [featureEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureEffect) or [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html)
  		 */
  open class ^ ()
    extends StObject
       with FeatureFilter {
    def this(properties: FeatureFilterProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureFilter]
}
