package typings.awsDashSdk.clientsGuarddutyMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardDuty extends Service {
  var config: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the invitation to be monitored by a master GuardDuty account.
    */
  def acceptInvitation(): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * Accepts the invitation to be monitored by a master GuardDuty account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]
  ): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * Archives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def archiveFindings(): Request[ArchiveFindingsResponse, AWSError] = js.native
  def archiveFindings(callback: js.Function2[/* err */ AWSError, /* data */ ArchiveFindingsResponse, Unit]): Request[ArchiveFindingsResponse, AWSError] = js.native
  /**
    * Archives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def archiveFindings(params: ArchiveFindingsRequest): Request[ArchiveFindingsResponse, AWSError] = js.native
  def archiveFindings(
    params: ArchiveFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ArchiveFindingsResponse, Unit]
  ): Request[ArchiveFindingsResponse, AWSError] = js.native
  /**
    * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
    */
  def createDetector(): Request[CreateDetectorResponse, AWSError] = js.native
  def createDetector(callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorResponse, Unit]): Request[CreateDetectorResponse, AWSError] = js.native
  /**
    * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
    */
  def createDetector(params: CreateDetectorRequest): Request[CreateDetectorResponse, AWSError] = js.native
  def createDetector(
    params: CreateDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorResponse, Unit]
  ): Request[CreateDetectorResponse, AWSError] = js.native
  /**
    * Creates a filter using the specified finding criteria.
    */
  def createFilter(): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]): Request[CreateFilterResponse, AWSError] = js.native
  /**
    * Creates a filter using the specified finding criteria.
    */
  def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(
    params: CreateFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]
  ): Request[CreateFilterResponse, AWSError] = js.native
  /**
    * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
    */
  def createIPSet(): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
    */
  def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(
    params: CreateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]
  ): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
    */
  def createMembers(): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
    */
  def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]
  ): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
    */
  def createSampleFindings(): Request[CreateSampleFindingsResponse, AWSError] = js.native
  def createSampleFindings(callback: js.Function2[/* err */ AWSError, /* data */ CreateSampleFindingsResponse, Unit]): Request[CreateSampleFindingsResponse, AWSError] = js.native
  /**
    * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
    */
  def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse, AWSError] = js.native
  def createSampleFindings(
    params: CreateSampleFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSampleFindingsResponse, Unit]
  ): Request[CreateSampleFindingsResponse, AWSError] = js.native
  /**
    * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
    */
  def createThreatIntelSet(): Request[CreateThreatIntelSetResponse, AWSError] = js.native
  def createThreatIntelSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateThreatIntelSetResponse, Unit]): Request[CreateThreatIntelSetResponse, AWSError] = js.native
  /**
    * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
    */
  def createThreatIntelSet(params: CreateThreatIntelSetRequest): Request[CreateThreatIntelSetResponse, AWSError] = js.native
  def createThreatIntelSet(
    params: CreateThreatIntelSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThreatIntelSetResponse, Unit]
  ): Request[CreateThreatIntelSetResponse, AWSError] = js.native
  /**
    * Declines invitations sent to the current member account by AWS account specified by their account IDs.
    */
  def declineInvitations(): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Declines invitations sent to the current member account by AWS account specified by their account IDs.
    */
  def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]
  ): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Deletes a Amazon GuardDuty detector specified by the detector ID.
    */
  def deleteDetector(): Request[DeleteDetectorResponse, AWSError] = js.native
  def deleteDetector(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorResponse, Unit]): Request[DeleteDetectorResponse, AWSError] = js.native
  /**
    * Deletes a Amazon GuardDuty detector specified by the detector ID.
    */
  def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResponse, AWSError] = js.native
  def deleteDetector(
    params: DeleteDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorResponse, Unit]
  ): Request[DeleteDetectorResponse, AWSError] = js.native
  /**
    * Deletes the filter specified by the filter name.
    */
  def deleteFilter(): Request[DeleteFilterResponse, AWSError] = js.native
  def deleteFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFilterResponse, Unit]): Request[DeleteFilterResponse, AWSError] = js.native
  /**
    * Deletes the filter specified by the filter name.
    */
  def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse, AWSError] = js.native
  def deleteFilter(
    params: DeleteFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFilterResponse, Unit]
  ): Request[DeleteFilterResponse, AWSError] = js.native
  /**
    * Deletes the IPSet specified by the IPSet ID.
    */
  def deleteIPSet(): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    * Deletes the IPSet specified by the IPSet ID.
    */
  def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(
    params: DeleteIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]
  ): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
    */
  def deleteInvitations(): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]
  ): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def deleteMembers(): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]
  ): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
    */
  def deleteThreatIntelSet(): Request[DeleteThreatIntelSetResponse, AWSError] = js.native
  def deleteThreatIntelSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThreatIntelSetResponse, Unit]): Request[DeleteThreatIntelSetResponse, AWSError] = js.native
  /**
    * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
    */
  def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): Request[DeleteThreatIntelSetResponse, AWSError] = js.native
  def deleteThreatIntelSet(
    params: DeleteThreatIntelSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThreatIntelSetResponse, Unit]
  ): Request[DeleteThreatIntelSetResponse, AWSError] = js.native
  /**
    * Disassociates the current GuardDuty member account from its master account.
    */
  def disassociateFromMasterAccount(): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * Disassociates the current GuardDuty member account from its master account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]
  ): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def disassociateMembers(): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]): Request[DisassociateMembersResponse, AWSError] = js.native
  /**
    * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(
    params: DisassociateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]
  ): Request[DisassociateMembersResponse, AWSError] = js.native
  /**
    * Retrieves an Amazon GuardDuty detector specified by the detectorId.
    */
  def getDetector(): Request[GetDetectorResponse, AWSError] = js.native
  def getDetector(callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorResponse, Unit]): Request[GetDetectorResponse, AWSError] = js.native
  /**
    * Retrieves an Amazon GuardDuty detector specified by the detectorId.
    */
  def getDetector(params: GetDetectorRequest): Request[GetDetectorResponse, AWSError] = js.native
  def getDetector(
    params: GetDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorResponse, Unit]
  ): Request[GetDetectorResponse, AWSError] = js.native
  /**
    * Returns the details of the filter specified by the filter name.
    */
  def getFilter(): Request[GetFilterResponse, AWSError] = js.native
  def getFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetFilterResponse, Unit]): Request[GetFilterResponse, AWSError] = js.native
  /**
    * Returns the details of the filter specified by the filter name.
    */
  def getFilter(params: GetFilterRequest): Request[GetFilterResponse, AWSError] = js.native
  def getFilter(
    params: GetFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFilterResponse, Unit]
  ): Request[GetFilterResponse, AWSError] = js.native
  /**
    * Describes Amazon GuardDuty findings specified by finding IDs.
    */
  def getFindings(): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Describes Amazon GuardDuty findings specified by finding IDs.
    */
  def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]
  ): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
    */
  def getFindingsStatistics(): Request[GetFindingsStatisticsResponse, AWSError] = js.native
  def getFindingsStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsStatisticsResponse, Unit]): Request[GetFindingsStatisticsResponse, AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
    */
  def getFindingsStatistics(params: GetFindingsStatisticsRequest): Request[GetFindingsStatisticsResponse, AWSError] = js.native
  def getFindingsStatistics(
    params: GetFindingsStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsStatisticsResponse, Unit]
  ): Request[GetFindingsStatisticsResponse, AWSError] = js.native
  /**
    * Retrieves the IPSet specified by the IPSet ID.
    */
  def getIPSet(): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]): Request[GetIPSetResponse, AWSError] = js.native
  /**
    * Retrieves the IPSet specified by the IPSet ID.
    */
  def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(
    params: GetIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]
  ): Request[GetIPSetResponse, AWSError] = js.native
  /**
    * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
    */
  def getInvitationsCount(): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]
  ): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Provides the details for the GuardDuty master account to the current GuardDuty member account.
    */
  def getMasterAccount(): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * Provides the details for the GuardDuty master account to the current GuardDuty member account.
    */
  def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]
  ): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def getMembers(): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def getMembers(params: GetMembersRequest): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]
  ): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
    */
  def getThreatIntelSet(): Request[GetThreatIntelSetResponse, AWSError] = js.native
  def getThreatIntelSet(callback: js.Function2[/* err */ AWSError, /* data */ GetThreatIntelSetResponse, Unit]): Request[GetThreatIntelSetResponse, AWSError] = js.native
  /**
    * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
    */
  def getThreatIntelSet(params: GetThreatIntelSetRequest): Request[GetThreatIntelSetResponse, AWSError] = js.native
  def getThreatIntelSet(
    params: GetThreatIntelSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThreatIntelSetResponse, Unit]
  ): Request[GetThreatIntelSetResponse, AWSError] = js.native
  /**
    * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
    */
  def inviteMembers(): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]): Request[InviteMembersResponse, AWSError] = js.native
  /**
    * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
    */
  def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(
    params: InviteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]
  ): Request[InviteMembersResponse, AWSError] = js.native
  /**
    * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
    */
  def listDetectors(): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]): Request[ListDetectorsResponse, AWSError] = js.native
  /**
    * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
    */
  def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(
    params: ListDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]
  ): Request[ListDetectorsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of the current filters.
    */
  def listFilters(): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]): Request[ListFiltersResponse, AWSError] = js.native
  /**
    * Returns a paginated list of the current filters.
    */
  def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(
    params: ListFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]
  ): Request[ListFiltersResponse, AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings for the specified detector ID.
    */
  def listFindings(): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]): Request[ListFindingsResponse, AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings for the specified detector ID.
    */
  def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse, AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFindingsResponse, Unit]
  ): Request[ListFindingsResponse, AWSError] = js.native
  /**
    * Lists the IPSets of the GuardDuty service specified by the detector ID.
    */
  def listIPSets(): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    * Lists the IPSets of the GuardDuty service specified by the detector ID.
    */
  def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(
    params: ListIPSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]
  ): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    * Lists all GuardDuty membership invitations that were sent to the current AWS account.
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Lists all GuardDuty membership invitations that were sent to the current AWS account.
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Lists details about all member accounts for the current GuardDuty master account.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Lists details about all member accounts for the current GuardDuty master account.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a given resource..
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a given resource..
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
    */
  def listThreatIntelSets(): Request[ListThreatIntelSetsResponse, AWSError] = js.native
  def listThreatIntelSets(callback: js.Function2[/* err */ AWSError, /* data */ ListThreatIntelSetsResponse, Unit]): Request[ListThreatIntelSetsResponse, AWSError] = js.native
  /**
    * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
    */
  def listThreatIntelSets(params: ListThreatIntelSetsRequest): Request[ListThreatIntelSetsResponse, AWSError] = js.native
  def listThreatIntelSets(
    params: ListThreatIntelSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThreatIntelSetsResponse, Unit]
  ): Request[ListThreatIntelSetsResponse, AWSError] = js.native
  /**
    * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
    */
  def startMonitoringMembers(): Request[StartMonitoringMembersResponse, AWSError] = js.native
  def startMonitoringMembers(callback: js.Function2[/* err */ AWSError, /* data */ StartMonitoringMembersResponse, Unit]): Request[StartMonitoringMembersResponse, AWSError] = js.native
  /**
    * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
    */
  def startMonitoringMembers(params: StartMonitoringMembersRequest): Request[StartMonitoringMembersResponse, AWSError] = js.native
  def startMonitoringMembers(
    params: StartMonitoringMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMonitoringMembersResponse, Unit]
  ): Request[StartMonitoringMembersResponse, AWSError] = js.native
  /**
    * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
    */
  def stopMonitoringMembers(): Request[StopMonitoringMembersResponse, AWSError] = js.native
  def stopMonitoringMembers(callback: js.Function2[/* err */ AWSError, /* data */ StopMonitoringMembersResponse, Unit]): Request[StopMonitoringMembersResponse, AWSError] = js.native
  /**
    * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
    */
  def stopMonitoringMembers(params: StopMonitoringMembersRequest): Request[StopMonitoringMembersResponse, AWSError] = js.native
  def stopMonitoringMembers(
    params: StopMonitoringMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopMonitoringMembersResponse, Unit]
  ): Request[StopMonitoringMembersResponse, AWSError] = js.native
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
    * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def unarchiveFindings(): Request[UnarchiveFindingsResponse, AWSError] = js.native
  def unarchiveFindings(callback: js.Function2[/* err */ AWSError, /* data */ UnarchiveFindingsResponse, Unit]): Request[UnarchiveFindingsResponse, AWSError] = js.native
  /**
    * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def unarchiveFindings(params: UnarchiveFindingsRequest): Request[UnarchiveFindingsResponse, AWSError] = js.native
  def unarchiveFindings(
    params: UnarchiveFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnarchiveFindingsResponse, Unit]
  ): Request[UnarchiveFindingsResponse, AWSError] = js.native
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
    * Updates an Amazon GuardDuty detector specified by the detectorId.
    */
  def updateDetector(): Request[UpdateDetectorResponse, AWSError] = js.native
  def updateDetector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorResponse, Unit]): Request[UpdateDetectorResponse, AWSError] = js.native
  /**
    * Updates an Amazon GuardDuty detector specified by the detectorId.
    */
  def updateDetector(params: UpdateDetectorRequest): Request[UpdateDetectorResponse, AWSError] = js.native
  def updateDetector(
    params: UpdateDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorResponse, Unit]
  ): Request[UpdateDetectorResponse, AWSError] = js.native
  /**
    * Updates the filter specified by the filter name.
    */
  def updateFilter(): Request[UpdateFilterResponse, AWSError] = js.native
  def updateFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFilterResponse, Unit]): Request[UpdateFilterResponse, AWSError] = js.native
  /**
    * Updates the filter specified by the filter name.
    */
  def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse, AWSError] = js.native
  def updateFilter(
    params: UpdateFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFilterResponse, Unit]
  ): Request[UpdateFilterResponse, AWSError] = js.native
  /**
    * Marks specified Amazon GuardDuty findings as useful or not useful.
    */
  def updateFindingsFeedback(): Request[UpdateFindingsFeedbackResponse, AWSError] = js.native
  def updateFindingsFeedback(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsFeedbackResponse, Unit]): Request[UpdateFindingsFeedbackResponse, AWSError] = js.native
  /**
    * Marks specified Amazon GuardDuty findings as useful or not useful.
    */
  def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): Request[UpdateFindingsFeedbackResponse, AWSError] = js.native
  def updateFindingsFeedback(
    params: UpdateFindingsFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsFeedbackResponse, Unit]
  ): Request[UpdateFindingsFeedbackResponse, AWSError] = js.native
  /**
    * Updates the IPSet specified by the IPSet ID.
    */
  def updateIPSet(): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    * Updates the IPSet specified by the IPSet ID.
    */
  def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(
    params: UpdateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]
  ): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
    */
  def updateThreatIntelSet(): Request[UpdateThreatIntelSetResponse, AWSError] = js.native
  def updateThreatIntelSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThreatIntelSetResponse, Unit]): Request[UpdateThreatIntelSetResponse, AWSError] = js.native
  /**
    * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
    */
  def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): Request[UpdateThreatIntelSetResponse, AWSError] = js.native
  def updateThreatIntelSet(
    params: UpdateThreatIntelSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThreatIntelSetResponse, Unit]
  ): Request[UpdateThreatIntelSetResponse, AWSError] = js.native
}

