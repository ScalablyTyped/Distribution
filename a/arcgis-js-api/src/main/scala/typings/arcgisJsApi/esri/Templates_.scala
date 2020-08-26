package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templates_ extends Object {
  /**
    * Includes the primary PopupTemplate suggested for the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var primaryTemplate: Template = js.native
  /**
    * Includes secondary PopupTemplates that may be applied to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var secondaryTemplates: js.Array[Template] = js.native
}

object Templates_ {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primaryTemplate: Template,
    propertyIsEnumerable: PropertyKey => Boolean,
    secondaryTemplates: js.Array[Template]
  ): Templates_ = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryTemplate = primaryTemplate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondaryTemplates = secondaryTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates_]
  }
  @scala.inline
  implicit class Templates_Ops[Self <: Templates_] (val x: Self) extends AnyVal {
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
    def setPrimaryTemplate(value: Template): Self = this.set("primaryTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryTemplatesVarargs(value: Template*): Self = this.set("secondaryTemplates", js.Array(value :_*))
    @scala.inline
    def setSecondaryTemplates(value: js.Array[Template]): Self = this.set("secondaryTemplates", value.asInstanceOf[js.Any])
  }
  
}

