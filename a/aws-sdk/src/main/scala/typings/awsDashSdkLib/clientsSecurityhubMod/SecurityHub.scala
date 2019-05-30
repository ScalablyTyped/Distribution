package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityHub
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SecurityHub: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the invitation to be monitored by a Security Hub master account.
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
    * Accepts the invitation to be monitored by a Security Hub master account.
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
    * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices.
    */
  def batchDisableStandards(): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices.
    */
  def batchDisableStandards(params: BatchDisableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDisableStandards(
    params: BatchDisableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDisableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchEnableStandards(): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchEnableStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
    */
  def batchEnableStandards(params: BatchEnableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchEnableStandards(
    params: BatchEnableStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchEnableStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub.
    */
  def batchImportFindings(): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchImportFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub.
    */
  def batchImportFindings(params: BatchImportFindingsRequest): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchImportFindings(
    params: BatchImportFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchImportFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
    */
  def createInsight(): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
    */
  def createInsight(params: CreateInsightRequest): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInsight(
    params: CreateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates Security Hub member accounts associated with the account used for this action, which becomes the Security Hub Master account. Security Hub must be enabled in the account used to make this request.
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
    * Creates Security Hub member accounts associated with the account used for this action, which becomes the Security Hub Master account. Security Hub must be enabled in the account used to make this request.
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
    * Declines invitations that are sent to this AWS account (invitee) from the AWS accounts (inviters) that are specified by the provided AccountIds.
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
    * Declines invitations that are sent to this AWS account (invitee) from the AWS accounts (inviters) that are specified by the provided AccountIds.
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
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(params: DeleteInsightRequest): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInsight(
    params: DeleteInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes invitations that were sent to theis AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
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
    * Deletes invitations that were sent to theis AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
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
    * Deletes the Security Hub member accounts that the account IDs specify.
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
    * Deletes the Security Hub member accounts that the account IDs specify.
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
    * Returns information about the products available that you can subscribe to.
    */
  def describeProducts(): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the products available that you can subscribe to.
    */
  def describeProducts(params: DescribeProductsRequest): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeProducts(
    params: DescribeProductsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the subscription that allows a findings-generating solution (product) to import its findings into Security Hub.
    */
  def disableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the subscription that allows a findings-generating solution (product) to import its findings into Security Hub.
    */
  def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableImportFindingsForProduct(
    params: DisableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the Security Hub service.
    */
  def disableSecurityHub(): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the Security Hub service.
    */
  def disableSecurityHub(params: DisableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableSecurityHub(
    params: DisableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from its master account.
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
    * Disassociates the current Security Hub member account from its master account.
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
    * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
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
    * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
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
    * Sets up the subscription that enables a findings-generating solution (product) to import its findings into Security Hub.
    */
  def enableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableImportFindingsForProduct(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets up the subscription that enables a findings-generating solution (product) to import its findings into Security Hub.
    */
  def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableImportFindingsForProduct(
    params: EnableImportFindingsForProductRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableImportFindingsForProductResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the Security Hub service.
    */
  def enableSecurityHub(): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSecurityHub(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the Security Hub service.
    */
  def enableSecurityHub(params: EnableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableSecurityHub(
    params: EnableSecurityHubRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnableSecurityHubResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes enabled standards.
    */
  def getEnabledStandards(): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEnabledStandards(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes enabled standards.
    */
  def getEnabledStandards(params: GetEnabledStandardsRequest): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEnabledStandards(
    params: GetEnabledStandardsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEnabledStandardsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes Security Hub-aggregated findings that filter attributes specify.
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
    * Lists and describes Security Hub-aggregated findings that filter attributes specify.
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
    * Lists the results of the Security Hub insight that the insight ARN specifies.
    */
  def getInsightResults(): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsightResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight that the insight ARN specifies.
    */
  def getInsightResults(params: GetInsightResultsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsightResults(
    params: GetInsightResultsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes insights that insight ARNs specify.
    */
  def getInsights(): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsights(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists and describes insights that insight ARNs specify.
    */
  def getInsights(params: GetInsightsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInsights(
    params: GetInsightsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInsightsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
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
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
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
    * Provides the details for the Security Hub master account to the current member account. 
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
    * Provides the details for the Security Hub master account to the current member account. 
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
    * Returns the details on the Security Hub member accounts that the account IDs specify.
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
    * Returns the details on the Security Hub member accounts that the account IDs specify.
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
    * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
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
    * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
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
    * Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.
    */
  def listEnabledProductsForImport(): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnabledProductsForImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.
    */
  def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listEnabledProductsForImport(
    params: ListEnabledProductsForImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListEnabledProductsForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
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
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
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
    * Lists details about all member accounts for the current Security Hub master account.
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
    * Lists details about all member accounts for the current Security Hub master account.
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
    * Returns a list of account IDs that are subscribed to the product.
    */
  def listProductSubscribers(): awsDashSdkLib.libRequestMod.Request[ListProductSubscribersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProductSubscribers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProductSubscribersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProductSubscribersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of account IDs that are subscribed to the product.
    */
  def listProductSubscribers(params: ListProductSubscribersRequest): awsDashSdkLib.libRequestMod.Request[ListProductSubscribersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProductSubscribers(
    params: ListProductSubscribersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProductSubscribersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProductSubscribersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(params: UpdateFindingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFindings(
    params: UpdateFindingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFindingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Security Hub insight that the insight ARN specifies.
    */
  def updateInsight(): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInsight(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Security Hub insight that the insight ARN specifies.
    */
  def updateInsight(params: UpdateInsightRequest): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInsight(
    params: UpdateInsightRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInsightResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

