package typings.arcgisJsApi

import typings.arcgisJsApi.esri.StylePattern3D
import typings.arcgisJsApi.esri.StylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsPatternsStylePattern3DMod {
  
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  /**
  		 * Renders polygons with predefined style pattern fills.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html)
  		 */
  open class ^ ()
    extends StObject
       with StylePattern3D {
    def this(properties: StylePattern3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/patterns/StylePattern3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): StylePattern3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[StylePattern3D]
}
