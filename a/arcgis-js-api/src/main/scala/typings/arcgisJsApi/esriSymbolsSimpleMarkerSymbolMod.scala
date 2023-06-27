package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SimpleMarkerSymbol
import typings.arcgisJsApi.esri.SimpleMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsSimpleMarkerSymbolMod {
  
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
  		 * SimpleMarkerSymbol is used for rendering 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries with a simple shape and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html)
  		 */
  open class ^ ()
    extends StObject
       with SimpleMarkerSymbol {
    def this(properties: SimpleMarkerSymbolProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SimpleMarkerSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SimpleMarkerSymbol]
}
