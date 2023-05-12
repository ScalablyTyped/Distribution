package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilitiesAttachment extends StObject {
  
  /**
    * Indicates if the [attachment operations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) support a cache hint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsCacheHint: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their content types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsContentType: Boolean
  
  /**
    * Indicates if the attachment [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) support `exifInfo`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsExifInfo: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their keywords.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsKeywords: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsName: Boolean
  
  /**
    * Indicates if resized attachments are supported in the feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsResize: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
    */
  var supportsSize: Boolean
}
object CapabilitiesAttachment {
  
  inline def apply(
    supportsCacheHint: Boolean,
    supportsContentType: Boolean,
    supportsExifInfo: Boolean,
    supportsKeywords: Boolean,
    supportsName: Boolean,
    supportsResize: Boolean,
    supportsSize: Boolean
  ): CapabilitiesAttachment = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any], supportsContentType = supportsContentType.asInstanceOf[js.Any], supportsExifInfo = supportsExifInfo.asInstanceOf[js.Any], supportsKeywords = supportsKeywords.asInstanceOf[js.Any], supportsName = supportsName.asInstanceOf[js.Any], supportsResize = supportsResize.asInstanceOf[js.Any], supportsSize = supportsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilitiesAttachment] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
    
    inline def setSupportsContentType(value: Boolean): Self = StObject.set(x, "supportsContentType", value.asInstanceOf[js.Any])
    
    inline def setSupportsExifInfo(value: Boolean): Self = StObject.set(x, "supportsExifInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportsKeywords(value: Boolean): Self = StObject.set(x, "supportsKeywords", value.asInstanceOf[js.Any])
    
    inline def setSupportsName(value: Boolean): Self = StObject.set(x, "supportsName", value.asInstanceOf[js.Any])
    
    inline def setSupportsResize(value: Boolean): Self = StObject.set(x, "supportsResize", value.asInstanceOf[js.Any])
    
    inline def setSupportsSize(value: Boolean): Self = StObject.set(x, "supportsSize", value.asInstanceOf[js.Any])
  }
}
