package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.PortalLayer
import typings.arcgisJsApi.esri.PortalLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersMixinsPortalLayerMod {
  
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PortalLayer {
    def this(properties: PortalLayerProperties) = this()
    
    /**
    		 * The portal item from which the layer is loaded.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    		 */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
  }
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PortalLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PortalLayer]
}
