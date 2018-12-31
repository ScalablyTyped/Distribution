package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MTurk
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MTurk: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMturkMod.MTurkNs.ClientConfiguration = js.native
  /**
    *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
    */
  def acceptQualificationRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptQualificationRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The AcceptQualificationRequest operation approves a Worker's request for a Qualification.   Only the owner of the Qualification type can grant a Qualification request for that type.   A successful request for the AcceptQualificationRequest operation returns with no errors and an empty body. 
    */
  def acceptQualificationRequest(params: awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptQualificationRequest(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AcceptQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
    */
  def approveAssignment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def approveAssignment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ApproveAssignment operation approves the results of a completed assignment.   Approving an assignment initiates two payments from the Requester's Amazon.com account     The Worker who submitted the results is paid the reward specified in the HIT.     Amazon Mechanical Turk fees are debited.     If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns an exception, and the approval is not processed. You can include an optional feedback message with the approval, which the Worker can see in the Status section of the web site.   You can also call this operation for assignments that were previous rejected and approve them by explicitly overriding the previous rejection. This only works on rejected assignments that were submitted within the previous 30 days and only if the assignment's related HIT has not been deleted. 
    */
  def approveAssignment(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def approveAssignment(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ApproveAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
    */
  def associateQualificationWithWorker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateQualificationWithWorker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The AssociateQualificationWithWorker operation gives a Worker a Qualification. AssociateQualificationWithWorker does not require that the Worker submit a Qualification request. It gives the Qualification directly to the Worker.   You can only assign a Qualification of a Qualification type that you created (using the CreateQualificationType operation).    Note: AssociateQualificationWithWorker does not affect any pending Qualification requests for the Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending Qualification request without affecting the Qualification the Worker already has, reject the request with the RejectQualificationRequest operation.  
    */
  def associateQualificationWithWorker(params: awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateQualificationWithWorker(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.AssociateQualificationWithWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
    */
  def createAdditionalAssignmentsForHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAdditionalAssignmentsForHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateAdditionalAssignmentsForHIT operation increases the maximum number of assignments of an existing HIT.   To extend the maximum number of assignments, specify the number of additional assignments.    HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10 or more assignments will result in an AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease exception.   HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created before July 22, 2015 will result in an AWS.MechanicalTurk.HITTooOldForExtension exception.    
    */
  def createAdditionalAssignmentsForHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAdditionalAssignmentsForHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateAdditionalAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
    */
  def createHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreateHIT operation creates a new Human Intelligence Task (HIT). The new HIT is made available for Workers to find and accept on the Amazon Mechanical Turk website.   This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its title, reward amount and number of assignments. When you pass these values to CreateHIT, a new HIT is created for you, with a new HITTypeID. The HITTypeID can be used to create additional HITs in the future without needing to specify common parameters such as the title, description and reward amount each time.  An alternative way to create HITs is to first generate a HITTypeID using the CreateHITType operation and then call the CreateHITWithHITType operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHIT also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing. 
    */
  def createHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
    */
  def createHITType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHITType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateHITType operation creates a new HIT type. This operation allows you to define a standard set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing HIT type, the HIT type ID of the existing type will be returned. 
    */
  def createHITType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHITType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
    */
  def createHITWithHITType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHITWithHITType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateHITWithHITType operation creates a new Human Intelligence Task (HIT) using an existing HITTypeID generated by the CreateHITType operation.   This is an alternative way to create HITs from the CreateHIT operation. This is the recommended best practice for Requesters who are creating large numbers of HITs.  CreateHITWithHITType also supports several ways to provide question data: by providing a value for the Question parameter that fully specifies the contents of the HIT, or by providing a HitLayoutId and associated HitLayoutParameters.    If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see Amazon Mechanical Turk Pricing.  
    */
  def createHITWithHITType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createHITWithHITType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateHITWithHITTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
    */
  def createQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The CreateQualificationType operation creates a new Qualification type, which is represented by a QualificationType data structure. 
    */
  def createQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
    */
  def createWorkerBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkerBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The CreateWorkerBlock operation allows you to prevent a Worker from working on your HITs. For example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
    */
  def createWorkerBlock(params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkerBlock(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.CreateWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
    */
  def deleteHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DeleteHIT operation is used to delete HIT that is no longer needed. Only the Requester who created the HIT can delete it.   You can only dispose of HITs that are in the Reviewable state, with all of their submitted assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the Reviewable state (for example, that has not expired, or still has active assignments), or on a HIT that is Reviewable but without all of its submitted assignments already approved or rejected, the service will return an error.      HITs are automatically disposed of after 120 days.     After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.     Disposed HITs are not returned in results for the ListHITs operation.     Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.    
    */
  def deleteHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
    */
  def deleteQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DeleteQualificationType deletes a Qualification type and deletes any HIT types that are associated with the Qualification type.  This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT types.  DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the Qualification type is available for reuse with CreateQualificationType. 
    */
  def deleteQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
    */
  def deleteWorkerBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkerBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The DeleteWorkerBlock operation allows you to reinstate a blocked Worker to work on your HITs. This operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation. If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If the specified Worker is not blocked, this operation returns successfully.
    */
  def deleteWorkerBlock(params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkerBlock(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DeleteWorkerBlockResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
    */
  def disassociateQualificationFromWorker(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateQualificationFromWorker(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The DisassociateQualificationFromWorker revokes a previously granted Qualification from a user.   You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification can see this message. 
    */
  def disassociateQualificationFromWorker(params: awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateQualificationFromWorker(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.DisassociateQualificationFromWorkerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
    */
  def getAccountBalance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountBalance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The GetAccountBalance operation retrieves the amount of money in your Amazon Mechanical Turk account.
    */
  def getAccountBalance(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountBalance(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAccountBalanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetAssignment operation retrieves the details of the specified Assignment. 
    */
  def getAssignment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAssignment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetAssignment operation retrieves the details of the specified Assignment. 
    */
  def getAssignment(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAssignment(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
    */
  def getFileUploadURL(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFileUploadURL(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetFileUploadURL operation generates and returns a temporary URL. You use the temporary URL to retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure will no longer support the FileUploadAnswer element to be used for the QuestionForm data structure. Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3. 
    */
  def getFileUploadURL(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFileUploadURL(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetFileUploadURLResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetHIT operation retrieves the details of the specified HIT. 
    */
  def getHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetHIT operation retrieves the details of the specified HIT. 
    */
  def getHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
    */
  def getQualificationScore(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQualificationScore(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetQualificationScore operation returns the value of a Worker's Qualification for a given Qualification type.   To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment data returned by the ListAssignmentsForHIT operation.  Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
    */
  def getQualificationScore(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQualificationScore(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationScoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
    */
  def getQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The GetQualificationTypeoperation retrieves information about a Qualification type using its ID. 
    */
  def getQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.GetQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
    */
  def listAssignmentsForHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssignmentsForHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListAssignmentsForHIT operation retrieves completed assignments for a HIT. You can use this operation to retrieve the results for a HIT.   You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial results with this operation.   Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments that have already been approved and rejected together in one result set.   Only the Requester who created the HIT can retrieve the assignments for that HIT.   Results are sorted and divided into numbered pages and the operation returns a single page of results. You can use the parameters of the operation to control sorting and pagination. 
    */
  def listAssignmentsForHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssignmentsForHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListAssignmentsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
    */
  def listBonusPayments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBonusPayments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListBonusPayments operation retrieves the amounts of bonuses you have paid to Workers for a given HIT or assignment. 
    */
  def listBonusPayments(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBonusPayments(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListBonusPaymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listHITs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListHITs operation returns all of a Requester's HITs. The operation returns HITs of any status, except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITs(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listHITs(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITsForQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listHITsForQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListHITsForQualificationType operation returns the HITs that use the given Qualification type for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted with the DeleteHIT operation or that have been auto-deleted. 
    */
  def listHITsForQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listHITsForQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListHITsForQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
    */
  def listQualificationRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQualificationRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListQualificationRequests operation retrieves requests for Qualifications of a particular Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and accepts them using the AcceptQualification operation. 
    */
  def listQualificationRequests(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQualificationRequests(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
    */
  def listQualificationTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQualificationTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListQualificationTypes operation returns a list of Qualification types, filtered by an optional search term. 
    */
  def listQualificationTypes(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQualificationTypes(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListQualificationTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
    */
  def listReviewPolicyResultsForHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReviewPolicyResultsForHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListReviewPolicyResultsForHIT operation retrieves the computed results and the actions taken in the course of executing your Review Policies for a given HIT. For information about how to specify Review Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return results for both Assignment-level and HIT-level review results. 
    */
  def listReviewPolicyResultsForHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReviewPolicyResultsForHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewPolicyResultsForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
    */
  def listReviewableHITs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReviewableHITs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListReviewableHITs operation retrieves the HITs with Status equal to Reviewable or Status equal to Reviewing that belong to the Requester calling the operation. 
    */
  def listReviewableHITs(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReviewableHITs(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListReviewableHITsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
    */
  def listWorkerBlocks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkerBlocks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * The ListWorkersBlocks operation retrieves a list of Workers who are blocked from working on your HITs.
    */
  def listWorkerBlocks(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkerBlocks(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkerBlocksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
    */
  def listWorkersWithQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkersWithQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The ListWorkersWithQualificationType operation returns all of the Workers that have been associated with a given Qualification type. 
    */
  def listWorkersWithQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkersWithQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.ListWorkersWithQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
    */
  def notifyWorkers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def notifyWorkers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The NotifyWorkers operation sends an email to one or more Workers that you specify with the Worker ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously approved or rejected work from the Worker. 
    */
  def notifyWorkers(params: awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def notifyWorkers(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.NotifyWorkersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
    */
  def rejectAssignment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectAssignment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The RejectAssignment operation rejects the results of a completed assignment.   You can include an optional feedback message with the rejection, which the Worker can see in the Status section of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the assignment was rejected, and can improve the quality of the results the Worker submits in the future.   Only the Requester who created the HIT can reject an assignment for the HIT. 
    */
  def rejectAssignment(params: awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectAssignment(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectAssignmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
    */
  def rejectQualificationRequest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectQualificationRequest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The RejectQualificationRequest operation rejects a user's request for a Qualification.   You can provide a text message explaining why the request was rejected. The Worker who made the request can see this message.
    */
  def rejectQualificationRequest(params: awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def rejectQualificationRequest(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.RejectQualificationRequestResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
    */
  def sendBonus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBonus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The SendBonus operation issues a payment of money from your account to a Worker. This payment happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment. Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if your account does not have enough funds to pay for both the bonus and the fees. 
    */
  def sendBonus(params: awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBonus(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendBonusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
    */
  def sendTestEventNotification(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendTestEventNotification(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The SendTestEventNotification operation causes Amazon Mechanical Turk to send a notification message as if a HIT event occurred, according to the provided notification specification. This allows you to test notifications without setting up notifications for a real HIT type and trying to trigger them using the website. When you call this operation, the service attempts to send the test notification immediately. 
    */
  def sendTestEventNotification(params: awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendTestEventNotification(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.SendTestEventNotificationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
    */
  def updateExpirationForHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateExpirationForHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateExpirationForHIT operation allows you update the expiration time of a HIT. If you update it to a time in the past, the HIT will be immediately expired. 
    */
  def updateExpirationForHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateExpirationForHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateExpirationForHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
    */
  def updateHITReviewStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateHITReviewStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateHITReviewStatus operation updates the status of a HIT. If the status is Reviewable, this operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status. 
    */
  def updateHITReviewStatus(params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateHITReviewStatus(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITReviewStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
    */
  def updateHITTypeOfHIT(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateHITTypeOfHIT(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateHITTypeOfHIT operation allows you to change the HITType properties of a HIT. This operation disassociates the HIT from its old HITType properties and associates it with the new HITType properties. The HIT takes on the properties of the new HITType in place of the old ones. 
    */
  def updateHITTypeOfHIT(params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateHITTypeOfHIT(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateHITTypeOfHITResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
    */
  def updateNotificationSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNotificationSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateNotificationSettings operation creates, updates, disables or re-enables notifications for a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification specification, the operation replaces the old specification with a new one. You can call the UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to modify the notification specification itself by providing updates to the Active status without specifying a new notification specification. To change the Active status of a HIT type's notifications, the HIT type must already have a notification specification, or one must be provided in the same call to UpdateNotificationSettings. 
    */
  def updateNotificationSettings(params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateNotificationSettings(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateNotificationSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
    */
  def updateQualificationType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateQualificationType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  The UpdateQualificationType operation modifies the attributes of an existing Qualification type, which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its attributes.   Most attributes of a Qualification type can be changed after the type has been created. However, the Name and Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.   You can use this operation to update the test for a Qualification type. The test is updated based on the values specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters. The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.   If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a test from a Qualification type that has one. If the type already has a test, you cannot update it to be AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will henceforth have a test.   If you want to update the test duration or answer key for an existing test without changing the questions, you must specify a Test parameter with the original questions, along with the updated values.   If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such Qualifications must be granted manually.   You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
    */
  def updateQualificationType(params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateQualificationType(
    params: awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMturkMod.MTurkNs.UpdateQualificationTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

