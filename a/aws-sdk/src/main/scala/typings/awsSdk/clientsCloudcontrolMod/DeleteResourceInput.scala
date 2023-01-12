package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceInput extends StObject {
  
  /**
    * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request retries and new resource requests. You might retry a resource request to ensure that it was successfully received. A client token is valid for 36 hours once used. After that, a resource request with the same client token is treated as a new request. If you do not specify a client token, one is generated for inclusion in the request. For more information, see Ensuring resource operation requests are unique in the Amazon Web Services Cloud Control API User Guide.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ClientToken] = js.undefined
  
  /**
    * The identifier for the resource. You can specify the primary identifier, or any secondary identifier defined for the resource type in its resource schema. You can only specify one identifier. Primary identifiers can be specified as a string or JSON; secondary identifiers must be specified as JSON. For compound primary identifiers (that is, one that consists of multiple resource properties strung together), to specify the primary identifier as a string, list the property values in the order they are specified in the primary identifier definition, separated by |. For more information, see Identifying resources in the Amazon Web Services Cloud Control API User Guide.
    */
  var Identifier: typings.awsSdk.clientsCloudcontrolMod.Identifier
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when performing this resource operation. The role specified must have the permissions required for this operation. The necessary permissions for each event handler are defined in the  handlers  section of the resource type definition schema. If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services user credentials. For more information, see Specifying credentials in the Amazon Web Services Cloud Control API User Guide.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.RoleArn] = js.undefined
  
  /**
    * The name of the resource type.
    */
  var TypeName: typings.awsSdk.clientsCloudcontrolMod.TypeName
  
  /**
    * For private resource types, the type version to use in this resource operation. If you do not specify a resource version, CloudFormation uses the default version.
    */
  var TypeVersionId: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.TypeVersionId] = js.undefined
}
object DeleteResourceInput {
  
  inline def apply(Identifier: Identifier, TypeName: TypeName): DeleteResourceInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourceInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionId(value: TypeVersionId): Self = StObject.set(x, "TypeVersionId", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionIdUndefined: Self = StObject.set(x, "TypeVersionId", js.undefined)
  }
}
