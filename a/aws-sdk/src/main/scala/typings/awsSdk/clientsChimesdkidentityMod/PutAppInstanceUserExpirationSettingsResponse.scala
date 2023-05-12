package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAppInstanceUserExpirationSettingsResponse extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * Settings that control the interval after which an AppInstanceUser is automatically deleted.
    */
  var ExpirationSettings: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.ExpirationSettings] = js.undefined
}
object PutAppInstanceUserExpirationSettingsResponse {
  
  inline def apply(): PutAppInstanceUserExpirationSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceUserExpirationSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAppInstanceUserExpirationSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setExpirationSettings(value: ExpirationSettings): Self = StObject.set(x, "ExpirationSettings", value.asInstanceOf[js.Any])
    
    inline def setExpirationSettingsUndefined: Self = StObject.set(x, "ExpirationSettings", js.undefined)
  }
}
