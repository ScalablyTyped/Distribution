package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionInfo
  extends Accessor
     with JSONSupport {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#expression)
    */
  var expression: String = js.native
  /**
    * The name of the expression. This is used to reference the value of the given `expression` in the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) property by wrapping it in curly braces and prefacing it with `expression/` (e.g. `{expression/expressionName}`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name)
    */
  var name: String = js.native
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#returnType)
    *
    * @default boolean
    */
  var returnType: boolean | number | string = js.native
  /**
    * The title used to describe the value returned by the expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#title)
    */
  var title: String = js.native
}

