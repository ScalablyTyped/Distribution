package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableSelectionChangeEventRemoved extends Object {
  
  var attachments: js.Array[AttachmentInfo] = js.native
  
  var feature: Graphic = js.native
  
  var relatedRecords: js.Array[Graphic] = js.native
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
  implicit class FeatureTableSelectionChangeEventRemovedOps[Self <: FeatureTableSelectionChangeEventRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentInfo*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[AttachmentInfo]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: Graphic): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedRecordsVarargs(value: Graphic*): Self = this.set("relatedRecords", js.Array(value :_*))
    
    @scala.inline
    def setRelatedRecords(value: js.Array[Graphic]): Self = this.set("relatedRecords", value.asInstanceOf[js.Any])
  }
}
