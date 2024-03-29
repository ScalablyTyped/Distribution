package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLunaClientRequest extends StObject {
  
  /**
    * The new certificate for the client.
    */
  var Certificate: typings.awsSdk.clientsCloudhsmMod.Certificate
  
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsSdk.clientsCloudhsmMod.ClientArn
}
object ModifyLunaClientRequest {
  
  inline def apply(Certificate: Certificate, ClientArn: ClientArn): ModifyLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], ClientArn = ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLunaClientRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyLunaClientRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
  }
}
