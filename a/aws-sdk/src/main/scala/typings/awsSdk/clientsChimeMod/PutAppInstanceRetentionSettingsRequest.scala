package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceRetentionSettingsRequest extends StObject {
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The time in days to retain data. Data type: number.
    */
  var AppInstanceRetentionSettings: typings.awsSdk.clientsChimeMod.AppInstanceRetentionSettings
}
object PutAppInstanceRetentionSettingsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn, AppInstanceRetentionSettings: AppInstanceRetentionSettings): PutAppInstanceRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceRetentionSettings = AppInstanceRetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAppInstanceRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = StObject.set(x, "AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
  }
}
