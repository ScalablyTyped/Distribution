package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Edges3D
import typings.arcgisJsApi.esri.Edges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsEdgesEdges3DMod {
  
  @JSImport("esri/symbols/edges/Edges3D", JSImport.Namespace)
  @js.native
  /**
  		 * Edges3D is the base class for symbol classes that add edge rendering visualization to existing symbols.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html)
  		 */
  open class ^ ()
    extends StObject
       with Edges3D {
    def this(properties: Edges3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/edges/Edges3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Edges3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Edges3D]
}
