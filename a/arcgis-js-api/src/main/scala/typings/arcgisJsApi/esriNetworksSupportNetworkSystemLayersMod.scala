package typings.arcgisJsApi

import typings.arcgisJsApi.esri.NetworkSystemLayers
import typings.arcgisJsApi.esri.NetworkSystemLayersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriNetworksSupportNetworkSystemLayersMod {
  
  @JSImport("esri/networks/support/NetworkSystemLayers", JSImport.Namespace)
  @js.native
  /**
    * The NetworkSystemLayers contains the url and IDs of the utility network rules, subnetworks, and dirty areas tables or layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html)
    */
  open class ^ ()
    extends StObject
       with NetworkSystemLayers {
    def this(properties: NetworkSystemLayersProperties) = this()
  }
}
