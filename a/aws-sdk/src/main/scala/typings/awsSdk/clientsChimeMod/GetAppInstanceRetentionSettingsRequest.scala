package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppInstanceRetentionSettingsRequest extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: ChimeArn
}
object GetAppInstanceRetentionSettingsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): GetAppInstanceRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppInstanceRetentionSettingsRequest]
  }
  
  extension [Self <: GetAppInstanceRetentionSettingsRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
