package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ArcGISMapService
import typings.arcgisJsApi.esri.ArcGISMapServiceCapabilities
import typings.arcgisJsApi.esri.ArcGISMapServiceConstructor
import typings.arcgisJsApi.esri.ArcGISMapServiceProperties
import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcGISMapServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ArcGISMapServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  open class Class ()
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
  
  type _To = js.Object & ArcGISMapServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `arcGISMapServiceMod.foo` */
  override def _to: js.Object & ArcGISMapServiceConstructor = ^
}
