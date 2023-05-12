package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you. If you retry the operation with the same ClientToken, but with different parameters, the retry fails with an IdempotentParameterMismatch error.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the customer managed permission. The name must be unique within the Amazon Web Services Region.
    */
  var name: PermissionName
  
  /**
    * A string in JSON format string that contains the following elements of a resource-based policy:    Effect: must be set to ALLOW.    Action: specifies the actions that are allowed by this customer managed permission. The list must contain only actions that are supported by the specified resource type. For a list of all actions supported by each resource type, see Actions, resources, and condition keys for Amazon Web Services services in the Identity and Access Management User Guide.    Condition: (optional) specifies conditional parameters that must evaluate to true when a user attempts an action for that action to be allowed. For more information about the Condition element, see IAM policies: Condition element in the Identity and Access Management User Guide.   This template can't include either the Resource or Principal elements. Those are both filled in by RAM when it instantiates the resource-based policy on each resource shared using this managed permission. The Resource comes from the ARN of the specific resource that you are sharing. The Principal comes from the list of identities added to the resource share.
    */
  var policyTemplate: Policy
  
  /**
    * Specifies the name of the resource type that this customer managed permission applies to. The format is  &lt;service-code&gt;:&lt;resource-type&gt;  and is not case sensitive. For example, to specify an Amazon EC2 Subnet, you can use the string ec2:subnet. To see the list of valid values for this parameter, query the ListResourceTypes operation.
    */
  var resourceType: String
  
  /**
    * Specifies a list of one or more tag key and value pairs to attach to the permission.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreatePermissionRequest {
  
  inline def apply(name: PermissionName, policyTemplate: Policy, resourceType: String): CreatePermissionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], policyTemplate = policyTemplate.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: PermissionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolicyTemplate(value: Policy): Self = StObject.set(x, "policyTemplate", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
