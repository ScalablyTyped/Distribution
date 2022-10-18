package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartElasticsearchServiceSoftwareUpdateRequest extends StObject {
  
  /**
    * The name of the domain that you want to update to the latest service software.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object StartElasticsearchServiceSoftwareUpdateRequest {
  
  inline def apply(DomainName: DomainName): StartElasticsearchServiceSoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
  }
  
  extension [Self <: StartElasticsearchServiceSoftwareUpdateRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
