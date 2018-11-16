package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardDuty
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_GuardDuty: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ClientConfiguration = js.native
  /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     */
  def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     */
  def acceptInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     */
  def acceptInvitation(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     */
  def acceptInvitation(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def archiveFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def archiveFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def archiveFindings(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def archiveFindings(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ArchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
     */
  def createDetector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
     */
  def createDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
     */
  def createDetector(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A detector must be created in order for GuardDuty to become operational.
     */
  def createDetector(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a filter using the specified finding criteria.
     */
  def createFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a filter using the specified finding criteria.
     */
  def createFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a filter using the specified finding criteria.
     */
  def createFilter(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a filter using the specified finding criteria.
     */
  def createFilter(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
     */
  def createIPSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
     */
  def createIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
     */
  def createIPSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS infrastructure and applications.
     */
  def createIPSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
     */
  def createMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
     */
  def createMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
     */
  def createMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS account can then invite these members to manage GuardDuty in their accounts.
     */
  def createMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
     */
  def createSampleFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
     */
  def createSampleFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
     */
  def createSampleFindings(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for findingTypes, the API generates example findings of all supported finding types.
     */
  def createSampleFindings(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateSampleFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
     */
  def createThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
     */
  def createThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
     */
  def createThreatIntelSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates findings based on ThreatIntelSets.
     */
  def createThreatIntelSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.CreateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     */
  def declineInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     */
  def declineInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     */
  def declineInvitations(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     */
  def declineInvitations(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     */
  def deleteDetector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     */
  def deleteDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     */
  def deleteDetector(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     */
  def deleteDetector(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the filter specified by the filter name.
     */
  def deleteFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the filter specified by the filter name.
     */
  def deleteFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the filter specified by the filter name.
     */
  def deleteFilter(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the filter specified by the filter name.
     */
  def deleteFilter(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the IPSet specified by the IPSet ID.
     */
  def deleteIPSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the IPSet specified by the IPSet ID.
     */
  def deleteIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the IPSet specified by the IPSet ID.
     */
  def deleteIPSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the IPSet specified by the IPSet ID.
     */
  def deleteIPSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     */
  def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     */
  def deleteInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     */
  def deleteInvitations(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     */
  def deleteInvitations(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def deleteMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def deleteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def deleteMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def deleteMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     */
  def deleteThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     */
  def deleteThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     */
  def deleteThreatIntelSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     */
  def deleteThreatIntelSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DeleteThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the current GuardDuty member account from its master account.
     */
  def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the current GuardDuty member account from its master account.
     */
  def disassociateFromMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the current GuardDuty member account from its master account.
     */
  def disassociateFromMasterAccount(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the current GuardDuty member account from its master account.
     */
  def disassociateFromMasterAccount(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def disassociateMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def disassociateMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def disassociateMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     */
  def getDetector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     */
  def getDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     */
  def getDetector(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     */
  def getDetector(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of the filter specified by the filter name.
     */
  def getFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of the filter specified by the filter name.
     */
  def getFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of the filter specified by the filter name.
     */
  def getFilter(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of the filter specified by the filter name.
     */
  def getFilter(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     */
  def getFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     */
  def getFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     */
  def getFindings(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     */
  def getFindings(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     */
  def getFindingsStatistics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     */
  def getFindingsStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     */
  def getFindingsStatistics(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     */
  def getFindingsStatistics(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetFindingsStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IPSet specified by the IPSet ID.
     */
  def getIPSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IPSet specified by the IPSet ID.
     */
  def getIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IPSet specified by the IPSet ID.
     */
  def getIPSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the IPSet specified by the IPSet ID.
     */
  def getIPSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
     */
  def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
     */
  def getInvitationsCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
     */
  def getInvitationsCount(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the currently accepted invitation.
     */
  def getInvitationsCount(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     */
  def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     */
  def getMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     */
  def getMasterAccount(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     */
  def getMasterAccount(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def getMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def getMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def getMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     */
  def getMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     */
  def getThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     */
  def getThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     */
  def getThreatIntelSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     */
  def getThreatIntelSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.GetThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
     */
  def inviteMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
     */
  def inviteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
     */
  def inviteMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the master account.
     */
  def inviteMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     */
  def listDetectors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     */
  def listDetectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     */
  def listDetectors(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     */
  def listDetectors(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListDetectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of the current filters.
     */
  def listFilters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of the current filters.
     */
  def listFilters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of the current filters.
     */
  def listFilters(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of the current filters.
     */
  def listFilters(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     */
  def listFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     */
  def listFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     */
  def listFindings(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     */
  def listFindings(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     */
  def listIPSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     */
  def listIPSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     */
  def listIPSets(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     */
  def listIPSets(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListIPSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     */
  def listInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     */
  def listInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     */
  def listInvitations(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     */
  def listInvitations(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists details about all member accounts for the current GuardDuty master account.
     */
  def listMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists details about all member accounts for the current GuardDuty master account.
     */
  def listMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists details about all member accounts for the current GuardDuty master account.
     */
  def listMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists details about all member accounts for the current GuardDuty master account.
     */
  def listMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     */
  def listThreatIntelSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     */
  def listThreatIntelSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     */
  def listThreatIntelSets(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     */
  def listThreatIntelSets(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.ListThreatIntelSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
     */
  def startMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
     */
  def startMonitoringMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
     */
  def startMonitoringMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty account can run this command after disabling GuardDuty from monitoring these members' findings by running StopMonitoringMembers.
     */
  def startMonitoringMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StartMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
     */
  def stopMonitoringMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
     */
  def stopMonitoringMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
     */
  def stopMonitoringMembers(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these members’ findings.
     */
  def stopMonitoringMembers(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.StopMonitoringMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def unarchiveFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def unarchiveFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def unarchiveFindings(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     */
  def unarchiveFindings(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UnarchiveFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     */
  def updateDetector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     */
  def updateDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     */
  def updateDetector(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     */
  def updateDetector(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateDetectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the filter specified by the filter name.
     */
  def updateFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the filter specified by the filter name.
     */
  def updateFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the filter specified by the filter name.
     */
  def updateFilter(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the filter specified by the filter name.
     */
  def updateFilter(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     */
  def updateFindingsFeedback(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     */
  def updateFindingsFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     */
  def updateFindingsFeedback(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     */
  def updateFindingsFeedback(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateFindingsFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the IPSet specified by the IPSet ID.
     */
  def updateIPSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the IPSet specified by the IPSet ID.
     */
  def updateIPSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the IPSet specified by the IPSet ID.
     */
  def updateIPSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the IPSet specified by the IPSet ID.
     */
  def updateIPSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateIPSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     */
  def updateThreatIntelSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     */
  def updateThreatIntelSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     */
  def updateThreatIntelSet(params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     */
  def updateThreatIntelSet(
    params: awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGuarddutyMod.GuardDutyNs.UpdateThreatIntelSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

