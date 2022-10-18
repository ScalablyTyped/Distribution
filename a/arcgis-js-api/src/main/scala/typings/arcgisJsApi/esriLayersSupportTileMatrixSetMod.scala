package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TileMatrixSet
import typings.arcgisJsApi.esri.TileMatrixSetConstructor
import typings.arcgisJsApi.esri.TileMatrixSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportTileMatrixSetMod extends Shortcut {
  
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TileMatrixSetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TileMatrixSet", JSImport.Namespace)
  @js.native
  /**
    * Contains information about the tiling scheme for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html)
    */
  open class Class ()
    extends StObject
       with TileMatrixSet {
    def this(properties: TileMatrixSetProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TileMatrixSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportTileMatrixSetMod.foo` */
  override def _to: js.Object & TileMatrixSetConstructor = ^
}
