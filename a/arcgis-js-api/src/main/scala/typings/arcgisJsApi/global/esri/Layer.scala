package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LayerFromArcGISServerUrlParams
import typings.arcgisJsApi.esri.LayerFromPortalItemParams
import typings.arcgisJsApi.esri.LayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Layer")
@js.native
/**
  * The layer is the most fundamental component of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
  */
open class Layer ()
  extends StObject
     with typings.arcgisJsApi.esri.Layer {
  def this(properties: LayerProperties) = this()
}
/* static members */
object Layer {
  
  @JSGlobal("__esri.Layer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new layer instance from an ArcGIS Server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  inline def fromArcGISServerUrl(params: LayerFromArcGISServerUrlParams): js.Promise[typings.arcgisJsApi.esri.Layer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArcGISServerUrl")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Layer]]
  
  /**
    * Creates a new layer instance of the appropriate layer class from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  inline def fromPortalItem(params: LayerFromPortalItemParams): js.Promise[typings.arcgisJsApi.esri.Layer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPortalItem")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Layer]]
}
