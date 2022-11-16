package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PictureMarkerSymbol
import typings.arcgisJsApi.esri.PictureMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsPictureMarkerSymbolMod {
  
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
    */
  open class ^ ()
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
  @JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PictureMarkerSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PictureMarkerSymbol]
}
