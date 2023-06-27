package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColorVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColorVariable")
@js.native
/**
		 * The color visual variable is used to visualize features along a continuous color ramp based on the values of a numeric attribute [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#field) or an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#valueExpression).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html)
		 */
open class ColorVariable ()
  extends StObject
     with typings.arcgisJsApi.esri.ColorVariable {
  def this(properties: ColorVariableProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ColorVariable {
  
  @JSGlobal("__esri.ColorVariable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ColorVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColorVariable]
}
