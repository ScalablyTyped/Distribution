package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait popupExpressionInfoProperties extends js.Object {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string, number, dictionary, or array. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The name of the expression. This is used to reference the value of the given `expression` in the popupTemplate's [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#content) property by wrapping it in curly braces and prefacing it with `expression/` (e.g. `{expression/expressionName}`). See the code snippets below for more examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates the return type of the Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
    */
  var returnType: js.UndefOr[String | Double] = js.native
  /**
    * The title used to describe the value returned by the expression in the popup. This will display if the value is referenced in a [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object popupExpressionInfoProperties {
  @scala.inline
  def apply(): popupExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[popupExpressionInfoProperties]
  }
  @scala.inline
  implicit class popupExpressionInfoPropertiesOps[Self <: popupExpressionInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReturnType(value: String | Double): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

