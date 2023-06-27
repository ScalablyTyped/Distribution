package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClassBreaksRenderer
import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import typings.arcgisJsApi.esri.VisualVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersClassBreaksRendererMod {
  
  @JSImport("esri/renderers/ClassBreaksRenderer", JSImport.Namespace)
  @js.native
  /**
  		 * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
  		 */
  open class ^ ()
    extends StObject
       with ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
    		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    		 */
    /* CompleteClass */
    var visualVariables: js.Array[VisualVariable] = js.native
  }
  @JSImport("esri/renderers/ClassBreaksRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ClassBreaksRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ClassBreaksRenderer]
}
