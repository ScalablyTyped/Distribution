package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsIndex extends js.Object {
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    *
    * @default []
    */
  var dateFields: js.Array[_ | Field] = js.native
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def get(fieldName: String): Field = js.native
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def has(fieldName: String): Boolean = js.native
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    *
    * @param fieldName The name of the field.
    *
    */
  def isDateField(fieldName: String): Boolean = js.native
}

object FieldsIndex {
  @scala.inline
  def apply(
    dateFields: js.Array[_ | Field],
    get: String => Field,
    has: String => Boolean,
    isDateField: String => Boolean
  ): FieldsIndex = {
    val __obj = js.Dynamic.literal(dateFields = dateFields.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDateField = js.Any.fromFunction1(isDateField))
    __obj.asInstanceOf[FieldsIndex]
  }
  @scala.inline
  implicit class FieldsIndexOps[Self <: FieldsIndex] (val x: Self) extends AnyVal {
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
    def setDateFieldsVarargs(value: (js.Any | Field)*): Self = this.set("dateFields", js.Array(value :_*))
    @scala.inline
    def setDateFields(value: js.Array[_ | Field]): Self = this.set("dateFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: String => Field): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDateField(value: String => Boolean): Self = this.set("isDateField", js.Any.fromFunction1(value))
  }
  
}

