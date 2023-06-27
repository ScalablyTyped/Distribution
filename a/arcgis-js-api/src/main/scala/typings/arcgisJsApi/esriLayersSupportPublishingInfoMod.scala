package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PublishingInfo
import typings.arcgisJsApi.esri.PublishingInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportPublishingInfoMod {
  
  @JSImport("esri/layers/support/PublishingInfo", JSImport.Namespace)
  @js.native
  /**
  		 * This stops when the status has been determined or when the layer is destroyed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PublishingInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with PublishingInfo {
    def this(properties: PublishingInfoProperties) = this()
  }
}
