package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyResponse extends StObject {
  
  /**
    * The ARN of the secret that the resource-based policy was deleted for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret that the resource-based policy was deleted for.
    */
  var Name: js.UndefOr[NameType] = js.undefined
}
object DeleteResourcePolicyResponse {
  
  inline def apply(): DeleteResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyResponse]
  }
  
  extension [Self <: DeleteResourcePolicyResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: NameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
