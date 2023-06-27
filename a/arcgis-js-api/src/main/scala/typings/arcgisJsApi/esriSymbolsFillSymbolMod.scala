package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FillSymbol
import typings.arcgisJsApi.esri.FillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsFillSymbolMod {
  
  @JSImport("esri/symbols/FillSymbol", JSImport.Namespace)
  @js.native
  /**
  		 * Fill symbols are used to draw [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) graphics in a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) or a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html)
  		 */
  open class ^ ()
    extends StObject
       with FillSymbol {
    def this(properties: FillSymbolProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/FillSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FillSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FillSymbol]
}
