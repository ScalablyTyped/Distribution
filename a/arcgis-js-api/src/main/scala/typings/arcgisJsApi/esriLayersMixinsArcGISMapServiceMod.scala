package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ArcGISMapService
import typings.arcgisJsApi.esri.ArcGISMapServiceCapabilities
import typings.arcgisJsApi.esri.ArcGISMapServiceProperties
import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersMixinsArcGISMapServiceMod {
  
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ArcGISMapService {
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
    var fullExtent: Extent = js.native
    
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
    override val spatialReference: SpatialReference = js.native
    
    /**
      * The version of ArcGIS Server in which the map service is published.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
      */
    /* CompleteClass */
    override val version: Double = js.native
  }
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ArcGISMapService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ArcGISMapService]
}
