package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PortalLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PortalLayer")
@js.native
open class PortalLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.PortalLayer {
  def this(properties: PortalLayerProperties) = this()
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  var portalItem: typings.arcgisJsApi.esri.PortalItem = js.native
}
/* static members */
object PortalLayer {
  
  @JSGlobal("__esri.PortalLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PortalLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PortalLayer]
}
