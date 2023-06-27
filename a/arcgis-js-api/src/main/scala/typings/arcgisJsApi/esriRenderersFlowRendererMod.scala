package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FlowRenderer
import typings.arcgisJsApi.esri.FlowRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersFlowRendererMod {
  
  @JSImport("esri/renderers/FlowRenderer", JSImport.Namespace)
  @js.native
  /**
  		 * The FlowRenderer allows you to visualize your raster data with animated streamlines.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html)
  		 */
  open class ^ ()
    extends StObject
       with FlowRenderer {
    def this(properties: FlowRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/FlowRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FlowRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FlowRenderer]
}
