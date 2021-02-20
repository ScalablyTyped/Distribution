package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceRetentionSettingsRequest extends StObject {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The time in days to retain data. Data type: number.
    */
  var AppInstanceRetentionSettings: typings.awsSdk.chimeMod.AppInstanceRetentionSettings = js.native
}
object PutAppInstanceRetentionSettingsRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn, AppInstanceRetentionSettings: AppInstanceRetentionSettings): PutAppInstanceRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceRetentionSettings = AppInstanceRetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceRetentionSettingsRequest]
  }
  
  @scala.inline
  implicit class PutAppInstanceRetentionSettingsRequestMutableBuilder[Self <: PutAppInstanceRetentionSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceRetentionSettings(value: AppInstanceRetentionSettings): Self = StObject.set(x, "AppInstanceRetentionSettings", value.asInstanceOf[js.Any])
  }
}
