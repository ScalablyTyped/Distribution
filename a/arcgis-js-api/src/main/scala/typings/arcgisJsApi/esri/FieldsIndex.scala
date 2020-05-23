package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsIndex extends js.Object {
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    *
    * @default []
    */
  var dateFields: js.Array[_ | Field]
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def get(fieldName: String): Field
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def has(fieldName: String): Boolean
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    *
    * @param fieldName The name of the field.
    *
    */
  def isDateField(fieldName: String): Boolean
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
}

