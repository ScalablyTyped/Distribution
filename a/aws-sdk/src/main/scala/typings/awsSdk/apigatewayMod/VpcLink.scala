package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcLink extends StObject {
  
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name used to label and identify the VPC link.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The status of the VPC link. The valid values are AVAILABLE, PENDING, DELETING, or FAILED. Deploying an API will wait if the status is PENDING and will fail if the status is DELETING.
    */
  var status: js.UndefOr[VpcLinkStatus] = js.native
  
  /**
    * A description about the VPC link status.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner.
    */
  var targetArns: js.UndefOr[ListOfString] = js.native
}
object VpcLink {
  
  @scala.inline
  def apply(): VpcLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcLink]
  }
  
  @scala.inline
  implicit class VpcLinkMutableBuilder[Self <: VpcLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: VpcLinkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTargetArns(value: ListOfString): Self = StObject.set(x, "targetArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnsUndefined: Self = StObject.set(x, "targetArns", js.undefined)
    
    @scala.inline
    def setTargetArnsVarargs(value: String*): Self = StObject.set(x, "targetArns", js.Array(value :_*))
  }
}
