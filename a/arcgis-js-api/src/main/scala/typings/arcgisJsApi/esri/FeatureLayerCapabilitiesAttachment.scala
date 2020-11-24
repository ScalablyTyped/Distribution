package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerCapabilitiesAttachment extends Object {
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their content types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsContentType: Boolean = js.native
  
  /**
    * Indicates if the attachment [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) support `exifInfo`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsExifInfo: Boolean = js.native
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their keywords.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsKeywords: Boolean = js.native
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsName: Boolean = js.native
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html) by their sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsSize: Boolean = js.native
}
object FeatureLayerCapabilitiesAttachment {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsContentType: Boolean,
    supportsExifInfo: Boolean,
    supportsKeywords: Boolean,
    supportsName: Boolean,
    supportsSize: Boolean
  ): FeatureLayerCapabilitiesAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsContentType = supportsContentType.asInstanceOf[js.Any], supportsExifInfo = supportsExifInfo.asInstanceOf[js.Any], supportsKeywords = supportsKeywords.asInstanceOf[js.Any], supportsName = supportsName.asInstanceOf[js.Any], supportsSize = supportsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesAttachment]
  }
  
  @scala.inline
  implicit class FeatureLayerCapabilitiesAttachmentOps[Self <: FeatureLayerCapabilitiesAttachment] (val x: Self) extends AnyVal {
    
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
    def setSupportsContentType(value: Boolean): Self = this.set("supportsContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsExifInfo(value: Boolean): Self = this.set("supportsExifInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsKeywords(value: Boolean): Self = this.set("supportsKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsName(value: Boolean): Self = this.set("supportsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsSize(value: Boolean): Self = this.set("supportsSize", value.asInstanceOf[js.Any])
  }
}
