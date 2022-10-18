package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVodSourceResponse extends StObject {
  
  /**
    * The ARN of the VOD source.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp that indicates when the VOD source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The HTTP package configurations.
    */
  var HttpPackageConfigurations: js.UndefOr[typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations] = js.undefined
  
  /**
    * The last modified time of the VOD source.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the source location associated with the VOD source.
    */
  var SourceLocationName: js.UndefOr[string] = js.undefined
  
  /**
    * The tags assigned to the VOD source.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: js.UndefOr[string] = js.undefined
}
object DescribeVodSourceResponse {
  
  inline def apply(): DescribeVodSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVodSourceResponse]
  }
  
  extension [Self <: DescribeVodSourceResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsUndefined: Self = StObject.set(x, "HttpPackageConfigurations", js.undefined)
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
