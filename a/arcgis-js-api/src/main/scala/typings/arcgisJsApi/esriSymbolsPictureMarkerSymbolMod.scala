package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PictureMarkerSymbol
import typings.arcgisJsApi.esri.PictureMarkerSymbolConstructor
import typings.arcgisJsApi.esri.PictureMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsPictureMarkerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PictureMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
    */
  open class Class ()
    extends StObject
       with PictureMarkerSymbol {
    def this(properties: PictureMarkerSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PictureMarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsPictureMarkerSymbolMod.foo` */
  override def _to: js.Object & PictureMarkerSymbolConstructor = ^
}
