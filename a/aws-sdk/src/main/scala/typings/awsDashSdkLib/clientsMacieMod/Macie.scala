package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Macie
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Macie: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a specified AWS account with Amazon Macie as a member account.
    */
  def associateMemberAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateMemberAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a specified AWS account with Amazon Macie as a member account.
    */
  def associateMemberAccount(params: AssociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateMemberAccount(
    params: AssociateMemberAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
    */
  def associateS3Resources(): awsDashSdkLib.libRequestMod.Request[AssociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
    */
  def associateS3Resources(params: AssociateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[AssociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateS3Resources(
    params: AssociateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified member account from Amazon Macie.
    */
  def disassociateMemberAccount(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMemberAccount(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified member account from Amazon Macie.
    */
  def disassociateMemberAccount(params: DisassociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateMemberAccount(
    params: DisassociateMemberAccountRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
    */
  def disassociateS3Resources(): awsDashSdkLib.libRequestMod.Request[DisassociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
    */
  def disassociateS3Resources(params: DisassociateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[DisassociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateS3Resources(
    params: DisassociateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
    */
  def listMemberAccounts(): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMemberAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMemberAccountsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
    */
  def listMemberAccounts(params: ListMemberAccountsRequest): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMemberAccounts(
    params: ListMemberAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMemberAccountsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMemberAccountsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def listS3Resources(): awsDashSdkLib.libRequestMod.Request[ListS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def listS3Resources(params: ListS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listS3Resources(
    params: ListS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def updateS3Resources(): awsDashSdkLib.libRequestMod.Request[UpdateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateS3Resources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
    */
  def updateS3Resources(params: UpdateS3ResourcesRequest): awsDashSdkLib.libRequestMod.Request[UpdateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateS3Resources(
    params: UpdateS3ResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateS3ResourcesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

