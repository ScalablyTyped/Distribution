package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DimensionLayer
import typings.arcgisJsApi.esri.DimensionLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersDimensionLayerMod {
  
  @JSImport("esri/layers/DimensionLayer", JSImport.Namespace)
  @js.native
  /**
  		 * The dimension layer displays measurement annotations of lengths and distances in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with DimensionLayer {
    def this(properties: DimensionLayerProperties) = this()
  }
}
