package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerAttachmentEdit extends StObject {
  
  /**
    * The attachment to be added, updated or deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var attachment: SubtypeGroupLayerAttachmentEditAttachment
  
  /**
    * The feature, `objectId` or `globalId` of feature associated with the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#AttachmentEdit)
    */
  var feature: Graphic | Double | String
}
object SubtypeGroupLayerAttachmentEdit {
  
  inline def apply(attachment: SubtypeGroupLayerAttachmentEditAttachment, feature: Graphic | Double | String): SubtypeGroupLayerAttachmentEdit = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerAttachmentEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerAttachmentEdit] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: SubtypeGroupLayerAttachmentEditAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: Graphic | Double | String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
