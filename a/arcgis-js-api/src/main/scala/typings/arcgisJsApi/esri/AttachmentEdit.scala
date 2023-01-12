package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentEdit extends StObject {
  
  /**
    * The attachment to be added, updated or deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var attachment: AttachmentEditAttachment
  
  /**
    * The feature, `objectId` or `globalId` of feature associated with the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)
    */
  var feature: Graphic | Double | String
}
object AttachmentEdit {
  
  inline def apply(attachment: AttachmentEditAttachment, feature: Graphic | Double | String): AttachmentEdit = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentEdit] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: AttachmentEditAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: Graphic | Double | String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
