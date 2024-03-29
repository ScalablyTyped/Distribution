package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVodSourceRequest extends StObject {
  
  /**
    * A list of HTTP package configuration parameters for this VOD source.
    */
  var HttpPackageConfigurations: typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations
  
  /**
    * The name of the source location for this VOD source.
    */
  var SourceLocationName: _String
  
  /**
    * The tags to assign to the VOD source. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The name associated with the VOD source.&gt;
    */
  var VodSourceName: _String
}
object CreateVodSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    SourceLocationName: _String,
    VodSourceName: _String
  ): CreateVodSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVodSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVodSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVodSourceName(value: _String): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
