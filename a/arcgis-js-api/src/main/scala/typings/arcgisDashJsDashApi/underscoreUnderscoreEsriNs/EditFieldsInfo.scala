package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditFieldsInfo extends Object {
  /**
    * The name of the field that stores the date and time the feature was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creationDateField: String
  /**
    * The name of the field that stores the name of the user who created the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creatorField: String
  /**
    * The name of the field that stores the date and time the feature was last edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editDateField: String
  /**
    * The name of the field that stores the name of the user who last edited the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editorField: String
}

object EditFieldsInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    creationDateField: String,
    creatorField: String,
    editDateField: String,
    editorField: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EditFieldsInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, creationDateField = creationDateField, creatorField = creatorField, editDateField = editDateField, editorField = editorField, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[EditFieldsInfo]
  }
}

