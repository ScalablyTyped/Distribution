package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksSecret extends StObject {
  
  /**
    * Specifies whether the secret or the secret's keys must be defined.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see DNS subdomain names in the Kubernetes documentation.
    */
  var secretName: String
}
object EksSecret {
  
  inline def apply(secretName: String): EksSecret = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksSecret]
  }
  
  extension [Self <: EksSecret](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setSecretName(value: String): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
