package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerApplyEditsEdits extends Object {
  
  /**
    * An array of attachments to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.native
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
  
  /**
    * An array of [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#AttachmentEdit)s for attachments to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteAttachments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with `objectId` or `globalId` of each feature to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.native
  
  /**
    * An array of attachments to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateAttachments: js.UndefOr[js.Array[AttachmentEdit]] = js.native
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
}
object FeatureLayerApplyEditsEdits {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerApplyEditsEdits]
  }
  
  @scala.inline
  implicit class FeatureLayerApplyEditsEditsOps[Self <: FeatureLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    
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
    def setAddAttachmentsVarargs(value: AttachmentEdit*): Self = this.set("addAttachments", js.Array(value :_*))
    
    @scala.inline
    def setAddAttachments(value: js.Array[AttachmentEdit]): Self = this.set("addAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAttachments: Self = this.set("addAttachments", js.undefined)
    
    @scala.inline
    def setAddFeaturesVarargs(value: Graphic*): Self = this.set("addFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = this.set("addFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddFeatures: Self = this.set("addFeatures", js.undefined)
    
    @scala.inline
    def setDeleteAttachmentsVarargs(value: String*): Self = this.set("deleteAttachments", js.Array(value :_*))
    
    @scala.inline
    def setDeleteAttachments(value: js.Array[String]): Self = this.set("deleteAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAttachments: Self = this.set("deleteAttachments", js.undefined)
    
    @scala.inline
    def setDeleteFeaturesVarargs(value: (js.Any | Graphic)*): Self = this.set("deleteFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeleteFeatures(value: (js.Array[_ | Graphic]) | Collection[Graphic]): Self = this.set("deleteFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFeatures: Self = this.set("deleteFeatures", js.undefined)
    
    @scala.inline
    def setUpdateAttachmentsVarargs(value: AttachmentEdit*): Self = this.set("updateAttachments", js.Array(value :_*))
    
    @scala.inline
    def setUpdateAttachments(value: js.Array[AttachmentEdit]): Self = this.set("updateAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAttachments: Self = this.set("updateAttachments", js.undefined)
    
    @scala.inline
    def setUpdateFeaturesVarargs(value: Graphic*): Self = this.set("updateFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = this.set("updateFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateFeatures: Self = this.set("updateFeatures", js.undefined)
  }
}
