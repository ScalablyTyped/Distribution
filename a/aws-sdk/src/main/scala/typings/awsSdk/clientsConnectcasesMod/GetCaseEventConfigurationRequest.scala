package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCaseEventConfigurationRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
}
object GetCaseEventConfigurationRequest {
  
  inline def apply(domainId: DomainId): GetCaseEventConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCaseEventConfigurationRequest]
  }
  
  extension [Self <: GetCaseEventConfigurationRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
  }
}
