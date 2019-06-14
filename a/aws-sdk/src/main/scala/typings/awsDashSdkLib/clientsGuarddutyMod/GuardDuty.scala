package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardDuty extends Service {
  var config: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the invitation to be monitored by a master GuardDuty account.
    */
  def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Accepts the invitation to be monitored by a master GuardDuty account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Archives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def archiveFindings(): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def archiveFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ArchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Archives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def archiveFindings(params: ArchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def archiveFindings(
    params: ArchiveFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ArchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ArchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
    */
  def createDetector(): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
    */
  def createDetector(params: CreateDetectorRequest): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDetector(
    params: CreateDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a filter using the specified finding criteria.
    */
  def createFilter(): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a filter using the specified finding criteria.
    */
  def createFilter(params: CreateFilterRequest): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFilter(
    params: CreateFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
    */
  def createIPSet(): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
    */
  def createIPSet(params: CreateIPSetRequest): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIPSet(
    params: CreateIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
    */
  def createMembers(): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
    */
  def createMembers(params: CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
    */
  def createSampleFindings(): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSampleFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSampleFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
    */
  def createSampleFindings(params: CreateSampleFindingsRequest): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSampleFindings(
    params: CreateSampleFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSampleFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSampleFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
    */
  def createThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
    */
  def createThreatIntelSet(params: CreateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createThreatIntelSet(
    params: CreateThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines invitations sent to the current member account by AWS account specified by their account IDs.
    */
  def declineInvitations(): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Declines invitations sent to the current member account by AWS account specified by their account IDs.
    */
  def declineInvitations(params: DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Amazon GuardDuty detector specified by the detector ID.
    */
  def deleteDetector(): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Amazon GuardDuty detector specified by the detector ID.
    */
  def deleteDetector(params: DeleteDetectorRequest): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDetector(
    params: DeleteDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the filter specified by the filter name.
    */
  def deleteFilter(): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the filter specified by the filter name.
    */
  def deleteFilter(params: DeleteFilterRequest): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFilter(
    params: DeleteFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the IPSet specified by the IPSet ID.
    */
  def deleteIPSet(): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the IPSet specified by the IPSet ID.
    */
  def deleteIPSet(params: DeleteIPSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIPSet(
    params: DeleteIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
    */
  def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def deleteMembers(): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def deleteMembers(params: DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
    */
  def deleteThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
    */
  def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteThreatIntelSet(
    params: DeleteThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the current GuardDuty member account from its master account.
    */
  def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFromMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the current GuardDuty member account from its master account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def disassociateMembers(params: DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMembers(
    params: DisassociateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an Amazon GuardDuty detector specified by the detectorId.
    */
  def getDetector(): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an Amazon GuardDuty detector specified by the detectorId.
    */
  def getDetector(params: GetDetectorRequest): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDetector(
    params: GetDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details of the filter specified by the filter name.
    */
  def getFilter(): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details of the filter specified by the filter name.
    */
  def getFilter(params: GetFilterRequest): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFilter(
    params: GetFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes Amazon GuardDuty findings specified by finding IDs.
    */
  def getFindings(): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes Amazon GuardDuty findings specified by finding IDs.
    */
  def getFindings(params: GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
    */
  def getFindingsStatistics(): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindingsStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
    */
  def getFindingsStatistics(params: GetFindingsStatisticsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFindingsStatistics(
    params: GetFindingsStatisticsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFindingsStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFindingsStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the IPSet specified by the IPSet ID.
    */
  def getIPSet(): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the IPSet specified by the IPSet ID.
    */
  def getIPSet(params: GetIPSetRequest): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIPSet(
    params: GetIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
    */
  def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvitationsCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides the details for the GuardDuty master account to the current GuardDuty member account.
    */
  def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides the details for the GuardDuty master account to the current GuardDuty member account.
    */
  def getMasterAccount(params: GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def getMembers(): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
    */
  def getMembers(params: GetMembersRequest): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
    */
  def getThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
    */
  def getThreatIntelSet(params: GetThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getThreatIntelSet(
    params: GetThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
    */
  def inviteMembers(): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
    */
  def inviteMembers(params: InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteMembers(
    params: InviteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
    */
  def listDetectors(): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
    */
  def listDetectors(params: ListDetectorsRequest): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectors(
    params: ListDetectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a paginated list of the current filters.
    */
  def listFilters(): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFilters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a paginated list of the current filters.
    */
  def listFilters(params: ListFiltersRequest): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFilters(
    params: ListFiltersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFiltersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings for the specified detector ID.
    */
  def listFindings(): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists Amazon GuardDuty findings for the specified detector ID.
    */
  def listFindings(params: ListFindingsRequest): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFindings(
    params: ListFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the IPSets of the GuardDuty service specified by the detector ID.
    */
  def listIPSets(): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIPSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIPSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the IPSets of the GuardDuty service specified by the detector ID.
    */
  def listIPSets(params: ListIPSetsRequest): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIPSets(
    params: ListIPSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIPSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all GuardDuty membership invitations that were sent to the current AWS account.
    */
  def listInvitations(): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all GuardDuty membership invitations that were sent to the current AWS account.
    */
  def listInvitations(params: ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists details about all member accounts for the current GuardDuty master account.
    */
  def listMembers(): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists details about all member accounts for the current GuardDuty master account.
    */
  def listMembers(params: ListMembersRequest): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a given resource..
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, and Threat Intel sets, with a limit of 50 tags per resource. When invoked, this operation returns all assigned tags for a given resource..
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
    */
  def listThreatIntelSets(): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThreatIntelSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThreatIntelSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
    */
  def listThreatIntelSets(params: ListThreatIntelSetsRequest): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listThreatIntelSets(
    params: ListThreatIntelSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListThreatIntelSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListThreatIntelSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
    */
  def startMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startMonitoringMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
    */
  def startMonitoringMembers(params: StartMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startMonitoringMembers(
    params: StartMonitoringMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
    */
  def stopMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopMonitoringMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
    */
  def stopMonitoringMembers(params: StopMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopMonitoringMembers(
    params: StopMonitoringMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopMonitoringMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def unarchiveFindings(): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unarchiveFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnarchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
    */
  def unarchiveFindings(params: UnarchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unarchiveFindings(
    params: UnarchiveFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnarchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnarchiveFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Amazon GuardDuty detector specified by the detectorId.
    */
  def updateDetector(): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an Amazon GuardDuty detector specified by the detectorId.
    */
  def updateDetector(params: UpdateDetectorRequest): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDetector(
    params: UpdateDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the filter specified by the filter name.
    */
  def updateFilter(): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the filter specified by the filter name.
    */
  def updateFilter(params: UpdateFilterRequest): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFilter(
    params: UpdateFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFilterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Marks specified Amazon GuardDuty findings as useful or not useful.
    */
  def updateFindingsFeedback(): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindingsFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Marks specified Amazon GuardDuty findings as useful or not useful.
    */
  def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindingsFeedback(
    params: UpdateFindingsFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the IPSet specified by the IPSet ID.
    */
  def updateIPSet(): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the IPSet specified by the IPSet ID.
    */
  def updateIPSet(params: UpdateIPSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIPSet(
    params: UpdateIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
    */
  def updateThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
    */
  def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateThreatIntelSet(
    params: UpdateThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateThreatIntelSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

