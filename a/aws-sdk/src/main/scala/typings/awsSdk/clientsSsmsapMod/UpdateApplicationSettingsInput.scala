package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsInput extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationId: typings.awsSdk.clientsSsmsapMod.ApplicationId
  
  /**
    * The credentials to be added or updated.
    */
  var CredentialsToAddOrUpdate: js.UndefOr[ApplicationCredentialList] = js.undefined
  
  /**
    * The credentials to be removed.
    */
  var CredentialsToRemove: js.UndefOr[ApplicationCredentialList] = js.undefined
}
object UpdateApplicationSettingsInput {
  
  inline def apply(ApplicationId: ApplicationId): UpdateApplicationSettingsInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCredentialsToAddOrUpdate(value: ApplicationCredentialList): Self = StObject.set(x, "CredentialsToAddOrUpdate", value.asInstanceOf[js.Any])
    
    inline def setCredentialsToAddOrUpdateUndefined: Self = StObject.set(x, "CredentialsToAddOrUpdate", js.undefined)
    
    inline def setCredentialsToAddOrUpdateVarargs(value: ApplicationCredential*): Self = StObject.set(x, "CredentialsToAddOrUpdate", js.Array(value*))
    
    inline def setCredentialsToRemove(value: ApplicationCredentialList): Self = StObject.set(x, "CredentialsToRemove", value.asInstanceOf[js.Any])
    
    inline def setCredentialsToRemoveUndefined: Self = StObject.set(x, "CredentialsToRemove", js.undefined)
    
    inline def setCredentialsToRemoveVarargs(value: ApplicationCredential*): Self = StObject.set(x, "CredentialsToRemove", js.Array(value*))
  }
}
