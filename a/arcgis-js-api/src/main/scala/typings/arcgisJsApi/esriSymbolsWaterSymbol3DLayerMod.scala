package typings.arcgisJsApi

import typings.arcgisJsApi.esri.WaterSymbol3DLayer
import typings.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsWaterSymbol3DLayerMod {
  
  @JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
  		 * WaterSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries as realistic, animated water surfaces, therefore it can only be used inside a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with WaterSymbol3DLayer {
    def this(properties: WaterSymbol3DLayerProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): WaterSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[WaterSymbol3DLayer]
}
