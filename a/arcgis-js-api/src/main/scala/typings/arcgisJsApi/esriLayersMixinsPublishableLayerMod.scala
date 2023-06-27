package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PublishableLayer
import typings.arcgisJsApi.esri.PublishingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsPublishableLayerMod {
  
  @JSImport("esri/layers/mixins/PublishableLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PublishableLayer {
    
    /**
    		 * Checks layer's publishing status while the layer is being published to the portal.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PublishableLayer.html#publishingInfo)
    		 */
    /* CompleteClass */
    override val publishingInfo: PublishingInfo = js.native
  }
}
