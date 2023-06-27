package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.WCSLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.WCSLayer")
@js.native
/**
		 * WCS presents raster data from a [OGC Web Coverage Service](https://www.ogc.org/standards/wcs).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html)
		 */
open class WCSLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.WCSLayer {
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
  var portalItem: typings.arcgisJsApi.esri.PortalItem = js.native
}
/* static members */
object WCSLayer {
  
  @JSGlobal("__esri.WCSLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.WCSLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.WCSLayer]
}
