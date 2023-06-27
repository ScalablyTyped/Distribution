package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointSymbol3D
import typings.arcgisJsApi.esri.PointSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsPointSymbol3DMod {
  
  @JSImport("esri/symbols/PointSymbol3D", JSImport.Namespace)
  @js.native
  /**
  		 * PointSymbol3D is used to render features with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html)
  		 */
  open class ^ ()
    extends StObject
       with PointSymbol3D {
    def this(properties: PointSymbol3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/PointSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PointSymbol3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PointSymbol3D]
}
