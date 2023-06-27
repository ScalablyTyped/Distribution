package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Sublayer
import typings.arcgisJsApi.esri.SublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportSublayerMod {
  
  @JSImport("esri/layers/support/Sublayer", JSImport.Namespace)
  @js.native
  /**
  		 * Represents a sublayer in a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or a [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html)
  		 */
  open class ^ ()
    extends StObject
       with Sublayer {
    def this(properties: SublayerProperties) = this()
  }
}
