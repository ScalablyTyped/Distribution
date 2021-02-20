package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.rotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualVariable
  extends Accessor
     with JSONSupport {
  
  /**
    * The name of the numeric attribute field that contains the data values used to determine the color/opacity/size/rotation of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#field)
    */
  var field: String = js.native
  
  /**
    * An object providing options for displaying the visual variable in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#legendOptions)
    */
  var legendOptions: VisualVariableLegendOptions = js.native
  
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#type)
    */
  val `type`: typings.arcgisJsApi.arcgisJsApiStrings.color | typings.arcgisJsApi.arcgisJsApiStrings.opacity | rotation | typings.arcgisJsApi.arcgisJsApiStrings.size = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpression)
    */
  var valueExpression: String = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html#valueExpressionTitle)
    */
  var valueExpressionTitle: String = js.native
}
