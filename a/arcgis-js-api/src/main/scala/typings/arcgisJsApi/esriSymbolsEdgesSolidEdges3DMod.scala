package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SolidEdges3D
import typings.arcgisJsApi.esri.SolidEdges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsEdgesSolidEdges3DMod {
  
  @JSImport("esri/symbols/edges/SolidEdges3D", JSImport.Namespace)
  @js.native
  /**
  		 * SolidEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a solid line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html)
  		 */
  open class ^ ()
    extends StObject
       with SolidEdges3D {
    def this(properties: SolidEdges3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/edges/SolidEdges3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SolidEdges3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SolidEdges3D]
}
