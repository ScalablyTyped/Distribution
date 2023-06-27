package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TextSymbol3DLayer
import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsTextSymbol3DLayerMod {
  
  @JSImport("esri/symbols/TextSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
  		 * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with TextSymbol3DLayer {
    def this(properties: TextSymbol3DLayerProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/TextSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TextSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TextSymbol3DLayer]
}
