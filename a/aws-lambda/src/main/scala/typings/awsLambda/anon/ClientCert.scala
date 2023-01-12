package typings.awsLambda.anon

import typings.awsLambda.commonApiGatewayMod.APIGatewayEventClientCertificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCert extends StObject {
  
  var clientCert: APIGatewayEventClientCertificate
}
object ClientCert {
  
  inline def apply(clientCert: APIGatewayEventClientCertificate): ClientCert = {
    val __obj = js.Dynamic.literal(clientCert = clientCert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCert] (val x: Self) extends AnyVal {
    
    inline def setClientCert(value: APIGatewayEventClientCertificate): Self = StObject.set(x, "clientCert", value.asInstanceOf[js.Any])
  }
}
