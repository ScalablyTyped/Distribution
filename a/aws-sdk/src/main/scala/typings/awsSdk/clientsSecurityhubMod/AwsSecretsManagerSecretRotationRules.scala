package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSecretsManagerSecretRotationRules extends StObject {
  
  /**
    * The number of days after the previous rotation to rotate the secret.
    */
  var AutomaticallyAfterDays: js.UndefOr[Integer] = js.undefined
}
object AwsSecretsManagerSecretRotationRules {
  
  inline def apply(): AwsSecretsManagerSecretRotationRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecretsManagerSecretRotationRules]
  }
  
  extension [Self <: AwsSecretsManagerSecretRotationRules](x: Self) {
    
    inline def setAutomaticallyAfterDays(value: Integer): Self = StObject.set(x, "AutomaticallyAfterDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAfterDaysUndefined: Self = StObject.set(x, "AutomaticallyAfterDays", js.undefined)
  }
}
