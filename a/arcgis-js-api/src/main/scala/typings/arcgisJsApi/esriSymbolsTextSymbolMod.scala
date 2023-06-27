package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TextSymbol
import typings.arcgisJsApi.esri.TextSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsTextSymbolMod {
  
  @JSImport("esri/symbols/TextSymbol", JSImport.Namespace)
  @js.native
  /**
  		 * Text symbols are used to define the graphic for displaying labels on a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html)
  		 */
  open class ^ ()
    extends StObject
       with TextSymbol {
    def this(properties: TextSymbolProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/TextSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TextSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TextSymbol]
}
