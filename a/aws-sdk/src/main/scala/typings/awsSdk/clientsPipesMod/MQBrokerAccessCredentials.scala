package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MQBrokerAccessCredentials extends StObject {
  
  /**
    * The ARN of the Secrets Manager secret.
    */
  var BasicAuth: js.UndefOr[SecretManagerArn] = js.undefined
}
object MQBrokerAccessCredentials {
  
  inline def apply(): MQBrokerAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MQBrokerAccessCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MQBrokerAccessCredentials] (val x: Self) extends AnyVal {
    
    inline def setBasicAuth(value: SecretManagerArn): Self = StObject.set(x, "BasicAuth", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthUndefined: Self = StObject.set(x, "BasicAuth", js.undefined)
  }
}
