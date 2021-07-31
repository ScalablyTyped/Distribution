package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormTemplate
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description)
    */
  var description: String = js.native
  
  /**
    * An array of [form element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html) objects that represent an ordered list of form elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements)
    */
  var elements: js.Array[Element] = js.native
  
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos)
    */
  var expressionInfos: js.Array[ExpressionInfo] = js.native
  
  /**
    * The string template for defining how to format the title used in a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title)
    */
  var title: String = js.native
}
