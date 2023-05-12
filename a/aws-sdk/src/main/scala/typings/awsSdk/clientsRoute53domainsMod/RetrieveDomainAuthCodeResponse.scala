package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveDomainAuthCodeResponse extends StObject {
  
  /**
    * The authorization code for the domain.
    */
  var AuthCode: js.UndefOr[DomainAuthCode] = js.undefined
}
object RetrieveDomainAuthCodeResponse {
  
  inline def apply(): RetrieveDomainAuthCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveDomainAuthCodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetrieveDomainAuthCodeResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthCode(value: DomainAuthCode): Self = StObject.set(x, "AuthCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "AuthCode", js.undefined)
  }
}
