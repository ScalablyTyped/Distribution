package typings.awsSdk.clientsConnectMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends Service {
  
  /**
    * Activates an evaluation form in the specified Amazon Connect instance. After the evaluation form is activated, it is available to start new evaluations based on the form. 
    */
  def activateEvaluationForm(): Request[ActivateEvaluationFormResponse, AWSError] = js.native
  def activateEvaluationForm(callback: js.Function2[/* err */ AWSError, /* data */ ActivateEvaluationFormResponse, scala.Unit]): Request[ActivateEvaluationFormResponse, AWSError] = js.native
  /**
    * Activates an evaluation form in the specified Amazon Connect instance. After the evaluation form is activated, it is available to start new evaluations based on the form. 
    */
  def activateEvaluationForm(params: ActivateEvaluationFormRequest): Request[ActivateEvaluationFormResponse, AWSError] = js.native
  def activateEvaluationForm(
    params: ActivateEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateEvaluationFormResponse, scala.Unit]
  ): Request[ActivateEvaluationFormResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates an approved origin to an Amazon Connect instance.
    */
  def associateApprovedOrigin(): Request[js.Object, AWSError] = js.native
  def associateApprovedOrigin(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates an approved origin to an Amazon Connect instance.
    */
  def associateApprovedOrigin(params: AssociateApprovedOriginRequest): Request[js.Object, AWSError] = js.native
  def associateApprovedOrigin(
    params: AssociateApprovedOriginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
    */
  def associateBot(): Request[js.Object, AWSError] = js.native
  def associateBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
    */
  def associateBot(params: AssociateBotRequest): Request[js.Object, AWSError] = js.native
  def associateBot(
    params: AssociateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in post-call and real-time analysis sessions for the given language.
    */
  def associateDefaultVocabulary(): Request[AssociateDefaultVocabularyResponse, AWSError] = js.native
  def associateDefaultVocabulary(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDefaultVocabularyResponse, scala.Unit]
  ): Request[AssociateDefaultVocabularyResponse, AWSError] = js.native
  /**
    * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in post-call and real-time analysis sessions for the given language.
    */
  def associateDefaultVocabulary(params: AssociateDefaultVocabularyRequest): Request[AssociateDefaultVocabularyResponse, AWSError] = js.native
  def associateDefaultVocabulary(
    params: AssociateDefaultVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDefaultVocabularyResponse, scala.Unit]
  ): Request[AssociateDefaultVocabularyResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a storage resource type for the first time. You can only associate one type of storage configuration in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing chat transcripts. This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
    */
  def associateInstanceStorageConfig(): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  def associateInstanceStorageConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateInstanceStorageConfigResponse, scala.Unit]
  ): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a storage resource type for the first time. You can only associate one type of storage configuration in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing chat transcripts. This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
    */
  def associateInstanceStorageConfig(params: AssociateInstanceStorageConfigRequest): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  def associateInstanceStorageConfig(
    params: AssociateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateInstanceStorageConfigResponse, scala.Unit]
  ): Request[AssociateInstanceStorageConfigResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Lambda function.
    */
  def associateLambdaFunction(): Request[js.Object, AWSError] = js.native
  def associateLambdaFunction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Lambda function.
    */
  def associateLambdaFunction(params: AssociateLambdaFunctionRequest): Request[js.Object, AWSError] = js.native
  def associateLambdaFunction(
    params: AssociateLambdaFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Amazon Lex V1 bot. This API only supports the association of Amazon Lex V1 bots.
    */
  def associateLexBot(): Request[js.Object, AWSError] = js.native
  def associateLexBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Allows the specified Amazon Connect instance to access the specified Amazon Lex V1 bot. This API only supports the association of Amazon Lex V1 bots.
    */
  def associateLexBot(params: AssociateLexBotRequest): Request[js.Object, AWSError] = js.native
  def associateLexBot(
    params: AssociateLexBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a flow with a phone number claimed to your Amazon Connect instance.  If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def associatePhoneNumberContactFlow(): Request[js.Object, AWSError] = js.native
  def associatePhoneNumberContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a flow with a phone number claimed to your Amazon Connect instance.  If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def associatePhoneNumberContactFlow(params: AssociatePhoneNumberContactFlowRequest): Request[js.Object, AWSError] = js.native
  def associatePhoneNumberContactFlow(
    params: AssociatePhoneNumberContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a set of quick connects with a queue.
    */
  def associateQueueQuickConnects(): Request[js.Object, AWSError] = js.native
  def associateQueueQuickConnects(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a set of quick connects with a queue.
    */
  def associateQueueQuickConnects(params: AssociateQueueQuickConnectsRequest): Request[js.Object, AWSError] = js.native
  def associateQueueQuickConnects(
    params: AssociateQueueQuickConnectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates a set of queues with a routing profile.
    */
  def associateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def associateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates a set of queues with a routing profile.
    */
  def associateRoutingProfileQueues(params: AssociateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def associateRoutingProfileQueues(
    params: AssociateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a security key to the instance.
    */
  def associateSecurityKey(): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  def associateSecurityKey(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSecurityKeyResponse, scala.Unit]): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Associates a security key to the instance.
    */
  def associateSecurityKey(params: AssociateSecurityKeyRequest): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  def associateSecurityKey(
    params: AssociateSecurityKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSecurityKeyResponse, scala.Unit]
  ): Request[AssociateSecurityKeyResponse, AWSError] = js.native
  
  /**
    * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group was created. For more information about how to use this operation, see Claim a phone number in your country and Claim phone numbers to traffic distribution groups in the Amazon Connect Administrator Guide.   You can call the SearchAvailablePhoneNumbers API for available phone numbers that you can claim. Call the DescribePhoneNumber API to verify the status of a previous ClaimPhoneNumber operation. 
    */
  def claimPhoneNumber(): Request[ClaimPhoneNumberResponse, AWSError] = js.native
  def claimPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ ClaimPhoneNumberResponse, scala.Unit]): Request[ClaimPhoneNumberResponse, AWSError] = js.native
  /**
    * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group was created. For more information about how to use this operation, see Claim a phone number in your country and Claim phone numbers to traffic distribution groups in the Amazon Connect Administrator Guide.   You can call the SearchAvailablePhoneNumbers API for available phone numbers that you can claim. Call the DescribePhoneNumber API to verify the status of a previous ClaimPhoneNumber operation. 
    */
  def claimPhoneNumber(params: ClaimPhoneNumberRequest): Request[ClaimPhoneNumberResponse, AWSError] = js.native
  def claimPhoneNumber(
    params: ClaimPhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClaimPhoneNumberResponse, scala.Unit]
  ): Request[ClaimPhoneNumberResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Connect: ConfigBase & ClientConfiguration = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates an agent status for the specified Amazon Connect instance.
    */
  def createAgentStatus(): Request[CreateAgentStatusResponse, AWSError] = js.native
  def createAgentStatus(callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentStatusResponse, scala.Unit]): Request[CreateAgentStatusResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates an agent status for the specified Amazon Connect instance.
    */
  def createAgentStatus(params: CreateAgentStatusRequest): Request[CreateAgentStatusResponse, AWSError] = js.native
  def createAgentStatus(
    params: CreateAgentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentStatusResponse, scala.Unit]
  ): Request[CreateAgentStatusResponse, AWSError] = js.native
  
  /**
    * Creates a flow for the specified Amazon Connect instance. You can also create and update flows using the Amazon Connect Flow language.
    */
  def createContactFlow(): Request[CreateContactFlowResponse, AWSError] = js.native
  def createContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowResponse, scala.Unit]): Request[CreateContactFlowResponse, AWSError] = js.native
  /**
    * Creates a flow for the specified Amazon Connect instance. You can also create and update flows using the Amazon Connect Flow language.
    */
  def createContactFlow(params: CreateContactFlowRequest): Request[CreateContactFlowResponse, AWSError] = js.native
  def createContactFlow(
    params: CreateContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowResponse, scala.Unit]
  ): Request[CreateContactFlowResponse, AWSError] = js.native
  
  /**
    * Creates a flow module for the specified Amazon Connect instance. 
    */
  def createContactFlowModule(): Request[CreateContactFlowModuleResponse, AWSError] = js.native
  def createContactFlowModule(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowModuleResponse, scala.Unit]): Request[CreateContactFlowModuleResponse, AWSError] = js.native
  /**
    * Creates a flow module for the specified Amazon Connect instance. 
    */
  def createContactFlowModule(params: CreateContactFlowModuleRequest): Request[CreateContactFlowModuleResponse, AWSError] = js.native
  def createContactFlowModule(
    params: CreateContactFlowModuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactFlowModuleResponse, scala.Unit]
  ): Request[CreateContactFlowModuleResponse, AWSError] = js.native
  
  /**
    * Creates an evaluation form in the specified Amazon Connect instance. The form can be used to define questions related to agent performance, and create sections to organize such questions. Question and section identifiers cannot be duplicated within the same evaluation form.
    */
  def createEvaluationForm(): Request[CreateEvaluationFormResponse, AWSError] = js.native
  def createEvaluationForm(callback: js.Function2[/* err */ AWSError, /* data */ CreateEvaluationFormResponse, scala.Unit]): Request[CreateEvaluationFormResponse, AWSError] = js.native
  /**
    * Creates an evaluation form in the specified Amazon Connect instance. The form can be used to define questions related to agent performance, and create sections to organize such questions. Question and section identifiers cannot be duplicated within the same evaluation form.
    */
  def createEvaluationForm(params: CreateEvaluationFormRequest): Request[CreateEvaluationFormResponse, AWSError] = js.native
  def createEvaluationForm(
    params: CreateEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEvaluationFormResponse, scala.Unit]
  ): Request[CreateEvaluationFormResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates hours of operation. 
    */
  def createHoursOfOperation(): Request[CreateHoursOfOperationResponse, AWSError] = js.native
  def createHoursOfOperation(callback: js.Function2[/* err */ AWSError, /* data */ CreateHoursOfOperationResponse, scala.Unit]): Request[CreateHoursOfOperationResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates hours of operation. 
    */
  def createHoursOfOperation(params: CreateHoursOfOperationRequest): Request[CreateHoursOfOperationResponse, AWSError] = js.native
  def createHoursOfOperation(
    params: CreateHoursOfOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHoursOfOperationResponse, scala.Unit]
  ): Request[CreateHoursOfOperationResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage, such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any configurations on features, such as Contact Lens for Amazon Connect.  Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you exceed this limit, you will get an error message indicating there has been an excessive number of attempts at creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in your account.
    */
  def createInstance(): Request[CreateInstanceResponse, AWSError] = js.native
  def createInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResponse, scala.Unit]): Request[CreateInstanceResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage, such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any configurations on features, such as Contact Lens for Amazon Connect.  Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you exceed this limit, you will get an error message indicating there has been an excessive number of attempts at creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in your account.
    */
  def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResponse, AWSError] = js.native
  def createInstance(
    params: CreateInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResponse, scala.Unit]
  ): Request[CreateInstanceResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Web Services resource association with an Amazon Connect instance.
    */
  def createIntegrationAssociation(): Request[CreateIntegrationAssociationResponse, AWSError] = js.native
  def createIntegrationAssociation(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationAssociationResponse, scala.Unit]
  ): Request[CreateIntegrationAssociationResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services resource association with an Amazon Connect instance.
    */
  def createIntegrationAssociation(params: CreateIntegrationAssociationRequest): Request[CreateIntegrationAssociationResponse, AWSError] = js.native
  def createIntegrationAssociation(
    params: CreateIntegrationAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntegrationAssociationResponse, scala.Unit]
  ): Request[CreateIntegrationAssociationResponse, AWSError] = js.native
  
  /**
    * Adds a new participant into an on-going chat contact. For more information, see Customize chat flow experiences by integrating custom participants.
    */
  def createParticipant(): Request[CreateParticipantResponse, AWSError] = js.native
  def createParticipant(callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantResponse, scala.Unit]): Request[CreateParticipantResponse, AWSError] = js.native
  /**
    * Adds a new participant into an on-going chat contact. For more information, see Customize chat flow experiences by integrating custom participants.
    */
  def createParticipant(params: CreateParticipantRequest): Request[CreateParticipantResponse, AWSError] = js.native
  def createParticipant(
    params: CreateParticipantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantResponse, scala.Unit]
  ): Request[CreateParticipantResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates a new queue for the specified Amazon Connect instance.  If the number being used in the input is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the OutboundCallerIdNumberId value of the OutboundCallerConfig request body parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def createQueue(): Request[CreateQueueResponse, AWSError] = js.native
  def createQueue(callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResponse, scala.Unit]): Request[CreateQueueResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates a new queue for the specified Amazon Connect instance.  If the number being used in the input is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the OutboundCallerIdNumberId value of the OutboundCallerConfig request body parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def createQueue(params: CreateQueueRequest): Request[CreateQueueResponse, AWSError] = js.native
  def createQueue(
    params: CreateQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQueueResponse, scala.Unit]
  ): Request[CreateQueueResponse, AWSError] = js.native
  
  /**
    * Creates a quick connect for the specified Amazon Connect instance.
    */
  def createQuickConnect(): Request[CreateQuickConnectResponse, AWSError] = js.native
  def createQuickConnect(callback: js.Function2[/* err */ AWSError, /* data */ CreateQuickConnectResponse, scala.Unit]): Request[CreateQuickConnectResponse, AWSError] = js.native
  /**
    * Creates a quick connect for the specified Amazon Connect instance.
    */
  def createQuickConnect(params: CreateQuickConnectRequest): Request[CreateQuickConnectResponse, AWSError] = js.native
  def createQuickConnect(
    params: CreateQuickConnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQuickConnectResponse, scala.Unit]
  ): Request[CreateQuickConnectResponse, AWSError] = js.native
  
  /**
    * Creates a new routing profile.
    */
  def createRoutingProfile(): Request[CreateRoutingProfileResponse, AWSError] = js.native
  def createRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingProfileResponse, scala.Unit]): Request[CreateRoutingProfileResponse, AWSError] = js.native
  /**
    * Creates a new routing profile.
    */
  def createRoutingProfile(params: CreateRoutingProfileRequest): Request[CreateRoutingProfileResponse, AWSError] = js.native
  def createRoutingProfile(
    params: CreateRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoutingProfileResponse, scala.Unit]
  ): Request[CreateRoutingProfileResponse, AWSError] = js.native
  
  /**
    * Creates a rule for the specified Amazon Connect instance. Use the Rules Function language to code conditions for the rule. 
    */
  def createRule(): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, scala.Unit]): Request[CreateRuleResponse, AWSError] = js.native
  /**
    * Creates a rule for the specified Amazon Connect instance. Use the Rules Function language to code conditions for the rule. 
    */
  def createRule(params: CreateRuleRequest): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(
    params: CreateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, scala.Unit]
  ): Request[CreateRuleResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates a security profile.
    */
  def createSecurityProfile(): Request[CreateSecurityProfileResponse, AWSError] = js.native
  def createSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityProfileResponse, scala.Unit]): Request[CreateSecurityProfileResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Creates a security profile.
    */
  def createSecurityProfile(params: CreateSecurityProfileRequest): Request[CreateSecurityProfileResponse, AWSError] = js.native
  def createSecurityProfile(
    params: CreateSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityProfileResponse, scala.Unit]
  ): Request[CreateSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Creates a new task template in the specified Amazon Connect instance.
    */
  def createTaskTemplate(): Request[CreateTaskTemplateResponse, AWSError] = js.native
  def createTaskTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskTemplateResponse, scala.Unit]): Request[CreateTaskTemplateResponse, AWSError] = js.native
  /**
    * Creates a new task template in the specified Amazon Connect instance.
    */
  def createTaskTemplate(params: CreateTaskTemplateRequest): Request[CreateTaskTemplateResponse, AWSError] = js.native
  def createTaskTemplate(
    params: CreateTaskTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskTemplateResponse, scala.Unit]
  ): Request[CreateTaskTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.  For more information about creating traffic distribution groups, see Set up traffic distribution groups in the Amazon Connect Administrator Guide. 
    */
  def createTrafficDistributionGroup(): Request[CreateTrafficDistributionGroupResponse, AWSError] = js.native
  def createTrafficDistributionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficDistributionGroupResponse, scala.Unit]
  ): Request[CreateTrafficDistributionGroupResponse, AWSError] = js.native
  /**
    * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.  For more information about creating traffic distribution groups, see Set up traffic distribution groups in the Amazon Connect Administrator Guide. 
    */
  def createTrafficDistributionGroup(params: CreateTrafficDistributionGroupRequest): Request[CreateTrafficDistributionGroupResponse, AWSError] = js.native
  def createTrafficDistributionGroup(
    params: CreateTrafficDistributionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTrafficDistributionGroupResponse, scala.Unit]
  ): Request[CreateTrafficDistributionGroupResponse, AWSError] = js.native
  
  /**
    * Creates a use case for an integration association.
    */
  def createUseCase(): Request[CreateUseCaseResponse, AWSError] = js.native
  def createUseCase(callback: js.Function2[/* err */ AWSError, /* data */ CreateUseCaseResponse, scala.Unit]): Request[CreateUseCaseResponse, AWSError] = js.native
  /**
    * Creates a use case for an integration association.
    */
  def createUseCase(params: CreateUseCaseRequest): Request[CreateUseCaseResponse, AWSError] = js.native
  def createUseCase(
    params: CreateUseCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUseCaseResponse, scala.Unit]
  ): Request[CreateUseCaseResponse, AWSError] = js.native
  
  /**
    * Creates a user account for the specified Amazon Connect instance. For information about how to create user accounts using the Amazon Connect console, see Add Users in the Amazon Connect Administrator Guide.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user account for the specified Amazon Connect instance. For information about how to create user accounts using the Amazon Connect console, see Add Users in the Amazon Connect Administrator Guide.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, scala.Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Creates a new user hierarchy group.
    */
  def createUserHierarchyGroup(): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  def createUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserHierarchyGroupResponse, scala.Unit]
  ): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Creates a new user hierarchy group.
    */
  def createUserHierarchyGroup(params: CreateUserHierarchyGroupRequest): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  def createUserHierarchyGroup(
    params: CreateUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserHierarchyGroupResponse, scala.Unit]
  ): Request[CreateUserHierarchyGroupResponse, AWSError] = js.native
  
  /**
    * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in post-call and real-time contact analysis sessions for that language.
    */
  def createVocabulary(): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, scala.Unit]): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in post-call and real-time contact analysis sessions for that language.
    */
  def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(
    params: CreateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, scala.Unit]
  ): Request[CreateVocabularyResponse, AWSError] = js.native
  
  /**
    * Deactivates an evaluation form in the specified Amazon Connect instance. After a form is deactivated, it is no longer available for users to start new evaluations based on the form. 
    */
  def deactivateEvaluationForm(): Request[DeactivateEvaluationFormResponse, AWSError] = js.native
  def deactivateEvaluationForm(
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateEvaluationFormResponse, scala.Unit]
  ): Request[DeactivateEvaluationFormResponse, AWSError] = js.native
  /**
    * Deactivates an evaluation form in the specified Amazon Connect instance. After a form is deactivated, it is no longer available for users to start new evaluations based on the form. 
    */
  def deactivateEvaluationForm(params: DeactivateEvaluationFormRequest): Request[DeactivateEvaluationFormResponse, AWSError] = js.native
  def deactivateEvaluationForm(
    params: DeactivateEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateEvaluationFormResponse, scala.Unit]
  ): Request[DeactivateEvaluationFormResponse, AWSError] = js.native
  
  /**
    * Deletes a contact evaluation in the specified Amazon Connect instance.
    */
  def deleteContactEvaluation(): Request[js.Object, AWSError] = js.native
  def deleteContactEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a contact evaluation in the specified Amazon Connect instance.
    */
  def deleteContactEvaluation(params: DeleteContactEvaluationRequest): Request[js.Object, AWSError] = js.native
  def deleteContactEvaluation(
    params: DeleteContactEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a flow for the specified Amazon Connect instance.
    */
  def deleteContactFlow(): Request[DeleteContactFlowResponse, AWSError] = js.native
  def deleteContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactFlowResponse, scala.Unit]): Request[DeleteContactFlowResponse, AWSError] = js.native
  /**
    * Deletes a flow for the specified Amazon Connect instance.
    */
  def deleteContactFlow(params: DeleteContactFlowRequest): Request[DeleteContactFlowResponse, AWSError] = js.native
  def deleteContactFlow(
    params: DeleteContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactFlowResponse, scala.Unit]
  ): Request[DeleteContactFlowResponse, AWSError] = js.native
  
  /**
    * Deletes the specified flow module.
    */
  def deleteContactFlowModule(): Request[DeleteContactFlowModuleResponse, AWSError] = js.native
  def deleteContactFlowModule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactFlowModuleResponse, scala.Unit]): Request[DeleteContactFlowModuleResponse, AWSError] = js.native
  /**
    * Deletes the specified flow module.
    */
  def deleteContactFlowModule(params: DeleteContactFlowModuleRequest): Request[DeleteContactFlowModuleResponse, AWSError] = js.native
  def deleteContactFlowModule(
    params: DeleteContactFlowModuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactFlowModuleResponse, scala.Unit]
  ): Request[DeleteContactFlowModuleResponse, AWSError] = js.native
  
  /**
    * Deletes an evaluation form in the specified Amazon Connect instance.    If the version property is provided, only the specified version of the evaluation form is deleted.   If no version is provided, then the full form (all versions) is deleted.  
    */
  def deleteEvaluationForm(): Request[js.Object, AWSError] = js.native
  def deleteEvaluationForm(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an evaluation form in the specified Amazon Connect instance.    If the version property is provided, only the specified version of the evaluation form is deleted.   If no version is provided, then the full form (all versions) is deleted.  
    */
  def deleteEvaluationForm(params: DeleteEvaluationFormRequest): Request[js.Object, AWSError] = js.native
  def deleteEvaluationForm(
    params: DeleteEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes an hours of operation.
    */
  def deleteHoursOfOperation(): Request[js.Object, AWSError] = js.native
  def deleteHoursOfOperation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes an hours of operation.
    */
  def deleteHoursOfOperation(params: DeleteHoursOfOperationRequest): Request[js.Object, AWSError] = js.native
  def deleteHoursOfOperation(
    params: DeleteHoursOfOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes the Amazon Connect instance. Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you exceed this limit, you will get an error message indicating there has been an excessive number of attempts at creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in your account.
    */
  def deleteInstance(): Request[js.Object, AWSError] = js.native
  def deleteInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes the Amazon Connect instance. Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you exceed this limit, you will get an error message indicating there has been an excessive number of attempts at creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in your account.
    */
  def deleteInstance(params: DeleteInstanceRequest): Request[js.Object, AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not have any use cases associated with it.
    */
  def deleteIntegrationAssociation(): Request[js.Object, AWSError] = js.native
  def deleteIntegrationAssociation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not have any use cases associated with it.
    */
  def deleteIntegrationAssociation(params: DeleteIntegrationAssociationRequest): Request[js.Object, AWSError] = js.native
  def deleteIntegrationAssociation(
    params: DeleteIntegrationAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a quick connect.
    */
  def deleteQuickConnect(): Request[js.Object, AWSError] = js.native
  def deleteQuickConnect(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a quick connect.
    */
  def deleteQuickConnect(params: DeleteQuickConnectRequest): Request[js.Object, AWSError] = js.native
  def deleteQuickConnect(
    params: DeleteQuickConnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a rule for the specified Amazon Connect instance.
    */
  def deleteRule(): Request[js.Object, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a rule for the specified Amazon Connect instance.
    */
  def deleteRule(params: DeleteRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes a security profile.
    */
  def deleteSecurityProfile(): Request[js.Object, AWSError] = js.native
  def deleteSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes a security profile.
    */
  def deleteSecurityProfile(params: DeleteSecurityProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteSecurityProfile(
    params: DeleteSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the task template.
    */
  def deleteTaskTemplate(): Request[DeleteTaskTemplateResponse, AWSError] = js.native
  def deleteTaskTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskTemplateResponse, scala.Unit]): Request[DeleteTaskTemplateResponse, AWSError] = js.native
  /**
    * Deletes the task template.
    */
  def deleteTaskTemplate(params: DeleteTaskTemplateRequest): Request[DeleteTaskTemplateResponse, AWSError] = js.native
  def deleteTaskTemplate(
    params: DeleteTaskTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskTemplateResponse, scala.Unit]
  ): Request[DeleteTaskTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution group is created. For more information about deleting traffic distribution groups, see Delete traffic distribution groups in the Amazon Connect Administrator Guide.
    */
  def deleteTrafficDistributionGroup(): Request[DeleteTrafficDistributionGroupResponse, AWSError] = js.native
  def deleteTrafficDistributionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficDistributionGroupResponse, scala.Unit]
  ): Request[DeleteTrafficDistributionGroupResponse, AWSError] = js.native
  /**
    * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution group is created. For more information about deleting traffic distribution groups, see Delete traffic distribution groups in the Amazon Connect Administrator Guide.
    */
  def deleteTrafficDistributionGroup(params: DeleteTrafficDistributionGroupRequest): Request[DeleteTrafficDistributionGroupResponse, AWSError] = js.native
  def deleteTrafficDistributionGroup(
    params: DeleteTrafficDistributionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTrafficDistributionGroupResponse, scala.Unit]
  ): Request[DeleteTrafficDistributionGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a use case from an integration association.
    */
  def deleteUseCase(): Request[js.Object, AWSError] = js.native
  def deleteUseCase(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a use case from an integration association.
    */
  def deleteUseCase(params: DeleteUseCaseRequest): Request[js.Object, AWSError] = js.native
  def deleteUseCase(
    params: DeleteUseCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a user account from the specified Amazon Connect instance. For information about what happens to a user's data when their account is deleted, see Delete Users from Your Amazon Connect Instance in the Amazon Connect Administrator Guide.
    */
  def deleteUser(): Request[js.Object, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user account from the specified Amazon Connect instance. For information about what happens to a user's data when their account is deleted, see Delete Users from Your Amazon Connect Instance in the Amazon Connect Administrator Guide.
    */
  def deleteUser(params: DeleteUserRequest): Request[js.Object, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child groups.
    */
  def deleteUserHierarchyGroup(): Request[js.Object, AWSError] = js.native
  def deleteUserHierarchyGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child groups.
    */
  def deleteUserHierarchyGroup(params: DeleteUserHierarchyGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteUserHierarchyGroup(
    params: DeleteUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the vocabulary that has the given identifier.
    */
  def deleteVocabulary(): Request[DeleteVocabularyResponse, AWSError] = js.native
  def deleteVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVocabularyResponse, scala.Unit]): Request[DeleteVocabularyResponse, AWSError] = js.native
  /**
    * Deletes the vocabulary that has the given identifier.
    */
  def deleteVocabulary(params: DeleteVocabularyRequest): Request[DeleteVocabularyResponse, AWSError] = js.native
  def deleteVocabulary(
    params: DeleteVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVocabularyResponse, scala.Unit]
  ): Request[DeleteVocabularyResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes an agent status.
    */
  def describeAgentStatus(): Request[DescribeAgentStatusResponse, AWSError] = js.native
  def describeAgentStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentStatusResponse, scala.Unit]): Request[DescribeAgentStatusResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes an agent status.
    */
  def describeAgentStatus(params: DescribeAgentStatusRequest): Request[DescribeAgentStatusResponse, AWSError] = js.native
  def describeAgentStatus(
    params: DescribeAgentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentStatusResponse, scala.Unit]
  ): Request[DescribeAgentStatusResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified contact.   Contact information remains available in Amazon Connect for 24 months, and then it is deleted. Only data from November 12, 2021, and later is returned by this API. 
    */
  def describeContact(): Request[DescribeContactResponse, AWSError] = js.native
  def describeContact(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactResponse, scala.Unit]): Request[DescribeContactResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified contact.   Contact information remains available in Amazon Connect for 24 months, and then it is deleted. Only data from November 12, 2021, and later is returned by this API. 
    */
  def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse, AWSError] = js.native
  def describeContact(
    params: DescribeContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactResponse, scala.Unit]
  ): Request[DescribeContactResponse, AWSError] = js.native
  
  /**
    * Describes a contact evaluation in the specified Amazon Connect instance.
    */
  def describeContactEvaluation(): Request[DescribeContactEvaluationResponse, AWSError] = js.native
  def describeContactEvaluation(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactEvaluationResponse, scala.Unit]
  ): Request[DescribeContactEvaluationResponse, AWSError] = js.native
  /**
    * Describes a contact evaluation in the specified Amazon Connect instance.
    */
  def describeContactEvaluation(params: DescribeContactEvaluationRequest): Request[DescribeContactEvaluationResponse, AWSError] = js.native
  def describeContactEvaluation(
    params: DescribeContactEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactEvaluationResponse, scala.Unit]
  ): Request[DescribeContactEvaluationResponse, AWSError] = js.native
  
  /**
    * Describes the specified flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def describeContactFlow(): Request[DescribeContactFlowResponse, AWSError] = js.native
  def describeContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowResponse, scala.Unit]): Request[DescribeContactFlowResponse, AWSError] = js.native
  /**
    * Describes the specified flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def describeContactFlow(params: DescribeContactFlowRequest): Request[DescribeContactFlowResponse, AWSError] = js.native
  def describeContactFlow(
    params: DescribeContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowResponse, scala.Unit]
  ): Request[DescribeContactFlowResponse, AWSError] = js.native
  
  /**
    * Describes the specified flow module.
    */
  def describeContactFlowModule(): Request[DescribeContactFlowModuleResponse, AWSError] = js.native
  def describeContactFlowModule(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowModuleResponse, scala.Unit]
  ): Request[DescribeContactFlowModuleResponse, AWSError] = js.native
  /**
    * Describes the specified flow module.
    */
  def describeContactFlowModule(params: DescribeContactFlowModuleRequest): Request[DescribeContactFlowModuleResponse, AWSError] = js.native
  def describeContactFlowModule(
    params: DescribeContactFlowModuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContactFlowModuleResponse, scala.Unit]
  ): Request[DescribeContactFlowModuleResponse, AWSError] = js.native
  
  /**
    * Describes an evaluation form in the specified Amazon Connect instance. If the version property is not provided, the latest version of the evaluation form is described.
    */
  def describeEvaluationForm(): Request[DescribeEvaluationFormResponse, AWSError] = js.native
  def describeEvaluationForm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationFormResponse, scala.Unit]): Request[DescribeEvaluationFormResponse, AWSError] = js.native
  /**
    * Describes an evaluation form in the specified Amazon Connect instance. If the version property is not provided, the latest version of the evaluation form is described.
    */
  def describeEvaluationForm(params: DescribeEvaluationFormRequest): Request[DescribeEvaluationFormResponse, AWSError] = js.native
  def describeEvaluationForm(
    params: DescribeEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationFormResponse, scala.Unit]
  ): Request[DescribeEvaluationFormResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the hours of operation.
    */
  def describeHoursOfOperation(): Request[DescribeHoursOfOperationResponse, AWSError] = js.native
  def describeHoursOfOperation(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHoursOfOperationResponse, scala.Unit]
  ): Request[DescribeHoursOfOperationResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the hours of operation.
    */
  def describeHoursOfOperation(params: DescribeHoursOfOperationRequest): Request[DescribeHoursOfOperationResponse, AWSError] = js.native
  def describeHoursOfOperation(
    params: DescribeHoursOfOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHoursOfOperationResponse, scala.Unit]
  ): Request[DescribeHoursOfOperationResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns the current state of the specified instance identifier. It tracks the instance while it is being created and returns an error status, if applicable.  If an instance is not created successfully, the instance status reason field returns details relevant to the reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
    */
  def describeInstance(): Request[DescribeInstanceResponse, AWSError] = js.native
  def describeInstance(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceResponse, scala.Unit]): Request[DescribeInstanceResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns the current state of the specified instance identifier. It tracks the instance while it is being created and returns an error status, if applicable.  If an instance is not created successfully, the instance status reason field returns details relevant to the reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
    */
  def describeInstance(params: DescribeInstanceRequest): Request[DescribeInstanceResponse, AWSError] = js.native
  def describeInstance(
    params: DescribeInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceResponse, scala.Unit]
  ): Request[DescribeInstanceResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified instance attribute.
    */
  def describeInstanceAttribute(): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  def describeInstanceAttribute(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAttributeResponse, scala.Unit]
  ): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified instance attribute.
    */
  def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  def describeInstanceAttribute(
    params: DescribeInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceAttributeResponse, scala.Unit]
  ): Request[DescribeInstanceAttributeResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
    */
  def describeInstanceStorageConfig(): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  def describeInstanceStorageConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStorageConfigResponse, scala.Unit]
  ): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
    */
  def describeInstanceStorageConfig(params: DescribeInstanceStorageConfigRequest): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  def describeInstanceStorageConfig(
    params: DescribeInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceStorageConfigResponse, scala.Unit]
  ): Request[DescribeInstanceStorageConfigResponse, AWSError] = js.native
  
  /**
    * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution group.  If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def describePhoneNumber(): Request[DescribePhoneNumberResponse, AWSError] = js.native
  def describePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ DescribePhoneNumberResponse, scala.Unit]): Request[DescribePhoneNumberResponse, AWSError] = js.native
  /**
    * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution group.  If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def describePhoneNumber(params: DescribePhoneNumberRequest): Request[DescribePhoneNumberResponse, AWSError] = js.native
  def describePhoneNumber(
    params: DescribePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePhoneNumberResponse, scala.Unit]
  ): Request[DescribePhoneNumberResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified queue.
    */
  def describeQueue(): Request[DescribeQueueResponse, AWSError] = js.native
  def describeQueue(callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueueResponse, scala.Unit]): Request[DescribeQueueResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Describes the specified queue.
    */
  def describeQueue(params: DescribeQueueRequest): Request[DescribeQueueResponse, AWSError] = js.native
  def describeQueue(
    params: DescribeQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQueueResponse, scala.Unit]
  ): Request[DescribeQueueResponse, AWSError] = js.native
  
  /**
    * Describes the quick connect.
    */
  def describeQuickConnect(): Request[DescribeQuickConnectResponse, AWSError] = js.native
  def describeQuickConnect(callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuickConnectResponse, scala.Unit]): Request[DescribeQuickConnectResponse, AWSError] = js.native
  /**
    * Describes the quick connect.
    */
  def describeQuickConnect(params: DescribeQuickConnectRequest): Request[DescribeQuickConnectResponse, AWSError] = js.native
  def describeQuickConnect(
    params: DescribeQuickConnectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeQuickConnectResponse, scala.Unit]
  ): Request[DescribeQuickConnectResponse, AWSError] = js.native
  
  /**
    * Describes the specified routing profile.
    */
  def describeRoutingProfile(): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  def describeRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingProfileResponse, scala.Unit]): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  /**
    * Describes the specified routing profile.
    */
  def describeRoutingProfile(params: DescribeRoutingProfileRequest): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  def describeRoutingProfile(
    params: DescribeRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRoutingProfileResponse, scala.Unit]
  ): Request[DescribeRoutingProfileResponse, AWSError] = js.native
  
  /**
    * Describes a rule for the specified Amazon Connect instance.
    */
  def describeRule(): Request[DescribeRuleResponse, AWSError] = js.native
  def describeRule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleResponse, scala.Unit]): Request[DescribeRuleResponse, AWSError] = js.native
  /**
    * Describes a rule for the specified Amazon Connect instance.
    */
  def describeRule(params: DescribeRuleRequest): Request[DescribeRuleResponse, AWSError] = js.native
  def describeRule(
    params: DescribeRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleResponse, scala.Unit]
  ): Request[DescribeRuleResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Gets basic information about the security profle.
    */
  def describeSecurityProfile(): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  def describeSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityProfileResponse, scala.Unit]): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Gets basic information about the security profle.
    */
  def describeSecurityProfile(params: DescribeSecurityProfileRequest): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  def describeSecurityProfile(
    params: DescribeSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityProfileResponse, scala.Unit]
  ): Request[DescribeSecurityProfileResponse, AWSError] = js.native
  
  /**
    * Gets details and status of a traffic distribution group.
    */
  def describeTrafficDistributionGroup(): Request[DescribeTrafficDistributionGroupResponse, AWSError] = js.native
  def describeTrafficDistributionGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficDistributionGroupResponse, scala.Unit]
  ): Request[DescribeTrafficDistributionGroupResponse, AWSError] = js.native
  /**
    * Gets details and status of a traffic distribution group.
    */
  def describeTrafficDistributionGroup(params: DescribeTrafficDistributionGroupRequest): Request[DescribeTrafficDistributionGroupResponse, AWSError] = js.native
  def describeTrafficDistributionGroup(
    params: DescribeTrafficDistributionGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTrafficDistributionGroupResponse, scala.Unit]
  ): Request[DescribeTrafficDistributionGroupResponse, AWSError] = js.native
  
  /**
    * Describes the specified user account. You can find the instance ID in the Amazon Connect console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Describes the specified user account. You can find the instance ID in the Amazon Connect console (it’s the final part of the ARN). The console does not display the user IDs. Instead, list the users and note the IDs provided in the output.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, scala.Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  /**
    * Describes the specified hierarchy group.
    */
  def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  def describeUserHierarchyGroup(
    params: DescribeUserHierarchyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyGroupResponse, scala.Unit]
  ): Request[DescribeUserHierarchyGroupResponse, AWSError] = js.native
  
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  /**
    * Describes the hierarchy structure of the specified Amazon Connect instance.
    */
  def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  def describeUserHierarchyStructure(
    params: DescribeUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserHierarchyStructureResponse, scala.Unit]
  ): Request[DescribeUserHierarchyStructureResponse, AWSError] = js.native
  
  /**
    * Describes the specified vocabulary.
    */
  def describeVocabulary(): Request[DescribeVocabularyResponse, AWSError] = js.native
  def describeVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVocabularyResponse, scala.Unit]): Request[DescribeVocabularyResponse, AWSError] = js.native
  /**
    * Describes the specified vocabulary.
    */
  def describeVocabulary(params: DescribeVocabularyRequest): Request[DescribeVocabularyResponse, AWSError] = js.native
  def describeVocabulary(
    params: DescribeVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVocabularyResponse, scala.Unit]
  ): Request[DescribeVocabularyResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes access to integrated applications from Amazon Connect.
    */
  def disassociateApprovedOrigin(): Request[js.Object, AWSError] = js.native
  def disassociateApprovedOrigin(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes access to integrated applications from Amazon Connect.
    */
  def disassociateApprovedOrigin(params: DisassociateApprovedOriginRequest): Request[js.Object, AWSError] = js.native
  def disassociateApprovedOrigin(
    params: DisassociateApprovedOriginRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot. 
    */
  def disassociateBot(): Request[js.Object, AWSError] = js.native
  def disassociateBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot. 
    */
  def disassociateBot(params: DisassociateBotRequest): Request[js.Object, AWSError] = js.native
  def disassociateBot(
    params: DisassociateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Removes the storage type configurations for the specified resource type and association ID.
    */
  def disassociateInstanceStorageConfig(): Request[js.Object, AWSError] = js.native
  def disassociateInstanceStorageConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Removes the storage type configurations for the specified resource type and association ID.
    */
  def disassociateInstanceStorageConfig(params: DisassociateInstanceStorageConfigRequest): Request[js.Object, AWSError] = js.native
  def disassociateInstanceStorageConfig(
    params: DisassociateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Remove the Lambda function from the dropdown options available in the relevant flow blocks.
    */
  def disassociateLambdaFunction(): Request[js.Object, AWSError] = js.native
  def disassociateLambdaFunction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Remove the Lambda function from the dropdown options available in the relevant flow blocks.
    */
  def disassociateLambdaFunction(params: DisassociateLambdaFunctionRequest): Request[js.Object, AWSError] = js.native
  def disassociateLambdaFunction(
    params: DisassociateLambdaFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes authorization from the specified instance to access the specified Amazon Lex bot.
    */
  def disassociateLexBot(): Request[js.Object, AWSError] = js.native
  def disassociateLexBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Revokes authorization from the specified instance to access the specified Amazon Lex bot.
    */
  def disassociateLexBot(params: DisassociateLexBotRequest): Request[js.Object, AWSError] = js.native
  def disassociateLexBot(
    params: DisassociateLexBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the flow association from a phone number claimed to your Amazon Connect instance.  If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def disassociatePhoneNumberContactFlow(): Request[js.Object, AWSError] = js.native
  def disassociatePhoneNumberContactFlow(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the flow association from a phone number claimed to your Amazon Connect instance.  If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the PhoneNumberId URI request parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def disassociatePhoneNumberContactFlow(params: DisassociatePhoneNumberContactFlowRequest): Request[js.Object, AWSError] = js.native
  def disassociatePhoneNumberContactFlow(
    params: DisassociatePhoneNumberContactFlowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Disassociates a set of quick connects from a queue.
    */
  def disassociateQueueQuickConnects(): Request[js.Object, AWSError] = js.native
  def disassociateQueueQuickConnects(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Disassociates a set of quick connects from a queue.
    */
  def disassociateQueueQuickConnects(params: DisassociateQueueQuickConnectsRequest): Request[js.Object, AWSError] = js.native
  def disassociateQueueQuickConnects(
    params: DisassociateQueueQuickConnectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates a set of queues from a routing profile.
    */
  def disassociateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def disassociateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a set of queues from a routing profile.
    */
  def disassociateRoutingProfileQueues(params: DisassociateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def disassociateRoutingProfileQueues(
    params: DisassociateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes the specified security key.
    */
  def disassociateSecurityKey(): Request[js.Object, AWSError] = js.native
  def disassociateSecurityKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Deletes the specified security key.
    */
  def disassociateSecurityKey(params: DisassociateSecurityKeyRequest): Request[js.Object, AWSError] = js.native
  def disassociateSecurityKey(
    params: DisassociateSecurityKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to receive a new routed contact. Contacts can only be dismissed if they are in a MISSED, ERROR, ENDED, or REJECTED state in the Agent Event Stream.
    */
  def dismissUserContact(): Request[DismissUserContactResponse, AWSError] = js.native
  def dismissUserContact(callback: js.Function2[/* err */ AWSError, /* data */ DismissUserContactResponse, scala.Unit]): Request[DismissUserContactResponse, AWSError] = js.native
  /**
    * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to receive a new routed contact. Contacts can only be dismissed if they are in a MISSED, ERROR, ENDED, or REJECTED state in the Agent Event Stream.
    */
  def dismissUserContact(params: DismissUserContactRequest): Request[DismissUserContactResponse, AWSError] = js.native
  def dismissUserContact(
    params: DismissUserContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DismissUserContactResponse, scala.Unit]
  ): Request[DismissUserContactResponse, AWSError] = js.native
  
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]): Request[GetContactAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the contact attributes for the specified contact.
    */
  def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse, AWSError] = js.native
  def getContactAttributes(
    params: GetContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactAttributesResponse, scala.Unit]
  ): Request[GetContactAttributesResponse, AWSError] = js.native
  
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For a description of each metric, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getCurrentMetricData(): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  /**
    * Gets the real-time metric data from the specified Amazon Connect instance. For a description of each metric, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  def getCurrentMetricData(
    params: GetCurrentMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentMetricDataResponse, scala.Unit]
  ): Request[GetCurrentMetricDataResponse, AWSError] = js.native
  
  /**
    * Gets the real-time active user data from the specified Amazon Connect instance. 
    */
  def getCurrentUserData(): Request[GetCurrentUserDataResponse, AWSError] = js.native
  def getCurrentUserData(callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentUserDataResponse, scala.Unit]): Request[GetCurrentUserDataResponse, AWSError] = js.native
  /**
    * Gets the real-time active user data from the specified Amazon Connect instance. 
    */
  def getCurrentUserData(params: GetCurrentUserDataRequest): Request[GetCurrentUserDataResponse, AWSError] = js.native
  def getCurrentUserData(
    params: GetCurrentUserDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCurrentUserDataResponse, scala.Unit]
  ): Request[GetCurrentUserDataResponse, AWSError] = js.native
  
  /**
    * Retrieves a token for federation.  This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error message similar to the following one appears:   Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect  
    */
  def getFederationToken(): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]): Request[GetFederationTokenResponse, AWSError] = js.native
  /**
    * Retrieves a token for federation.  This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error message similar to the following one appears:   Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect  
    */
  def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse, AWSError] = js.native
  def getFederationToken(
    params: GetFederationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFederationTokenResponse, scala.Unit]
  ): Request[GetFederationTokenResponse, AWSError] = js.native
  
  /**
    * Gets historical metric data from the specified Amazon Connect instance. For a description of each historical metric, see Historical Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getMetricData(): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]): Request[GetMetricDataResponse, AWSError] = js.native
  /**
    * Gets historical metric data from the specified Amazon Connect instance. For a description of each historical metric, see Historical Metrics Definitions in the Amazon Connect Administrator Guide.
    */
  def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse, AWSError] = js.native
  def getMetricData(
    params: GetMetricDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataResponse, scala.Unit]
  ): Request[GetMetricDataResponse, AWSError] = js.native
  
  /**
    * Gets metric data from the specified Amazon Connect instance.   GetMetricDataV2 offers more features than GetMetricData, the previous version of this API. It has new metrics, offers filtering at a metric level, and offers the ability to filter and group data by channels, queues, routing profiles, agents, and agent hierarchy levels. It can retrieve historical data for the last 35 days, in 24-hour intervals. For a description of the historical metrics that are supported by GetMetricDataV2 and GetMetricData, see Historical metrics definitions in the Amazon Connect Administrator's Guide.  This API is not available in the Amazon Web Services GovCloud (US) Regions.
    */
  def getMetricDataV2(): Request[GetMetricDataV2Response, AWSError] = js.native
  def getMetricDataV2(callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataV2Response, scala.Unit]): Request[GetMetricDataV2Response, AWSError] = js.native
  /**
    * Gets metric data from the specified Amazon Connect instance.   GetMetricDataV2 offers more features than GetMetricData, the previous version of this API. It has new metrics, offers filtering at a metric level, and offers the ability to filter and group data by channels, queues, routing profiles, agents, and agent hierarchy levels. It can retrieve historical data for the last 35 days, in 24-hour intervals. For a description of the historical metrics that are supported by GetMetricDataV2 and GetMetricData, see Historical metrics definitions in the Amazon Connect Administrator's Guide.  This API is not available in the Amazon Web Services GovCloud (US) Regions.
    */
  def getMetricDataV2(params: GetMetricDataV2Request): Request[GetMetricDataV2Response, AWSError] = js.native
  def getMetricDataV2(
    params: GetMetricDataV2Request,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMetricDataV2Response, scala.Unit]
  ): Request[GetMetricDataV2Response, AWSError] = js.native
  
  /**
    * Gets details about a specific task template in the specified Amazon Connect instance.
    */
  def getTaskTemplate(): Request[GetTaskTemplateResponse, AWSError] = js.native
  def getTaskTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetTaskTemplateResponse, scala.Unit]): Request[GetTaskTemplateResponse, AWSError] = js.native
  /**
    * Gets details about a specific task template in the specified Amazon Connect instance.
    */
  def getTaskTemplate(params: GetTaskTemplateRequest): Request[GetTaskTemplateResponse, AWSError] = js.native
  def getTaskTemplate(
    params: GetTaskTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTaskTemplateResponse, scala.Unit]
  ): Request[GetTaskTemplateResponse, AWSError] = js.native
  
  /**
    * Retrieves the current traffic distribution for a given traffic distribution group.
    */
  def getTrafficDistribution(): Request[GetTrafficDistributionResponse, AWSError] = js.native
  def getTrafficDistribution(callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficDistributionResponse, scala.Unit]): Request[GetTrafficDistributionResponse, AWSError] = js.native
  /**
    * Retrieves the current traffic distribution for a given traffic distribution group.
    */
  def getTrafficDistribution(params: GetTrafficDistributionRequest): Request[GetTrafficDistributionResponse, AWSError] = js.native
  def getTrafficDistribution(
    params: GetTrafficDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTrafficDistributionResponse, scala.Unit]
  ): Request[GetTrafficDistributionResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists agent statuses.
    */
  def listAgentStatuses(): Request[ListAgentStatusResponse, AWSError] = js.native
  def listAgentStatuses(callback: js.Function2[/* err */ AWSError, /* data */ ListAgentStatusResponse, scala.Unit]): Request[ListAgentStatusResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists agent statuses.
    */
  def listAgentStatuses(params: ListAgentStatusRequest): Request[ListAgentStatusResponse, AWSError] = js.native
  def listAgentStatuses(
    params: ListAgentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAgentStatusResponse, scala.Unit]
  ): Request[ListAgentStatusResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all approved origins associated with the instance.
    */
  def listApprovedOrigins(): Request[ListApprovedOriginsResponse, AWSError] = js.native
  def listApprovedOrigins(callback: js.Function2[/* err */ AWSError, /* data */ ListApprovedOriginsResponse, scala.Unit]): Request[ListApprovedOriginsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all approved origins associated with the instance.
    */
  def listApprovedOrigins(params: ListApprovedOriginsRequest): Request[ListApprovedOriginsResponse, AWSError] = js.native
  def listApprovedOrigins(
    params: ListApprovedOriginsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApprovedOriginsResponse, scala.Unit]
  ): Request[ListApprovedOriginsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
    */
  def listBots(): Request[ListBotsResponse, AWSError] = js.native
  def listBots(callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, scala.Unit]): Request[ListBotsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
    */
  def listBots(params: ListBotsRequest): Request[ListBotsResponse, AWSError] = js.native
  def listBots(
    params: ListBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, scala.Unit]
  ): Request[ListBotsResponse, AWSError] = js.native
  
  /**
    * Lists contact evaluations in the specified Amazon Connect instance.
    */
  def listContactEvaluations(): Request[ListContactEvaluationsResponse, AWSError] = js.native
  def listContactEvaluations(callback: js.Function2[/* err */ AWSError, /* data */ ListContactEvaluationsResponse, scala.Unit]): Request[ListContactEvaluationsResponse, AWSError] = js.native
  /**
    * Lists contact evaluations in the specified Amazon Connect instance.
    */
  def listContactEvaluations(params: ListContactEvaluationsRequest): Request[ListContactEvaluationsResponse, AWSError] = js.native
  def listContactEvaluations(
    params: ListContactEvaluationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactEvaluationsResponse, scala.Unit]
  ): Request[ListContactEvaluationsResponse, AWSError] = js.native
  
  /**
    * Provides information about the flow modules for the specified Amazon Connect instance.
    */
  def listContactFlowModules(): Request[ListContactFlowModulesResponse, AWSError] = js.native
  def listContactFlowModules(callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowModulesResponse, scala.Unit]): Request[ListContactFlowModulesResponse, AWSError] = js.native
  /**
    * Provides information about the flow modules for the specified Amazon Connect instance.
    */
  def listContactFlowModules(params: ListContactFlowModulesRequest): Request[ListContactFlowModulesResponse, AWSError] = js.native
  def listContactFlowModules(
    params: ListContactFlowModulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowModulesResponse, scala.Unit]
  ): Request[ListContactFlowModulesResponse, AWSError] = js.native
  
  /**
    * Provides information about the flows for the specified Amazon Connect instance. You can also create and update flows using the Amazon Connect Flow language. For more information about flows, see Flows in the Amazon Connect Administrator Guide.
    */
  def listContactFlows(): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]): Request[ListContactFlowsResponse, AWSError] = js.native
  /**
    * Provides information about the flows for the specified Amazon Connect instance. You can also create and update flows using the Amazon Connect Flow language. For more information about flows, see Flows in the Amazon Connect Administrator Guide.
    */
  def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse, AWSError] = js.native
  def listContactFlows(
    params: ListContactFlowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactFlowsResponse, scala.Unit]
  ): Request[ListContactFlowsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. For the specified referenceTypes, returns a list of references associated with the contact. 
    */
  def listContactReferences(): Request[ListContactReferencesResponse, AWSError] = js.native
  def listContactReferences(callback: js.Function2[/* err */ AWSError, /* data */ ListContactReferencesResponse, scala.Unit]): Request[ListContactReferencesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. For the specified referenceTypes, returns a list of references associated with the contact. 
    */
  def listContactReferences(params: ListContactReferencesRequest): Request[ListContactReferencesResponse, AWSError] = js.native
  def listContactReferences(
    params: ListContactReferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactReferencesResponse, scala.Unit]
  ): Request[ListContactReferencesResponse, AWSError] = js.native
  
  /**
    * Lists the default vocabularies for the specified Amazon Connect instance.
    */
  def listDefaultVocabularies(): Request[ListDefaultVocabulariesResponse, AWSError] = js.native
  def listDefaultVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListDefaultVocabulariesResponse, scala.Unit]): Request[ListDefaultVocabulariesResponse, AWSError] = js.native
  /**
    * Lists the default vocabularies for the specified Amazon Connect instance.
    */
  def listDefaultVocabularies(params: ListDefaultVocabulariesRequest): Request[ListDefaultVocabulariesResponse, AWSError] = js.native
  def listDefaultVocabularies(
    params: ListDefaultVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDefaultVocabulariesResponse, scala.Unit]
  ): Request[ListDefaultVocabulariesResponse, AWSError] = js.native
  
  /**
    * Lists versions of an evaluation form in the specified Amazon Connect instance.
    */
  def listEvaluationFormVersions(): Request[ListEvaluationFormVersionsResponse, AWSError] = js.native
  def listEvaluationFormVersions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListEvaluationFormVersionsResponse, scala.Unit]
  ): Request[ListEvaluationFormVersionsResponse, AWSError] = js.native
  /**
    * Lists versions of an evaluation form in the specified Amazon Connect instance.
    */
  def listEvaluationFormVersions(params: ListEvaluationFormVersionsRequest): Request[ListEvaluationFormVersionsResponse, AWSError] = js.native
  def listEvaluationFormVersions(
    params: ListEvaluationFormVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEvaluationFormVersionsResponse, scala.Unit]
  ): Request[ListEvaluationFormVersionsResponse, AWSError] = js.native
  
  /**
    * Lists evaluation forms in the specified Amazon Connect instance.
    */
  def listEvaluationForms(): Request[ListEvaluationFormsResponse, AWSError] = js.native
  def listEvaluationForms(callback: js.Function2[/* err */ AWSError, /* data */ ListEvaluationFormsResponse, scala.Unit]): Request[ListEvaluationFormsResponse, AWSError] = js.native
  /**
    * Lists evaluation forms in the specified Amazon Connect instance.
    */
  def listEvaluationForms(params: ListEvaluationFormsRequest): Request[ListEvaluationFormsResponse, AWSError] = js.native
  def listEvaluationForms(
    params: ListEvaluationFormsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEvaluationFormsResponse, scala.Unit]
  ): Request[ListEvaluationFormsResponse, AWSError] = js.native
  
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance. For more information about hours of operation, see Set the Hours of Operation for a Queue in the Amazon Connect Administrator Guide.
    */
  def listHoursOfOperations(): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  /**
    * Provides information about the hours of operation for the specified Amazon Connect instance. For more information about hours of operation, see Set the Hours of Operation for a Queue in the Amazon Connect Administrator Guide.
    */
  def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  def listHoursOfOperations(
    params: ListHoursOfOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHoursOfOperationsResponse, scala.Unit]
  ): Request[ListHoursOfOperationsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all attribute types for the given instance.
    */
  def listInstanceAttributes(): Request[ListInstanceAttributesResponse, AWSError] = js.native
  def listInstanceAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceAttributesResponse, scala.Unit]): Request[ListInstanceAttributesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all attribute types for the given instance.
    */
  def listInstanceAttributes(params: ListInstanceAttributesRequest): Request[ListInstanceAttributesResponse, AWSError] = js.native
  def listInstanceAttributes(
    params: ListInstanceAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceAttributesResponse, scala.Unit]
  ): Request[ListInstanceAttributesResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of storage configs for the identified instance and resource type.
    */
  def listInstanceStorageConfigs(): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  def listInstanceStorageConfigs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceStorageConfigsResponse, scala.Unit]
  ): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of storage configs for the identified instance and resource type.
    */
  def listInstanceStorageConfigs(params: ListInstanceStorageConfigsRequest): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  def listInstanceStorageConfigs(
    params: ListInstanceStorageConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceStorageConfigsResponse, scala.Unit]
  ): Request[ListInstanceStorageConfigsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances that aren't successfully created (they are in a failed state) are returned only for 24 hours after the CreateInstance API was invoked.
    */
  def listInstances(): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, scala.Unit]): Request[ListInstancesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances that aren't successfully created (they are in a failed state) are returned only for 24 hours after the CreateInstance API was invoked.
    */
  def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, scala.Unit]
  ): Request[ListInstancesResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect instance.
    */
  def listIntegrationAssociations(): Request[ListIntegrationAssociationsResponse, AWSError] = js.native
  def listIntegrationAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListIntegrationAssociationsResponse, scala.Unit]
  ): Request[ListIntegrationAssociationsResponse, AWSError] = js.native
  /**
    * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect instance.
    */
  def listIntegrationAssociations(params: ListIntegrationAssociationsRequest): Request[ListIntegrationAssociationsResponse, AWSError] = js.native
  def listIntegrationAssociations(
    params: ListIntegrationAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIntegrationAssociationsResponse, scala.Unit]
  ): Request[ListIntegrationAssociationsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow blocks.
    */
  def listLambdaFunctions(): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  def listLambdaFunctions(callback: js.Function2[/* err */ AWSError, /* data */ ListLambdaFunctionsResponse, scala.Unit]): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow blocks.
    */
  def listLambdaFunctions(params: ListLambdaFunctionsRequest): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  def listLambdaFunctions(
    params: ListLambdaFunctionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLambdaFunctionsResponse, scala.Unit]
  ): Request[ListLambdaFunctionsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both Amazon Lex V1 and V2 bots, use the ListBots API. 
    */
  def listLexBots(): Request[ListLexBotsResponse, AWSError] = js.native
  def listLexBots(callback: js.Function2[/* err */ AWSError, /* data */ ListLexBotsResponse, scala.Unit]): Request[ListLexBotsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both Amazon Lex V1 and V2 bots, use the ListBots API. 
    */
  def listLexBots(params: ListLexBotsRequest): Request[ListLexBotsResponse, AWSError] = js.native
  def listLexBots(
    params: ListLexBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLexBotsResponse, scala.Unit]
  ): Request[ListLexBotsResponse, AWSError] = js.native
  
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.  For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.  The phone number Arn value that is returned from each of the items in the PhoneNumberSummaryList cannot be used to tag phone number resources. It will fail with a ResourceNotFoundException. Instead, use the ListPhoneNumbersV2 API. It returns the new phone number ARN that can be used to tag phone number resources. 
    */
  def listPhoneNumbers(): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Provides information about the phone numbers for the specified Amazon Connect instance.  For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.  The phone number Arn value that is returned from each of the items in the PhoneNumberSummaryList cannot be used to tag phone number resources. It will fail with a ResourceNotFoundException. Instead, use the ListPhoneNumbersV2 API. It returns the new phone number ARN that can be used to tag phone number resources. 
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, scala.Unit]
  ): Request[ListPhoneNumbersResponse, AWSError] = js.native
  
  /**
    * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided TargetArn is a traffic distribution group, you can call this API in both Amazon Web Services Regions associated with traffic distribution group. For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.
    */
  def listPhoneNumbersV2(): Request[ListPhoneNumbersV2Response, AWSError] = js.native
  def listPhoneNumbersV2(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersV2Response, scala.Unit]): Request[ListPhoneNumbersV2Response, AWSError] = js.native
  /**
    * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided TargetArn is a traffic distribution group, you can call this API in both Amazon Web Services Regions associated with traffic distribution group. For more information about phone numbers, see Set Up Phone Numbers for Your Contact Center in the Amazon Connect Administrator Guide.
    */
  def listPhoneNumbersV2(params: ListPhoneNumbersV2Request): Request[ListPhoneNumbersV2Response, AWSError] = js.native
  def listPhoneNumbersV2(
    params: ListPhoneNumbersV2Request,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersV2Response, scala.Unit]
  ): Request[ListPhoneNumbersV2Response, AWSError] = js.native
  
  /**
    * Provides information about the prompts for the specified Amazon Connect instance.
    */
  def listPrompts(): Request[ListPromptsResponse, AWSError] = js.native
  def listPrompts(callback: js.Function2[/* err */ AWSError, /* data */ ListPromptsResponse, scala.Unit]): Request[ListPromptsResponse, AWSError] = js.native
  /**
    * Provides information about the prompts for the specified Amazon Connect instance.
    */
  def listPrompts(params: ListPromptsRequest): Request[ListPromptsResponse, AWSError] = js.native
  def listPrompts(
    params: ListPromptsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPromptsResponse, scala.Unit]
  ): Request[ListPromptsResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists the quick connects associated with a queue.
    */
  def listQueueQuickConnects(): Request[ListQueueQuickConnectsResponse, AWSError] = js.native
  def listQueueQuickConnects(callback: js.Function2[/* err */ AWSError, /* data */ ListQueueQuickConnectsResponse, scala.Unit]): Request[ListQueueQuickConnectsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists the quick connects associated with a queue.
    */
  def listQueueQuickConnects(params: ListQueueQuickConnectsRequest): Request[ListQueueQuickConnectsResponse, AWSError] = js.native
  def listQueueQuickConnects(
    params: ListQueueQuickConnectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueueQuickConnectsResponse, scala.Unit]
  ): Request[ListQueueQuickConnectsResponse, AWSError] = js.native
  
  /**
    * Provides information about the queues for the specified Amazon Connect instance. If you do not specify a QueueTypes parameter, both standard and agent queues are returned. This might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of results of the API call in code. For more information about queues, see Queues: Standard and Agent in the Amazon Connect Administrator Guide.
    */
  def listQueues(): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]): Request[ListQueuesResponse, AWSError] = js.native
  /**
    * Provides information about the queues for the specified Amazon Connect instance. If you do not specify a QueueTypes parameter, both standard and agent queues are returned. This might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of results of the API call in code. For more information about queues, see Queues: Standard and Agent in the Amazon Connect Administrator Guide.
    */
  def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse, AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQueuesResponse, scala.Unit]
  ): Request[ListQueuesResponse, AWSError] = js.native
  
  /**
    * Provides information about the quick connects for the specified Amazon Connect instance. 
    */
  def listQuickConnects(): Request[ListQuickConnectsResponse, AWSError] = js.native
  def listQuickConnects(callback: js.Function2[/* err */ AWSError, /* data */ ListQuickConnectsResponse, scala.Unit]): Request[ListQuickConnectsResponse, AWSError] = js.native
  /**
    * Provides information about the quick connects for the specified Amazon Connect instance. 
    */
  def listQuickConnects(params: ListQuickConnectsRequest): Request[ListQuickConnectsResponse, AWSError] = js.native
  def listQuickConnects(
    params: ListQuickConnectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListQuickConnectsResponse, scala.Unit]
  ): Request[ListQuickConnectsResponse, AWSError] = js.native
  
  /**
    * Lists the queues associated with a routing profile.
    */
  def listRoutingProfileQueues(): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  def listRoutingProfileQueues(
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfileQueuesResponse, scala.Unit]
  ): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  /**
    * Lists the queues associated with a routing profile.
    */
  def listRoutingProfileQueues(params: ListRoutingProfileQueuesRequest): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  def listRoutingProfileQueues(
    params: ListRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfileQueuesResponse, scala.Unit]
  ): Request[ListRoutingProfileQueuesResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance. For more information about routing profiles, see Routing Profiles and Create a Routing Profile in the Amazon Connect Administrator Guide.
    */
  def listRoutingProfiles(): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]): Request[ListRoutingProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the routing profiles for the specified Amazon Connect instance. For more information about routing profiles, see Routing Profiles and Create a Routing Profile in the Amazon Connect Administrator Guide.
    */
  def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse, AWSError] = js.native
  def listRoutingProfiles(
    params: ListRoutingProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoutingProfilesResponse, scala.Unit]
  ): Request[ListRoutingProfilesResponse, AWSError] = js.native
  
  /**
    * List all rules for the specified Amazon Connect instance.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, scala.Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * List all rules for the specified Amazon Connect instance.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, scala.Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all security keys associated with the instance.
    */
  def listSecurityKeys(): Request[ListSecurityKeysResponse, AWSError] = js.native
  def listSecurityKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityKeysResponse, scala.Unit]): Request[ListSecurityKeysResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Returns a paginated list of all security keys associated with the instance.
    */
  def listSecurityKeys(params: ListSecurityKeysRequest): Request[ListSecurityKeysResponse, AWSError] = js.native
  def listSecurityKeys(
    params: ListSecurityKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityKeysResponse, scala.Unit]
  ): Request[ListSecurityKeysResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists the permissions granted to a security profile.
    */
  def listSecurityProfilePermissions(): Request[ListSecurityProfilePermissionsResponse, AWSError] = js.native
  def listSecurityProfilePermissions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilePermissionsResponse, scala.Unit]
  ): Request[ListSecurityProfilePermissionsResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Lists the permissions granted to a security profile.
    */
  def listSecurityProfilePermissions(params: ListSecurityProfilePermissionsRequest): Request[ListSecurityProfilePermissionsResponse, AWSError] = js.native
  def listSecurityProfilePermissions(
    params: ListSecurityProfilePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilePermissionsResponse, scala.Unit]
  ): Request[ListSecurityProfilePermissionsResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance. For more information about security profiles, see Security Profiles in the Amazon Connect Administrator Guide.
    */
  def listSecurityProfiles(): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]): Request[ListSecurityProfilesResponse, AWSError] = js.native
  /**
    * Provides summary information about the security profiles for the specified Amazon Connect instance. For more information about security profiles, see Security Profiles in the Amazon Connect Administrator Guide.
    */
  def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse, AWSError] = js.native
  def listSecurityProfiles(
    params: ListSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityProfilesResponse, scala.Unit]
  ): Request[ListSecurityProfilesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, scala.Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists task templates for the specified Amazon Connect instance.
    */
  def listTaskTemplates(): Request[ListTaskTemplatesResponse, AWSError] = js.native
  def listTaskTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTaskTemplatesResponse, scala.Unit]): Request[ListTaskTemplatesResponse, AWSError] = js.native
  /**
    * Lists task templates for the specified Amazon Connect instance.
    */
  def listTaskTemplates(params: ListTaskTemplatesRequest): Request[ListTaskTemplatesResponse, AWSError] = js.native
  def listTaskTemplates(
    params: ListTaskTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTaskTemplatesResponse, scala.Unit]
  ): Request[ListTaskTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists traffic distribution groups.
    */
  def listTrafficDistributionGroups(): Request[ListTrafficDistributionGroupsResponse, AWSError] = js.native
  def listTrafficDistributionGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficDistributionGroupsResponse, scala.Unit]
  ): Request[ListTrafficDistributionGroupsResponse, AWSError] = js.native
  /**
    * Lists traffic distribution groups.
    */
  def listTrafficDistributionGroups(params: ListTrafficDistributionGroupsRequest): Request[ListTrafficDistributionGroupsResponse, AWSError] = js.native
  def listTrafficDistributionGroups(
    params: ListTrafficDistributionGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTrafficDistributionGroupsResponse, scala.Unit]
  ): Request[ListTrafficDistributionGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the use cases for the integration association. 
    */
  def listUseCases(): Request[ListUseCasesResponse, AWSError] = js.native
  def listUseCases(callback: js.Function2[/* err */ AWSError, /* data */ ListUseCasesResponse, scala.Unit]): Request[ListUseCasesResponse, AWSError] = js.native
  /**
    * Lists the use cases for the integration association. 
    */
  def listUseCases(params: ListUseCasesRequest): Request[ListUseCasesResponse, AWSError] = js.native
  def listUseCases(
    params: ListUseCasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUseCasesResponse, scala.Unit]
  ): Request[ListUseCasesResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance. For more information about agent hierarchies, see Set Up Agent Hierarchies in the Amazon Connect Administrator Guide.
    */
  def listUserHierarchyGroups(): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  /**
    * Provides summary information about the hierarchy groups for the specified Amazon Connect instance. For more information about agent hierarchies, see Set Up Agent Hierarchies in the Amazon Connect Administrator Guide.
    */
  def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  def listUserHierarchyGroups(
    params: ListUserHierarchyGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserHierarchyGroupsResponse, scala.Unit]
  ): Request[ListUserHierarchyGroupsResponse, AWSError] = js.native
  
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Provides summary information about the users for the specified Amazon Connect instance.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, scala.Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by userId will be set to silent monitoring mode on the contact.
    */
  def monitorContact(): Request[MonitorContactResponse, AWSError] = js.native
  def monitorContact(callback: js.Function2[/* err */ AWSError, /* data */ MonitorContactResponse, scala.Unit]): Request[MonitorContactResponse, AWSError] = js.native
  /**
    * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by userId will be set to silent monitoring mode on the contact.
    */
  def monitorContact(params: MonitorContactRequest): Request[MonitorContactResponse, AWSError] = js.native
  def monitorContact(
    params: MonitorContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ MonitorContactResponse, scala.Unit]
  ): Request[MonitorContactResponse, AWSError] = js.native
  
  /**
    * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact, this sets the agent's next status. For more information, see Agent status and Set your next status in the Amazon Connect Administrator Guide.
    */
  def putUserStatus(): Request[PutUserStatusResponse, AWSError] = js.native
  def putUserStatus(callback: js.Function2[/* err */ AWSError, /* data */ PutUserStatusResponse, scala.Unit]): Request[PutUserStatusResponse, AWSError] = js.native
  /**
    * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact, this sets the agent's next status. For more information, see Agent status and Set your next status in the Amazon Connect Administrator Guide.
    */
  def putUserStatus(params: PutUserStatusRequest): Request[PutUserStatusResponse, AWSError] = js.native
  def putUserStatus(
    params: PutUserStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutUserStatusResponse, scala.Unit]
  ): Request[PutUserStatusResponse, AWSError] = js.native
  
  /**
    * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can call this API only in the Amazon Web Services Region where the number was claimed.  To release phone numbers from a traffic distribution group, use the ReleasePhoneNumber API, not the Amazon Connect console. After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web Services Support. 
    */
  def releasePhoneNumber(): Request[js.Object, AWSError] = js.native
  def releasePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can call this API only in the Amazon Web Services Region where the number was claimed.  To release phone numbers from a traffic distribution group, use the ReleasePhoneNumber API, not the Amazon Connect console. After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web Services Support. 
    */
  def releasePhoneNumber(params: ReleasePhoneNumberRequest): Request[js.Object, AWSError] = js.native
  def releasePhoneNumber(
    params: ReleasePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Replicates an Amazon Connect instance in the specified Amazon Web Services Region. For more information about replicating an Amazon Connect instance, see Create a replica of your existing Amazon Connect instance in the Amazon Connect Administrator Guide.
    */
  def replicateInstance(): Request[ReplicateInstanceResponse, AWSError] = js.native
  def replicateInstance(callback: js.Function2[/* err */ AWSError, /* data */ ReplicateInstanceResponse, scala.Unit]): Request[ReplicateInstanceResponse, AWSError] = js.native
  /**
    * Replicates an Amazon Connect instance in the specified Amazon Web Services Region. For more information about replicating an Amazon Connect instance, see Create a replica of your existing Amazon Connect instance in the Amazon Connect Administrator Guide.
    */
  def replicateInstance(params: ReplicateInstanceRequest): Request[ReplicateInstanceResponse, AWSError] = js.native
  def replicateInstance(
    params: ReplicateInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicateInstanceResponse, scala.Unit]
  ): Request[ReplicateInstanceResponse, AWSError] = js.native
  
  /**
    * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API resumes recording the call. Only voice recordings are supported at this time.
    */
  def resumeContactRecording(): Request[ResumeContactRecordingResponse, AWSError] = js.native
  def resumeContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ ResumeContactRecordingResponse, scala.Unit]): Request[ResumeContactRecordingResponse, AWSError] = js.native
  /**
    * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API resumes recording the call. Only voice recordings are supported at this time.
    */
  def resumeContactRecording(params: ResumeContactRecordingRequest): Request[ResumeContactRecordingResponse, AWSError] = js.native
  def resumeContactRecording(
    params: ResumeContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResumeContactRecordingResponse, scala.Unit]
  ): Request[ResumeContactRecordingResponse, AWSError] = js.native
  
  /**
    * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution group. If the provided TargetArn is a traffic distribution group, you can call this API in both Amazon Web Services Regions associated with the traffic distribution group.
    */
  def searchAvailablePhoneNumbers(): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, scala.Unit]
  ): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  /**
    * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution group. If the provided TargetArn is a traffic distribution group, you can call this API in both Amazon Web Services Regions associated with the traffic distribution group.
    */
  def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(
    params: SearchAvailablePhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, scala.Unit]
  ): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches queues in an Amazon Connect instance, with optional filtering.
    */
  def searchQueues(): Request[SearchQueuesResponse, AWSError] = js.native
  def searchQueues(callback: js.Function2[/* err */ AWSError, /* data */ SearchQueuesResponse, scala.Unit]): Request[SearchQueuesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches queues in an Amazon Connect instance, with optional filtering.
    */
  def searchQueues(params: SearchQueuesRequest): Request[SearchQueuesResponse, AWSError] = js.native
  def searchQueues(
    params: SearchQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchQueuesResponse, scala.Unit]
  ): Request[SearchQueuesResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches routing profiles in an Amazon Connect instance, with optional filtering.
    */
  def searchRoutingProfiles(): Request[SearchRoutingProfilesResponse, AWSError] = js.native
  def searchRoutingProfiles(callback: js.Function2[/* err */ AWSError, /* data */ SearchRoutingProfilesResponse, scala.Unit]): Request[SearchRoutingProfilesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches routing profiles in an Amazon Connect instance, with optional filtering.
    */
  def searchRoutingProfiles(params: SearchRoutingProfilesRequest): Request[SearchRoutingProfilesResponse, AWSError] = js.native
  def searchRoutingProfiles(
    params: SearchRoutingProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchRoutingProfilesResponse, scala.Unit]
  ): Request[SearchRoutingProfilesResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches security profiles in an Amazon Connect instance, with optional filtering.
    */
  def searchSecurityProfiles(): Request[SearchSecurityProfilesResponse, AWSError] = js.native
  def searchSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ SearchSecurityProfilesResponse, scala.Unit]): Request[SearchSecurityProfilesResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Searches security profiles in an Amazon Connect instance, with optional filtering.
    */
  def searchSecurityProfiles(params: SearchSecurityProfilesRequest): Request[SearchSecurityProfilesResponse, AWSError] = js.native
  def searchSecurityProfiles(
    params: SearchSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSecurityProfilesResponse, scala.Unit]
  ): Request[SearchSecurityProfilesResponse, AWSError] = js.native
  
  /**
    * Searches users in an Amazon Connect instance, with optional filtering.   AfterContactWorkTimeLimit is returned in milliseconds.  
    */
  def searchUsers(): Request[SearchUsersResponse, AWSError] = js.native
  def searchUsers(callback: js.Function2[/* err */ AWSError, /* data */ SearchUsersResponse, scala.Unit]): Request[SearchUsersResponse, AWSError] = js.native
  /**
    * Searches users in an Amazon Connect instance, with optional filtering.   AfterContactWorkTimeLimit is returned in milliseconds.  
    */
  def searchUsers(params: SearchUsersRequest): Request[SearchUsersResponse, AWSError] = js.native
  def searchUsers(
    params: SearchUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchUsersResponse, scala.Unit]
  ): Request[SearchUsersResponse, AWSError] = js.native
  
  /**
    * Searches for vocabularies within a specific Amazon Connect instance using State, NameStartsWith, and LanguageCode.
    */
  def searchVocabularies(): Request[SearchVocabulariesResponse, AWSError] = js.native
  def searchVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ SearchVocabulariesResponse, scala.Unit]): Request[SearchVocabulariesResponse, AWSError] = js.native
  /**
    * Searches for vocabularies within a specific Amazon Connect instance using State, NameStartsWith, and LanguageCode.
    */
  def searchVocabularies(params: SearchVocabulariesRequest): Request[SearchVocabulariesResponse, AWSError] = js.native
  def searchVocabularies(
    params: SearchVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchVocabulariesResponse, scala.Unit]
  ): Request[SearchVocabulariesResponse, AWSError] = js.native
  
  /**
    * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS.  A 429 error occurs in the following situations:   API rate limit is exceeded. API TPS throttling returns a TooManyRequests exception.   The quota for concurrent active chats is exceeded. Active chat throttling returns a LimitExceededException.   If you use the ChatDurationInMinutes parameter and receive a 400 error, your account may not support the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.  For more information about chat, see Chat in the Amazon Connect Administrator Guide.
    */
  def startChatContact(): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]): Request[StartChatContactResponse, AWSError] = js.native
  /**
    * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain credentials from the CreateParticipantConnection API in the Amazon Connect Participant Service. When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the created chat within 5 minutes. This is achieved by invoking CreateParticipantConnection with WEBSOCKET and CONNECTION_CREDENTIALS.  A 429 error occurs in the following situations:   API rate limit is exceeded. API TPS throttling returns a TooManyRequests exception.   The quota for concurrent active chats is exceeded. Active chat throttling returns a LimitExceededException.   If you use the ChatDurationInMinutes parameter and receive a 400 error, your account may not support the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.  For more information about chat, see Chat in the Amazon Connect Administrator Guide.
    */
  def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse, AWSError] = js.native
  def startChatContact(
    params: StartChatContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChatContactResponse, scala.Unit]
  ): Request[StartChatContactResponse, AWSError] = js.native
  
  /**
    * Starts an empty evaluation in the specified Amazon Connect instance, using the given evaluation form for the particular contact. The evaluation form version used for the contact evaluation corresponds to the currently activated version. If no version is activated for the evaluation form, the contact evaluation cannot be started.   Evaluations created through the public API do not contain answer values suggested from automation. 
    */
  def startContactEvaluation(): Request[StartContactEvaluationResponse, AWSError] = js.native
  def startContactEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ StartContactEvaluationResponse, scala.Unit]): Request[StartContactEvaluationResponse, AWSError] = js.native
  /**
    * Starts an empty evaluation in the specified Amazon Connect instance, using the given evaluation form for the particular contact. The evaluation form version used for the contact evaluation corresponds to the currently activated version. If no version is activated for the evaluation form, the contact evaluation cannot be started.   Evaluations created through the public API do not contain answer values suggested from automation. 
    */
  def startContactEvaluation(params: StartContactEvaluationRequest): Request[StartContactEvaluationResponse, AWSError] = js.native
  def startContactEvaluation(
    params: StartContactEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContactEvaluationResponse, scala.Unit]
  ): Request[StartContactEvaluationResponse, AWSError] = js.native
  
  /**
    * Starts recording the contact:    If the API is called before the agent joins the call, recording starts when the agent joins the call.   If the API is called after the agent joins the call, recording starts at the time of the API call.   StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card number), use SuspendContactRecording and ResumeContactRecording. You can use this API to override the recording behavior configured in the Set recording behavior block. Only voice recordings are supported at this time.
    */
  def startContactRecording(): Request[StartContactRecordingResponse, AWSError] = js.native
  def startContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ StartContactRecordingResponse, scala.Unit]): Request[StartContactRecordingResponse, AWSError] = js.native
  /**
    * Starts recording the contact:    If the API is called before the agent joins the call, recording starts when the agent joins the call.   If the API is called after the agent joins the call, recording starts at the time of the API call.   StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card number), use SuspendContactRecording and ResumeContactRecording. You can use this API to override the recording behavior configured in the Set recording behavior block. Only voice recordings are supported at this time.
    */
  def startContactRecording(params: StartContactRecordingRequest): Request[StartContactRecordingResponse, AWSError] = js.native
  def startContactRecording(
    params: StartContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContactRecordingResponse, scala.Unit]
  ): Request[StartContactRecordingResponse, AWSError] = js.native
  
  /**
    *  Initiates real-time message streaming for a new chat contact.  For more information about message streaming, see Enable real-time chat message streaming in the Amazon Connect Administrator Guide.
    */
  def startContactStreaming(): Request[StartContactStreamingResponse, AWSError] = js.native
  def startContactStreaming(callback: js.Function2[/* err */ AWSError, /* data */ StartContactStreamingResponse, scala.Unit]): Request[StartContactStreamingResponse, AWSError] = js.native
  /**
    *  Initiates real-time message streaming for a new chat contact.  For more information about message streaming, see Enable real-time chat message streaming in the Amazon Connect Administrator Guide.
    */
  def startContactStreaming(params: StartContactStreamingRequest): Request[StartContactStreamingResponse, AWSError] = js.native
  def startContactStreaming(
    params: StartContactStreamingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContactStreamingResponse, scala.Unit]
  ): Request[StartContactStreamingResponse, AWSError] = js.native
  
  /**
    * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's specified (in ContactFlowId). Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any other inbound case. There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.  UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must submit a service quota increase request. For more information, see Amazon Connect Service Quotas in the Amazon Connect Administrator Guide.    Campaign calls are not allowed by default. Before you can make a call with TrafficType = CAMPAIGN, you must submit a service quota increase request to the quota Amazon Connect campaigns.  
    */
  def startOutboundVoiceContact(): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  /**
    * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's specified (in ContactFlowId). Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any other inbound case. There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.  UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must submit a service quota increase request. For more information, see Amazon Connect Service Quotas in the Amazon Connect Administrator Guide.    Campaign calls are not allowed by default. Before you can make a call with TrafficType = CAMPAIGN, you must submit a service quota increase request to the quota Amazon Connect campaigns.  
    */
  def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  def startOutboundVoiceContact(
    params: StartOutboundVoiceContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOutboundVoiceContactResponse, scala.Unit]
  ): Request[StartOutboundVoiceContactResponse, AWSError] = js.native
  
  /**
    * Initiates a flow to start a new task.
    */
  def startTaskContact(): Request[StartTaskContactResponse, AWSError] = js.native
  def startTaskContact(callback: js.Function2[/* err */ AWSError, /* data */ StartTaskContactResponse, scala.Unit]): Request[StartTaskContactResponse, AWSError] = js.native
  /**
    * Initiates a flow to start a new task.
    */
  def startTaskContact(params: StartTaskContactRequest): Request[StartTaskContactResponse, AWSError] = js.native
  def startTaskContact(
    params: StartTaskContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTaskContactResponse, scala.Unit]
  ): Request[StartTaskContactResponse, AWSError] = js.native
  
  /**
    * Ends the specified contact. This call does not work for the following initiation methods:   DISCONNECT   TRANSFER   QUEUE_TRANSFER  
    */
  def stopContact(): Request[StopContactResponse, AWSError] = js.native
  def stopContact(callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]): Request[StopContactResponse, AWSError] = js.native
  /**
    * Ends the specified contact. This call does not work for the following initiation methods:   DISCONNECT   TRANSFER   QUEUE_TRANSFER  
    */
  def stopContact(params: StopContactRequest): Request[StopContactResponse, AWSError] = js.native
  def stopContact(
    params: StopContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactResponse, scala.Unit]
  ): Request[StopContactResponse, AWSError] = js.native
  
  /**
    * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend it for sensitive information (for example, to collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording. Only voice recordings are supported at this time.
    */
  def stopContactRecording(): Request[StopContactRecordingResponse, AWSError] = js.native
  def stopContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ StopContactRecordingResponse, scala.Unit]): Request[StopContactRecordingResponse, AWSError] = js.native
  /**
    * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started and you want to suspend it for sensitive information (for example, to collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording. Only voice recordings are supported at this time.
    */
  def stopContactRecording(params: StopContactRecordingRequest): Request[StopContactRecordingResponse, AWSError] = js.native
  def stopContactRecording(
    params: StopContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactRecordingResponse, scala.Unit]
  ): Request[StopContactRecordingResponse, AWSError] = js.native
  
  /**
    *  Ends message streaming on a specified contact. To restart message streaming on that contact, call the StartContactStreaming API. 
    */
  def stopContactStreaming(): Request[StopContactStreamingResponse, AWSError] = js.native
  def stopContactStreaming(callback: js.Function2[/* err */ AWSError, /* data */ StopContactStreamingResponse, scala.Unit]): Request[StopContactStreamingResponse, AWSError] = js.native
  /**
    *  Ends message streaming on a specified contact. To restart message streaming on that contact, call the StartContactStreaming API. 
    */
  def stopContactStreaming(params: StopContactStreamingRequest): Request[StopContactStreamingResponse, AWSError] = js.native
  def stopContactStreaming(
    params: StopContactStreamingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContactStreamingResponse, scala.Unit]
  ): Request[StopContactStreamingResponse, AWSError] = js.native
  
  /**
    * Submits a contact evaluation in the specified Amazon Connect instance. Answers included in the request are merged with existing answers for the given evaluation. If no answers or notes are passed, the evaluation is submitted with the existing answers and notes. You can delete an answer or note by passing an empty object ({}) to the question identifier.  If a contact evaluation is already in submitted state, this operation will trigger a resubmission.
    */
  def submitContactEvaluation(): Request[SubmitContactEvaluationResponse, AWSError] = js.native
  def submitContactEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ SubmitContactEvaluationResponse, scala.Unit]): Request[SubmitContactEvaluationResponse, AWSError] = js.native
  /**
    * Submits a contact evaluation in the specified Amazon Connect instance. Answers included in the request are merged with existing answers for the given evaluation. If no answers or notes are passed, the evaluation is submitted with the existing answers and notes. You can delete an answer or note by passing an empty object ({}) to the question identifier.  If a contact evaluation is already in submitted state, this operation will trigger a resubmission.
    */
  def submitContactEvaluation(params: SubmitContactEvaluationRequest): Request[SubmitContactEvaluationResponse, AWSError] = js.native
  def submitContactEvaluation(
    params: SubmitContactEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitContactEvaluationResponse, scala.Unit]
  ): Request[SubmitContactEvaluationResponse, AWSError] = js.native
  
  /**
    * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording to restart recording.  The period of time that the recording is suspended is filled with silence in the final recording.  Only voice recordings are supported at this time.
    */
  def suspendContactRecording(): Request[SuspendContactRecordingResponse, AWSError] = js.native
  def suspendContactRecording(callback: js.Function2[/* err */ AWSError, /* data */ SuspendContactRecordingResponse, scala.Unit]): Request[SuspendContactRecordingResponse, AWSError] = js.native
  /**
    * When a contact is being recorded, this API suspends recording the call. For example, you might suspend the call recording while collecting sensitive information, such as a credit card number. Then use ResumeContactRecording to restart recording.  The period of time that the recording is suspended is filled with silence in the final recording.  Only voice recordings are supported at this time.
    */
  def suspendContactRecording(params: SuspendContactRecordingRequest): Request[SuspendContactRecordingResponse, AWSError] = js.native
  def suspendContactRecording(
    params: SuspendContactRecordingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SuspendContactRecordingResponse, scala.Unit]
  ): Request[SuspendContactRecordingResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource. Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see Tagging resources in Amazon Connect. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see Tagging resources in Amazon Connect. For sample policies that use tags, see Amazon Connect Identity-Based Policy Examples in the Amazon Connect Administrator Guide.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination queue. This gives you more control over contact handling and helps you adhere to the service level agreement (SLA) guaranteed to your customers. Note the following requirements:   Transfer is supported for only TASK contacts.   Do not use both QueueId and UserId in the same call.   The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.   The TransferContact API can be called only on active contacts.   A contact cannot be transferred more than 11 times.  
    */
  def transferContact(): Request[TransferContactResponse, AWSError] = js.native
  def transferContact(callback: js.Function2[/* err */ AWSError, /* data */ TransferContactResponse, scala.Unit]): Request[TransferContactResponse, AWSError] = js.native
  /**
    * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination queue. This gives you more control over contact handling and helps you adhere to the service level agreement (SLA) guaranteed to your customers. Note the following requirements:   Transfer is supported for only TASK contacts.   Do not use both QueueId and UserId in the same call.   The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.   The TransferContact API can be called only on active contacts.   A contact cannot be transferred more than 11 times.  
    */
  def transferContact(params: TransferContactRequest): Request[TransferContactResponse, AWSError] = js.native
  def transferContact(
    params: TransferContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TransferContactResponse, scala.Unit]
  ): Request[TransferContactResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates agent status.
    */
  def updateAgentStatus(): Request[js.Object, AWSError] = js.native
  def updateAgentStatus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates agent status.
    */
  def updateAgentStatus(params: UpdateAgentStatusRequest): Request[js.Object, AWSError] = js.native
  def updateAgentStatus(
    params: UpdateAgentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Adds or updates user-defined contact information associated with the specified contact. At least one field to be updated must be present in the request.  You can add or update user-defined contact information for both ongoing and completed contacts. 
    */
  def updateContact(): Request[UpdateContactResponse, AWSError] = js.native
  def updateContact(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResponse, scala.Unit]): Request[UpdateContactResponse, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Adds or updates user-defined contact information associated with the specified contact. At least one field to be updated must be present in the request.  You can add or update user-defined contact information for both ongoing and completed contacts. 
    */
  def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse, AWSError] = js.native
  def updateContact(
    params: UpdateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResponse, scala.Unit]
  ): Request[UpdateContactResponse, AWSError] = js.native
  
  /**
    * Creates or updates user-defined contact attributes associated with the specified contact. You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the call is active, you can update the customer's name or the reason the customer called. You can add notes about steps that the agent took during the call that display to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about contact record retention and the maximum size of the contact record attributes section, see Feature specifications in the Amazon Connect Administrator Guide. 
    */
  def updateContactAttributes(): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]): Request[UpdateContactAttributesResponse, AWSError] = js.native
  /**
    * Creates or updates user-defined contact attributes associated with the specified contact. You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the call is active, you can update the customer's name or the reason the customer called. You can add notes about steps that the agent took during the call that display to the next agent that takes the call. You can also update attributes for a contact using data from your CRM application and save the data with the contact in Amazon Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers. Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about contact record retention and the maximum size of the contact record attributes section, see Feature specifications in the Amazon Connect Administrator Guide. 
    */
  def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse, AWSError] = js.native
  def updateContactAttributes(
    params: UpdateContactAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactAttributesResponse, scala.Unit]
  ): Request[UpdateContactAttributesResponse, AWSError] = js.native
  
  /**
    * Updates details about a contact evaluation in the specified Amazon Connect instance. A contact evaluation must be in draft state. Answers included in the request are merged with existing answers for the given evaluation. An answer or note can be deleted by passing an empty object ({}) to the question identifier. 
    */
  def updateContactEvaluation(): Request[UpdateContactEvaluationResponse, AWSError] = js.native
  def updateContactEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactEvaluationResponse, scala.Unit]): Request[UpdateContactEvaluationResponse, AWSError] = js.native
  /**
    * Updates details about a contact evaluation in the specified Amazon Connect instance. A contact evaluation must be in draft state. Answers included in the request are merged with existing answers for the given evaluation. An answer or note can be deleted by passing an empty object ({}) to the question identifier. 
    */
  def updateContactEvaluation(params: UpdateContactEvaluationRequest): Request[UpdateContactEvaluationResponse, AWSError] = js.native
  def updateContactEvaluation(
    params: UpdateContactEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactEvaluationResponse, scala.Unit]
  ): Request[UpdateContactEvaluationResponse, AWSError] = js.native
  
  /**
    * Updates the specified flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def updateContactFlowContent(): Request[UpdateContactFlowContentResponse, AWSError] = js.native
  def updateContactFlowContent(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowContentResponse, scala.Unit]
  ): Request[UpdateContactFlowContentResponse, AWSError] = js.native
  /**
    * Updates the specified flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def updateContactFlowContent(params: UpdateContactFlowContentRequest): Request[UpdateContactFlowContentResponse, AWSError] = js.native
  def updateContactFlowContent(
    params: UpdateContactFlowContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowContentResponse, scala.Unit]
  ): Request[UpdateContactFlowContentResponse, AWSError] = js.native
  
  /**
    * Updates metadata about specified flow.
    */
  def updateContactFlowMetadata(): Request[UpdateContactFlowMetadataResponse, AWSError] = js.native
  def updateContactFlowMetadata(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowMetadataResponse, scala.Unit]
  ): Request[UpdateContactFlowMetadataResponse, AWSError] = js.native
  /**
    * Updates metadata about specified flow.
    */
  def updateContactFlowMetadata(params: UpdateContactFlowMetadataRequest): Request[UpdateContactFlowMetadataResponse, AWSError] = js.native
  def updateContactFlowMetadata(
    params: UpdateContactFlowMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowMetadataResponse, scala.Unit]
  ): Request[UpdateContactFlowMetadataResponse, AWSError] = js.native
  
  /**
    * Updates specified flow module for the specified Amazon Connect instance. 
    */
  def updateContactFlowModuleContent(): Request[UpdateContactFlowModuleContentResponse, AWSError] = js.native
  def updateContactFlowModuleContent(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowModuleContentResponse, scala.Unit]
  ): Request[UpdateContactFlowModuleContentResponse, AWSError] = js.native
  /**
    * Updates specified flow module for the specified Amazon Connect instance. 
    */
  def updateContactFlowModuleContent(params: UpdateContactFlowModuleContentRequest): Request[UpdateContactFlowModuleContentResponse, AWSError] = js.native
  def updateContactFlowModuleContent(
    params: UpdateContactFlowModuleContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowModuleContentResponse, scala.Unit]
  ): Request[UpdateContactFlowModuleContentResponse, AWSError] = js.native
  
  /**
    * Updates metadata about specified flow module.
    */
  def updateContactFlowModuleMetadata(): Request[UpdateContactFlowModuleMetadataResponse, AWSError] = js.native
  def updateContactFlowModuleMetadata(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowModuleMetadataResponse, scala.Unit]
  ): Request[UpdateContactFlowModuleMetadataResponse, AWSError] = js.native
  /**
    * Updates metadata about specified flow module.
    */
  def updateContactFlowModuleMetadata(params: UpdateContactFlowModuleMetadataRequest): Request[UpdateContactFlowModuleMetadataResponse, AWSError] = js.native
  def updateContactFlowModuleMetadata(
    params: UpdateContactFlowModuleMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowModuleMetadataResponse, scala.Unit]
  ): Request[UpdateContactFlowModuleMetadataResponse, AWSError] = js.native
  
  /**
    * The name of the flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def updateContactFlowName(): Request[UpdateContactFlowNameResponse, AWSError] = js.native
  def updateContactFlowName(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowNameResponse, scala.Unit]): Request[UpdateContactFlowNameResponse, AWSError] = js.native
  /**
    * The name of the flow. You can also create and update flows using the Amazon Connect Flow language.
    */
  def updateContactFlowName(params: UpdateContactFlowNameRequest): Request[UpdateContactFlowNameResponse, AWSError] = js.native
  def updateContactFlowName(
    params: UpdateContactFlowNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactFlowNameResponse, scala.Unit]
  ): Request[UpdateContactFlowNameResponse, AWSError] = js.native
  
  /**
    * Updates the scheduled time of a task contact that is already scheduled.
    */
  def updateContactSchedule(): Request[UpdateContactScheduleResponse, AWSError] = js.native
  def updateContactSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactScheduleResponse, scala.Unit]): Request[UpdateContactScheduleResponse, AWSError] = js.native
  /**
    * Updates the scheduled time of a task contact that is already scheduled.
    */
  def updateContactSchedule(params: UpdateContactScheduleRequest): Request[UpdateContactScheduleResponse, AWSError] = js.native
  def updateContactSchedule(
    params: UpdateContactScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactScheduleResponse, scala.Unit]
  ): Request[UpdateContactScheduleResponse, AWSError] = js.native
  
  /**
    * Updates details about a specific evaluation form version in the specified Amazon Connect instance. Question and section identifiers cannot be duplicated within the same evaluation form. This operation does not support partial updates. Instead it does a full update of evaluation form content.
    */
  def updateEvaluationForm(): Request[UpdateEvaluationFormResponse, AWSError] = js.native
  def updateEvaluationForm(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEvaluationFormResponse, scala.Unit]): Request[UpdateEvaluationFormResponse, AWSError] = js.native
  /**
    * Updates details about a specific evaluation form version in the specified Amazon Connect instance. Question and section identifiers cannot be duplicated within the same evaluation form. This operation does not support partial updates. Instead it does a full update of evaluation form content.
    */
  def updateEvaluationForm(params: UpdateEvaluationFormRequest): Request[UpdateEvaluationFormResponse, AWSError] = js.native
  def updateEvaluationForm(
    params: UpdateEvaluationFormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEvaluationFormResponse, scala.Unit]
  ): Request[UpdateEvaluationFormResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the hours of operation.
    */
  def updateHoursOfOperation(): Request[js.Object, AWSError] = js.native
  def updateHoursOfOperation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the hours of operation.
    */
  def updateHoursOfOperation(params: UpdateHoursOfOperationRequest): Request[js.Object, AWSError] = js.native
  def updateHoursOfOperation(
    params: UpdateHoursOfOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the value for the specified attribute type.
    */
  def updateInstanceAttribute(): Request[js.Object, AWSError] = js.native
  def updateInstanceAttribute(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the value for the specified attribute type.
    */
  def updateInstanceAttribute(params: UpdateInstanceAttributeRequest): Request[js.Object, AWSError] = js.native
  def updateInstanceAttribute(
    params: UpdateInstanceAttributeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates an existing configuration for a resource type. This API is idempotent.
    */
  def updateInstanceStorageConfig(): Request[js.Object, AWSError] = js.native
  def updateInstanceStorageConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates an existing configuration for a resource type. This API is idempotent.
    */
  def updateInstanceStorageConfig(params: UpdateInstanceStorageConfigRequest): Request[js.Object, AWSError] = js.native
  def updateInstanceStorageConfig(
    params: UpdateInstanceStorageConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically disconnected from a chat due to idleness. You can set four timers:   Customer idle timeout   Customer auto-disconnect timeout   Agent idle timeout   Agent auto-disconnect timeout   For more information about how chat timeouts work, see Set up chat timeouts for human participants. 
    */
  def updateParticipantRoleConfig(): Request[UpdateParticipantRoleConfigResponse, AWSError] = js.native
  def updateParticipantRoleConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateParticipantRoleConfigResponse, scala.Unit]
  ): Request[UpdateParticipantRoleConfigResponse, AWSError] = js.native
  /**
    * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically disconnected from a chat due to idleness. You can set four timers:   Customer idle timeout   Customer auto-disconnect timeout   Agent idle timeout   Agent auto-disconnect timeout   For more information about how chat timeouts work, see Set up chat timeouts for human participants. 
    */
  def updateParticipantRoleConfig(params: UpdateParticipantRoleConfigRequest): Request[UpdateParticipantRoleConfigResponse, AWSError] = js.native
  def updateParticipantRoleConfig(
    params: UpdateParticipantRoleConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateParticipantRoleConfigResponse, scala.Unit]
  ): Request[UpdateParticipantRoleConfigResponse, AWSError] = js.native
  
  /**
    * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.  After using this API, you must verify that the phone number is attached to the correct flow in the target instance or traffic distribution group. You need to do this because the API switches only the phone number to a new instance or traffic distribution group. It doesn't migrate the flow configuration of the phone number, too. You can call DescribePhoneNumber API to verify the status of a previous UpdatePhoneNumber operation. 
    */
  def updatePhoneNumber(): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, scala.Unit]): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.  After using this API, you must verify that the phone number is attached to the correct flow in the target instance or traffic distribution group. You need to do this because the API switches only the phone number to a new instance or traffic distribution group. It doesn't migrate the flow configuration of the phone number, too. You can call DescribePhoneNumber API to verify the status of a previous UpdatePhoneNumber operation. 
    */
  def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(
    params: UpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, scala.Unit]
  ): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the hours of operation for the specified queue.
    */
  def updateQueueHoursOfOperation(): Request[js.Object, AWSError] = js.native
  def updateQueueHoursOfOperation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the hours of operation for the specified queue.
    */
  def updateQueueHoursOfOperation(params: UpdateQueueHoursOfOperationRequest): Request[js.Object, AWSError] = js.native
  def updateQueueHoursOfOperation(
    params: UpdateQueueHoursOfOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the maximum number of contacts allowed in a queue before it is considered full.
    */
  def updateQueueMaxContacts(): Request[js.Object, AWSError] = js.native
  def updateQueueMaxContacts(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the maximum number of contacts allowed in a queue before it is considered full.
    */
  def updateQueueMaxContacts(params: UpdateQueueMaxContactsRequest): Request[js.Object, AWSError] = js.native
  def updateQueueMaxContacts(
    params: UpdateQueueMaxContactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the name and description of a queue. At least Name or Description must be provided.
    */
  def updateQueueName(): Request[js.Object, AWSError] = js.native
  def updateQueueName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the name and description of a queue. At least Name or Description must be provided.
    */
  def updateQueueName(params: UpdateQueueNameRequest): Request[js.Object, AWSError] = js.native
  def updateQueueName(
    params: UpdateQueueNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.  If the number being used in the input is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the OutboundCallerIdNumberId value of the OutboundCallerConfig request body parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def updateQueueOutboundCallerConfig(): Request[js.Object, AWSError] = js.native
  def updateQueueOutboundCallerConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.  If the number being used in the input is claimed to a traffic distribution group, and you are calling this API using an instance in the Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone number ARN or UUID value for the OutboundCallerIdNumberId value of the OutboundCallerConfig request body parameter. However, if the number is claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will receive a ResourceNotFoundException. 
    */
  def updateQueueOutboundCallerConfig(params: UpdateQueueOutboundCallerConfigRequest): Request[js.Object, AWSError] = js.native
  def updateQueueOutboundCallerConfig(
    params: UpdateQueueOutboundCallerConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the status of the queue.
    */
  def updateQueueStatus(): Request[js.Object, AWSError] = js.native
  def updateQueueStatus(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates the status of the queue.
    */
  def updateQueueStatus(params: UpdateQueueStatusRequest): Request[js.Object, AWSError] = js.native
  def updateQueueStatus(
    params: UpdateQueueStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the configuration settings for the specified quick connect.
    */
  def updateQuickConnectConfig(): Request[js.Object, AWSError] = js.native
  def updateQuickConnectConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the configuration settings for the specified quick connect.
    */
  def updateQuickConnectConfig(params: UpdateQuickConnectConfigRequest): Request[js.Object, AWSError] = js.native
  def updateQuickConnectConfig(
    params: UpdateQuickConnectConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateQuickConnectName(): Request[js.Object, AWSError] = js.native
  def updateQuickConnectName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateQuickConnectName(params: UpdateQuickConnectNameRequest): Request[js.Object, AWSError] = js.native
  def updateQuickConnectName(
    params: UpdateQuickConnectNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
    */
  def updateRoutingProfileConcurrency(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileConcurrency(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
    */
  def updateRoutingProfileConcurrency(params: UpdateRoutingProfileConcurrencyRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileConcurrency(
    params: UpdateRoutingProfileConcurrencyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the default outbound queue of a routing profile.
    */
  def updateRoutingProfileDefaultOutboundQueue(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileDefaultOutboundQueue(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the default outbound queue of a routing profile.
    */
  def updateRoutingProfileDefaultOutboundQueue(params: UpdateRoutingProfileDefaultOutboundQueueRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileDefaultOutboundQueue(
    params: UpdateRoutingProfileDefaultOutboundQueueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateRoutingProfileName(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At least Name or Description must be provided.
    */
  def updateRoutingProfileName(params: UpdateRoutingProfileNameRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileName(
    params: UpdateRoutingProfileNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the properties associated with a set of queues for a routing profile.
    */
  def updateRoutingProfileQueues(): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileQueues(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the properties associated with a set of queues for a routing profile.
    */
  def updateRoutingProfileQueues(params: UpdateRoutingProfileQueuesRequest): Request[js.Object, AWSError] = js.native
  def updateRoutingProfileQueues(
    params: UpdateRoutingProfileQueuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a rule for the specified Amazon Connect instance. Use the Rules Function language to code conditions for the rule. 
    */
  def updateRule(): Request[js.Object, AWSError] = js.native
  def updateRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a rule for the specified Amazon Connect instance. Use the Rules Function language to code conditions for the rule. 
    */
  def updateRule(params: UpdateRuleRequest): Request[js.Object, AWSError] = js.native
  def updateRule(
    params: UpdateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates a security profile.
    */
  def updateSecurityProfile(): Request[js.Object, AWSError] = js.native
  def updateSecurityProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This API is in preview release for Amazon Connect and is subject to change. Updates a security profile.
    */
  def updateSecurityProfile(params: UpdateSecurityProfileRequest): Request[js.Object, AWSError] = js.native
  def updateSecurityProfile(
    params: UpdateSecurityProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not support partial updates. Instead it does a full update of template content.
    */
  def updateTaskTemplate(): Request[UpdateTaskTemplateResponse, AWSError] = js.native
  def updateTaskTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskTemplateResponse, scala.Unit]): Request[UpdateTaskTemplateResponse, AWSError] = js.native
  /**
    * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not support partial updates. Instead it does a full update of template content.
    */
  def updateTaskTemplate(params: UpdateTaskTemplateRequest): Request[UpdateTaskTemplateResponse, AWSError] = js.native
  def updateTaskTemplate(
    params: UpdateTaskTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskTemplateResponse, scala.Unit]
  ): Request[UpdateTaskTemplateResponse, AWSError] = js.native
  
  /**
    * Updates the traffic distribution for a given traffic distribution group.  For more information about updating a traffic distribution group, see Update telephony traffic distribution across Amazon Web Services Regions  in the Amazon Connect Administrator Guide. 
    */
  def updateTrafficDistribution(): Request[UpdateTrafficDistributionResponse, AWSError] = js.native
  def updateTrafficDistribution(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficDistributionResponse, scala.Unit]
  ): Request[UpdateTrafficDistributionResponse, AWSError] = js.native
  /**
    * Updates the traffic distribution for a given traffic distribution group.  For more information about updating a traffic distribution group, see Update telephony traffic distribution across Amazon Web Services Regions  in the Amazon Connect Administrator Guide. 
    */
  def updateTrafficDistribution(params: UpdateTrafficDistributionRequest): Request[UpdateTrafficDistributionResponse, AWSError] = js.native
  def updateTrafficDistribution(
    params: UpdateTrafficDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTrafficDistributionResponse, scala.Unit]
  ): Request[UpdateTrafficDistributionResponse, AWSError] = js.native
  
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified hierarchy group to the specified user.
    */
  def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchy(
    params: UpdateUserHierarchyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the name of the user hierarchy group. 
    */
  def updateUserHierarchyGroupName(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyGroupName(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the name of the user hierarchy group. 
    */
  def updateUserHierarchyGroupName(params: UpdateUserHierarchyGroupNameRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyGroupName(
    params: UpdateUserHierarchyGroupNameRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
    */
  def updateUserHierarchyStructure(): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyStructure(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
    */
  def updateUserHierarchyStructure(params: UpdateUserHierarchyStructureRequest): Request[js.Object, AWSError] = js.native
  def updateUserHierarchyStructure(
    params: UpdateUserHierarchyStructureRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the identity information for the specified user.  We strongly recommend limiting who has the ability to invoke UpdateUserIdentityInfo. Someone with that ability can change the login credentials of other users by changing their email address. This poses a security risk to your organization. They can change the email address of a user to the attacker's email address, and then reset the password through email. For more information, see Best Practices for Security Profiles in the Amazon Connect Administrator Guide. 
    */
  def updateUserIdentityInfo(): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the identity information for the specified user.  We strongly recommend limiting who has the ability to invoke UpdateUserIdentityInfo. Someone with that ability can change the login credentials of other users by changing their email address. This poses a security risk to your organization. They can change the email address of a user to the attacker's email address, and then reset the password through email. For more information, see Best Practices for Security Profiles in the Amazon Connect Administrator Guide. 
    */
  def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object, AWSError] = js.native
  def updateUserIdentityInfo(
    params: UpdateUserIdentityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone configuration settings for the specified user.
    */
  def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object, AWSError] = js.native
  def updateUserPhoneConfig(
    params: UpdateUserPhoneConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified routing profile to the specified user.
    */
  def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object, AWSError] = js.native
  def updateUserRoutingProfile(
    params: UpdateUserRoutingProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns the specified security profiles to the specified user.
    */
  def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object, AWSError] = js.native
  def updateUserSecurityProfiles(
    params: UpdateUserSecurityProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
}
