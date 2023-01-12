package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRelatedItemRequest extends StObject {
  
  /**
    * A unique identifier of the case.
    */
  var caseId: CaseId
  
  /**
    * The content of a related item to be created.
    */
  var content: RelatedItemInputContent
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The type of a related item.
    */
  var `type`: RelatedItemType
}
object CreateRelatedItemRequest {
  
  inline def apply(caseId: CaseId, content: RelatedItemInputContent, domainId: DomainId, `type`: RelatedItemType): CreateRelatedItemRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelatedItemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRelatedItemRequest] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setContent(value: RelatedItemInputContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RelatedItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
