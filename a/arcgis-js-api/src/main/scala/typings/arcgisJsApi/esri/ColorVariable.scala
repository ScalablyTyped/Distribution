package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorVariable extends VisualVariable {
  
  /**
    * Name of the numeric attribute field by which to normalize the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#normalizationField)
    */
  var normalizationField: String = js.native
  
  /**
    * An array of sequential objects, or stops, that defines a continuous color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops)
    */
  var stops: js.Array[ColorStop] = js.native
  
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#type)
    */
  @JSName("type")
  val type_ColorVariable: typings.arcgisJsApi.arcgisJsApiStrings.color = js.native
}
