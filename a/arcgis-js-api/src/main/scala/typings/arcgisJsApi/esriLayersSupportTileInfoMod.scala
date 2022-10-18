package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TileInfo
import typings.arcgisJsApi.esri.TileInfoConstructor
import typings.arcgisJsApi.esri.TileInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportTileInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/TileInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TileInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TileInfo", JSImport.Namespace)
  @js.native
  /**
    * Contains information about the tiling scheme for [TileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), [ImageryTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), [VectorTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html), and [WebTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html)
    */
  open class Class ()
    extends StObject
       with TileInfo {
    def this(properties: TileInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TileInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportTileInfoMod.foo` */
  override def _to: js.Object & TileInfoConstructor = ^
}
