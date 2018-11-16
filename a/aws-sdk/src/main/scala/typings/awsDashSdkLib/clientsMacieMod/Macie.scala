package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Macie
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Macie: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMacieMod.MacieNs.ClientConfiguration = js.native
  /**
     * Associates a specified AWS account with Amazon Macie as a member account.
     */
  def associateMemberAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates a specified AWS account with Amazon Macie as a member account.
     */
  def associateMemberAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates a specified AWS account with Amazon Macie as a member account.
     */
  def associateMemberAccount(params: awsDashSdkLib.clientsMacieMod.MacieNs.AssociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates a specified AWS account with Amazon Macie as a member account.
     */
  def associateMemberAccount(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.AssociateMemberAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
     */
  def associateS3Resources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
     */
  def associateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
     */
  def associateS3Resources(params: awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
     */
  def associateS3Resources(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.AssociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified member account from Amazon Macie.
     */
  def disassociateMemberAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified member account from Amazon Macie.
     */
  def disassociateMemberAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified member account from Amazon Macie.
     */
  def disassociateMemberAccount(params: awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified member account from Amazon Macie.
     */
  def disassociateMemberAccount(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateMemberAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
     */
  def disassociateS3Resources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
     */
  def disassociateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
     */
  def disassociateS3Resources(params: awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
     */
  def disassociateS3Resources(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.DisassociateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     */
  def listMemberAccounts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     */
  def listMemberAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     */
  def listMemberAccounts(params: awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
     */
  def listMemberAccounts(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListMemberAccountsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def listS3Resources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def listS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def listS3Resources(params: awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def listS3Resources(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.ListS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def updateS3Resources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def updateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def updateS3Resources(params: awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
     */
  def updateS3Resources(
    params: awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMacieMod.MacieNs.UpdateS3ResourcesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

