package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PieChartRenderer
import typings.arcgisJsApi.esri.PieChartRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersPieChartRendererMod {
  
  @JSImport("esri/renderers/PieChartRenderer", JSImport.Namespace)
  @js.native
  /**
  		 * PieChartRenderer allows you to create a pie chart for each feature in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html)
  		 */
  open class ^ ()
    extends StObject
       with PieChartRenderer {
    def this(properties: PieChartRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/PieChartRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PieChartRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PieChartRenderer]
}
