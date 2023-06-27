package typings.arcgisJsApi

import typings.arcgisJsApi.esri.OpacityStop
import typings.arcgisJsApi.esri.OpacityStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersVisualVariablesSupportOpacityStopMod {
  
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  /**
  		 * Defines an opacity stop used for creating a continuous opacity visualization in a [opacity visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-OpacityStop.html)
  		 */
  open class ^ ()
    extends StObject
       with OpacityStop {
    def this(properties: OpacityStopProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/visualVariables/support/OpacityStop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): OpacityStop = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OpacityStop]
}
