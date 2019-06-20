package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupsTaggingAPI
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ResourceGroupsTaggingAPI: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the policy that is attached to the specified organization root or account. You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def deleteTagPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTagPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the policy that is attached to the specified organization root or account. You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def deleteTagPolicy(params: DeleteTagPolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTagPolicy(
    params: DeleteTagPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the status of the StartReportCreation operation.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def describeReportCreation(): awsDashSdkLib.libRequestMod.Request[DescribeReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReportCreation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReportCreationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the status of the StartReportCreation operation.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def describeReportCreation(params: DescribeReportCreationInput): awsDashSdkLib.libRequestMod.Request[DescribeReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeReportCreation(
    params: DescribeReportCreationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeReportCreationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables tag policies for your organization and deletes all tag policies. You can call this operation from the organization's master account only and from the us-east-1 Region only.   Use caution when disabling tag policies, as this is a destructive operation that applies to your entire organization. You cannot undo this operation. 
    */
  def disableTagPolicies(): awsDashSdkLib.libRequestMod.Request[DisableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableTagPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableTagPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables tag policies for your organization and deletes all tag policies. You can call this operation from the organization's master account only and from the us-east-1 Region only.   Use caution when disabling tag policies, as this is a destructive operation that applies to your entire organization. You cannot undo this operation. 
    */
  def disableTagPolicies(params: DisableTagPoliciesInput): awsDashSdkLib.libRequestMod.Request[DisableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableTagPolicies(
    params: DisableTagPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableTagPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables tag policies for your organization. To use tag policies, you must be using AWS Organizations with all features enabled.  You can call this operation from the organization's master account only and from the us-east-1 Region only.  This operation does the following:   Enables tag policies for the specified organization.   Calls the EnableAWSServiceAccess API on your behalf to allow service access with the tagpolicies.tag.amazonaws.com service principal.   Creates a service-linked role named AWSServiceRoleForTagPolicies.    For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide. 
    */
  def enableTagPolicies(): awsDashSdkLib.libRequestMod.Request[EnableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableTagPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableTagPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables tag policies for your organization. To use tag policies, you must be using AWS Organizations with all features enabled.  You can call this operation from the organization's master account only and from the us-east-1 Region only.  This operation does the following:   Enables tag policies for the specified organization.   Calls the EnableAWSServiceAccess API on your behalf to allow service access with the tagpolicies.tag.amazonaws.com service principal.   Creates a service-linked role named AWSServiceRoleForTagPolicies.    For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide. 
    */
  def enableTagPolicies(params: EnableTagPoliciesInput): awsDashSdkLib.libRequestMod.Request[EnableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableTagPolicies(
    params: EnableTagPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableTagPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableTagPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a table that shows counts of resources that are noncompliant with their tag policies. For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def getComplianceSummary(): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getComplianceSummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetComplianceSummaryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a table that shows counts of resources that are noncompliant with their tag policies. For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def getComplianceSummary(params: GetComplianceSummaryInput): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getComplianceSummary(
    params: GetComplianceSummaryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetComplianceSummaryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the contents of the effective tag policy for the AWS account. Depending on how you use tag policies, the effective tag policy for an account is one of the following:   The tag policy attached to the organization that the account belongs to.   The tag policy attached to the account.   The combination of both policies if tag policies are attached to the organization root and account.  
    */
  def getEffectiveTagPolicy(): awsDashSdkLib.libRequestMod.Request[GetEffectiveTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEffectiveTagPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEffectiveTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEffectiveTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the contents of the effective tag policy for the AWS account. Depending on how you use tag policies, the effective tag policy for an account is one of the following:   The tag policy attached to the organization that the account belongs to.   The tag policy attached to the account.   The combination of both policies if tag policies are attached to the organization root and account.  
    */
  def getEffectiveTagPolicy(params: GetEffectiveTagPolicyInput): awsDashSdkLib.libRequestMod.Request[GetEffectiveTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEffectiveTagPolicy(
    params: GetEffectiveTagPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEffectiveTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEffectiveTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified Region for the AWS account. Depending on what information you want returned, you can also specify the following:    Filters that specify what tags and resource types you want returned. The response includes all tags that are associated with the requested resources.   Information about compliance with tag policies. If supplied, the compliance check follows the specified tag policy instead of following the effective tag policy. For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide.     You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified Region for the AWS account. Depending on what information you want returned, you can also specify the following:    Filters that specify what tags and resource types you want returned. The response includes all tags that are associated with the requested resources.   Information about compliance with tag policies. If supplied, the compliance check follows the specified tag policy instead of following the effective tag policy. For more information on tag policies, see Tag Policies in the AWS Resource Groups User Guide.     You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(params: GetResourcesInput): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    params: GetResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tag keys in the specified Region for the AWS account.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getTagKeys(): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagKeysOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tag keys in the specified Region for the AWS account.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getTagKeys(params: GetTagKeysInput): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagKeys(
    params: GetTagKeysInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagKeysOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the policy that is attached to the specified target.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def getTagPolicy(): awsDashSdkLib.libRequestMod.Request[GetTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the policy that is attached to the specified target.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def getTagPolicy(params: GetTagPolicyInput): awsDashSdkLib.libRequestMod.Request[GetTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagPolicy(
    params: GetTagPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tag values for the specified key in the specified Region for the AWS account.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getTagValues(): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagValues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagValuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all tag values for the specified key in the specified Region for the AWS account.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getTagValues(params: GetTagValuesInput): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTagValues(
    params: GetTagValuesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagValuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Validates the tag policy and then attaches it to the account or organization root. This policy determines whether a resource is compliant. Validating the tag policy includes checking that the tag policy document includes the required components, uses JSON syntax, and has fewer than 5,000 characters (including spaces). For more information, see Tag Policy Structure in the AWS Resource Groups User Guide.   If you later call this operation to attach a tag policy to the same organization root or account, it overwrites the original call without prompting you to confirm.  You can call this operation from the organization's master account only, and from the us-east-1 Region only. 
    */
  def putTagPolicy(): awsDashSdkLib.libRequestMod.Request[PutTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTagPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Validates the tag policy and then attaches it to the account or organization root. This policy determines whether a resource is compliant. Validating the tag policy includes checking that the tag policy document includes the required components, uses JSON syntax, and has fewer than 5,000 characters (including spaces). For more information, see Tag Policy Structure in the AWS Resource Groups User Guide.   If you later call this operation to attach a tag policy to the same organization root or account, it overwrites the original call without prompting you to confirm.  You can call this operation from the organization's master account only, and from the us-east-1 Region only. 
    */
  def putTagPolicy(params: PutTagPolicyInput): awsDashSdkLib.libRequestMod.Request[PutTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTagPolicy(
    params: PutTagPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTagPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTagPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a report that lists all tagged resources in accounts across your organization, and whether each resource is compliant with the effective tag policy.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def startReportCreation(): awsDashSdkLib.libRequestMod.Request[StartReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReportCreation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReportCreationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a report that lists all tagged resources in accounts across your organization, and whether each resource is compliant with the effective tag policy.  You can call this operation from the organization's master account only and from the us-east-1 Region only. 
    */
  def startReportCreation(params: StartReportCreationInput): awsDashSdkLib.libRequestMod.Request[StartReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startReportCreation(
    params: StartReportCreationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartReportCreationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartReportCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see this list.   Each resource can have up to 50 tags.    You can only tag resources that are located in the specified Region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Set Up Permissions in the AWS Resource Groups User Guide.   
    */
  def tagResources(): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see this list.   Each resource can have up to 50 tags.    You can only tag resources that are located in the specified Region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Set Up Permissions in the AWS Resource Groups User Guide.   
    */
  def tagResources(params: TagResourcesInput): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResources(
    params: TagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Set Up Permissions in the AWS Resource Groups User Guide.    You can only tag resources that are located in the specified Region for the AWS account.  
    */
  def untagResources(): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Set Up Permissions in the AWS Resource Groups User Guide.    You can only tag resources that are located in the specified Region for the AWS account.  
    */
  def untagResources(params: UntagResourcesInput): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResources(
    params: UntagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

