package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AggregateField
import typings.arcgisJsApi.esri.AggregateFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportAggregateFieldMod {
  
  @JSImport("esri/layers/support/AggregateField", JSImport.Namespace)
  @js.native
  /**
  		 * Defines the aggregate fields used in a layer visualized with [FeatureReductionBinning](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html) or [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html)
  		 */
  open class ^ ()
    extends StObject
       with AggregateField {
    def this(properties: AggregateFieldProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/AggregateField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AggregateField = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AggregateField]
}
