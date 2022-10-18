package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * The name of the domain to create. The name can range between 3 and 255 characters and can contain the following characters: a-z, A-Z, 0-9, '_', '-', and '.'.
    */
  var DomainName: String
}
object CreateDomainRequest {
  
  inline def apply(DomainName: String): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  extension [Self <: CreateDomainRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
