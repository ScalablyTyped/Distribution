package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.PortalLayer
import typings.arcgisJsApi.esri.PortalLayerConstructor
import typings.arcgisJsApi.esri.PortalLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsPortalLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/PortalLayer", JSImport.Namespace)
  @js.native
  open class Class ()
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
  
  type _To = js.Object & PortalLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsPortalLayerMod.foo` */
  override def _to: js.Object & PortalLayerConstructor = ^
}
