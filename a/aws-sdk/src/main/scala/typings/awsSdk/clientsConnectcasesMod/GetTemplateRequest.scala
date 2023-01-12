package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object GetTemplateRequest {
  
  inline def apply(domainId: DomainId, templateId: TemplateId): GetTemplateRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
