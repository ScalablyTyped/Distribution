package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVodSourceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the VOD source.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The timestamp that indicates when the VOD source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of HTTP package configurations for the VOD source on this account.
    */
  var HttpPackageConfigurations: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations] = js.undefined
  
  /**
    * The timestamp that indicates when the VOD source was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the source location associated with the VOD source.
    */
  var SourceLocationName: js.UndefOr[_String] = js.undefined
  
  /**
    * The tags to assign to the VOD source. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: js.UndefOr[_String] = js.undefined
}
object UpdateVodSourceResponse {
  
  inline def apply(): UpdateVodSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVodSourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVodSourceResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsUndefined: Self = StObject.set(x, "HttpPackageConfigurations", js.undefined)
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVodSourceName(value: _String): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
