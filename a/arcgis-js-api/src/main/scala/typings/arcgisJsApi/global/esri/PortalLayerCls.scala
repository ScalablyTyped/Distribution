package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PortalLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PortalLayer")
@js.native
class PortalLayerCls ()
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
