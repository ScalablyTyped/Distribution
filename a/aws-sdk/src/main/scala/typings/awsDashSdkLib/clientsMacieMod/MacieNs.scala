package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/macie", "Macie")
@js.native
object MacieNs extends js.Object {
  
  trait AssociateMemberAccountRequest extends js.Object {
    /**
         * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
         */
    var memberAccountId: AWSAccountId
  }
  
  
  trait AssociateS3ResourcesRequest extends js.Object {
    /**
         * The ID of the Amazon Macie member account whose resources you want to associate with Macie. 
         */
    var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    /**
         * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification. 
         */
    var s3Resources: S3ResourcesClassification
  }
  
  
  trait AssociateS3ResourcesResult extends js.Object {
    /**
         * S3 resources that couldn't be associated with Amazon Macie. An error code and an error message are provided for each failed item. 
         */
    var failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
  }
  
  
  trait ClassificationType extends js.Object {
    /**
         * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
         */
    var continuous: S3ContinuousClassificationType
    /**
         * A one-time classification of all of the existing objects in a specified S3 bucket. 
         */
    var oneTime: S3OneTimeClassificationType
  }
  
  
  trait ClassificationTypeUpdate extends js.Object {
    /**
         * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
         */
    var continuous: js.UndefOr[S3ContinuousClassificationType] = js.undefined
    /**
         * A one-time classification of all of the existing objects in a specified S3 bucket. 
         */
    var oneTime: js.UndefOr[S3OneTimeClassificationType] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DisassociateMemberAccountRequest extends js.Object {
    /**
         * The ID of the member account that you want to remove from Amazon Macie.
         */
    var memberAccountId: AWSAccountId
  }
  
  
  trait DisassociateS3ResourcesRequest extends js.Object {
    /**
         * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon Macie. 
         */
    var associatedS3Resources: S3Resources
    /**
         * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon Macie. 
         */
    var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
  }
  
  
  trait DisassociateS3ResourcesResult extends js.Object {
    /**
         * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie. An error code and an error message are provided for each failed item. 
         */
    var failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
  }
  
  
  trait FailedS3Resource extends js.Object {
    /**
         * The status code of a failed item.
         */
    var errorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The error message of a failed item.
         */
    var errorMessage: js.UndefOr[ExceptionMessage] = js.undefined
    /**
         * The failed S3 resources.
         */
    var failedItem: js.UndefOr[S3Resource] = js.undefined
  }
  
  
  trait ListMemberAccountsRequest extends js.Object {
    /**
         * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListMemberAccounts action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListMemberAccountsResult extends js.Object {
    /**
         * A list of the Amazon Macie member accounts returned by the action. The current master account is also included in this list. 
         */
    var memberAccounts: js.UndefOr[MemberAccounts] = js.undefined
    /**
         * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListS3ResourcesRequest extends js.Object {
    /**
         * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The Amazon Macie member account ID whose associated S3 resources you want to list. 
         */
    var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    /**
         * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListS3ResourcesResult extends js.Object {
    /**
         * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of the associated S3 resources returned by the action.
         */
    var s3Resources: js.UndefOr[S3ResourcesClassification] = js.undefined
  }
  
  
  trait MemberAccount extends js.Object {
    /**
         * The AWS account ID of the Amazon Macie member account.
         */
    var accountId: js.UndefOr[AWSAccountId] = js.undefined
  }
  
  
  trait S3Resource extends js.Object {
    /**
         * The name of the S3 bucket.
         */
    var bucketName: BucketName
    /**
         * The prefix of the S3 bucket. 
         */
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  
  trait S3ResourceClassification extends js.Object {
    /**
         * The name of the S3 bucket that you want to associate with Amazon Macie.
         */
    var bucketName: BucketName
    /**
         * The classification type that you want to specify for the resource associated with Amazon Macie. 
         */
    var classificationType: ClassificationType
    /**
         * The prefix of the S3 bucket that you want to associate with Amazon Macie.
         */
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  
  trait S3ResourceClassificationUpdate extends js.Object {
    /**
         * The name of the S3 bucket whose classification types you want to update.
         */
    var bucketName: BucketName
    /**
         * The classification type that you want to update for the resource associated with Amazon Macie. 
         */
    var classificationTypeUpdate: ClassificationTypeUpdate
    /**
         * The prefix of the S3 bucket whose classification types you want to update.
         */
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    def associateMemberAccount(params: AssociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a specified AWS account with Amazon Macie as a member account.
       */
    def associateMemberAccount(
      params: AssociateMemberAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
       */
    def associateS3Resources(): awsDashSdkLib.libRequestMod.Request[AssociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
       */
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
    /**
       * Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId isn't specified, the action associates specified S3 resources with Macie for the current master account. If memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member account. 
       */
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
    /**
       * Removes the specified member account from Amazon Macie.
       */
    def disassociateMemberAccount(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified member account from Amazon Macie.
       */
    def disassociateMemberAccount(params: DisassociateMemberAccountRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified member account from Amazon Macie.
       */
    def disassociateMemberAccount(
      params: DisassociateMemberAccountRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
       */
    def disassociateS3Resources(): awsDashSdkLib.libRequestMod.Request[DisassociateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
       */
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
    /**
       * Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified, the action removes specified S3 resources from Macie for the specified member account.
       */
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
    /**
       * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
       */
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
    /**
       * Lists all Amazon Macie member accounts for the current Amazon Macie master account.
       */
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
    /**
       * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
       */
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
    /**
       * Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action lists the S3 resources associated with Amazon Macie for the specified member account. 
       */
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
    /**
       * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
       */
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
    /**
       * Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the action updates the classification types of the S3 resources associated with Amazon Macie for the specified member account. 
       */
    def updateS3Resources(
      params: UpdateS3ResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateS3ResourcesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateS3ResourcesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateS3ResourcesRequest extends js.Object {
    /**
         * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update. 
         */
    var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    /**
         * The S3 resources whose classification types you want to update.
         */
    var s3ResourcesUpdate: S3ResourcesClassificationUpdate
  }
  
  
  trait UpdateS3ResourcesResult extends js.Object {
    /**
         * The S3 resources whose classification types can't be updated. An error code and an error message are provided for each failed item. 
         */
    var failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AWSAccountId = java.lang.String
  type BucketName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = java.lang.String
  type ExceptionMessage = java.lang.String
  type FailedS3Resources = js.Array[FailedS3Resource]
  type MaxResults = scala.Double
  type MemberAccounts = js.Array[MemberAccount]
  type NextToken = java.lang.String
  type Prefix = java.lang.String
  type S3ContinuousClassificationType = awsDashSdkLib.awsDashSdkLibStrings.FULL | java.lang.String
  type S3OneTimeClassificationType = awsDashSdkLib.awsDashSdkLibStrings.FULL | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type S3Resources = js.Array[S3Resource]
  type S3ResourcesClassification = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-12-19` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

