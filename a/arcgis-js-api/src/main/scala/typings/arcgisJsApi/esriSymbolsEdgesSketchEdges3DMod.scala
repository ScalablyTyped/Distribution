package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SketchEdges3D
import typings.arcgisJsApi.esri.SketchEdges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsEdgesSketchEdges3DMod {
  
  @JSImport("esri/symbols/edges/SketchEdges3D", JSImport.Namespace)
  @js.native
  /**
  		 * SketchEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a sketched line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html)
  		 */
  open class ^ ()
    extends StObject
       with SketchEdges3D {
    def this(properties: SketchEdges3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/edges/SketchEdges3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SketchEdges3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SketchEdges3D]
}
