package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LayerFloorInfo
import typings.arcgisJsApi.esri.LayerFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportLayerFloorInfoMod {
  
  @JSImport("esri/layers/support/LayerFloorInfo", JSImport.Namespace)
  @js.native
  /**
  		 * LayerFloorInfo contains properties that allow a layer to be floor-aware.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LayerFloorInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with LayerFloorInfo {
    def this(properties: LayerFloorInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/LayerFloorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LayerFloorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LayerFloorInfo]
}
