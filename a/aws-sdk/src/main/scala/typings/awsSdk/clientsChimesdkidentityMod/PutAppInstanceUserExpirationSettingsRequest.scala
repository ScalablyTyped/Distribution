package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceUserExpirationSettingsRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: ChimeArn
  
  /**
    * Settings that control the interval after which an AppInstanceUser is automatically deleted.
    */
  var ExpirationSettings: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.ExpirationSettings] = js.undefined
}
object PutAppInstanceUserExpirationSettingsRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn): PutAppInstanceUserExpirationSettingsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceUserExpirationSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAppInstanceUserExpirationSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setExpirationSettings(value: ExpirationSettings): Self = StObject.set(x, "ExpirationSettings", value.asInstanceOf[js.Any])
    
    inline def setExpirationSettingsUndefined: Self = StObject.set(x, "ExpirationSettings", js.undefined)
  }
}
