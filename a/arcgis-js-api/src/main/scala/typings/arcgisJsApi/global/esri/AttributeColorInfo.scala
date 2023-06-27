package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AttributeColorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AttributeColorInfo")
@js.native
/**
		 * Defines colors for dots in a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes), or colors for pie chart slices in a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html)
		 */
open class AttributeColorInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.AttributeColorInfo {
  def this(properties: AttributeColorInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AttributeColorInfo {
  
  @JSGlobal("__esri.AttributeColorInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AttributeColorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AttributeColorInfo]
}
