package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLiveSourceResponse extends StObject {
  
  /**
    * The ARN to assign to the live source.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The time the live source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of HTTP package configuration parameters for this live source.
    */
  var HttpPackageConfigurations: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations] = js.undefined
  
  /**
    * The time the live source was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name to assign to the live source.
    */
  var LiveSourceName: js.UndefOr[_String] = js.undefined
  
  /**
    * The name to assign to the source location of the live source.
    */
  var SourceLocationName: js.UndefOr[_String] = js.undefined
  
  /**
    * The tags to assign to the live source. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateLiveSourceResponse {
  
  inline def apply(): CreateLiveSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLiveSourceResponse]
  }
  
  extension [Self <: CreateLiveSourceResponse](x: Self) {
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsUndefined: Self = StObject.set(x, "HttpPackageConfigurations", js.undefined)
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLiveSourceName(value: _String): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceNameUndefined: Self = StObject.set(x, "LiveSourceName", js.undefined)
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
