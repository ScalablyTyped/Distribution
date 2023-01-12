package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMetadataRequest extends StObject {
  
  /**
    * The name of the domain for which to display the metadata of.
    */
  var DomainName: String
}
object DomainMetadataRequest {
  
  inline def apply(DomainName: String): DomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
