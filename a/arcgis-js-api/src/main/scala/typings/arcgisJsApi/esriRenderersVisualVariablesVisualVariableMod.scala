package typings.arcgisJsApi

import typings.arcgisJsApi.esri.VisualVariable
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersVisualVariablesVisualVariableMod {
  
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  /**
  		 * The visual variable base class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html)
  		 */
  open class ^ ()
    extends StObject
       with VisualVariable {
    def this(properties: VisualVariableProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): VisualVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[VisualVariable]
}
