package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LOD
import typings.arcgisJsApi.esri.LODProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportLodMod {
  
  @JSImport("esri/layers/support/LOD", JSImport.Namespace)
  @js.native
  /**
  		 * A [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) has a number of LODs (Levels of Detail).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html)
  		 */
  open class ^ ()
    extends StObject
       with LOD {
    def this(properties: LODProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/LOD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LOD = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LOD]
}
