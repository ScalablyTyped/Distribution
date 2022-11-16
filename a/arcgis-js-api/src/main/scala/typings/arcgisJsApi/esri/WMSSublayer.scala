package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSSublayer
  extends StObject
     with Accessor
     with Identifiable {
  
  /**
    * Description for the WMS sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#description)
    */
  var description: String = js.native
  
  /**
    * An array of time, elevation and other dimensions for the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#dimensions)
    */
  val dimensions: js.Array[TimeDimension | ElevationDimension | GenericDimension] = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  
  /**
    * The id for the WMS sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#id)
    */
  var id: Double = js.native
  
  /**
    * The [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#layer)
    */
  var layer: WMSLayer = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * A string url pointing to a legend image for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#legendUrl)
    */
  var legendUrl: String = js.native
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#maxScale)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#minScale)
    */
  var minScale: Double = js.native
  
  /**
    * Name of the WMS sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#name)
    */
  var name: String = js.native
  
  /**
    * Returns a reference to the parent WMS sublayer or layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#parent)
    */
  var parent: Any = js.native
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
  /**
    * Indicates if the layer can be queried, i.e.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#queryable)
    */
  var queryable: Boolean = js.native
  
  /**
    * List of spatialReferences (WKID) derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#spatialReferences)
    */
  var spatialReferences: js.Array[Double] = js.native
  
  /**
    * A collection of [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#sublayers)
    */
  var sublayers: Collection[WMSSublayer] = js.native
  
  /**
    * The title of the WMS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#title)
    */
  var title: String = js.native
  
  /**
    * Indicates if the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#visible)
    */
  var visible: Boolean = js.native
}
