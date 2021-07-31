package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableSelectionChangeEventRemoved
  extends StObject
     with Object {
  
  var attachments: js.Array[AttachmentInfo]
  
  var feature: Graphic
  
  var relatedRecords: js.Array[Graphic]
}
object FeatureTableSelectionChangeEventRemoved {
  
  @scala.inline
  def apply(
    attachments: js.Array[AttachmentInfo],
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relatedRecords: js.Array[Graphic]
  ): FeatureTableSelectionChangeEventRemoved = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relatedRecords = relatedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEventRemoved]
  }
  
  @scala.inline
  implicit class FeatureTableSelectionChangeEventRemovedMutableBuilder[Self <: FeatureTableSelectionChangeEventRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[AttachmentInfo]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentInfo*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedRecords(value: js.Array[Graphic]): Self = StObject.set(x, "relatedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedRecordsVarargs(value: Graphic*): Self = StObject.set(x, "relatedRecords", js.Array(value :_*))
  }
}
