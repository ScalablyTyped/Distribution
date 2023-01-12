package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableSelectionChangeEventRemoved extends StObject {
  
  var attachments: js.Array[AttachmentInfo]
  
  var feature: Graphic
  
  var objectId: Double
  
  var relatedRecords: js.Array[Graphic]
}
object FeatureTableSelectionChangeEventRemoved {
  
  inline def apply(
    attachments: js.Array[AttachmentInfo],
    feature: Graphic,
    objectId: Double,
    relatedRecords: js.Array[Graphic]
  ): FeatureTableSelectionChangeEventRemoved = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], relatedRecords = relatedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEventRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTableSelectionChangeEventRemoved] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: js.Array[AttachmentInfo]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: AttachmentInfo*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setRelatedRecords(value: js.Array[Graphic]): Self = StObject.set(x, "relatedRecords", value.asInstanceOf[js.Any])
    
    inline def setRelatedRecordsVarargs(value: Graphic*): Self = StObject.set(x, "relatedRecords", js.Array(value*))
  }
}
