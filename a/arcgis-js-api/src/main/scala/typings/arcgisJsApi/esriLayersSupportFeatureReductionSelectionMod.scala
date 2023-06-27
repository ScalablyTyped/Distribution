package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureReductionSelection
import typings.arcgisJsApi.esri.FeatureReductionSelectionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportFeatureReductionSelectionMod {
  
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  /**
  		 * Declutters points in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by thinning overlapping features so no features intersect on screen.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html)
  		 */
  open class ^ ()
    extends StObject
       with FeatureReductionSelection {
    def this(properties: FeatureReductionSelectionProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/FeatureReductionSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureReductionSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureReductionSelection]
}
