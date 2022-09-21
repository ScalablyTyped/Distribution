package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.WCSLayer
import typings.arcgisJsApi.esri.WCSLayerConstructor
import typings.arcgisJsApi.esri.WCSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wcslayerMod extends Shortcut {
  
  @JSImport("esri/layers/WCSLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WCSLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/WCSLayer", JSImport.Namespace)
  @js.native
  /**
    * WCS presents raster data from a [OGC Web Coverage Service](https://www.ogc.org/standards/wcs).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html)
    */
  open class Class ()
    extends StObject
       with WCSLayer {
    def this(properties: WCSLayerProperties) = this()
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
  }
  
  type _To = js.Object & WCSLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `wcslayerMod.foo` */
  override def _to: js.Object & WCSLayerConstructor = ^
}
