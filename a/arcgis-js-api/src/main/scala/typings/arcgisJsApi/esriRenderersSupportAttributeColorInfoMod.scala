package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AttributeColorInfo
import typings.arcgisJsApi.esri.AttributeColorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportAttributeColorInfoMod {
  
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Defines colors for dots in a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes), or colors for pie chart slices in a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with AttributeColorInfo {
    def this(properties: AttributeColorInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/AttributeColorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AttributeColorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AttributeColorInfo]
}
