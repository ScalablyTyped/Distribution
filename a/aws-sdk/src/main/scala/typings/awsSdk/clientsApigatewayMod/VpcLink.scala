package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcLink extends StObject {
  
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name used to label and identify the VPC link.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the VPC link. The valid values are AVAILABLE, PENDING, DELETING, or FAILED. Deploying an API will wait if the status is PENDING and will fail if the status is DELETING. 
    */
  var status: js.UndefOr[VpcLinkStatus] = js.undefined
  
  /**
    * A description about the VPC link status.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner.
    */
  var targetArns: js.UndefOr[ListOfString] = js.undefined
}
object VpcLink {
  
  inline def apply(): VpcLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcLink]
  }
  
  extension [Self <: VpcLink](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: VpcLinkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetArns(value: ListOfString): Self = StObject.set(x, "targetArns", value.asInstanceOf[js.Any])
    
    inline def setTargetArnsUndefined: Self = StObject.set(x, "targetArns", js.undefined)
    
    inline def setTargetArnsVarargs(value: String*): Self = StObject.set(x, "targetArns", js.Array(value*))
  }
}
