package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationInputResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  
  /**
    * Describes the application input configuration. 
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputDescriptions] = js.undefined
}
object AddApplicationInputResponse {
  
  inline def apply(): AddApplicationInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationInputResponse]
  }
  
  extension [Self <: AddApplicationInputResponse](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    inline def setInputDescriptions(value: InputDescriptions): Self = StObject.set(x, "InputDescriptions", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionsUndefined: Self = StObject.set(x, "InputDescriptions", js.undefined)
    
    inline def setInputDescriptionsVarargs(value: InputDescription*): Self = StObject.set(x, "InputDescriptions", js.Array(value*))
  }
}
