package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId
  
  /**
    * Allows the environment owner to turn on or turn off the Amazon Web Services managed temporary credentials for an Cloud9 environment by using one of the following values:    ENABLE     DISABLE     Only the environment owner can change the status of managed temporary credentials. An AccessDeniedException is thrown if an attempt to turn on or turn off managed temporary credentials is made by an account that's not the environment owner. 
    */
  var managedCredentialsAction: js.UndefOr[ManagedCredentialsAction] = js.undefined
  
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
}
object UpdateEnvironmentRequest {
  
  inline def apply(environmentId: EnvironmentId): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: EnvironmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setManagedCredentialsAction(value: ManagedCredentialsAction): Self = StObject.set(x, "managedCredentialsAction", value.asInstanceOf[js.Any])
    
    inline def setManagedCredentialsActionUndefined: Self = StObject.set(x, "managedCredentialsAction", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
