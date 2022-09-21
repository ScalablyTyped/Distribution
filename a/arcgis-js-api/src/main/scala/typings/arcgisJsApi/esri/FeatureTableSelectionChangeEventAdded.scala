package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableSelectionChangeEventAdded
  extends StObject
     with Object {
  
  var attachments: js.Array[AttachmentInfo]
  
  var feature: Graphic
  
  var relatedRecords: js.Array[Graphic]
}
object FeatureTableSelectionChangeEventAdded {
  
  inline def apply(
    attachments: js.Array[AttachmentInfo],
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relatedRecords: js.Array[Graphic]
  ): FeatureTableSelectionChangeEventAdded = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relatedRecords = relatedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEventAdded]
  }
  
  extension [Self <: FeatureTableSelectionChangeEventAdded](x: Self) {
    
    inline def setAttachments(value: js.Array[AttachmentInfo]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: AttachmentInfo*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setRelatedRecords(value: js.Array[Graphic]): Self = StObject.set(x, "relatedRecords", value.asInstanceOf[js.Any])
    
    inline def setRelatedRecordsVarargs(value: Graphic*): Self = StObject.set(x, "relatedRecords", js.Array(value*))
  }
}
