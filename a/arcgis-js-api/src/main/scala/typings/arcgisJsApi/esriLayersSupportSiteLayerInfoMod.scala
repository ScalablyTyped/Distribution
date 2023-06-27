package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SiteLayerInfo
import typings.arcgisJsApi.esri.SiteLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportSiteLayerInfoMod {
  
  @JSImport("esri/layers/support/SiteLayerInfo", JSImport.Namespace)
  @js.native
  /**
  		 * The SiteLayerInfo class describes the boundaries of managed sites and is used for visualizing groups of facilities.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with SiteLayerInfo {
    def this(properties: SiteLayerInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/SiteLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SiteLayerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SiteLayerInfo]
}
