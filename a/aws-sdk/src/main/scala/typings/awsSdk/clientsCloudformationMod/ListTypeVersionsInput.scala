package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypeVersionsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * The deprecation status of the extension versions that you want to get summary information about. Valid values include:    LIVE: The extension version is registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The extension version has been deregistered and can no longer be used in CloudFormation operations.   The default is LIVE.
    */
  var DeprecatedStatus: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DeprecatedStatus] = js.undefined
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCloudformationMod.MaxResults] = js.undefined
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * The publisher ID of the extension publisher. Extensions published by Amazon aren't assigned a publisher ID.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
  
  /**
    * The kind of the extension. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the extension for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
}
object ListTypeVersionsInput {
  
  inline def apply(): ListTypeVersionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsInput]
  }
  
  extension [Self <: ListTypeVersionsInput](x: Self) {
    
    inline def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDeprecatedStatus(value: DeprecatedStatus): Self = StObject.set(x, "DeprecatedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedStatusUndefined: Self = StObject.set(x, "DeprecatedStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
