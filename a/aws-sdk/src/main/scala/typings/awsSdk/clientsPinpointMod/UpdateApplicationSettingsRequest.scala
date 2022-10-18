package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var WriteApplicationSettingsRequest: typings.awsSdk.clientsPinpointMod.WriteApplicationSettingsRequest
}
object UpdateApplicationSettingsRequest {
  
  inline def apply(ApplicationId: string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
  
  extension [Self <: UpdateApplicationSettingsRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setWriteApplicationSettingsRequest(value: WriteApplicationSettingsRequest): Self = StObject.set(x, "WriteApplicationSettingsRequest", value.asInstanceOf[js.Any])
  }
}
