package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VodSource extends StObject {
  
  /**
    * The ARN for the VOD source.
    */
  var Arn: string
  
  /**
    * The timestamp that indicates when the VOD source was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The HTTP package configurations for the VOD source.
    */
  var HttpPackageConfigurations: typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations
  
  /**
    * The timestamp that indicates when the VOD source was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the source location that the VOD source is associated with.
    */
  var SourceLocationName: string
  
  /**
    * The tags assigned to the VOD source.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: string
}
object VodSource {
  
  inline def apply(
    Arn: string,
    HttpPackageConfigurations: HttpPackageConfigurations,
    SourceLocationName: string,
    VodSourceName: string
  ): VodSource = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VodSource]
  }
  
  extension [Self <: VodSource](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
