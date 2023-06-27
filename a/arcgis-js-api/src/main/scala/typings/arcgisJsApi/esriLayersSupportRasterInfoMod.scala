package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RasterInfo
import typings.arcgisJsApi.esri.RasterInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportRasterInfoMod {
  
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Describes general raster data information exposed by the ArcGIS REST API for [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html) and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with RasterInfo {
    def this(properties: RasterInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RasterInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RasterInfo]
}
