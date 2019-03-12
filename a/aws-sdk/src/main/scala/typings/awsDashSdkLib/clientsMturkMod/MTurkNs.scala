package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mturk", "MTurk")
@js.native
object MTurkNs extends js.Object {
  trait AcceptQualificationRequestRequest extends js.Object {
    /**
      *  The value of the Qualification. You can omit this value if you are using the presence or absence of the Qualification as the basis for a HIT requirement. 
      */
    var IntegerValue: js.UndefOr[Integer] = js.undefined
    /**
      * The ID of the Qualification request, as returned by the GetQualificationRequests operation.
      */
    var QualificationRequestId: String
  }
  
  trait AcceptQualificationRequestResponse extends js.Object
  
  trait ApproveAssignmentRequest extends js.Object {
    /**
      *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
      */
    var AssignmentId: EntityId
    /**
      *  A flag indicating that an assignment should be approved even if it was previously rejected. Defaults to False. 
      */
    var OverrideRejection: js.UndefOr[Boolean] = js.undefined
    /**
      *  A message for the Worker, which the Worker can see in the Status section of the web site. 
      */
    var RequesterFeedback: js.UndefOr[String] = js.undefined
  }
  
  trait ApproveAssignmentResponse extends js.Object
  
  trait Assignment extends js.Object {
    /**
      *  The date and time the Worker accepted the assignment.
      */
    var AcceptTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer may be empty.
      */
    var Answer: js.UndefOr[String] = js.undefined
    /**
      *  If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time the Requester approved the results. This value is omitted from the assignment if the Requester has not yet approved the results.
      */
    var ApprovalTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  A unique identifier for the assignment.
      */
    var AssignmentId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The status of the assignment.
      */
    var AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined
    /**
      *  If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are considered Approved automatically if they have not already been explicitly approved or rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
      */
    var AutoApprovalTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The date and time of the deadline for the assignment. This value is derived from the deadline specification for the HIT and the date and time the Worker accepted the HIT.
      */
    var Deadline: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The ID of the HIT.
      */
    var HITId: js.UndefOr[EntityId] = js.undefined
    /**
      *  If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and time the Requester rejected the results.
      */
    var RejectionTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation, if the Requester approved or rejected the assignment and specified feedback.
      */
    var RequesterFeedback: js.UndefOr[String] = js.undefined
    /**
      *  If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is omitted from the assignment if the Worker has not yet submitted results.
      */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The ID of the Worker who accepted the HIT.
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait AssociateQualificationWithWorkerRequest extends js.Object {
    /**
      * The value of the Qualification to assign.
      */
    var IntegerValue: js.UndefOr[Integer] = js.undefined
    /**
      * The ID of the Qualification type to use for the assigned Qualification.
      */
    var QualificationTypeId: EntityId
    /**
      *  Specifies whether to send a notification email message to the Worker saying that the qualification was assigned to the Worker. Note: this is true by default. 
      */
    var SendNotification: js.UndefOr[Boolean] = js.undefined
    /**
      *  The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT assignments and Qualification requests. 
      */
    var WorkerId: CustomerId
  }
  
  trait AssociateQualificationWithWorkerResponse extends js.Object
  
  trait BonusPayment extends js.Object {
    /**
      * The ID of the assignment associated with this bonus payment.
      */
    var AssignmentId: js.UndefOr[EntityId] = js.undefined
    var BonusAmount: js.UndefOr[CurrencyAmount] = js.undefined
    /**
      * The date and time of when the bonus was granted.
      */
    var GrantTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The Reason text given when the bonus was granted, if any.
      */
    var Reason: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Worker to whom the bonus was paid.
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateAdditionalAssignmentsForHITRequest extends js.Object {
    /**
      * The ID of the HIT to extend.
      */
    var HITId: EntityId
    /**
      * The number of additional assignments to request for this HIT.
      */
    var NumberOfAdditionalAssignments: Integer
    /**
      *  A unique identifier for this request, which allows you to retry the call on error without extending the HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the extend HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID. 
      */
    var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  }
  
  trait CreateAdditionalAssignmentsForHITResponse extends js.Object
  
  trait CreateHITRequest extends js.Object {
    /**
      *  The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find and accept. 
      */
    var AssignmentDurationInSeconds: Long
    /**
      *  The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
      */
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      *  The number of seconds after an assignment for the HIT has been submitted, after which the assignment is considered Approved automatically unless the Requester explicitly rejects it. 
      */
    var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      *  A general description of the HIT. A description includes detailed information about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate the HIT before accepting it. 
      */
    var Description: String
    /**
      *  The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT by providing those values as HITLayoutParameters.   Constraints: Either a Question parameter or a HITLayoutId parameter must be provided. 
      */
    var HITLayoutId: js.UndefOr[EntityId] = js.undefined
    /**
      *  If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter structure. For more information, see HITLayout. 
      */
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined
    /**
      *  The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
      */
    var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      *  One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find HITs. 
      */
    var Keywords: js.UndefOr[String] = js.undefined
    /**
      *  An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT have been accepted. 
      */
    var LifetimeInSeconds: Long
    /**
      *  The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
      */
    var MaxAssignments: js.UndefOr[Integer] = js.undefined
    /**
      *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
      */
    var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined
    /**
      *  The data the person completing the HIT uses to produce the results.   Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including whitespace.  Either a Question parameter or a HITLayoutId parameter must be provided.
      */
    var Question: js.UndefOr[String] = js.undefined
    /**
      *  An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application that corresponds with the HIT.   The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown to the Worker, or any other Requester.   The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are grouped. 
      */
    var RequesterAnnotation: js.UndefOr[String] = js.undefined
    /**
      *  The amount of money the Requester will pay a Worker for successfully completing the HIT. 
      */
    var Reward: CurrencyAmount
    /**
      *  The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned. 
      */
    var Title: String
    /**
      *  A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.    Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.  
      */
    var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  }
  
  trait CreateHITResponse extends js.Object {
    /**
      *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
      */
    var HIT: js.UndefOr[HIT] = js.undefined
  }
  
  trait CreateHITTypeRequest extends js.Object {
    /**
      *  The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find and accept. 
      */
    var AssignmentDurationInSeconds: Long
    /**
      *  The number of seconds after an assignment for the HIT has been submitted, after which the assignment is considered Approved automatically unless the Requester explicitly rejects it. 
      */
    var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      *  A general description of the HIT. A description includes detailed information about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate the HIT before accepting it. 
      */
    var Description: String
    /**
      *  One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find HITs. 
      */
    var Keywords: js.UndefOr[String] = js.undefined
    /**
      *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
      */
    var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined
    /**
      *  The amount of money the Requester will pay a Worker for successfully completing the HIT. 
      */
    var Reward: CurrencyAmount
    /**
      *  The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned. 
      */
    var Title: String
  }
  
  trait CreateHITTypeResponse extends js.Object {
    /**
      *  The ID of the newly registered HIT type.
      */
    var HITTypeId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateHITWithHITTypeRequest extends js.Object {
    /**
      *  The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
      */
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      *  The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT by providing those values as HITLayoutParameters.   Constraints: Either a Question parameter or a HITLayoutId parameter must be provided. 
      */
    var HITLayoutId: js.UndefOr[EntityId] = js.undefined
    /**
      *  If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter structure. For more information, see HITLayout. 
      */
    var HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined
    /**
      *  The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
      */
    var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      * The HIT type ID you want to create this HIT with.
      */
    var HITTypeId: EntityId
    /**
      *  An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT have been accepted. 
      */
    var LifetimeInSeconds: Long
    /**
      *  The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
      */
    var MaxAssignments: js.UndefOr[Integer] = js.undefined
    /**
      *  The data the person completing the HIT uses to produce the results.   Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including whitespace.  Either a Question parameter or a HITLayoutId parameter must be provided.
      */
    var Question: js.UndefOr[String] = js.undefined
    /**
      *  An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application that corresponds with the HIT.   The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown to the Worker, or any other Requester.   The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are grouped. 
      */
    var RequesterAnnotation: js.UndefOr[String] = js.undefined
    /**
      *  A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.    Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.  
      */
    var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  }
  
  trait CreateHITWithHITTypeResponse extends js.Object {
    /**
      *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
      */
    var HIT: js.UndefOr[HIT] = js.undefined
  }
  
  trait CreateQualificationTypeRequest extends js.Object {
    /**
      * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure. Constraints: Must not be longer than 65535 bytes. Constraints: None. If not specified, you must process Qualification requests manually.
      */
    var AnswerKey: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Constraints: If the Test parameter is specified, this parameter cannot be true.
      */
    var AutoGranted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the AutoGranted parameter is true.
      */
    var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
    /**
      * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is displayed when a Worker examines a Qualification type.
      */
    var Description: String
    /**
      * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type make the type easier to find during a search.
      */
    var Keywords: js.UndefOr[String] = js.undefined
    /**
      *  The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and to find the type using a Qualification type search. It must be unique across all of your Qualification types.
      */
    var Name: String
    /**
      * The initial status of the Qualification type. Constraints: Valid values are: Active | Inactive
      */
    var QualificationTypeStatus: awsDashSdkLib.clientsMturkMod.MTurkNs.QualificationTypeStatus
    /**
      * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before the worker can retry the Qualification request. Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
      */
    var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      *  The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified.  Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
      */
    var Test: js.UndefOr[String] = js.undefined
    /**
      * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
      */
    var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  }
  
  trait CreateQualificationTypeResponse extends js.Object {
    /**
      * The created Qualification type, returned as a QualificationType data structure.
      */
    var QualificationType: js.UndefOr[QualificationType] = js.undefined
  }
  
  trait CreateWorkerBlockRequest extends js.Object {
    /**
      * A message explaining the reason for blocking the Worker. This parameter enables you to keep track of your Workers. The Worker does not see this message.
      */
    var Reason: String
    /**
      * The ID of the Worker to block.
      */
    var WorkerId: CustomerId
  }
  
  trait CreateWorkerBlockResponse extends js.Object
  
  trait DeleteHITRequest extends js.Object {
    /**
      * The ID of the HIT to be deleted.
      */
    var HITId: EntityId
  }
  
  trait DeleteHITResponse extends js.Object
  
  trait DeleteQualificationTypeRequest extends js.Object {
    /**
      * The ID of the QualificationType to dispose.
      */
    var QualificationTypeId: EntityId
  }
  
  trait DeleteQualificationTypeResponse extends js.Object
  
  trait DeleteWorkerBlockRequest extends js.Object {
    /**
      * A message that explains the reason for unblocking the Worker. The Worker does not see this message.
      */
    var Reason: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Worker to unblock.
      */
    var WorkerId: CustomerId
  }
  
  trait DeleteWorkerBlockResponse extends js.Object
  
  trait DisassociateQualificationFromWorkerRequest extends js.Object {
    /**
      * The ID of the Qualification type of the Qualification to be revoked.
      */
    var QualificationTypeId: EntityId
    /**
      * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this message.
      */
    var Reason: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Worker who possesses the Qualification to be revoked.
      */
    var WorkerId: CustomerId
  }
  
  trait DisassociateQualificationFromWorkerResponse extends js.Object
  
  trait GetAccountBalanceRequest extends js.Object
  
  trait GetAccountBalanceResponse extends js.Object {
    var AvailableBalance: js.UndefOr[CurrencyAmount] = js.undefined
    var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.undefined
  }
  
  trait GetAssignmentRequest extends js.Object {
    /**
      * The ID of the Assignment to be retrieved.
      */
    var AssignmentId: EntityId
  }
  
  trait GetAssignmentResponse extends js.Object {
    /**
      *  The assignment. The response includes one Assignment element. 
      */
    var Assignment: js.UndefOr[Assignment] = js.undefined
    /**
      *  The HIT associated with this assignment. The response includes one HIT element.
      */
    var HIT: js.UndefOr[HIT] = js.undefined
  }
  
  trait GetFileUploadURLRequest extends js.Object {
    /**
      * The ID of the assignment that contains the question with a FileUploadAnswer.
      */
    var AssignmentId: EntityId
    /**
      * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
      */
    var QuestionIdentifier: String
  }
  
  trait GetFileUploadURLResponse extends js.Object {
    /**
      *  A temporary URL for the file that the Worker uploaded for the answer. 
      */
    var FileUploadURL: js.UndefOr[String] = js.undefined
  }
  
  trait GetHITRequest extends js.Object {
    /**
      * The ID of the HIT to be retrieved.
      */
    var HITId: EntityId
  }
  
  trait GetHITResponse extends js.Object {
    /**
      *  Contains the requested HIT data.
      */
    var HIT: js.UndefOr[HIT] = js.undefined
  }
  
  trait GetQualificationScoreRequest extends js.Object {
    /**
      * The ID of the QualificationType.
      */
    var QualificationTypeId: EntityId
    /**
      * The ID of the Worker whose Qualification is being updated.
      */
    var WorkerId: CustomerId
  }
  
  trait GetQualificationScoreResponse extends js.Object {
    /**
      *  The Qualification data structure of the Qualification assigned to a user, including the Qualification type and the value (score). 
      */
    var Qualification: js.UndefOr[Qualification] = js.undefined
  }
  
  trait GetQualificationTypeRequest extends js.Object {
    /**
      * The ID of the QualificationType.
      */
    var QualificationTypeId: EntityId
  }
  
  trait GetQualificationTypeResponse extends js.Object {
    /**
      *  The returned Qualification Type
      */
    var QualificationType: js.UndefOr[QualificationType] = js.undefined
  }
  
  trait HIT extends js.Object {
    /**
      *  The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
      */
    var AssignmentDurationInSeconds: js.UndefOr[Long] = js.undefined
    /**
      * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid. 
      */
    var AutoApprovalDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      *  The date and time the HIT was created.
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  A general description of the HIT.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The date and time the HIT expires.
      */
    var Expiration: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The ID of the HIT Group of this HIT.
      */
    var HITGroupId: js.UndefOr[EntityId] = js.undefined
    /**
      *  A unique identifier for the HIT.
      */
    var HITId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The ID of the HIT Layout of this HIT.
      */
    var HITLayoutId: js.UndefOr[EntityId] = js.undefined
    /**
      *  Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate | ReviewedInappropriate.
      */
    var HITReviewStatus: js.UndefOr[HITReviewStatus] = js.undefined
    /**
      * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing | Disposed. 
      */
    var HITStatus: js.UndefOr[HITStatus] = js.undefined
    /**
      * The ID of the HIT type of this HIT
      */
    var HITTypeId: js.UndefOr[EntityId] = js.undefined
    /**
      *  One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of a HIT are more likely to have the HIT in the search results.
      */
    var Keywords: js.UndefOr[String] = js.undefined
    /**
      * The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
      */
    var MaxAssignments: js.UndefOr[Integer] = js.undefined
    /**
      *  The number of assignments for this HIT that are available for Workers to accept.
      */
    var NumberOfAssignmentsAvailable: js.UndefOr[Integer] = js.undefined
    /**
      *  The number of assignments for this HIT that have been approved or rejected.
      */
    var NumberOfAssignmentsCompleted: js.UndefOr[Integer] = js.undefined
    /**
      *  The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not yet been submitted, returned, or abandoned.
      */
    var NumberOfAssignmentsPending: js.UndefOr[Integer] = js.undefined
    /**
      *  Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT. Additionally, other actions can be restricted using the ActionsGuarded field on each QualificationRequirement structure. 
      */
    var QualificationRequirements: js.UndefOr[QualificationRequirementList] = js.undefined
    /**
      *  The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm, HTMLQuestion or an ExternalQuestion data structure.
      */
    var Question: js.UndefOr[String] = js.undefined
    /**
      *  An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of the HIT.
      */
    var RequesterAnnotation: js.UndefOr[String] = js.undefined
    var Reward: js.UndefOr[CurrencyAmount] = js.undefined
    /**
      *  The title of the HIT.
      */
    var Title: js.UndefOr[String] = js.undefined
  }
  
  trait HITLayoutParameter extends js.Object {
    /**
      *  The name of the parameter in the HITLayout. 
      */
    var Name: String
    /**
      * The value substituted for the parameter referenced in the HITLayout. 
      */
    var Value: String
  }
  
  trait ListAssignmentsForHITRequest extends js.Object {
    /**
      * The status of the assignments to return: Submitted | Approved | Rejected
      */
    var AssignmentStatuses: js.UndefOr[AssignmentStatusList] = js.undefined
    /**
      * The ID of the HIT.
      */
    var HITId: EntityId
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListAssignmentsForHITResponse extends js.Object {
    /**
      *  The collection of Assignment data structures returned by this call.
      */
    var Assignments: js.UndefOr[AssignmentList] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
  }
  
  trait ListBonusPaymentsRequest extends js.Object {
    /**
      * The ID of the assignment associated with the bonus payments to retrieve. If specified, only bonus payments for the given assignment are returned. Either the HITId parameter or the AssignmentId parameter must be specified
      */
    var AssignmentId: js.UndefOr[EntityId] = js.undefined
    /**
      * The ID of the HIT associated with the bonus payments to retrieve. If not specified, all bonus payments for all assignments for the given HIT are returned. Either the HITId parameter or the AssignmentId parameter must be specified
      */
    var HITId: js.UndefOr[EntityId] = js.undefined
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListBonusPaymentsResponse extends js.Object {
    /**
      * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
      */
    var BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
  }
  
  trait ListHITsForQualificationTypeRequest extends js.Object {
    /**
      *  Limit the number of results returned. 
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination Token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The ID of the Qualification type to use when querying HITs. 
      */
    var QualificationTypeId: EntityId
  }
  
  trait ListHITsForQualificationTypeResponse extends js.Object {
    /**
      *  The list of HIT elements returned by the query.
      */
    var HITs: js.UndefOr[HITList] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
  }
  
  trait ListHITsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListHITsResponse extends js.Object {
    /**
      *  The list of HIT elements returned by the query.
      */
    var HITs: js.UndefOr[HITList] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call.
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
  }
  
  trait ListQualificationRequestsRequest extends js.Object {
    /**
      *  The maximum number of results to return in a single call. 
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The ID of the QualificationType.
      */
    var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait ListQualificationRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
    /**
      * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
      */
    var QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined
  }
  
  trait ListQualificationTypesRequest extends js.Object {
    /**
      *  The maximum number of results to return in a single call. 
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      *  Specifies that only Qualification types that the Requester created are returned. If false, the operation returns all Qualification types. 
      */
    var MustBeOwnedByCaller: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types, including those managed by the system, are considered. Valid values are True | False. 
      */
    var MustBeRequestable: Boolean
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  A text query against all of the searchable attributes of Qualification types. 
      */
    var Query: js.UndefOr[String] = js.undefined
  }
  
  trait ListQualificationTypesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of Qualification types on this page in the filtered results list, equivalent to the number of types this operation returns. 
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
    /**
      *  The list of QualificationType elements returned by the query. 
      */
    var QualificationTypes: js.UndefOr[QualificationTypeList] = js.undefined
  }
  
  trait ListReviewPolicyResultsForHITRequest extends js.Object {
    /**
      * The unique identifier of the HIT to retrieve review results for.
      */
    var HITId: EntityId
    /**
      * Limit the number of results returned.
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to retrieve all data for both policy levels. For a list of all the described policies, see Review Policies. 
      */
    var PolicyLevels: js.UndefOr[ReviewPolicyLevelList] = js.undefined
    /**
      *  Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their outcomes. 
      */
    var RetrieveActions: js.UndefOr[Boolean] = js.undefined
    /**
      *  Specify if the operation should retrieve a list of the results computed by the Review Policies. 
      */
    var RetrieveResults: js.UndefOr[Boolean] = js.undefined
  }
  
  trait ListReviewPolicyResultsForHITResponse extends js.Object {
    /**
      *  The name of the Assignment-level Review Policy. This contains only the PolicyName element. 
      */
    var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      *  Contains both ReviewResult and ReviewAction elements for an Assignment. 
      */
    var AssignmentReviewReport: js.UndefOr[ReviewReport] = js.undefined
    /**
      * The HITId of the HIT for which results have been returned.
      */
    var HITId: js.UndefOr[EntityId] = js.undefined
    /**
      * The name of the HIT-level Review Policy. This contains only the PolicyName element.
      */
    var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
    /**
      * Contains both ReviewResult and ReviewAction elements for a particular HIT. 
      */
    var HITReviewReport: js.UndefOr[ReviewReport] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListReviewableHITsRequest extends js.Object {
    /**
      *  The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are considered 
      */
    var HITTypeId: js.UndefOr[EntityId] = js.undefined
    /**
      *  Limit the number of results returned. 
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination Token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  Can be either Reviewable or Reviewing. Reviewable is the default value. 
      */
    var Status: js.UndefOr[ReviewableHITStatus] = js.undefined
  }
  
  trait ListReviewableHITsResponse extends js.Object {
    /**
      *  The list of HIT elements returned by the query.
      */
    var HITs: js.UndefOr[HITList] = js.undefined
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
  }
  
  trait ListWorkerBlocksRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListWorkerBlocksResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
    /**
      *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
      */
    var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.undefined
  }
  
  trait ListWorkersWithQualificationTypeRequest extends js.Object {
    /**
      *  Limit the number of results returned. 
      */
    var MaxResults: js.UndefOr[ResultSize] = js.undefined
    /**
      * Pagination Token
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The ID of the Qualification type of the Qualifications to return.
      */
    var QualificationTypeId: EntityId
    /**
      *  The status of the Qualifications to return. Can be Granted | Revoked. 
      */
    var Status: js.UndefOr[QualificationStatus] = js.undefined
  }
  
  trait ListWorkersWithQualificationTypeResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
      */
    var NumResults: js.UndefOr[Integer] = js.undefined
    /**
      *  The list of Qualification elements returned by this call. 
      */
    var Qualifications: js.UndefOr[QualificationList] = js.undefined
  }
  
  trait Locale extends js.Object {
    /**
      *  The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United States of America. 
      */
    var Country: CountryParameters
    /**
      * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to the state of Washington.
      */
    var Subdivision: js.UndefOr[CountryParameters] = js.undefined
  }
  
  trait NotificationSpecification extends js.Object {
    /**
      *  The target for notification messages. The Destination’s format is determined by the specified Transport:    When Transport is Email, the Destination is your email address.   When Transport is SQS, the Destination is your queue URL.   When Transport is SNS, the Destination is the ARN of your topic.  
      */
    var Destination: String
    /**
      *  The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted | AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved | HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the SendTestEventNotification operation. 
      */
    var EventTypes: EventTypeList
    /**
      *  The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS. 
      */
    var Transport: NotificationTransport
    /**
      * The version of the Notification API to use. Valid value is 2006-05-05.
      */
    var Version: String
  }
  
  trait NotifyWorkersFailureStatus extends js.Object {
    /**
      *  Encoded value for the failure type. 
      */
    var NotifyWorkersFailureCode: js.UndefOr[NotifyWorkersFailureCode] = js.undefined
    /**
      *  A message detailing the reason the Worker could not be notified. 
      */
    var NotifyWorkersFailureMessage: js.UndefOr[String] = js.undefined
    /**
      *  The ID of the Worker.
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait NotifyWorkersRequest extends js.Object {
    /**
      * The text of the email message to send. Can include up to 4,096 characters
      */
    var MessageText: String
    /**
      * The subject line of the email message to send. Can include up to 200 characters.
      */
    var Subject: String
    /**
      * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
      */
    var WorkerIds: CustomerIdList
  }
  
  trait NotifyWorkersResponse extends js.Object {
    /**
      *  When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of NotifyWorkersFailureStatus objects. 
      */
    var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.undefined
  }
  
  trait ParameterMapEntry extends js.Object {
    /**
      *  The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of the ScoreMyKnownAnswers/2011-09-01 Review Policy. 
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      *  The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in order for the answer to be scored correctly. 
      */
    var Values: js.UndefOr[StringList] = js.undefined
  }
  
  trait PolicyParameter extends js.Object {
    /**
      *  Name of the parameter from the list of Review Polices. 
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      *  List of ParameterMapEntry objects. 
      */
    var MapEntries: js.UndefOr[ParameterMapEntryList] = js.undefined
    /**
      *  The list of values of the Parameter
      */
    var Values: js.UndefOr[StringList] = js.undefined
  }
  
  trait Qualification extends js.Object {
    /**
      *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
      */
    var GrantTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The value (score) of the Qualification, if the Qualification has an integer value.
      */
    var IntegerValue: js.UndefOr[Integer] = js.undefined
    var LocaleValue: js.UndefOr[Locale] = js.undefined
    /**
      *  The ID of the Qualification type for the Qualification.
      */
    var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The status of the Qualification. Valid values are Granted | Revoked.
      */
    var Status: js.UndefOr[QualificationStatus] = js.undefined
    /**
      *  The ID of the Worker who possesses the Qualification. 
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait QualificationRequest extends js.Object {
    /**
      *  The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty. 
      */
    var Answer: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Qualification request, a unique identifier generated when the request was submitted. 
      */
    var QualificationRequestId: js.UndefOr[String] = js.undefined
    /**
      *  The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation. 
      */
    var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
    /**
      * The date and time the Qualification request had a status of Submitted. This is either the time the Worker submitted answers for a Qualification test, or the time the Worker requested the Qualification if the Qualification type does not have a test. 
      */
    var SubmitTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the time the Worker requests the Qualification.
      */
    var Test: js.UndefOr[String] = js.undefined
    /**
      *  The ID of the Worker requesting the Qualification.
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait QualificationRequirement extends js.Object {
    /**
      *  Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform an action when they have met all QualificationRequirements guarding the action. The actions in the order of least restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the RequiredToPreview field. 
      */
    var ActionsGuarded: js.UndefOr[HITAccessActions] = js.undefined
    /**
      * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's profile, regardless of its value. 
      */
    var Comparator: awsDashSdkLib.clientsMturkMod.MTurkNs.Comparator
    /**
      *  The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure. 
      */
    var IntegerValues: js.UndefOr[IntegerList] = js.undefined
    /**
      *  The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data structure. 
      */
    var LocaleValues: js.UndefOr[LocaleList] = js.undefined
    /**
      *  The ID of the Qualification type for the requirement.
      */
    var QualificationTypeId: String
    /**
      *  DEPRECATED: Use the ActionsGuarded field instead. If RequiredToPreview is true, the question data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default is false. This should not be used in combination with the ActionsGuarded field. 
      */
    var RequiredToPreview: js.UndefOr[Boolean] = js.undefined
  }
  
  trait QualificationType extends js.Object {
    /**
      * The answers to the Qualification test specified in the Test parameter.
      */
    var AnswerKey: js.UndefOr[String] = js.undefined
    /**
      * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Valid values are True | False.
      */
    var AutoGranted: js.UndefOr[Boolean] = js.undefined
    /**
      *  The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is 1 by default. 
      */
    var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
    /**
      *  The date and time the Qualification type was created. 
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  A long description for the Qualification type. 
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      *  Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by the system. Valid values are True | False. 
      */
    var IsRequestable: js.UndefOr[Boolean] = js.undefined
    /**
      *  One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type easier to find using a search. 
      */
    var Keywords: js.UndefOr[String] = js.undefined
    /**
      *  The name of the Qualification type. The type name is used to identify the type, and to find the type using a Qualification type search. 
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      *  A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you call the CreateQualificationType operation. 
      */
    var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The status of the Qualification type. A Qualification type's status determines if users can apply to receive a Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are Active | Inactive. 
      */
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined
    /**
      *  The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries are disabled and Workers can request a Qualification only once. 
      */
    var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      *  The questions for a Qualification test associated with this Qualification type that a user can take to obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot have both a specified Test parameter and an AutoGranted value of true. 
      */
    var Test: js.UndefOr[String] = js.undefined
    /**
      *  The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the Worker requests the Qualification. 
      */
    var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  }
  
  trait RejectAssignmentRequest extends js.Object {
    /**
      *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
      */
    var AssignmentId: EntityId
    /**
      *  A message for the Worker, which the Worker can see in the Status section of the web site. 
      */
    var RequesterFeedback: String
  }
  
  trait RejectAssignmentResponse extends js.Object
  
  trait RejectQualificationRequestRequest extends js.Object {
    /**
      *  The ID of the Qualification request, as returned by the ListQualificationRequests operation. 
      */
    var QualificationRequestId: String
    /**
      * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
      */
    var Reason: js.UndefOr[String] = js.undefined
  }
  
  trait RejectQualificationRequestResponse extends js.Object
  
  trait ReviewActionDetail extends js.Object {
    /**
      * The unique identifier for the action.
      */
    var ActionId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting results, and deciding which other actions will be necessary. 
      */
    var ActionName: js.UndefOr[String] = js.undefined
    /**
      *  The date when the action was completed.
      */
    var CompleteTime: js.UndefOr[Timestamp] = js.undefined
    /**
      *  Present only when the Results have a FAILED Status.
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    /**
      *  A description of the outcome of the review.
      */
    var Result: js.UndefOr[String] = js.undefined
    /**
      *  The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED. 
      */
    var Status: js.UndefOr[ReviewActionStatus] = js.undefined
    /**
      *  The specific HITId or AssignmentID targeted by the action.
      */
    var TargetId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The type of object in TargetId.
      */
    var TargetType: js.UndefOr[String] = js.undefined
  }
  
  trait ReviewPolicy extends js.Object {
    /**
      * Name of the parameter from the Review policy.
      */
    var Parameters: js.UndefOr[PolicyParameterList] = js.undefined
    /**
      *  Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01 
      */
    var PolicyName: String
  }
  
  trait ReviewReport extends js.Object {
    /**
      *  A list of ReviewAction objects for each action specified in the Review Policy. 
      */
    var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined
    /**
      *  A list of ReviewResults objects for each action specified in the Review Policy. 
      */
    var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined
  }
  
  trait ReviewResultDetail extends js.Object {
    /**
      *  A unique identifier of the Review action result. 
      */
    var ActionId: js.UndefOr[EntityId] = js.undefined
    /**
      *  Key identifies the particular piece of reviewed information. 
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      *  Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT. 
      */
    var QuestionId: js.UndefOr[EntityId] = js.undefined
    /**
      * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit results about the Assignment itself. 
      */
    var SubjectId: js.UndefOr[EntityId] = js.undefined
    /**
      *  The type of the object from the SubjectId field.
      */
    var SubjectType: js.UndefOr[String] = js.undefined
    /**
      *  The values of Key provided by the review policies you have selected. 
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait SendBonusRequest extends js.Object {
    /**
      * The ID of the assignment for which this bonus is paid.
      */
    var AssignmentId: EntityId
    /**
      *  The Bonus amount is a US Dollar amount specified using a string (for example, "5" represents $5.00 USD and "101.42" represents $101.42 USD). Do not include currency symbols or currency codes. 
      */
    var BonusAmount: CurrencyAmount
    /**
      * A message that explains the reason for the bonus payment. The Worker receiving the bonus can see this message.
      */
    var Reason: String
    /**
      * A unique identifier for this request, which allows you to retry the call on error without granting multiple bonuses. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the bonus already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID.
      */
    var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
    /**
      * The ID of the Worker being paid the bonus.
      */
    var WorkerId: CustomerId
  }
  
  trait SendBonusResponse extends js.Object
  
  trait SendTestEventNotificationRequest extends js.Object {
    /**
      *  The notification specification to test. This value is identical to the value you would provide to the UpdateNotificationSettings operation when you establish the notification specification for a HIT type. 
      */
    var Notification: NotificationSpecification
    /**
      *  The event to simulate to test the notification specification. This event is included in the test message even if the notification specification does not include the event type. The notification specification does not filter out the test event. 
      */
    var TestEventType: EventType
  }
  
  trait SendTestEventNotificationResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
      */
    def acceptQualificationRequest(): awsDashSdkLib.libRequestMod.Request[AcceptQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptQualificationRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptQualificationRequestResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
      */
    def acceptQualificationRequest(params: AcceptQualificationRequestRequest): awsDashSdkLib.libRequestMod.Request[AcceptQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptQualificationRequest(
      params: AcceptQualificationRequestRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptQualificationRequestResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
      */
    def approveAssignment(): awsDashSdkLib.libRequestMod.Request[ApproveAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def approveAssignment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApproveAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApproveAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
      */
    def approveAssignment(params: ApproveAssignmentRequest): awsDashSdkLib.libRequestMod.Request[ApproveAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def approveAssignment(
      params: ApproveAssignmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApproveAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApproveAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
      */
    def associateQualificationWithWorker(): awsDashSdkLib.libRequestMod.Request[AssociateQualificationWithWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateQualificationWithWorker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateQualificationWithWorkerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateQualificationWithWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
      */
    def associateQualificationWithWorker(params: AssociateQualificationWithWorkerRequest): awsDashSdkLib.libRequestMod.Request[AssociateQualificationWithWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateQualificationWithWorker(
      params: AssociateQualificationWithWorkerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateQualificationWithWorkerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateQualificationWithWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
      */
    def createAdditionalAssignmentsForHIT(): awsDashSdkLib.libRequestMod.Request[CreateAdditionalAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAdditionalAssignmentsForHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAdditionalAssignmentsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAdditionalAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
      */
    def createAdditionalAssignmentsForHIT(params: CreateAdditionalAssignmentsForHITRequest): awsDashSdkLib.libRequestMod.Request[CreateAdditionalAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAdditionalAssignmentsForHIT(
      params: CreateAdditionalAssignmentsForHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAdditionalAssignmentsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAdditionalAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
      */
    def createHIT(): awsDashSdkLib.libRequestMod.Request[CreateHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
      */
    def createHIT(params: CreateHITRequest): awsDashSdkLib.libRequestMod.Request[CreateHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHIT(
      params: CreateHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
      */
    def createHITType(): awsDashSdkLib.libRequestMod.Request[CreateHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHITType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
      */
    def createHITType(params: CreateHITTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHITType(
      params: CreateHITTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
      */
    def createHITWithHITType(): awsDashSdkLib.libRequestMod.Request[CreateHITWithHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHITWithHITType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITWithHITTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITWithHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
      */
    def createHITWithHITType(params: CreateHITWithHITTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateHITWithHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createHITWithHITType(
      params: CreateHITWithHITTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateHITWithHITTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateHITWithHITTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
      */
    def createQualificationType(): awsDashSdkLib.libRequestMod.Request[CreateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
      */
    def createQualificationType(params: CreateQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createQualificationType(
      params: CreateQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
      */
    def createWorkerBlock(): awsDashSdkLib.libRequestMod.Request[CreateWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkerBlock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkerBlockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
      */
    def createWorkerBlock(params: CreateWorkerBlockRequest): awsDashSdkLib.libRequestMod.Request[CreateWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkerBlock(
      params: CreateWorkerBlockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkerBlockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
      */
    def deleteHIT(): awsDashSdkLib.libRequestMod.Request[DeleteHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
      */
    def deleteHIT(params: DeleteHITRequest): awsDashSdkLib.libRequestMod.Request[DeleteHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteHIT(
      params: DeleteHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
      */
    def deleteQualificationType(): awsDashSdkLib.libRequestMod.Request[DeleteQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
      */
    def deleteQualificationType(params: DeleteQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[DeleteQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteQualificationType(
      params: DeleteQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
      */
    def deleteWorkerBlock(): awsDashSdkLib.libRequestMod.Request[DeleteWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkerBlock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkerBlockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
      */
    def deleteWorkerBlock(params: DeleteWorkerBlockRequest): awsDashSdkLib.libRequestMod.Request[DeleteWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkerBlock(
      params: DeleteWorkerBlockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkerBlockResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkerBlockResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
      */
    def disassociateQualificationFromWorker(): awsDashSdkLib.libRequestMod.Request[DisassociateQualificationFromWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateQualificationFromWorker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateQualificationFromWorkerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateQualificationFromWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
      */
    def disassociateQualificationFromWorker(params: DisassociateQualificationFromWorkerRequest): awsDashSdkLib.libRequestMod.Request[DisassociateQualificationFromWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateQualificationFromWorker(
      params: DisassociateQualificationFromWorkerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateQualificationFromWorkerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateQualificationFromWorkerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
      */
    def getAccountBalance(): awsDashSdkLib.libRequestMod.Request[GetAccountBalanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountBalance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountBalanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountBalanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
      */
    def getAccountBalance(params: GetAccountBalanceRequest): awsDashSdkLib.libRequestMod.Request[GetAccountBalanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAccountBalance(
      params: GetAccountBalanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAccountBalanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAccountBalanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetAssignment operation retrieves the details of the specified Assignment. 
      */
    def getAssignment(): awsDashSdkLib.libRequestMod.Request[GetAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAssignment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetAssignment operation retrieves the details of the specified Assignment. 
      */
    def getAssignment(params: GetAssignmentRequest): awsDashSdkLib.libRequestMod.Request[GetAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAssignment(
      params: GetAssignmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
      */
    def getFileUploadURL(): awsDashSdkLib.libRequestMod.Request[GetFileUploadURLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFileUploadURL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFileUploadURLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFileUploadURLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
      */
    def getFileUploadURL(params: GetFileUploadURLRequest): awsDashSdkLib.libRequestMod.Request[GetFileUploadURLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFileUploadURL(
      params: GetFileUploadURLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFileUploadURLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFileUploadURLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetHIT operation retrieves the details of the specified HIT. 
      */
    def getHIT(): awsDashSdkLib.libRequestMod.Request[GetHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHIT(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetHITResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetHIT operation retrieves the details of the specified HIT. 
      */
    def getHIT(params: GetHITRequest): awsDashSdkLib.libRequestMod.Request[GetHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getHIT(
      params: GetHITRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetHITResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
      */
    def getQualificationScore(): awsDashSdkLib.libRequestMod.Request[GetQualificationScoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQualificationScore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQualificationScoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQualificationScoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
      */
    def getQualificationScore(params: GetQualificationScoreRequest): awsDashSdkLib.libRequestMod.Request[GetQualificationScoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQualificationScore(
      params: GetQualificationScoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQualificationScoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQualificationScoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
      */
    def getQualificationType(): awsDashSdkLib.libRequestMod.Request[GetQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
      */
    def getQualificationType(params: GetQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[GetQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getQualificationType(
      params: GetQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
      */
    def listAssignmentsForHIT(): awsDashSdkLib.libRequestMod.Request[ListAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssignmentsForHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssignmentsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
      */
    def listAssignmentsForHIT(params: ListAssignmentsForHITRequest): awsDashSdkLib.libRequestMod.Request[ListAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssignmentsForHIT(
      params: ListAssignmentsForHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssignmentsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssignmentsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
      */
    def listBonusPayments(): awsDashSdkLib.libRequestMod.Request[ListBonusPaymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBonusPayments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBonusPaymentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBonusPaymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
      */
    def listBonusPayments(params: ListBonusPaymentsRequest): awsDashSdkLib.libRequestMod.Request[ListBonusPaymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBonusPayments(
      params: ListBonusPaymentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBonusPaymentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBonusPaymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
      */
    def listHITs(): awsDashSdkLib.libRequestMod.Request[ListHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHITs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHITsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
      */
    def listHITs(params: ListHITsRequest): awsDashSdkLib.libRequestMod.Request[ListHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHITs(
      params: ListHITsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHITsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
      */
    def listHITsForQualificationType(): awsDashSdkLib.libRequestMod.Request[ListHITsForQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHITsForQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHITsForQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHITsForQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
      */
    def listHITsForQualificationType(params: ListHITsForQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[ListHITsForQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listHITsForQualificationType(
      params: ListHITsForQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListHITsForQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListHITsForQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
      */
    def listQualificationRequests(): awsDashSdkLib.libRequestMod.Request[ListQualificationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQualificationRequests(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQualificationRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQualificationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
      */
    def listQualificationRequests(params: ListQualificationRequestsRequest): awsDashSdkLib.libRequestMod.Request[ListQualificationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQualificationRequests(
      params: ListQualificationRequestsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQualificationRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQualificationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
      */
    def listQualificationTypes(): awsDashSdkLib.libRequestMod.Request[ListQualificationTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQualificationTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQualificationTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQualificationTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
      */
    def listQualificationTypes(params: ListQualificationTypesRequest): awsDashSdkLib.libRequestMod.Request[ListQualificationTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listQualificationTypes(
      params: ListQualificationTypesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQualificationTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQualificationTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
      */
    def listReviewPolicyResultsForHIT(): awsDashSdkLib.libRequestMod.Request[ListReviewPolicyResultsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReviewPolicyResultsForHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReviewPolicyResultsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReviewPolicyResultsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
      */
    def listReviewPolicyResultsForHIT(params: ListReviewPolicyResultsForHITRequest): awsDashSdkLib.libRequestMod.Request[ListReviewPolicyResultsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReviewPolicyResultsForHIT(
      params: ListReviewPolicyResultsForHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReviewPolicyResultsForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReviewPolicyResultsForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
      */
    def listReviewableHITs(): awsDashSdkLib.libRequestMod.Request[ListReviewableHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReviewableHITs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReviewableHITsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReviewableHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
      */
    def listReviewableHITs(params: ListReviewableHITsRequest): awsDashSdkLib.libRequestMod.Request[ListReviewableHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listReviewableHITs(
      params: ListReviewableHITsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListReviewableHITsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListReviewableHITsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
      */
    def listWorkerBlocks(): awsDashSdkLib.libRequestMod.Request[ListWorkerBlocksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkerBlocks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkerBlocksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkerBlocksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
      */
    def listWorkerBlocks(params: ListWorkerBlocksRequest): awsDashSdkLib.libRequestMod.Request[ListWorkerBlocksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkerBlocks(
      params: ListWorkerBlocksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkerBlocksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkerBlocksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
      */
    def listWorkersWithQualificationType(): awsDashSdkLib.libRequestMod.Request[ListWorkersWithQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkersWithQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkersWithQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkersWithQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
      */
    def listWorkersWithQualificationType(params: ListWorkersWithQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[ListWorkersWithQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listWorkersWithQualificationType(
      params: ListWorkersWithQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWorkersWithQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWorkersWithQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
      */
    def notifyWorkers(): awsDashSdkLib.libRequestMod.Request[NotifyWorkersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def notifyWorkers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotifyWorkersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotifyWorkersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
      */
    def notifyWorkers(params: NotifyWorkersRequest): awsDashSdkLib.libRequestMod.Request[NotifyWorkersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def notifyWorkers(
      params: NotifyWorkersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotifyWorkersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotifyWorkersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
      */
    def rejectAssignment(): awsDashSdkLib.libRequestMod.Request[RejectAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectAssignment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
      */
    def rejectAssignment(params: RejectAssignmentRequest): awsDashSdkLib.libRequestMod.Request[RejectAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectAssignment(
      params: RejectAssignmentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectAssignmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectAssignmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
      */
    def rejectQualificationRequest(): awsDashSdkLib.libRequestMod.Request[RejectQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectQualificationRequest(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectQualificationRequestResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
      */
    def rejectQualificationRequest(params: RejectQualificationRequestRequest): awsDashSdkLib.libRequestMod.Request[RejectQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectQualificationRequest(
      params: RejectQualificationRequestRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectQualificationRequestResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectQualificationRequestResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
      */
    def sendBonus(): awsDashSdkLib.libRequestMod.Request[SendBonusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBonus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBonusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBonusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
      */
    def sendBonus(params: SendBonusRequest): awsDashSdkLib.libRequestMod.Request[SendBonusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendBonus(
      params: SendBonusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendBonusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendBonusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
      */
    def sendTestEventNotification(): awsDashSdkLib.libRequestMod.Request[SendTestEventNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTestEventNotification(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTestEventNotificationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTestEventNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
      */
    def sendTestEventNotification(params: SendTestEventNotificationRequest): awsDashSdkLib.libRequestMod.Request[SendTestEventNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendTestEventNotification(
      params: SendTestEventNotificationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendTestEventNotificationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendTestEventNotificationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
      */
    def updateExpirationForHIT(): awsDashSdkLib.libRequestMod.Request[UpdateExpirationForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateExpirationForHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateExpirationForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateExpirationForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
      */
    def updateExpirationForHIT(params: UpdateExpirationForHITRequest): awsDashSdkLib.libRequestMod.Request[UpdateExpirationForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateExpirationForHIT(
      params: UpdateExpirationForHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateExpirationForHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateExpirationForHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
      */
    def updateHITReviewStatus(): awsDashSdkLib.libRequestMod.Request[UpdateHITReviewStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHITReviewStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHITReviewStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHITReviewStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
      */
    def updateHITReviewStatus(params: UpdateHITReviewStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdateHITReviewStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHITReviewStatus(
      params: UpdateHITReviewStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHITReviewStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHITReviewStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
      */
    def updateHITTypeOfHIT(): awsDashSdkLib.libRequestMod.Request[UpdateHITTypeOfHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHITTypeOfHIT(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHITTypeOfHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHITTypeOfHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
      */
    def updateHITTypeOfHIT(params: UpdateHITTypeOfHITRequest): awsDashSdkLib.libRequestMod.Request[UpdateHITTypeOfHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateHITTypeOfHIT(
      params: UpdateHITTypeOfHITRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateHITTypeOfHITResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateHITTypeOfHITResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
      */
    def updateNotificationSettings(): awsDashSdkLib.libRequestMod.Request[UpdateNotificationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNotificationSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNotificationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNotificationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
      */
    def updateNotificationSettings(params: UpdateNotificationSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateNotificationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNotificationSettings(
      params: UpdateNotificationSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNotificationSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNotificationSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
      */
    def updateQualificationType(): awsDashSdkLib.libRequestMod.Request[UpdateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateQualificationType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
      */
    def updateQualificationType(params: UpdateQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[UpdateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateQualificationType(
      params: UpdateQualificationTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateQualificationTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateQualificationTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateExpirationForHITRequest extends js.Object {
    /**
      *  The date and time at which you want the HIT to expire 
      */
    var ExpireAt: Timestamp
    /**
      *  The HIT to update. 
      */
    var HITId: EntityId
  }
  
  trait UpdateExpirationForHITResponse extends js.Object
  
  trait UpdateHITReviewStatusRequest extends js.Object {
    /**
      *  The ID of the HIT to update. 
      */
    var HITId: EntityId
    /**
      *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
      */
    var Revert: js.UndefOr[Boolean] = js.undefined
  }
  
  trait UpdateHITReviewStatusResponse extends js.Object
  
  trait UpdateHITTypeOfHITRequest extends js.Object {
    /**
      * The HIT to update.
      */
    var HITId: EntityId
    /**
      * The ID of the new HIT type.
      */
    var HITTypeId: EntityId
  }
  
  trait UpdateHITTypeOfHITResponse extends js.Object
  
  trait UpdateNotificationSettingsRequest extends js.Object {
    /**
      *  Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification. You must specify either the Notification parameter or the Active parameter for the call to UpdateNotificationSettings to succeed. 
      */
    var Active: js.UndefOr[Boolean] = js.undefined
    /**
      *  The ID of the HIT type whose notification specification is being updated. 
      */
    var HITTypeId: EntityId
    /**
      *  The notification specification for the HIT type. 
      */
    var Notification: js.UndefOr[NotificationSpecification] = js.undefined
  }
  
  trait UpdateNotificationSettingsResponse extends js.Object
  
  trait UpdateQualificationTypeRequest extends js.Object {
    /**
      * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure.
      */
    var AnswerKey: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Constraints: If the Test parameter is specified, this parameter cannot be true.
      */
    var AutoGranted: js.UndefOr[Boolean] = js.undefined
    /**
      * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the AutoGranted parameter is true.
      */
    var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
    /**
      * The new description of the Qualification type.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The ID of the Qualification type to update.
      */
    var QualificationTypeId: EntityId
    /**
      * The new status of the Qualification type - Active | Inactive
      */
    var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined
    /**
      * The amount of time, in seconds, that Workers must wait after requesting a Qualification of the specified Qualification type before they can retry the Qualification request. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must dispose of the existing retry-enabled Qualification type using DisposeQualificationType and then create a new Qualification type with retries disabled using CreateQualificationType.
      */
    var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
    /**
      * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified. Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
      */
    var Test: js.UndefOr[String] = js.undefined
    /**
      * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
      */
    var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  }
  
  trait UpdateQualificationTypeResponse extends js.Object {
    /**
      *  Contains a QualificationType data structure.
      */
    var QualificationType: js.UndefOr[QualificationType] = js.undefined
  }
  
  trait WorkerBlock extends js.Object {
    /**
      *  A message explaining the reason the Worker was blocked. 
      */
    var Reason: js.UndefOr[String] = js.undefined
    /**
      *  The ID of the Worker who accepted the HIT.
      */
    var WorkerId: js.UndefOr[CustomerId] = js.undefined
  }
  
  trait _AssignmentStatus extends js.Object
  
  trait _Comparator extends js.Object
  
  trait _EventType extends js.Object
  
  trait _HITAccessActions extends js.Object
  
  trait _HITReviewStatus extends js.Object
  
  trait _HITStatus extends js.Object
  
  trait _NotificationTransport extends js.Object
  
  trait _NotifyWorkersFailureCode extends js.Object
  
  trait _QualificationStatus extends js.Object
  
  trait _QualificationTypeStatus extends js.Object
  
  trait _ReviewActionStatus extends js.Object
  
  trait _ReviewPolicyLevel extends js.Object
  
  trait _ReviewableHITStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AssignmentList = js.Array[Assignment]
  type AssignmentStatus = _AssignmentStatus | java.lang.String
  type AssignmentStatusList = js.Array[AssignmentStatus]
  type BonusPaymentList = js.Array[BonusPayment]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Comparator = _Comparator | java.lang.String
  type CountryParameters = java.lang.String
  type CurrencyAmount = java.lang.String
  type CustomerId = java.lang.String
  type CustomerIdList = js.Array[CustomerId]
  type EntityId = java.lang.String
  type EventType = _EventType | java.lang.String
  type EventTypeList = js.Array[EventType]
  type HITAccessActions = _HITAccessActions | java.lang.String
  type HITLayoutParameterList = js.Array[HITLayoutParameter]
  type HITList = js.Array[HIT]
  type HITReviewStatus = _HITReviewStatus | java.lang.String
  type HITStatus = _HITStatus | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type IntegerList = js.Array[Integer]
  type LocaleList = js.Array[Locale]
  type Long = scala.Double
  type NotificationTransport = _NotificationTransport | java.lang.String
  type NotifyWorkersFailureCode = _NotifyWorkersFailureCode | java.lang.String
  type NotifyWorkersFailureStatusList = js.Array[NotifyWorkersFailureStatus]
  type PaginationToken = java.lang.String
  type ParameterMapEntryList = js.Array[ParameterMapEntry]
  type PolicyParameterList = js.Array[PolicyParameter]
  type QualificationList = js.Array[Qualification]
  type QualificationRequestList = js.Array[QualificationRequest]
  type QualificationRequirementList = js.Array[QualificationRequirement]
  type QualificationStatus = _QualificationStatus | java.lang.String
  type QualificationTypeList = js.Array[QualificationType]
  type QualificationTypeStatus = _QualificationTypeStatus | java.lang.String
  type ResultSize = scala.Double
  type ReviewActionDetailList = js.Array[ReviewActionDetail]
  type ReviewActionStatus = _ReviewActionStatus | java.lang.String
  type ReviewPolicyLevel = _ReviewPolicyLevel | java.lang.String
  type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[ReviewResultDetail]
  type ReviewableHITStatus = _ReviewableHITStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type Timestamp = stdLib.Date
  type WorkerBlockList = js.Array[WorkerBlock]
  type apiVersion = _apiVersion | java.lang.String
}

