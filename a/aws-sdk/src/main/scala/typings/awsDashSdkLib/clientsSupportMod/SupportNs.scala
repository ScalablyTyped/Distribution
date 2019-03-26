package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/support", "Support")
@js.native
object SupportNs extends js.Object {
  trait AddAttachmentsToSetRequest extends js.Object {
    /**
      * The ID of the attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists.
      */
    var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    /**
      * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per attachment.
      */
    var attachments: Attachments
  }
  
  trait AddAttachmentsToSetResponse extends js.Object {
    /**
      * The ID of the attachment set. If an attachmentSetId was not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId was specified, the attachments are added to the specified set, if it exists.
      */
    var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    /**
      * The time and date when the attachment set expires.
      */
    var expiryTime: js.UndefOr[ExpiryTime] = js.undefined
  }
  
  trait AddCommunicationToCaseRequest extends js.Object {
    /**
      * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling AddAttachmentsToSet 
      */
    var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: js.UndefOr[CaseId] = js.undefined
    /**
      * The email addresses in the CC line of an email to be added to the support case.
      */
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
    /**
      * The body of an email communication to add to the support case.
      */
    var communicationBody: CommunicationBody
  }
  
  trait AddCommunicationToCaseResponse extends js.Object {
    /**
      * True if AddCommunicationToCase succeeds. Otherwise, returns an error.
      */
    var result: js.UndefOr[Result] = js.undefined
  }
  
  trait Attachment extends js.Object {
    /**
      * The content of the attachment file.
      */
    var data: js.UndefOr[Data] = js.undefined
    /**
      * The name of the attachment file.
      */
    var fileName: js.UndefOr[FileName] = js.undefined
  }
  
  trait AttachmentDetails extends js.Object {
    /**
      * The ID of the attachment.
      */
    var attachmentId: js.UndefOr[AttachmentId] = js.undefined
    /**
      * The file name of the attachment.
      */
    var fileName: js.UndefOr[FileName] = js.undefined
  }
  
  trait CaseDetails extends js.Object {
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: js.UndefOr[CaseId] = js.undefined
    /**
      * The category of problem for the AWS Support case.
      */
    var categoryCode: js.UndefOr[CategoryCode] = js.undefined
    /**
      * The email addresses that receive copies of communication about the case.
      */
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
    /**
      * The ID displayed for the case in the AWS Support Center. This is a numeric string.
      */
    var displayId: js.UndefOr[DisplayId] = js.undefined
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[Language] = js.undefined
    /**
      * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to the communications. Also includes a nextToken that you can use to retrieve earlier communications.
      */
    var recentCommunications: js.UndefOr[RecentCaseCommunications] = js.undefined
    /**
      * The code for the AWS service returned by the call to DescribeServices.
      */
    var serviceCode: js.UndefOr[ServiceCode] = js.undefined
    /**
      * The code for the severity level returned by the call to DescribeSeverityLevels.
      */
    var severityCode: js.UndefOr[SeverityCode] = js.undefined
    /**
      * The status of the case.
      */
    var status: js.UndefOr[Status] = js.undefined
    /**
      * The subject line for the case in the AWS Support Center.
      */
    var subject: js.UndefOr[Subject] = js.undefined
    /**
      * The email address of the account that submitted the case.
      */
    var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
    /**
      * The time that the case was case created in the AWS Support Center.
      */
    var timeCreated: js.UndefOr[TimeCreated] = js.undefined
  }
  
  trait Category extends js.Object {
    /**
      * The category code for the support case.
      */
    var code: js.UndefOr[CategoryCode] = js.undefined
    /**
      * The category name for the support case.
      */
    var name: js.UndefOr[CategoryName] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Communication extends js.Object {
    /**
      * Information about the attachments to the case communication.
      */
    var attachmentSet: js.UndefOr[AttachmentSet] = js.undefined
    /**
      * The text of the communication between the customer and AWS Support.
      */
    var body: js.UndefOr[CommunicationBody] = js.undefined
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: js.UndefOr[CaseId] = js.undefined
    /**
      * The email address of the account that submitted the AWS Support case.
      */
    var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
    /**
      * The time the communication was created.
      */
    var timeCreated: js.UndefOr[TimeCreated] = js.undefined
  }
  
  trait CreateCaseRequest extends js.Object {
    /**
      * The ID of a set of one or more attachments for the case. Create the set by using AddAttachmentsToSet.
      */
    var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
    /**
      * The category of problem for the AWS Support case.
      */
    var categoryCode: js.UndefOr[CategoryCode] = js.undefined
    /**
      * A list of email addresses that AWS Support copies on case correspondence.
      */
    var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
    /**
      * The communication body text when you create an AWS Support case by calling CreateCase.
      */
    var communicationBody: CommunicationBody
    /**
      * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."
      */
    var issueType: js.UndefOr[IssueType] = js.undefined
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[Language] = js.undefined
    /**
      * The code for the AWS service returned by the call to DescribeServices.
      */
    var serviceCode: js.UndefOr[ServiceCode] = js.undefined
    /**
      * The code for the severity level returned by the call to DescribeSeverityLevels.  The availability of severity levels depends on each customer's support subscription. In other words, your subscription may not necessarily require the urgent level of response time. 
      */
    var severityCode: js.UndefOr[SeverityCode] = js.undefined
    /**
      * The title of the AWS Support case.
      */
    var subject: Subject
  }
  
  trait CreateCaseResponse extends js.Object {
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: js.UndefOr[CaseId] = js.undefined
  }
  
  trait DescribeAttachmentRequest extends js.Object {
    /**
      * The ID of the attachment to return. Attachment IDs are returned by the DescribeCommunications operation.
      */
    var attachmentId: AttachmentId
  }
  
  trait DescribeAttachmentResponse extends js.Object {
    /**
      * The attachment content and file name.
      */
    var attachment: js.UndefOr[Attachment] = js.undefined
  }
  
  trait DescribeCasesRequest extends js.Object {
    /**
      * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
      */
    var afterTime: js.UndefOr[AfterTime] = js.undefined
    /**
      * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
      */
    var beforeTime: js.UndefOr[BeforeTime] = js.undefined
    /**
      * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
      */
    var caseIdList: js.UndefOr[CaseIdList] = js.undefined
    /**
      * The ID displayed for a case in the AWS Support Center user interface.
      */
    var displayId: js.UndefOr[DisplayId] = js.undefined
    /**
      * Specifies whether communications should be included in the DescribeCases results. The default is true.
      */
    var includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined
    /**
      * Specifies whether resolved support cases should be included in the DescribeCases results. The default is false.
      */
    var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[Language] = js.undefined
    /**
      * The maximum number of results to return before paginating.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A resumption point for pagination.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeCasesResponse extends js.Object {
    /**
      * The details for the cases that match the request.
      */
    var cases: js.UndefOr[CaseList] = js.undefined
    /**
      * A resumption point for pagination.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeCommunicationsRequest extends js.Object {
    /**
      * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
      */
    var afterTime: js.UndefOr[AfterTime] = js.undefined
    /**
      * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
      */
    var beforeTime: js.UndefOr[BeforeTime] = js.undefined
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: CaseId
    /**
      * The maximum number of results to return before paginating.
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * A resumption point for pagination.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeCommunicationsResponse extends js.Object {
    /**
      * The communications for the case.
      */
    var communications: js.UndefOr[CommunicationList] = js.undefined
    /**
      * A resumption point for pagination.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeServicesRequest extends js.Object {
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[Language] = js.undefined
    /**
      * A JSON-formatted list of service codes available for AWS services.
      */
    var serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined
  }
  
  trait DescribeServicesResponse extends js.Object {
    /**
      * A JSON-formatted list of AWS services.
      */
    var services: js.UndefOr[ServiceList] = js.undefined
  }
  
  trait DescribeSeverityLevelsRequest extends js.Object {
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[Language] = js.undefined
  }
  
  trait DescribeSeverityLevelsResponse extends js.Object {
    /**
      * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
      */
    var severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined
  }
  
  trait DescribeTrustedAdvisorCheckRefreshStatusesRequest extends js.Object {
    /**
      * The IDs of the Trusted Advisor checks to get the status of. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
      */
    var checkIds: StringList
  }
  
  trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
    /**
      * The refresh status of the specified Trusted Advisor checks.
      */
    var statuses: TrustedAdvisorCheckRefreshStatusList
  }
  
  trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
    /**
      * The unique identifier for the Trusted Advisor check.
      */
    var checkId: String
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeTrustedAdvisorCheckResultResponse extends js.Object {
    /**
      * The detailed results of the Trusted Advisor check.
      */
    var result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
  }
  
  trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
    /**
      * The IDs of the Trusted Advisor checks.
      */
    var checkIds: StringList
  }
  
  trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
    /**
      * The summary information for the requested Trusted Advisor checks.
      */
    var summaries: TrustedAdvisorCheckSummaryList
  }
  
  trait DescribeTrustedAdvisorChecksRequest extends js.Object {
    /**
      * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
      */
    var language: String
  }
  
  trait DescribeTrustedAdvisorChecksResponse extends js.Object {
    /**
      * Information about all available Trusted Advisor checks.
      */
    var checks: TrustedAdvisorCheckList
  }
  
  trait RecentCaseCommunications extends js.Object {
    /**
      * The five most recent communications associated with the case.
      */
    var communications: js.UndefOr[CommunicationList] = js.undefined
    /**
      * A resumption point for pagination.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait RefreshTrustedAdvisorCheckRequest extends js.Object {
    /**
      * The unique identifier for the Trusted Advisor check to refresh. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
      */
    var checkId: String
  }
  
  trait RefreshTrustedAdvisorCheckResponse extends js.Object {
    /**
      * The current refresh status for a check, including the amount of time until the check is eligible for refresh.
      */
    var status: TrustedAdvisorCheckRefreshStatus
  }
  
  trait ResolveCaseRequest extends js.Object {
    /**
      * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
      */
    var caseId: js.UndefOr[CaseId] = js.undefined
  }
  
  trait ResolveCaseResponse extends js.Object {
    /**
      * The status of the case after the ResolveCase request was processed.
      */
    var finalCaseStatus: js.UndefOr[CaseStatus] = js.undefined
    /**
      * The status of the case when the ResolveCase request was sent.
      */
    var initialCaseStatus: js.UndefOr[CaseStatus] = js.undefined
  }
  
  trait Service extends js.Object {
    /**
      * A list of categories that describe the type of support issue a case describes. Categories consist of a category name and a category code. Category names and codes are passed to AWS Support when you call CreateCase.
      */
    var categories: js.UndefOr[CategoryList] = js.undefined
    /**
      * The code for an AWS service returned by the DescribeServices response. The name element contains the corresponding friendly name.
      */
    var code: js.UndefOr[ServiceCode] = js.undefined
    /**
      * The friendly name for an AWS service. The code element contains the corresponding code.
      */
    var name: js.UndefOr[ServiceName] = js.undefined
  }
  
  trait SeverityLevel extends js.Object {
    /**
      * One of four values: "low," "medium," "high," and "urgent". These values correspond to response times returned to the caller in severityLevel.name. 
      */
    var code: js.UndefOr[SeverityLevelCode] = js.undefined
    /**
      * The name of the severity level that corresponds to the severity level code.
      */
    var name: js.UndefOr[SeverityLevelName] = js.undefined
  }
  
  trait TrustedAdvisorCategorySpecificSummary extends js.Object {
    /**
      * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
      */
    var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
  }
  
  trait TrustedAdvisorCheckDescription extends js.Object {
    /**
      * The category of the Trusted Advisor check.
      */
    var category: String
    /**
      * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains HTML markup).
      */
    var description: String
    /**
      * The unique identifier for the Trusted Advisor check.
      */
    var id: String
    /**
      * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to the order of the data in the Metadata element of the TrustedAdvisorResourceDetail for the check. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
      */
    var metadata: StringList
    /**
      * The display name for the Trusted Advisor check.
      */
    var name: String
  }
  
  trait TrustedAdvisorCheckRefreshStatus extends js.Object {
    /**
      * The unique identifier for the Trusted Advisor check.
      */
    var checkId: String
    /**
      * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
      */
    var millisUntilNextRefreshable: Long
    /**
      * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing", "success", or "abandoned".
      */
    var status: String
  }
  
  trait TrustedAdvisorCheckResult extends js.Object {
    /**
      * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
      */
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    /**
      * The unique identifier for the Trusted Advisor check.
      */
    var checkId: String
    /**
      * The details about each resource listed in the check result.
      */
    var flaggedResources: TrustedAdvisorResourceDetailList
    var resourcesSummary: TrustedAdvisorResourcesSummary
    /**
      * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
      */
    var status: String
    /**
      * The time of the last refresh of the check.
      */
    var timestamp: String
  }
  
  trait TrustedAdvisorCheckSummary extends js.Object {
    /**
      * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
      */
    var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    /**
      * The unique identifier for the Trusted Advisor check.
      */
    var checkId: String
    /**
      * Specifies whether the Trusted Advisor check has flagged resources.
      */
    var hasFlaggedResources: js.UndefOr[Boolean] = js.undefined
    var resourcesSummary: TrustedAdvisorResourcesSummary
    /**
      * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
      */
    var status: String
    /**
      * The time of the last refresh of the check.
      */
    var timestamp: String
  }
  
  trait TrustedAdvisorCostOptimizingSummary extends js.Object {
    /**
      * The estimated monthly savings that might be realized if the recommended actions are taken.
      */
    var estimatedMonthlySavings: Double
    /**
      * The estimated percentage of savings that might be realized if the recommended actions are taken.
      */
    var estimatedPercentMonthlySavings: Double
  }
  
  trait TrustedAdvisorResourceDetail extends js.Object {
    /**
      * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the user.
      */
    var isSuppressed: js.UndefOr[Boolean] = js.undefined
    /**
      * Additional information about the identified resource. The exact metadata and its order can be obtained by inspecting the TrustedAdvisorCheckDescription object returned by the call to DescribeTrustedAdvisorChecks. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
      */
    var metadata: StringList
    /**
      * The AWS region in which the identified resource is located.
      */
    var region: js.UndefOr[String] = js.undefined
    /**
      * The unique identifier for the identified resource.
      */
    var resourceId: String
    /**
      * The status code for the resource identified in the Trusted Advisor check.
      */
    var status: String
  }
  
  trait TrustedAdvisorResourcesSummary extends js.Object {
    /**
      * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
      */
    var resourcesFlagged: Long
    /**
      * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
      */
    var resourcesIgnored: Long
    /**
      * The number of AWS resources that were analyzed by the Trusted Advisor check.
      */
    var resourcesProcessed: Long
    /**
      * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
      */
    var resourcesSuppressed: Long
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
      */
    def addAttachmentsToSet(): awsDashSdkLib.libRequestMod.Request[AddAttachmentsToSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addAttachmentsToSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAttachmentsToSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAttachmentsToSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
      */
    def addAttachmentsToSet(params: AddAttachmentsToSetRequest): awsDashSdkLib.libRequestMod.Request[AddAttachmentsToSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addAttachmentsToSet(
      params: AddAttachmentsToSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAttachmentsToSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAttachmentsToSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
      */
    def addCommunicationToCase(): awsDashSdkLib.libRequestMod.Request[AddCommunicationToCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addCommunicationToCase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddCommunicationToCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddCommunicationToCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
      */
    def addCommunicationToCase(params: AddCommunicationToCaseRequest): awsDashSdkLib.libRequestMod.Request[AddCommunicationToCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addCommunicationToCase(
      params: AddCommunicationToCaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddCommunicationToCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddCommunicationToCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
      */
    def createCase(): awsDashSdkLib.libRequestMod.Request[CreateCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
      */
    def createCase(params: CreateCaseRequest): awsDashSdkLib.libRequestMod.Request[CreateCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCase(
      params: CreateCaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
      */
    def describeAttachment(): awsDashSdkLib.libRequestMod.Request[DescribeAttachmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAttachment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAttachmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAttachmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
      */
    def describeAttachment(params: DescribeAttachmentRequest): awsDashSdkLib.libRequestMod.Request[DescribeAttachmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAttachment(
      params: DescribeAttachmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAttachmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAttachmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
      */
    def describeCases(): awsDashSdkLib.libRequestMod.Request[DescribeCasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
      */
    def describeCases(params: DescribeCasesRequest): awsDashSdkLib.libRequestMod.Request[DescribeCasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCases(
      params: DescribeCasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
      */
    def describeCommunications(): awsDashSdkLib.libRequestMod.Request[DescribeCommunicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCommunications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommunicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommunicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
      */
    def describeCommunications(params: DescribeCommunicationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeCommunicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCommunications(
      params: DescribeCommunicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCommunicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCommunicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
      */
    def describeServices(): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
      */
    def describeServices(params: DescribeServicesRequest): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServices(
      params: DescribeServicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
      */
    def describeSeverityLevels(): awsDashSdkLib.libRequestMod.Request[DescribeSeverityLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSeverityLevels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSeverityLevelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSeverityLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
      */
    def describeSeverityLevels(params: DescribeSeverityLevelsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSeverityLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSeverityLevels(
      params: DescribeSeverityLevelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSeverityLevelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSeverityLevelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
      */
    def describeTrustedAdvisorCheckRefreshStatuses(): awsDashSdkLib.libRequestMod.Request[
        DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeTrustedAdvisorCheckRefreshStatuses(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
      */
    def describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeTrustedAdvisorCheckRefreshStatuses(
      params: DescribeTrustedAdvisorCheckRefreshStatusesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
      */
    def describeTrustedAdvisorCheckResult(): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckResultResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorCheckResult(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckResultResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckResultResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
      */
    def describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckResultResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorCheckResult(
      params: DescribeTrustedAdvisorCheckResultRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckResultResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckResultResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
      */
    def describeTrustedAdvisorCheckSummaries(): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckSummariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorCheckSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckSummariesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckSummariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
      */
    def describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckSummariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorCheckSummaries(
      params: DescribeTrustedAdvisorCheckSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorCheckSummariesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorCheckSummariesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
      */
    def describeTrustedAdvisorChecks(): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorChecks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorChecksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
      */
    def describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrustedAdvisorChecks(
      params: DescribeTrustedAdvisorChecksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustedAdvisorChecksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustedAdvisorChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
      */
    def refreshTrustedAdvisorCheck(): awsDashSdkLib.libRequestMod.Request[RefreshTrustedAdvisorCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshTrustedAdvisorCheck(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshTrustedAdvisorCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshTrustedAdvisorCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
      */
    def refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest): awsDashSdkLib.libRequestMod.Request[RefreshTrustedAdvisorCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshTrustedAdvisorCheck(
      params: RefreshTrustedAdvisorCheckRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshTrustedAdvisorCheckResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshTrustedAdvisorCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
      */
    def resolveCase(): awsDashSdkLib.libRequestMod.Request[ResolveCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveCase(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
      */
    def resolveCase(params: ResolveCaseRequest): awsDashSdkLib.libRequestMod.Request[ResolveCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveCase(
      params: ResolveCaseRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveCaseResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveCaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AfterTime = java.lang.String
  type AttachmentId = java.lang.String
  type AttachmentSet = js.Array[AttachmentDetails]
  type AttachmentSetId = java.lang.String
  type Attachments = js.Array[Attachment]
  type BeforeTime = java.lang.String
  type Boolean = scala.Boolean
  type CaseId = java.lang.String
  type CaseIdList = js.Array[CaseId]
  type CaseList = js.Array[CaseDetails]
  type CaseStatus = java.lang.String
  type CategoryCode = java.lang.String
  type CategoryList = js.Array[Category]
  type CategoryName = java.lang.String
  type CcEmailAddress = java.lang.String
  type CcEmailAddressList = js.Array[CcEmailAddress]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CommunicationBody = java.lang.String
  type CommunicationList = js.Array[Communication]
  type Data = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsSupportMod.Blob | java.lang.String
  type DisplayId = java.lang.String
  type Double = scala.Double
  type ExpiryTime = java.lang.String
  type FileName = java.lang.String
  type IncludeCommunications = scala.Boolean
  type IncludeResolvedCases = scala.Boolean
  type IssueType = java.lang.String
  type Language = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Result = scala.Boolean
  type ServiceCode = java.lang.String
  type ServiceCodeList = js.Array[ServiceCode]
  type ServiceList = js.Array[Service]
  type ServiceName = java.lang.String
  type SeverityCode = java.lang.String
  type SeverityLevelCode = java.lang.String
  type SeverityLevelName = java.lang.String
  type SeverityLevelsList = js.Array[SeverityLevel]
  type Status = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type Subject = java.lang.String
  type SubmittedBy = java.lang.String
  type TimeCreated = java.lang.String
  type TrustedAdvisorCheckList = js.Array[TrustedAdvisorCheckDescription]
  type TrustedAdvisorCheckRefreshStatusList = js.Array[TrustedAdvisorCheckRefreshStatus]
  type TrustedAdvisorCheckSummaryList = js.Array[TrustedAdvisorCheckSummary]
  type TrustedAdvisorResourceDetailList = js.Array[TrustedAdvisorResourceDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-04-15`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

