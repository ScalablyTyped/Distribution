package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditFieldsInfo
  extends stdLib.Object {
  /**
    * The name of the field that stores the date and time the feature was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creationDateField: java.lang.String
  /**
    * The name of the field that stores the name of the user who created the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creatorField: java.lang.String
  /**
    * The name of the field that stores the date and time the feature was last edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editDateField: java.lang.String
  /**
    * The name of the field that stores the name of the user who last edited the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editorField: java.lang.String
}

object EditFieldsInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    creationDateField: java.lang.String,
    creatorField: java.lang.String,
    editDateField: java.lang.String,
    editorField: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): EditFieldsInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, creationDateField = creationDateField, creatorField = creatorField, editDateField = editDateField, editorField = editorField, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[EditFieldsInfo]
  }
}

