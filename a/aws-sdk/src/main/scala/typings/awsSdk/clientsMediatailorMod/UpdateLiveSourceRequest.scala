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
    * The name of the live source.
    */
  var LiveSourceName: _String
  
  /**
    * The name of the source location associated with this Live Source.
    */
  var SourceLocationName: _String
}
object UpdateLiveSourceRequest {
  
  inline def apply(
    HttpPackageConfigurations: HttpPackageConfigurations,
    LiveSourceName: _String,
    SourceLocationName: _String
  ): UpdateLiveSourceRequest = {
    val __obj = js.Dynamic.literal(HttpPackageConfigurations = HttpPackageConfigurations.asInstanceOf[js.Any], LiveSourceName = LiveSourceName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLiveSourceRequest]
  }
  
  extension [Self <: UpdateLiveSourceRequest](x: Self) {
    
    inline def setHttpPackageConfigurations(value: HttpPackageConfigurations): Self = StObject.set(x, "HttpPackageConfigurations", value.asInstanceOf[js.Any])
    
    inline def setHttpPackageConfigurationsVarargs(value: HttpPackageConfiguration*): Self = StObject.set(x, "HttpPackageConfigurations", js.Array(value*))
    
    inline def setLiveSourceName(value: _String): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
