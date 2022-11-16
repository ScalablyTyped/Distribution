package typings.arcgisJsApi

import typings.arcgisJsApi.esri.WMSSublayer
import typings.arcgisJsApi.esri.WMSSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportWmssublayerMod {
  
  @JSImport("esri/layers/support/WMSSublayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a sublayer in a [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)
    */
  open class ^ ()
    extends StObject
       with WMSSublayer {
    def this(properties: WMSSublayerProperties) = this()
  }
}
