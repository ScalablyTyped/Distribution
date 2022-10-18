package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationInputProcessingConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The current application version ID.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
}
object DeleteApplicationInputProcessingConfigurationResponse {
  
  inline def apply(): DeleteApplicationInputProcessingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
  }
  
  extension [Self <: DeleteApplicationInputProcessingConfigurationResponse](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
  }
}
