package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchTemplateVersionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    create-time - The time the launch template version was created.    ebs-optimized - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.    http-endpoint - Indicates whether the HTTP metadata endpoint on your instances is enabled (enabled | disabled).    http-protocol-ipv4 - Indicates whether the IPv4 endpoint for the instance metadata service is enabled (enabled | disabled).    host-resource-group-arn - The ARN of the host resource group in which to launch the instances.    http-tokens - The state of token usage for your instance metadata requests (optional | required).    iam-instance-profile - The ARN of the IAM instance profile.    image-id - The ID of the AMI.    instance-type - The instance type.    is-default-version - A boolean that indicates whether the launch template version is the default version.    kernel-id - The kernel ID.    license-configuration-arn - The ARN of the license configuration.    network-card-index - The index of the network card.    ram-disk-id - The RAM disk ID.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The ID of the launch template. To describe one or more versions of a specified launch template, you must specify either the LaunchTemplateId or the LaunchTemplateName, but not both. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. To describe one or more versions of a specified launch template, you must specify either the LaunchTemplateName or the LaunchTemplateId, but not both. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The version number up to which to describe launch template versions.
    */
  var MaxVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The version number after which to describe launch template versions.
    */
  var MinVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * If true, and if a Systems Manager parameter is specified for ImageId, the AMI ID is displayed in the response for imageId. If false, and if a Systems Manager parameter is specified for ImageId, the parameter is displayed in the response for imageId.  For more information, see Use a Systems Manager parameter instead of an AMI ID in the Amazon Elastic Compute Cloud User Guide. Default: false 
    */
  var ResolveAlias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more versions of the launch template. Valid values depend on whether you are describing a specified launch template (by ID or name) or all launch templates in your account. To describe one or more versions of a specified launch template, valid values are $Latest, $Default, and numbers. To describe all launch templates in your account that are defined as the latest version, the valid value is $Latest. To describe all launch templates in your account that are defined as the default version, the valid value is $Default. You can specify $Latest and $Default in the same request. You cannot specify numbers.
    */
  var Versions: js.UndefOr[VersionStringList] = js.undefined
}
object DescribeLaunchTemplateVersionsRequest {
  
  inline def apply(): DescribeLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLaunchTemplateVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMaxVersion(value: String): Self = StObject.set(x, "MaxVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionUndefined: Self = StObject.set(x, "MaxVersion", js.undefined)
    
    inline def setMinVersion(value: String): Self = StObject.set(x, "MinVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "MinVersion", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolveAlias(value: Boolean): Self = StObject.set(x, "ResolveAlias", value.asInstanceOf[js.Any])
    
    inline def setResolveAliasUndefined: Self = StObject.set(x, "ResolveAlias", js.undefined)
    
    inline def setVersions(value: VersionStringList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
