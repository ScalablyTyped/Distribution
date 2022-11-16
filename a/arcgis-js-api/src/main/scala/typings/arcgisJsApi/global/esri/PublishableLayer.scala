package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PublishableLayer")
@js.native
open class PublishableLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.PublishableLayer {
  
  /**
    * Checks layer's publishing status while the layer is being published to the portal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PublishableLayer.html#publishingInfo)
    */
  /* CompleteClass */
  override val publishingInfo: typings.arcgisJsApi.esri.PublishingInfo = js.native
}
