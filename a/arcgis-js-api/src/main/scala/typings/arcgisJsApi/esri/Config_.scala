package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config_ extends Object {
  /**
    * The display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
    */
  var displayField: js.UndefOr[String] = js.native
  /**
    * The fields that record who adds or edits data in the feature service and when the edit is made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
    */
  var editFieldsInfo: js.UndefOr[EditFieldsInfo] = js.native
  /**
    * The fields displayed within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
    */
  var fields: js.Array[Field] = js.native
  /**
    * The object id field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
    */
  var objectIdField: js.UndefOr[String] = js.native
  /**
    * The title for the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
    */
  var title: String = js.native
}

object Config_ {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[Field],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String
  ): Config_ = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    @scala.inline
    def setEditFieldsInfo(value: EditFieldsInfo): Self = this.set("editFieldsInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditFieldsInfo: Self = this.set("editFieldsInfo", js.undefined)
    @scala.inline
    def setObjectIdField(value: String): Self = this.set("objectIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdField: Self = this.set("objectIdField", js.undefined)
  }
  
}

