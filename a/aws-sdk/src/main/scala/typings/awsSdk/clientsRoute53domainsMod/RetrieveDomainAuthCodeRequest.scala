package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveDomainAuthCodeRequest extends StObject {
  
  /**
    * The name of the domain that you want to get an authorization code for.
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
}
object RetrieveDomainAuthCodeRequest {
  
  inline def apply(DomainName: DomainName): RetrieveDomainAuthCodeRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveDomainAuthCodeRequest]
  }
  
  extension [Self <: RetrieveDomainAuthCodeRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
