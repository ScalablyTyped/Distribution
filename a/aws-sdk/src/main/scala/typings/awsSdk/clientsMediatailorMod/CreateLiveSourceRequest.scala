package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLiveSourceRequest extends StObject {
  
  /**
    * A list of HTTP package configuration parameters for this live source.
    */
  var HttpPackageConfigurations: typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations
  
  /**
    * The name of the live source.
    */
  var LiveSourceName: string
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: string
  
  /**
    * The tags to assign to the live source. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object CreateLiveSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    LiveSourceName: string,
    SourceLocationName: string
  ): CreateLiveSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLiveSourceRequest]
  }
  
  extension [Self <: CreateLiveSourceRequest](x: Self) {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
