package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RefreshableLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsRefreshableLayerMod {
  
  @JSImport("esri/layers/mixins/RefreshableLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RefreshableLayer {
    
    /**
    		 * Fetches all the data for the layer.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    		 */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /**
    		 * Refresh interval of the layer in minutes.
    		 *
    		 * @default 0
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    		 */
    /* CompleteClass */
    var refreshInterval: Double = js.native
  }
}
