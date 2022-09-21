package typings.awsLambda.anon

import typings.awsLambda.apiGatewayMod.APIGatewayEventClientCertificate
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
  
  extension [Self <: ClientCert](x: Self) {
    
    inline def setClientCert(value: APIGatewayEventClientCertificate): Self = StObject.set(x, "clientCert", value.asInstanceOf[js.Any])
  }
}
