package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLiveSourceRequest extends StObject {
  
  /**
    * A list of HTTP package configurations for the live source on this account.
    */
  var HttpPackageConfigurations: typings.awsSdk.clientsMediatailorMod.HttpPackageConfigurations
  
  /**
    * The identifier for the live source you are working on.
    */
  var LiveSourceName: string
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object UpdateLiveSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    LiveSourceName: string,
    SourceLocationName: string
  ): UpdateLiveSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLiveSourceRequest]
  }
  
  extension [Self <: UpdateLiveSourceRequest](x: Self) {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
