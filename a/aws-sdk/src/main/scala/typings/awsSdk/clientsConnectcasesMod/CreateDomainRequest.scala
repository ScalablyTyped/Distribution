package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * The name for your Cases domain. It must be unique for your Amazon Web Services account.
    */
  var name: DomainName
}
object CreateDomainRequest {
  
  inline def apply(name: DomainName): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
