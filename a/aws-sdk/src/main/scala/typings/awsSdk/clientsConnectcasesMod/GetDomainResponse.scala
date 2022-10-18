package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainResponse extends StObject {
  
  /**
    * The timestamp when the Cases domain was created.
    */
  var createdTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the Cases domain.
    */
  var domainArn: DomainArn
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * The status of the Cases domain.
    */
  var domainStatus: DomainStatus
  
  /**
    * The name of the Cases domain.
    */
  var name: DomainName
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object GetDomainResponse {
  
  inline def apply(
    createdTime: js.Date,
    domainArn: DomainArn,
    domainId: DomainId,
    domainStatus: DomainStatus,
    name: DomainName
  ): GetDomainResponse = {
    val __obj = js.Dynamic.literal(createdTime = createdTime.asInstanceOf[js.Any], domainArn = domainArn.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainResponse]
  }
  
  extension [Self <: GetDomainResponse](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDomainArn(value: DomainArn): Self = StObject.set(x, "domainArn", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
