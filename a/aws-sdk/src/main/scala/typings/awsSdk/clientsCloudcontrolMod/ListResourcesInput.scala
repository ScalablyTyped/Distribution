package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesInput extends StObject {
  
  /**
    * Reserved.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.MaxResults] = js.undefined
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[HandlerNextToken] = js.undefined
  
  /**
    * The resource model to use to select the resources to return.
    */
  var ResourceModel: js.UndefOr[Properties] = js.undefined
  
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
object ListResourcesInput {
  
  inline def apply(TypeName: TypeName): ListResourcesInput = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourcesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: HandlerNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceModel(value: Properties): Self = StObject.set(x, "ResourceModel", value.asInstanceOf[js.Any])
    
    inline def setResourceModelUndefined: Self = StObject.set(x, "ResourceModel", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionId(value: TypeVersionId): Self = StObject.set(x, "TypeVersionId", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionIdUndefined: Self = StObject.set(x, "TypeVersionId", js.undefined)
  }
}
