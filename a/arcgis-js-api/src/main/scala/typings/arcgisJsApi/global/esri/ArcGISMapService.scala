package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ArcGISMapServiceCapabilities
import typings.arcgisJsApi.esri.ArcGISMapServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ArcGISMapService")
@js.native
open class ArcGISMapService ()
  extends StObject
     with typings.arcgisJsApi.esri.ArcGISMapService {
  def this(properties: ArcGISMapServiceProperties) = this()
  
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  /* CompleteClass */
  override val capabilities: ArcGISMapServiceCapabilities = js.native
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  /* CompleteClass */
  var copyright: String = js.native
  
  /**
    * The full extent of the layer as defined by the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
    */
  /* CompleteClass */
  var fullExtent: typings.arcgisJsApi.esri.Extent = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    */
  /* CompleteClass */
  var legendEnabled: Boolean = js.native
  
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: typings.arcgisJsApi.esri.SpatialReference = js.native
  
  /**
    * The version of ArcGIS Server in which the map service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
    */
  /* CompleteClass */
  override val version: Double = js.native
}
/* static members */
object ArcGISMapService {
  
  @JSGlobal("__esri.ArcGISMapService")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ArcGISMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ArcGISMapService]
}
