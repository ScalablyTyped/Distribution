package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SizeVariable
import typings.arcgisJsApi.esri.SizeVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersVisualVariablesSizeVariableMod {
  
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  /**
  		 * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
  		 */
  open class ^ ()
    extends StObject
       with SizeVariable {
    def this(properties: SizeVariableProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SizeVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SizeVariable]
}
