package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypesInput extends StObject {
  
  /**
    * The deprecation status of the extension that you want to get summary information about. Valid values include:    LIVE: The extension is registered for use in CloudFormation operations.    DEPRECATED: The extension has been deregistered and can no longer be used in CloudFormation operations.  
    */
  var DeprecatedStatus: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DeprecatedStatus] = js.undefined
  
  /**
    * Filter criteria to use in determining which extensions to return. Filters must be compatible with Visibility to return valid results. For example, specifying AWS_TYPES for Category and PRIVATE for Visibility returns an empty list of types, but specifying PUBLIC for Visibility returns the desired list.
    */
  var Filters: js.UndefOr[TypeFilters] = js.undefined
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCloudformationMod.MaxResults] = js.undefined
  
  /**
    * If the previous paginated request didn't return all the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * For resource types, the provisioning behavior of the resource type. CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted. Valid values include:    FULLY_MUTABLE: The resource type includes an update handler to process updates to the type during stack update operations.    IMMUTABLE: The resource type doesn't include an update handler, so the type can't be updated and must instead be replaced during stack update operations.    NON_PROVISIONABLE: The resource type doesn't include create, read, and delete handlers, and therefore can't actually be provisioned.   The default is FULLY_MUTABLE.
    */
  var ProvisioningType: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ProvisioningType] = js.undefined
  
  /**
    * The type of extension.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The scope at which the extensions are visible and usable in CloudFormation operations. Valid values include:    PRIVATE: Extensions that are visible and usable within this account and region. This includes:   Private extensions you have registered in this account and region.   Public extensions that you have activated in this account and region.      PUBLIC: Extensions that are publicly visible and available to be activated within any Amazon Web Services account. This includes extensions from Amazon Web Services, in addition to third-party publishers.   The default is PRIVATE.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Visibility] = js.undefined
}
object ListTypesInput {
  
  inline def apply(): ListTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTypesInput] (val x: Self) extends AnyVal {
    
    inline def setDeprecatedStatus(value: DeprecatedStatus): Self = StObject.set(x, "DeprecatedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedStatusUndefined: Self = StObject.set(x, "DeprecatedStatus", js.undefined)
    
    inline def setFilters(value: TypeFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProvisioningType(value: ProvisioningType): Self = StObject.set(x, "ProvisioningType", value.asInstanceOf[js.Any])
    
    inline def setProvisioningTypeUndefined: Self = StObject.set(x, "ProvisioningType", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
