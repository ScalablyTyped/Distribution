package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineSymbol3DLayer
import typings.arcgisJsApi.esri.LineSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsLineSymbol3DLayerMod {
  
  @JSImport("esri/symbols/LineSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
  		 * LineSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries using a flat 2D line with a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with LineSymbol3DLayer {
    def this(properties: LineSymbol3DLayerProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/LineSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LineSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LineSymbol3DLayer]
}
