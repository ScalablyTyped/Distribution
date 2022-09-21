package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterInfo
import typings.arcgisJsApi.esri.RasterInfoConstructor
import typings.arcgisJsApi.esri.RasterInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
  @js.native
  /**
    * Describes general raster data information exposed by the ArcGIS REST API for [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html) and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html)
    */
  open class Class ()
    extends StObject
       with RasterInfo {
    def this(properties: RasterInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RasterInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterInfoMod.foo` */
  override def _to: js.Object & RasterInfoConstructor = ^
}
