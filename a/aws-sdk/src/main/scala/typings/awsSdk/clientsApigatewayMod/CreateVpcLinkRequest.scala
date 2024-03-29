package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcLinkRequest extends StObject {
  
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name used to label and identify the VPC link.
    */
  var name: String
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner.
    */
  var targetArns: ListOfString
}
object CreateVpcLinkRequest {
  
  inline def apply(name: String, targetArns: ListOfString): CreateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcLinkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcLinkRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetArns(value: ListOfString): Self = StObject.set(x, "targetArns", value.asInstanceOf[js.Any])
    
    inline def setTargetArnsVarargs(value: String*): Self = StObject.set(x, "targetArns", js.Array(value*))
  }
}
