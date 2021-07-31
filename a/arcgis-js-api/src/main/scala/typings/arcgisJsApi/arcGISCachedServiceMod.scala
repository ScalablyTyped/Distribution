package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ArcGISCachedService
import typings.arcgisJsApi.esri.ArcGISCachedServiceConstructor
import typings.arcgisJsApi.esri.ArcGISCachedServiceProperties
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.TileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcGISCachedServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ArcGISCachedService", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ArcGISCachedServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ArcGISCachedService", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ArcGISCachedService {
    def this(properties: ArcGISCachedServiceProperties) = this()
    
    /**
      * The copyright text as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
      */
    /* CompleteClass */
    var copyright: String = js.native
    
    /**
      * The spatial reference of the layer as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
      */
    /* CompleteClass */
    override val spatialReference: SpatialReference = js.native
    
    /**
      * Contains information about the tiling scheme for the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
      */
    /* CompleteClass */
    var tileInfo: TileInfo = js.native
  }
  
  type _To = js.Object & ArcGISCachedServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `arcGISCachedServiceMod.foo` */
  override def _to: js.Object & ArcGISCachedServiceConstructor = ^
}
