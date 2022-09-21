package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerAttachmentEdit
  extends StObject
     with Object {
  
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
  
  inline def apply(
    attachment: SubtypeGroupLayerAttachmentEditAttachment,
    constructor: js.Function,
    feature: Graphic | Double | String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SubtypeGroupLayerAttachmentEdit = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SubtypeGroupLayerAttachmentEdit]
  }
  
  extension [Self <: SubtypeGroupLayerAttachmentEdit](x: Self) {
    
    inline def setAttachment(value: SubtypeGroupLayerAttachmentEditAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: Graphic | Double | String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
