package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionInfoProperties extends js.Object {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the expression. This is used to reference the value of the given `expression` in the popupTemplate's [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) property by wrapping it in curly braces and prefacing it with `expression/` (e.g. `{expression/expressionName}`). See the code snippets below for more examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
    */
  var returnType: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The title used to describe the value returned by the expression in the popup. This will display if the value is referenced in a [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ExpressionInfoProperties {
  @scala.inline
  def apply(
    expression: java.lang.String = null,
    name: java.lang.String = null,
    returnType: java.lang.String | scala.Double = null,
    title: java.lang.String = null
  ): ExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (name != null) __obj.updateDynamic("name")(name)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ExpressionInfoProperties]
  }
}

