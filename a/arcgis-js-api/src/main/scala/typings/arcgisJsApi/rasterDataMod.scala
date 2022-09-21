package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterData
import typings.arcgisJsApi.esri.RasterDataConstructor
import typings.arcgisJsApi.esri.RasterDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterDataMod extends Shortcut {
  
  @JSImport("esri/rest/support/RasterData", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/RasterData", JSImport.Namespace)
  @js.native
  /**
    * A geoprocessing data object containing a raster data source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RasterData.html)
    */
  open class Class ()
    extends StObject
       with RasterData {
    def this(properties: RasterDataProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RasterDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterDataMod.foo` */
  override def _to: js.Object & RasterDataConstructor = ^
}
