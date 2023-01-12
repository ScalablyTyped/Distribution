package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsConfigInput extends StObject {
  
  /**
    * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
    */
  var ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
}
object TlsConfigInput {
  
  inline def apply(): TlsConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TlsConfigInput] (val x: Self) extends AnyVal {
    
    inline def setServerNameToVerify(value: StringWithLengthBetween1And512): Self = StObject.set(x, "ServerNameToVerify", value.asInstanceOf[js.Any])
    
    inline def setServerNameToVerifyUndefined: Self = StObject.set(x, "ServerNameToVerify", js.undefined)
  }
}
