package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditableItem extends StObject {
  
  /**
  		 * Indicates whether this layer supports the ability to work with attachments while creating features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var attachmentsOnCreateEnabled: Boolean
  
  /**
  		 * Indicates whether this layer supports the ability to work with attachments while updating or deleting features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var attachmentsOnUpdateEnabled: Boolean
  
  /**
  		 * Indicates whether this layer supports attribute editing while in the `update` workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var attributeUpdatesEnabled: Boolean
  
  /**
  		 * Indicates whether this layer enables or disables geometry updates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var geometryUpdatesEnabled: Boolean
  
  /**
  		 * Indicates whether this layer has attachments on it.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var hasAttachments: Boolean
  
  /**
  		 * Indicates whether this layer's [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) is invalid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var hasInvalidFormTemplate: Boolean
  
  /**
  		 * Indicates whether this layer references unsupported field types.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var hasUnsupportedFields: Boolean
  
  /**
  		 * The layer associated with the editable item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var layer: FeatureLayer | SceneLayer | Any
  
  /**
  		 * The workflow type that this item supports.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
  		 */
  var supports: String
}
object EditableItem {
  
  inline def apply(
    attachmentsOnCreateEnabled: Boolean,
    attachmentsOnUpdateEnabled: Boolean,
    attributeUpdatesEnabled: Boolean,
    geometryUpdatesEnabled: Boolean,
    hasAttachments: Boolean,
    hasInvalidFormTemplate: Boolean,
    hasUnsupportedFields: Boolean,
    layer: FeatureLayer | SceneLayer | Any,
    supports: String
  ): EditableItem = {
    val __obj = js.Dynamic.literal(attachmentsOnCreateEnabled = attachmentsOnCreateEnabled.asInstanceOf[js.Any], attachmentsOnUpdateEnabled = attachmentsOnUpdateEnabled.asInstanceOf[js.Any], attributeUpdatesEnabled = attributeUpdatesEnabled.asInstanceOf[js.Any], geometryUpdatesEnabled = geometryUpdatesEnabled.asInstanceOf[js.Any], hasAttachments = hasAttachments.asInstanceOf[js.Any], hasInvalidFormTemplate = hasInvalidFormTemplate.asInstanceOf[js.Any], hasUnsupportedFields = hasUnsupportedFields.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditableItem] (val x: Self) extends AnyVal {
    
    inline def setAttachmentsOnCreateEnabled(value: Boolean): Self = StObject.set(x, "attachmentsOnCreateEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsOnUpdateEnabled(value: Boolean): Self = StObject.set(x, "attachmentsOnUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesEnabled(value: Boolean): Self = StObject.set(x, "attributeUpdatesEnabled", value.asInstanceOf[js.Any])
    
    inline def setGeometryUpdatesEnabled(value: Boolean): Self = StObject.set(x, "geometryUpdatesEnabled", value.asInstanceOf[js.Any])
    
    inline def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasInvalidFormTemplate(value: Boolean): Self = StObject.set(x, "hasInvalidFormTemplate", value.asInstanceOf[js.Any])
    
    inline def setHasUnsupportedFields(value: Boolean): Self = StObject.set(x, "hasUnsupportedFields", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FeatureLayer | SceneLayer | Any): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
  }
}
