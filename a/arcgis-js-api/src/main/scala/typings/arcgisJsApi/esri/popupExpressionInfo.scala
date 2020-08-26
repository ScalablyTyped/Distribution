package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait popupExpressionInfo
  extends Accessor
     with JSONSupport {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
    */
  var expression: String = js.native
  /**
    * The name of the expression. This is used to reference the value of the given `expression` in the popupTemplate's [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) property by wrapping it in curly braces and prefacing it with `expression/` (e.g. `{expression/expressionName}`). See the code snippets below for more examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
    */
  var name: String = js.native
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
    */
  var returnType: String | Double = js.native
  /**
    * The title used to describe the value returned by the expression in the popup. This will display if the value is referenced in a [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
    */
  var title: String = js.native
}

