package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TileMatrixSet
import typings.arcgisJsApi.esri.TileMatrixSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportTileMatrixSetMod {
  
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  /**
  		 * Contains information about the tiling scheme for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html)
  		 */
  open class ^ ()
    extends StObject
       with TileMatrixSet {
    def this(properties: TileMatrixSetProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TileMatrixSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TileMatrixSet]
}
