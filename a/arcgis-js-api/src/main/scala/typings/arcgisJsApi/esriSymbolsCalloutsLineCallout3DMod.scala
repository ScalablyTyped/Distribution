package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineCallout3D
import typings.arcgisJsApi.esri.LineCallout3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsCalloutsLineCallout3DMod {
  
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  /**
  		 * This type of callout displays a line to connect a symbol or a label with its actual location in the scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
  		 */
  open class ^ ()
    extends StObject
       with LineCallout3D {
    def this(properties: LineCallout3DProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LineCallout3D = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LineCallout3D]
}
