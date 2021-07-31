package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditFieldsInfo
  extends StObject
     with Object {
  
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
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], creationDateField = creationDateField.asInstanceOf[js.Any], creatorField = creatorField.asInstanceOf[js.Any], editDateField = editDateField.asInstanceOf[js.Any], editorField = editorField.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EditFieldsInfo]
  }
  
  @scala.inline
  implicit class EditFieldsInfoMutableBuilder[Self <: EditFieldsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateField(value: String): Self = StObject.set(x, "creationDateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorField(value: String): Self = StObject.set(x, "creatorField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditDateField(value: String): Self = StObject.set(x, "editDateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorField(value: String): Self = StObject.set(x, "editorField", value.asInstanceOf[js.Any])
  }
}
