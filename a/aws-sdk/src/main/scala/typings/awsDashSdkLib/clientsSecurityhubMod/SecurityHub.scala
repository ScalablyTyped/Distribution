package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityHub
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SecurityHub: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ClientConfiguration = js.native
  /**
    * Accepts the invitation to be monitored by a master SecurityHub account.
    */
  def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts the invitation to be monitored by a master SecurityHub account.
    */
  def acceptInvitation(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptInvitation(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.AcceptInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchDisableStandards(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchDisableStandards(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDisableStandards(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchDisableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchEnableStandards(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchEnableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchEnableStandards(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchEnableStandards(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchEnableStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports security findings that are generated by the integrated third-party products into Security Hub.
    */
  def batchImportFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchImportFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports security findings that are generated by the integrated third-party products into Security Hub.
    */
  def batchImportFindings(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchImportFindings(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.BatchImportFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
    */
  def createInsight(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
    */
  def createInsight(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createInsight(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
    */
  def createMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
    */
  def createMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.CreateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
    */
  def declineInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def declineInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
    */
  def declineInvitations(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def declineInvitations(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeclineInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an insight that is specified by the insight ARN.
    */
  def deleteInsight(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an insight that is specified by the insight ARN.
    */
  def deleteInsight(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInsight(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
    */
  def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
    */
  def deleteInvitations(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteInvitations(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the Security Hub member accounts that are specified by the account IDs.
    */
  def deleteMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the Security Hub member accounts that are specified by the account IDs.
    */
  def deleteMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DeleteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
    */
  def disableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
    */
  def disableImportFindingsForProduct(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableImportFindingsForProduct(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the AWS Security Hub Service.
    */
  def disableSecurityHub(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the AWS Security Hub Service.
    */
  def disableSecurityHub(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disableSecurityHub(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the current Security Hub member account from its master account.
    */
  def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateFromMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the current Security Hub member account from its master account.
    */
  def disassociateFromMasterAccount(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateFromMasterAccount(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateFromMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
    */
  def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
    */
  def disassociateMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.DisassociateMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables you to import findings generated by integrated third-party providers into Security Hub.
    */
  def enableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables you to import findings generated by integrated third-party providers into Security Hub.
    */
  def enableImportFindingsForProduct(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableImportFindingsForProduct(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableImportFindingsForProductResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the AWS Security Hub service.
    */
  def enableSecurityHub(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the AWS Security Hub service.
    */
  def enableSecurityHub(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def enableSecurityHub(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.EnableSecurityHubResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes enabled standards.
    */
  def getEnabledStandards(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEnabledStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes enabled standards.
    */
  def getEnabledStandards(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEnabledStandards(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetEnabledStandardsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
    */
  def getFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
    */
  def getFindings(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFindings(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInsightResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInsightResults(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes insights that are specified by insight ARNs.
    */
  def getInsights(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInsights(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists and describes insights that are specified by insight ARNs.
    */
  def getInsights(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInsights(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInsightsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInvitationsCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInvitationsCount(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetInvitationsCountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the details for the Security Hub master account to the current member account. 
    */
  def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMasterAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the details for the Security Hub master account to the current member account. 
    */
  def getMasterAccount(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMasterAccount(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMasterAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
    */
  def getMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
    */
  def getMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.GetMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
    */
  def inviteMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def inviteMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
    */
  def inviteMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def inviteMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.InviteMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Security Hub-integrated third-party findings providers.
    */
  def listEnabledProductsForImport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEnabledProductsForImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Security Hub-integrated third-party findings providers.
    */
  def listEnabledProductsForImport(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listEnabledProductsForImport(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListEnabledProductsForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listInvitations(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListInvitationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listMembers(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.ListMembersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
    */
  def updateFindings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
    */
  def updateFindings(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFindings(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateFindingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the AWS Security Hub insight specified by the insight ARN.
    */
  def updateInsight(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the AWS Security Hub insight specified by the insight ARN.
    */
  def updateInsight(params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateInsight(
    params: awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSecurityhubMod.SecurityHubNs.UpdateInsightResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

