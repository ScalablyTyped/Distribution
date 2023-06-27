package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColormapInfo
import typings.arcgisJsApi.esri.ColormapInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportColormapInfoMod {
  
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  /**
  		 * The ColormapInfo describes pixel value, RGB colors and labels to color the raster.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with ColormapInfo {
    def this(properties: ColormapInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColormapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColormapInfo]
}
