package typings.awsSdk.clientsInspector2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'EC2' | 'ECR' | string */ @js.native
trait Inspector2 extends StObject {
  
  /**
    * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
    */
  def associateMember(): Request[AssociateMemberResponse, AWSError] = js.native
  def associateMember(callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberResponse, Unit]): Request[AssociateMemberResponse, AWSError] = js.native
  /**
    * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
    */
  def associateMember(params: AssociateMemberRequest): Request[AssociateMemberResponse, AWSError] = js.native
  def associateMember(
    params: AssociateMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateMemberResponse, Unit]
  ): Request[AssociateMemberResponse, AWSError] = js.native
  
  /**
    * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
    */
  def batchGetAccountStatus(): Request[BatchGetAccountStatusResponse, AWSError] = js.native
  def batchGetAccountStatus(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAccountStatusResponse, Unit]): Request[BatchGetAccountStatusResponse, AWSError] = js.native
  /**
    * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
    */
  def batchGetAccountStatus(params: BatchGetAccountStatusRequest): Request[BatchGetAccountStatusResponse, AWSError] = js.native
  def batchGetAccountStatus(
    params: BatchGetAccountStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAccountStatusResponse, Unit]
  ): Request[BatchGetAccountStatusResponse, AWSError] = js.native
  
  /**
    * Gets free trial status for multiple Amazon Web Services accounts.
    */
  def batchGetFreeTrialInfo(): Request[BatchGetFreeTrialInfoResponse, AWSError] = js.native
  def batchGetFreeTrialInfo(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFreeTrialInfoResponse, Unit]): Request[BatchGetFreeTrialInfoResponse, AWSError] = js.native
  /**
    * Gets free trial status for multiple Amazon Web Services accounts.
    */
  def batchGetFreeTrialInfo(params: BatchGetFreeTrialInfoRequest): Request[BatchGetFreeTrialInfoResponse, AWSError] = js.native
  def batchGetFreeTrialInfo(
    params: BatchGetFreeTrialInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFreeTrialInfoResponse, Unit]
  ): Request[BatchGetFreeTrialInfoResponse, AWSError] = js.native
  
  /**
    * Cancels the given findings report.
    */
  def cancelFindingsReport(): Request[CancelFindingsReportResponse, AWSError] = js.native
  def cancelFindingsReport(callback: js.Function2[/* err */ AWSError, /* data */ CancelFindingsReportResponse, Unit]): Request[CancelFindingsReportResponse, AWSError] = js.native
  /**
    * Cancels the given findings report.
    */
  def cancelFindingsReport(params: CancelFindingsReportRequest): Request[CancelFindingsReportResponse, AWSError] = js.native
  def cancelFindingsReport(
    params: CancelFindingsReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelFindingsReportResponse, Unit]
  ): Request[CancelFindingsReportResponse, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a filter resource using specified filter criteria.
    */
  def createFilter(): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]): Request[CreateFilterResponse, AWSError] = js.native
  /**
    * Creates a filter resource using specified filter criteria.
    */
  def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(
    params: CreateFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]
  ): Request[CreateFilterResponse, AWSError] = js.native
  
  /**
    * Creates a finding report.
    */
  def createFindingsReport(): Request[CreateFindingsReportResponse, AWSError] = js.native
  def createFindingsReport(callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingsReportResponse, Unit]): Request[CreateFindingsReportResponse, AWSError] = js.native
  /**
    * Creates a finding report.
    */
  def createFindingsReport(params: CreateFindingsReportRequest): Request[CreateFindingsReportResponse, AWSError] = js.native
  def createFindingsReport(
    params: CreateFindingsReportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFindingsReportResponse, Unit]
  ): Request[CreateFindingsReportResponse, AWSError] = js.native
  
  /**
    * Deletes a filter resource.
    */
  def deleteFilter(): Request[DeleteFilterResponse, AWSError] = js.native
  def deleteFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFilterResponse, Unit]): Request[DeleteFilterResponse, AWSError] = js.native
  /**
    * Deletes a filter resource.
    */
  def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse, AWSError] = js.native
  def deleteFilter(
    params: DeleteFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFilterResponse, Unit]
  ): Request[DeleteFilterResponse, AWSError] = js.native
  
  /**
    * Describe Amazon Inspector configuration settings for an Amazon Web Services organization
    */
  def describeOrganizationConfiguration(): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Describe Amazon Inspector configuration settings for an Amazon Web Services organization
    */
  def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  def describeOrganizationConfiguration(
    params: DescribeOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigurationResponse, Unit]
  ): Request[DescribeOrganizationConfigurationResponse, AWSError] = js.native
  
  /**
    * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an account disables the Amazon Inspector service.
    */
  def disable(): Request[DisableResponse, AWSError] = js.native
  def disable(callback: js.Function2[/* err */ AWSError, /* data */ DisableResponse, Unit]): Request[DisableResponse, AWSError] = js.native
  /**
    * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an account disables the Amazon Inspector service.
    */
  def disable(params: DisableRequest): Request[DisableResponse, AWSError] = js.native
  def disable(
    params: DisableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableResponse, Unit]
  ): Request[DisableResponse, AWSError] = js.native
  
  /**
    * Disables the Amazon Inspector delegated administrator for your organization.
    */
  def disableDelegatedAdminAccount(): Request[DisableDelegatedAdminAccountResponse, AWSError] = js.native
  def disableDelegatedAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ DisableDelegatedAdminAccountResponse, Unit]): Request[DisableDelegatedAdminAccountResponse, AWSError] = js.native
  /**
    * Disables the Amazon Inspector delegated administrator for your organization.
    */
  def disableDelegatedAdminAccount(params: DisableDelegatedAdminAccountRequest): Request[DisableDelegatedAdminAccountResponse, AWSError] = js.native
  def disableDelegatedAdminAccount(
    params: DisableDelegatedAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableDelegatedAdminAccountResponse, Unit]
  ): Request[DisableDelegatedAdminAccountResponse, AWSError] = js.native
  
  /**
    * Disassociates a member account from an Amazon Inspector delegated administrator.
    */
  def disassociateMember(): Request[DisassociateMemberResponse, AWSError] = js.native
  def disassociateMember(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberResponse, Unit]): Request[DisassociateMemberResponse, AWSError] = js.native
  /**
    * Disassociates a member account from an Amazon Inspector delegated administrator.
    */
  def disassociateMember(params: DisassociateMemberRequest): Request[DisassociateMemberResponse, AWSError] = js.native
  def disassociateMember(
    params: DisassociateMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMemberResponse, Unit]
  ): Request[DisassociateMemberResponse, AWSError] = js.native
  
  /**
    * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
    */
  def enable(): Request[EnableResponse, AWSError] = js.native
  def enable(callback: js.Function2[/* err */ AWSError, /* data */ EnableResponse, Unit]): Request[EnableResponse, AWSError] = js.native
  /**
    * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
    */
  def enable(params: EnableRequest): Request[EnableResponse, AWSError] = js.native
  def enable(params: EnableRequest, callback: js.Function2[/* err */ AWSError, /* data */ EnableResponse, Unit]): Request[EnableResponse, AWSError] = js.native
  
  /**
    * Enables the Amazon Inspector delegated administrator for your Organizations organization.
    */
  def enableDelegatedAdminAccount(): Request[EnableDelegatedAdminAccountResponse, AWSError] = js.native
  def enableDelegatedAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ EnableDelegatedAdminAccountResponse, Unit]): Request[EnableDelegatedAdminAccountResponse, AWSError] = js.native
  /**
    * Enables the Amazon Inspector delegated administrator for your Organizations organization.
    */
  def enableDelegatedAdminAccount(params: EnableDelegatedAdminAccountRequest): Request[EnableDelegatedAdminAccountResponse, AWSError] = js.native
  def enableDelegatedAdminAccount(
    params: EnableDelegatedAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableDelegatedAdminAccountResponse, Unit]
  ): Request[EnableDelegatedAdminAccountResponse, AWSError] = js.native
  
  /**
    * Retrieves setting configurations for Inspector scans.
    */
  def getConfiguration(): Request[GetConfigurationResponse, AWSError] = js.native
  def getConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationResponse, Unit]): Request[GetConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves setting configurations for Inspector scans.
    */
  def getConfiguration(params: GetConfigurationRequest): Request[GetConfigurationResponse, AWSError] = js.native
  def getConfiguration(
    params: GetConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationResponse, Unit]
  ): Request[GetConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the Amazon Inspector delegated administrator for your organization.
    */
  def getDelegatedAdminAccount(): Request[GetDelegatedAdminAccountResponse, AWSError] = js.native
  def getDelegatedAdminAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetDelegatedAdminAccountResponse, Unit]): Request[GetDelegatedAdminAccountResponse, AWSError] = js.native
  /**
    * Retrieves information about the Amazon Inspector delegated administrator for your organization.
    */
  def getDelegatedAdminAccount(params: GetDelegatedAdminAccountRequest): Request[GetDelegatedAdminAccountResponse, AWSError] = js.native
  def getDelegatedAdminAccount(
    params: GetDelegatedAdminAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDelegatedAdminAccountResponse, Unit]
  ): Request[GetDelegatedAdminAccountResponse, AWSError] = js.native
  
  /**
    * Gets the status of a findings report.
    */
  def getFindingsReportStatus(): Request[GetFindingsReportStatusResponse, AWSError] = js.native
  def getFindingsReportStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsReportStatusResponse, Unit]): Request[GetFindingsReportStatusResponse, AWSError] = js.native
  /**
    * Gets the status of a findings report.
    */
  def getFindingsReportStatus(params: GetFindingsReportStatusRequest): Request[GetFindingsReportStatusResponse, AWSError] = js.native
  def getFindingsReportStatus(
    params: GetFindingsReportStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsReportStatusResponse, Unit]
  ): Request[GetFindingsReportStatusResponse, AWSError] = js.native
  
  /**
    * Gets member information for your organization.
    */
  def getMember(): Request[GetMemberResponse, AWSError] = js.native
  def getMember(callback: js.Function2[/* err */ AWSError, /* data */ GetMemberResponse, Unit]): Request[GetMemberResponse, AWSError] = js.native
  /**
    * Gets member information for your organization.
    */
  def getMember(params: GetMemberRequest): Request[GetMemberResponse, AWSError] = js.native
  def getMember(
    params: GetMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMemberResponse, Unit]
  ): Request[GetMemberResponse, AWSError] = js.native
  
  /**
    * Lists the permissions an account has to configure Amazon Inspector.
    */
  def listAccountPermissions(): Request[ListAccountPermissionsResponse, AWSError] = js.native
  def listAccountPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountPermissionsResponse, Unit]): Request[ListAccountPermissionsResponse, AWSError] = js.native
  /**
    * Lists the permissions an account has to configure Amazon Inspector.
    */
  def listAccountPermissions(params: ListAccountPermissionsRequest): Request[ListAccountPermissionsResponse, AWSError] = js.native
  def listAccountPermissions(
    params: ListAccountPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountPermissionsResponse, Unit]
  ): Request[ListAccountPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists coverage details for you environment.
    */
  def listCoverage(): Request[ListCoverageResponse, AWSError] = js.native
  def listCoverage(callback: js.Function2[/* err */ AWSError, /* data */ ListCoverageResponse, Unit]): Request[ListCoverageResponse, AWSError] = js.native
  /**
    * Lists coverage details for you environment.
    */
  def listCoverage(params: ListCoverageRequest): Request[ListCoverageResponse, AWSError] = js.native
  def listCoverage(
    params: ListCoverageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoverageResponse, Unit]
  ): Request[ListCoverageResponse, AWSError] = js.native
  
  /**
    * Lists Amazon Inspector coverage statistics for your environment.
    */
  def listCoverageStatistics(): Request[ListCoverageStatisticsResponse, AWSError] = js.native
  def listCoverageStatistics(callback: js.Function2[/* err */ AWSError, /* data */ ListCoverageStatisticsResponse, Unit]): Request[ListCoverageStatisticsResponse, AWSError] = js.native
  /**
    * Lists Amazon Inspector coverage statistics for your environment.
    */
  def listCoverageStatistics(params: ListCoverageStatisticsRequest): Request[ListCoverageStatisticsResponse, AWSError] = js.native
  def listCoverageStatistics(
    params: ListCoverageStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoverageStatisticsResponse, Unit]
  ): Request[ListCoverageStatisticsResponse, AWSError] = js.native
  
  /**
    * Lists information about the Amazon Inspector delegated administrator of your organization.
    */
  def listDelegatedAdminAccounts(): Request[ListDelegatedAdminAccountsResponse, AWSError] = js.native
  def listDelegatedAdminAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListDelegatedAdminAccountsResponse, Unit]): Request[ListDelegatedAdminAccountsResponse, AWSError] = js.native
  /**
    * Lists information about the Amazon Inspector delegated administrator of your organization.
    */
  def listDelegatedAdminAccounts(params: ListDelegatedAdminAccountsRequest): Request[ListDelegatedAdminAccountsResponse, AWSError] = js.native
  def listDelegatedAdminAccounts(
    params: ListDelegatedAdminAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDelegatedAdminAccountsResponse, Unit]
  ): Request[ListDelegatedAdminAccountsResponse, AWSError] = js.native
  
  /**
    * Lists the filters associated with your account.
    */
  def listFilters(): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]): Request[ListFiltersResponse, AWSError] = js.native
  /**
    * Lists the filters associated with your account.
    */
  def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(
    params: ListFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]
  ): Request[ListFiltersResponse, AWSError] = js.native
  
  /**
    * Lists aggregated finding data for your environment based on specific criteria.
    */
  def listFindingAggregations(): Request[ListFindingAggregationsResponse, AWSError] = js.native
  def listFindingAggregations(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingAggregationsResponse, Unit]): Request[ListFindingAggregationsResponse, AWSError] = js.native
  /**
    * Lists aggregated finding data for your environment based on specific criteria.
    */
  def listFindingAggregations(params: ListFindingAggregationsRequest): Request[ListFindingAggregationsResponse, AWSError] = js.native
  def listFindingAggregations(
    params: ListFindingAggregationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingAggregationsResponse, Unit]
  ): Request[ListFindingAggregationsResponse, AWSError] = js.native
  
  /**
    * Lists findings for your environment.
    */
  def listFindings(): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]): Request[ListFindingsResponse, AWSError] = js.native
  /**
    * Lists findings for your environment.
    */
  def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]
  ): Request[ListFindingsResponse, AWSError] = js.native
  
  /**
    * List members associated with the Amazon Inspector delegated administrator for your organization.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * List members associated with the Amazon Inspector delegated administrator for your organization.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  
  /**
    * Lists all tags attached to a given resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags attached to a given resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Inspector usage totals over the last 30 days.
    */
  def listUsageTotals(): Request[ListUsageTotalsResponse, AWSError] = js.native
  def listUsageTotals(callback: js.Function2[/* err */ AWSError, /* data */ ListUsageTotalsResponse, Unit]): Request[ListUsageTotalsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Inspector usage totals over the last 30 days.
    */
  def listUsageTotals(params: ListUsageTotalsRequest): Request[ListUsageTotalsResponse, AWSError] = js.native
  def listUsageTotals(
    params: ListUsageTotalsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsageTotalsResponse, Unit]
  ): Request[ListUsageTotalsResponse, AWSError] = js.native
  
  /**
    * Adds tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization cannot update this setting.
    */
  def updateConfiguration(): Request[UpdateConfigurationResponse, AWSError] = js.native
  def updateConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationResponse, Unit]): Request[UpdateConfigurationResponse, AWSError] = js.native
  /**
    * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization cannot update this setting.
    */
  def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse, AWSError] = js.native
  def updateConfiguration(
    params: UpdateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationResponse, Unit]
  ): Request[UpdateConfigurationResponse, AWSError] = js.native
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  def updateFilter(): Request[UpdateFilterResponse, AWSError] = js.native
  def updateFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFilterResponse, Unit]): Request[UpdateFilterResponse, AWSError] = js.native
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse, AWSError] = js.native
  def updateFilter(
    params: UpdateFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFilterResponse, Unit]
  ): Request[UpdateFilterResponse, AWSError] = js.native
  
  /**
    * Updates the configurations for your Amazon Inspector organization.
    */
  def updateOrganizationConfiguration(): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  /**
    * Updates the configurations for your Amazon Inspector organization.
    */
  def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
  def updateOrganizationConfiguration(
    params: UpdateOrganizationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOrganizationConfigurationResponse, Unit]
  ): Request[UpdateOrganizationConfigurationResponse, AWSError] = js.native
}
