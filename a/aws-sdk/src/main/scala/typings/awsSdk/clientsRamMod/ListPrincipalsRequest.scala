package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalsRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to list information for only the listed principals. You can include the following values:   An Amazon Web Services account ID, for example: 123456789012    An Amazon Resoure Name (ARN) of an organization in Organizations, for example: organizations::123456789012:organization/o-exampleorgid    An ARN of an organizational unit (OU) in Organizations, for example: organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123    An ARN of an IAM role, for example: iam::123456789012:role/rolename    An ARN of an IAM user, for example: iam::123456789012user/username     Not all resource types can be shared with IAM roles and users. For more information, see Sharing with IAM roles and users in the Resource Access Manager User Guide. 
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
  
  /**
    * Specifies that you want to list principal information for the resource share with the specified Amazon Resoure Name (ARN).
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to list information for only resource shares that match the following:     SELF  – principals that your account is sharing resources with     OTHER-ACCOUNTS  – principals that are sharing resources with your account  
    */
  var resourceOwner: ResourceOwner
  
  /**
    * Specifies that you want to list information for only principals associated with the resource shares specified by a list the Amazon Resource Names (ARNs).
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * Specifies that you want to list information for only principals associated with resource shares that include the specified resource type. For a list of valid values, query the ListResourceTypes operation.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ListPrincipalsRequest {
  
  inline def apply(resourceOwner: ResourceOwner): ListPrincipalsRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalsRequest]
  }
  
  extension [Self <: ListPrincipalsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipals(value: PrincipalArnOrIdList): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: String*): Self = StObject.set(x, "principals", js.Array(value*))
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value*))
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
