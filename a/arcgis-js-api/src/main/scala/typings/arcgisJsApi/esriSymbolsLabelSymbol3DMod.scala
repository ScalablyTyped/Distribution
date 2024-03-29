package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LabelSymbol3D
import typings.arcgisJsApi.esri.LabelSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsLabelSymbol3DMod {
  
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  /**
  		 * LabelSymbol3D is used to render labels for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html)
  		 */
  open class ^ ()
    extends StObject
       with LabelSymbol3D {
    def this(properties: LabelSymbol3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LabelSymbol3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LabelSymbol3D]
}
