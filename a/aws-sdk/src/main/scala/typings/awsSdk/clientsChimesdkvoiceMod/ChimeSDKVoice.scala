package typings.awsSdk.clientsChimesdkvoiceMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChimeSDKVoice extends Service {
  
  /**
    * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, Unit]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    params: AssociatePhoneNumbersWithVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, Unit]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  
  /**
    * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
    */
  def associatePhoneNumbersWithVoiceConnectorGroup(): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnectorGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
    */
  def associatePhoneNumbersWithVoiceConnectorGroup(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnectorGroup(
    params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  
  /**
    *  Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime SDK Voice Connectors before they can be deleted.   Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently. 
    */
  def batchDeletePhoneNumber(): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  def batchDeletePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePhoneNumberResponse, Unit]): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  /**
    *  Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime SDK Voice Connectors before they can be deleted.   Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently. 
    */
  def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  def batchDeletePhoneNumber(
    params: BatchDeletePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePhoneNumberResponse, Unit]
  ): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  
  /**
    * Updates one or more phone numbers.
    */
  def batchUpdatePhoneNumber(): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  def batchUpdatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdatePhoneNumberResponse, Unit]): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates one or more phone numbers.
    */
  def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  def batchUpdatePhoneNumber(
    params: BatchUpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdatePhoneNumberResponse, Unit]
  ): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ChimeSDKVoice: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime SDK SIP media application dial-in product type.
    */
  def createPhoneNumberOrder(): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  def createPhoneNumberOrder(callback: js.Function2[/* err */ AWSError, /* data */ CreatePhoneNumberOrderResponse, Unit]): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime SDK SIP media application dial-in product type.
    */
  def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  def createPhoneNumberOrder(
    params: CreatePhoneNumberOrderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePhoneNumberOrderResponse, Unit]
  ): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  
  /**
    * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone numbers.
    */
  def createProxySession(): Request[CreateProxySessionResponse, AWSError] = js.native
  def createProxySession(callback: js.Function2[/* err */ AWSError, /* data */ CreateProxySessionResponse, Unit]): Request[CreateProxySessionResponse, AWSError] = js.native
  /**
    * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone numbers.
    */
  def createProxySession(params: CreateProxySessionRequest): Request[CreateProxySessionResponse, AWSError] = js.native
  def createProxySession(
    params: CreateProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProxySessionResponse, Unit]
  ): Request[CreateProxySessionResponse, AWSError] = js.native
  
  /**
    * Creates a SIP media application. For more information about SIP media applications, see Managing SIP media applications and rules in the Amazon Chime SDK Administrator Guide.
    */
  def createSipMediaApplication(): Request[CreateSipMediaApplicationResponse, AWSError] = js.native
  def createSipMediaApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateSipMediaApplicationResponse, Unit]): Request[CreateSipMediaApplicationResponse, AWSError] = js.native
  /**
    * Creates a SIP media application. For more information about SIP media applications, see Managing SIP media applications and rules in the Amazon Chime SDK Administrator Guide.
    */
  def createSipMediaApplication(params: CreateSipMediaApplicationRequest): Request[CreateSipMediaApplicationResponse, AWSError] = js.native
  def createSipMediaApplication(
    params: CreateSipMediaApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSipMediaApplicationResponse, Unit]
  ): Request[CreateSipMediaApplicationResponse, AWSError] = js.native
  
  /**
    * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the endpoint of the specified sipMediaApplicationId.
    */
  def createSipMediaApplicationCall(): Request[CreateSipMediaApplicationCallResponse, AWSError] = js.native
  def createSipMediaApplicationCall(callback: js.Function2[/* err */ AWSError, /* data */ CreateSipMediaApplicationCallResponse, Unit]): Request[CreateSipMediaApplicationCallResponse, AWSError] = js.native
  /**
    * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the endpoint of the specified sipMediaApplicationId.
    */
  def createSipMediaApplicationCall(params: CreateSipMediaApplicationCallRequest): Request[CreateSipMediaApplicationCallResponse, AWSError] = js.native
  def createSipMediaApplicationCall(
    params: CreateSipMediaApplicationCallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSipMediaApplicationCallResponse, Unit]
  ): Request[CreateSipMediaApplicationCallResponse, AWSError] = js.native
  
  /**
    * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For more information about SIP rules, see Managing SIP media applications and rules in the Amazon Chime SDK Administrator Guide.
    */
  def createSipRule(): Request[CreateSipRuleResponse, AWSError] = js.native
  def createSipRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateSipRuleResponse, Unit]): Request[CreateSipRuleResponse, AWSError] = js.native
  /**
    * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For more information about SIP rules, see Managing SIP media applications and rules in the Amazon Chime SDK Administrator Guide.
    */
  def createSipRule(params: CreateSipRuleRequest): Request[CreateSipRuleResponse, AWSError] = js.native
  def createSipRule(
    params: CreateSipRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSipRuleResponse, Unit]
  ): Request[CreateSipRuleResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see Managing Amazon Chime SDK Voice Connector groups in the Amazon Chime SDK Administrator Guide.
    */
  def createVoiceConnector(): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  def createVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorResponse, Unit]): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see Managing Amazon Chime SDK Voice Connector groups in the Amazon Chime SDK Administrator Guide.
    */
  def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  def createVoiceConnector(
    params: CreateVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorResponse, Unit]
  ): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Chime SDK Voice Connector group under the administrator's AWS account. You can associate Amazon Chime SDK Voice Connectors with the Voice Connector group by including VoiceConnectorItems in the request.  You can include Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  def createVoiceConnectorGroup(): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  def createVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorGroupResponse, Unit]): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime SDK Voice Connector group under the administrator's AWS account. You can associate Amazon Chime SDK Voice Connectors with the Voice Connector group by including VoiceConnectorItems in the request.  You can include Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  def createVoiceConnectorGroup(params: CreateVoiceConnectorGroupRequest): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  def createVoiceConnectorGroup(
    params: CreateVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorGroupResponse, Unit]
  ): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  
  /**
    * Creates a voice profile, which consists of an enrolled user and their latest voice print.  Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK.  For more information about voice profiles and voice analytics, see Using Amazon Chime SDK Voice Analytics in the Amazon Chime SDK Developer Guide.
    */
  def createVoiceProfile(): Request[CreateVoiceProfileResponse, AWSError] = js.native
  def createVoiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceProfileResponse, Unit]): Request[CreateVoiceProfileResponse, AWSError] = js.native
  /**
    * Creates a voice profile, which consists of an enrolled user and their latest voice print.  Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK.  For more information about voice profiles and voice analytics, see Using Amazon Chime SDK Voice Analytics in the Amazon Chime SDK Developer Guide.
    */
  def createVoiceProfile(params: CreateVoiceProfileRequest): Request[CreateVoiceProfileResponse, AWSError] = js.native
  def createVoiceProfile(
    params: CreateVoiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceProfileResponse, Unit]
  ): Request[CreateVoiceProfileResponse, AWSError] = js.native
  
  /**
    * Creates a voice profile domain, a collection of voice profiles, their voice prints, and encrypted enrollment audio.  Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK.  For more information about voice profile domains, see Using Amazon Chime SDK Voice Analytics in the Amazon Chime SDK Developer Guide.
    */
  def createVoiceProfileDomain(): Request[CreateVoiceProfileDomainResponse, AWSError] = js.native
  def createVoiceProfileDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceProfileDomainResponse, Unit]): Request[CreateVoiceProfileDomainResponse, AWSError] = js.native
  /**
    * Creates a voice profile domain, a collection of voice profiles, their voice prints, and encrypted enrollment audio.  Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK.  For more information about voice profile domains, see Using Amazon Chime SDK Voice Analytics in the Amazon Chime SDK Developer Guide.
    */
  def createVoiceProfileDomain(params: CreateVoiceProfileDomainRequest): Request[CreateVoiceProfileDomainResponse, AWSError] = js.native
  def createVoiceProfileDomain(
    params: CreateVoiceProfileDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceProfileDomainResponse, Unit]
  ): Request[CreateVoiceProfileDomainResponse, AWSError] = js.native
  
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime SDK Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(): Request[js.Object, AWSError] = js.native
  def deletePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime SDK Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object, AWSError] = js.native
  def deletePhoneNumber(
    params: DeletePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteProxySession(): Request[js.Object, AWSError] = js.native
  def deleteProxySession(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteProxySession(params: DeleteProxySessionRequest): Request[js.Object, AWSError] = js.native
  def deleteProxySession(
    params: DeleteProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a SIP media application.
    */
  def deleteSipMediaApplication(): Request[js.Object, AWSError] = js.native
  def deleteSipMediaApplication(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a SIP media application.
    */
  def deleteSipMediaApplication(params: DeleteSipMediaApplicationRequest): Request[js.Object, AWSError] = js.native
  def deleteSipMediaApplication(
    params: DeleteSipMediaApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a SIP rule.
    */
  def deleteSipRule(): Request[js.Object, AWSError] = js.native
  def deleteSipRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a SIP rule.
    */
  def deleteSipRule(params: DeleteSipRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteSipRule(
    params: DeleteSipRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice Connector must be disassociated from it before it can be deleted.
    */
  def deleteVoiceConnector(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice Connector must be disassociated from it before it can be deleted.
    */
  def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnector(
    params: DeleteVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteVoiceConnectorEmergencyCallingConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorEmergencyCallingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteVoiceConnectorEmergencyCallingConfiguration(params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorEmergencyCallingConfiguration(
    params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Amazon Chime SDK Voice Connector group. Any VoiceConnectorItems and phone numbers associated with the group must be removed before it can be deleted.
    */
  def deleteVoiceConnectorGroup(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Chime SDK Voice Connector group. Any VoiceConnectorItems and phone numbers associated with the group must be removed before it can be deleted.
    */
  def deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorGroup(
    params: DeleteVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the origination settings for the specified Amazon Chime SDK Voice Connector.   If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the origination settings. 
    */
  def deleteVoiceConnectorOrigination(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the origination settings for the specified Amazon Chime SDK Voice Connector.   If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the origination settings. 
    */
  def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorOrigination(
    params: DeleteVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteVoiceConnectorProxy(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
    */
  def deleteVoiceConnectorProxy(params: DeleteVoiceConnectorProxyRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorProxy(
    params: DeleteVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Voice Connector's streaming configuration.
    */
  def deleteVoiceConnectorStreamingConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorStreamingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Voice Connector's streaming configuration.
    */
  def deleteVoiceConnectorStreamingConfiguration(params: DeleteVoiceConnectorStreamingConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorStreamingConfiguration(
    params: DeleteVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the termination settings for the specified Amazon Chime SDK Voice Connector.  If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the termination settings. 
    */
  def deleteVoiceConnectorTermination(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the termination settings for the specified Amazon Chime SDK Voice Connector.  If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the termination settings. 
    */
  def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTermination(
    params: DeleteVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(
    params: DeleteVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
    */
  def deleteVoiceProfile(): Request[js.Object, AWSError] = js.native
  def deleteVoiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
    */
  def deleteVoiceProfile(params: DeleteVoiceProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceProfile(
    params: DeleteVoiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
    */
  def deleteVoiceProfileDomain(): Request[js.Object, AWSError] = js.native
  def deleteVoiceProfileDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
    */
  def deleteVoiceProfileDomain(params: DeleteVoiceProfileDomainRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceProfileDomain(
    params: DeleteVoiceProfileDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    params: DisassociatePhoneNumbersFromVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
    */
  def disassociatePhoneNumbersFromVoiceConnectorGroup(): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnectorGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
    */
  def disassociatePhoneNumbersFromVoiceConnectorGroup(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnectorGroup(
    params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  
  /**
    * Retrieves the global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
    */
  def getGlobalSettings(): Request[GetGlobalSettingsResponse, AWSError] = js.native
  def getGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetGlobalSettingsResponse, Unit]): Request[GetGlobalSettingsResponse, AWSError] = js.native
  
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(): Request[GetPhoneNumberResponse, AWSError] = js.native
  def getPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberResponse, Unit]): Request[GetPhoneNumberResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse, AWSError] = js.native
  def getPhoneNumber(
    params: GetPhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberResponse, Unit]
  ): Request[GetPhoneNumberResponse, AWSError] = js.native
  
  /**
    * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  def getPhoneNumberOrder(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberOrderResponse, Unit]): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  def getPhoneNumberOrder(
    params: GetPhoneNumberOrderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberOrderResponse, Unit]
  ): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  
  /**
    * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling name.
    */
  def getPhoneNumberSettings(): Request[GetPhoneNumberSettingsResponse, AWSError] = js.native
  def getPhoneNumberSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberSettingsResponse, Unit]): Request[GetPhoneNumberSettingsResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
    */
  def getProxySession(): Request[GetProxySessionResponse, AWSError] = js.native
  def getProxySession(callback: js.Function2[/* err */ AWSError, /* data */ GetProxySessionResponse, Unit]): Request[GetProxySessionResponse, AWSError] = js.native
  /**
    * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
    */
  def getProxySession(params: GetProxySessionRequest): Request[GetProxySessionResponse, AWSError] = js.native
  def getProxySession(
    params: GetProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProxySessionResponse, Unit]
  ): Request[GetProxySessionResponse, AWSError] = js.native
  
  /**
    * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
    */
  def getSipMediaApplication(): Request[GetSipMediaApplicationResponse, AWSError] = js.native
  def getSipMediaApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetSipMediaApplicationResponse, Unit]): Request[GetSipMediaApplicationResponse, AWSError] = js.native
  /**
    * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
    */
  def getSipMediaApplication(params: GetSipMediaApplicationRequest): Request[GetSipMediaApplicationResponse, AWSError] = js.native
  def getSipMediaApplication(
    params: GetSipMediaApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSipMediaApplicationResponse, Unit]
  ): Request[GetSipMediaApplicationResponse, AWSError] = js.native
  
  /**
    * Gets the Alexa Skill configuration for the SIP media application.
    */
  def getSipMediaApplicationAlexaSkillConfiguration(): Request[GetSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  def getSipMediaApplicationAlexaSkillConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetSipMediaApplicationAlexaSkillConfigurationResponse, 
      Unit
    ]
  ): Request[GetSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  /**
    * Gets the Alexa Skill configuration for the SIP media application.
    */
  def getSipMediaApplicationAlexaSkillConfiguration(params: GetSipMediaApplicationAlexaSkillConfigurationRequest): Request[GetSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  def getSipMediaApplicationAlexaSkillConfiguration(
    params: GetSipMediaApplicationAlexaSkillConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetSipMediaApplicationAlexaSkillConfigurationResponse, 
      Unit
    ]
  ): Request[GetSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the logging configuration for the specified SIP media application.
    */
  def getSipMediaApplicationLoggingConfiguration(): Request[GetSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  def getSipMediaApplicationLoggingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetSipMediaApplicationLoggingConfigurationResponse, 
      Unit
    ]
  ): Request[GetSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the logging configuration for the specified SIP media application.
    */
  def getSipMediaApplicationLoggingConfiguration(params: GetSipMediaApplicationLoggingConfigurationRequest): Request[GetSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  def getSipMediaApplicationLoggingConfiguration(
    params: GetSipMediaApplicationLoggingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetSipMediaApplicationLoggingConfigurationResponse, 
      Unit
    ]
  ): Request[GetSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
    */
  def getSipRule(): Request[GetSipRuleResponse, AWSError] = js.native
  def getSipRule(callback: js.Function2[/* err */ AWSError, /* data */ GetSipRuleResponse, Unit]): Request[GetSipRuleResponse, AWSError] = js.native
  /**
    * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
    */
  def getSipRule(params: GetSipRuleRequest): Request[GetSipRuleResponse, AWSError] = js.native
  def getSipRule(
    params: GetSipRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSipRuleResponse, Unit]
  ): Request[GetSipRuleResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of the specified speaker search task.
    */
  def getSpeakerSearchTask(): Request[GetSpeakerSearchTaskResponse, AWSError] = js.native
  def getSpeakerSearchTask(callback: js.Function2[/* err */ AWSError, /* data */ GetSpeakerSearchTaskResponse, Unit]): Request[GetSpeakerSearchTaskResponse, AWSError] = js.native
  /**
    * Retrieves the details of the specified speaker search task.
    */
  def getSpeakerSearchTask(params: GetSpeakerSearchTaskRequest): Request[GetSpeakerSearchTaskResponse, AWSError] = js.native
  def getSpeakerSearchTask(
    params: GetSpeakerSearchTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSpeakerSearchTaskResponse, Unit]
  ): Request[GetSpeakerSearchTaskResponse, AWSError] = js.native
  
  /**
    * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(): Request[GetVoiceConnectorResponse, AWSError] = js.native
  def getVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorResponse, Unit]): Request[GetVoiceConnectorResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse, AWSError] = js.native
  def getVoiceConnector(
    params: GetVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorResponse, Unit]
  ): Request[GetVoiceConnectorResponse, AWSError] = js.native
  
  /**
    * Retrieves the emergency calling configuration details for the specified Voice Connector.
    */
  def getVoiceConnectorEmergencyCallingConfiguration(): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorEmergencyCallingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetVoiceConnectorEmergencyCallingConfigurationResponse, 
      Unit
    ]
  ): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the emergency calling configuration details for the specified Voice Connector.
    */
  def getVoiceConnectorEmergencyCallingConfiguration(params: GetVoiceConnectorEmergencyCallingConfigurationRequest): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorEmergencyCallingConfiguration(
    params: GetVoiceConnectorEmergencyCallingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetVoiceConnectorEmergencyCallingConfigurationResponse, 
      Unit
    ]
  ): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and associated VoiceConnectorItems.
    */
  def getVoiceConnectorGroup(): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  def getVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorGroupResponse, Unit]): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and associated VoiceConnectorItems.
    */
  def getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  def getVoiceConnectorGroup(
    params: GetVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorGroupResponse, Unit]
  ): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  
  /**
    * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def getVoiceConnectorLoggingConfiguration(): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorLoggingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def getVoiceConnectorLoggingConfiguration(params: GetVoiceConnectorLoggingConfigurationRequest): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorLoggingConfiguration(
    params: GetVoiceConnectorLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the origination settings for the specified Voice Connector.
    */
  def getVoiceConnectorOrigination(): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  def getVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorOriginationResponse, Unit]): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * Retrieves the origination settings for the specified Voice Connector.
    */
  def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  def getVoiceConnectorOrigination(
    params: GetVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorOriginationResponse, Unit]
  ): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  
  /**
    * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
    */
  def getVoiceConnectorProxy(): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  def getVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorProxyResponse, Unit]): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
    */
  def getVoiceConnectorProxy(params: GetVoiceConnectorProxyRequest): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  def getVoiceConnectorProxy(
    params: GetVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorProxyResponse, Unit]
  ): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  
  /**
    * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon Kinesis data.
    */
  def getVoiceConnectorStreamingConfiguration(): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorStreamingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon Kinesis data.
    */
  def getVoiceConnectorStreamingConfiguration(params: GetVoiceConnectorStreamingConfigurationRequest): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorStreamingConfiguration(
    params: GetVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the termination setting details for the specified Voice Connector.
    */
  def getVoiceConnectorTermination(): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  def getVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationResponse, Unit]): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Retrieves the termination setting details for the specified Voice Connector.
    */
  def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  def getVoiceConnectorTermination(
    params: GetVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationResponse, Unit]
  ): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime SDK Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationHealthResponse, Unit]
  ): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime SDK Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    params: GetVoiceConnectorTerminationHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationHealthResponse, Unit]
  ): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of the specified voice profile.
    */
  def getVoiceProfile(): Request[GetVoiceProfileResponse, AWSError] = js.native
  def getVoiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceProfileResponse, Unit]): Request[GetVoiceProfileResponse, AWSError] = js.native
  /**
    * Retrieves the details of the specified voice profile.
    */
  def getVoiceProfile(params: GetVoiceProfileRequest): Request[GetVoiceProfileResponse, AWSError] = js.native
  def getVoiceProfile(
    params: GetVoiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceProfileResponse, Unit]
  ): Request[GetVoiceProfileResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of the specified voice profile domain.
    */
  def getVoiceProfileDomain(): Request[GetVoiceProfileDomainResponse, AWSError] = js.native
  def getVoiceProfileDomain(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceProfileDomainResponse, Unit]): Request[GetVoiceProfileDomainResponse, AWSError] = js.native
  /**
    * Retrieves the details of the specified voice profile domain.
    */
  def getVoiceProfileDomain(params: GetVoiceProfileDomainRequest): Request[GetVoiceProfileDomainResponse, AWSError] = js.native
  def getVoiceProfileDomain(
    params: GetVoiceProfileDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceProfileDomainResponse, Unit]
  ): Request[GetVoiceProfileDomainResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of a voice tone analysis task.
    */
  def getVoiceToneAnalysisTask(): Request[GetVoiceToneAnalysisTaskResponse, AWSError] = js.native
  def getVoiceToneAnalysisTask(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceToneAnalysisTaskResponse, Unit]): Request[GetVoiceToneAnalysisTaskResponse, AWSError] = js.native
  /**
    * Retrieves the details of a voice tone analysis task.
    */
  def getVoiceToneAnalysisTask(params: GetVoiceToneAnalysisTaskRequest): Request[GetVoiceToneAnalysisTaskResponse, AWSError] = js.native
  def getVoiceToneAnalysisTask(
    params: GetVoiceToneAnalysisTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceToneAnalysisTaskResponse, Unit]
  ): Request[GetVoiceToneAnalysisTaskResponse, AWSError] = js.native
  
  /**
    * Lists the available AWS Regions in which you can create an Amazon Chime SDK Voice Connector.
    */
  def listAvailableVoiceConnectorRegions(): Request[ListAvailableVoiceConnectorRegionsResponse, AWSError] = js.native
  def listAvailableVoiceConnectorRegions(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableVoiceConnectorRegionsResponse, Unit]
  ): Request[ListAvailableVoiceConnectorRegionsResponse, AWSError] = js.native
  
  /**
    * Lists the phone numbers for an administrator's Amazon Chime SDK account.
    */
  def listPhoneNumberOrders(): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  def listPhoneNumberOrders(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumberOrdersResponse, Unit]): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  /**
    * Lists the phone numbers for an administrator's Amazon Chime SDK account.
    */
  def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  def listPhoneNumberOrders(
    params: ListPhoneNumberOrdersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumberOrdersResponse, Unit]
  ): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  
  /**
    * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice Connector, or Amazon Chime SDK Voice Connector group.
    */
  def listPhoneNumbers(): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, Unit]): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice Connector, or Amazon Chime SDK Voice Connector group.
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, Unit]
  ): Request[ListPhoneNumbersResponse, AWSError] = js.native
  
  /**
    * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
    */
  def listProxySessions(): Request[ListProxySessionsResponse, AWSError] = js.native
  def listProxySessions(callback: js.Function2[/* err */ AWSError, /* data */ ListProxySessionsResponse, Unit]): Request[ListProxySessionsResponse, AWSError] = js.native
  /**
    * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
    */
  def listProxySessions(params: ListProxySessionsRequest): Request[ListProxySessionsResponse, AWSError] = js.native
  def listProxySessions(
    params: ListProxySessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProxySessionsResponse, Unit]
  ): Request[ListProxySessionsResponse, AWSError] = js.native
  
  /**
    * Lists the SIP media applications under the administrator's AWS account.
    */
  def listSipMediaApplications(): Request[ListSipMediaApplicationsResponse, AWSError] = js.native
  def listSipMediaApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListSipMediaApplicationsResponse, Unit]): Request[ListSipMediaApplicationsResponse, AWSError] = js.native
  /**
    * Lists the SIP media applications under the administrator's AWS account.
    */
  def listSipMediaApplications(params: ListSipMediaApplicationsRequest): Request[ListSipMediaApplicationsResponse, AWSError] = js.native
  def listSipMediaApplications(
    params: ListSipMediaApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSipMediaApplicationsResponse, Unit]
  ): Request[ListSipMediaApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists the SIP rules under the administrator's AWS account.
    */
  def listSipRules(): Request[ListSipRulesResponse, AWSError] = js.native
  def listSipRules(callback: js.Function2[/* err */ AWSError, /* data */ ListSipRulesResponse, Unit]): Request[ListSipRulesResponse, AWSError] = js.native
  /**
    * Lists the SIP rules under the administrator's AWS account.
    */
  def listSipRules(params: ListSipRulesRequest): Request[ListSipRulesResponse, AWSError] = js.native
  def listSipRules(
    params: ListSipRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSipRulesResponse, Unit]
  ): Request[ListSipRulesResponse, AWSError] = js.native
  
  /**
    * Lists the countries that you can order phone numbers from.
    */
  def listSupportedPhoneNumberCountries(): Request[ListSupportedPhoneNumberCountriesResponse, AWSError] = js.native
  def listSupportedPhoneNumberCountries(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSupportedPhoneNumberCountriesResponse, Unit]
  ): Request[ListSupportedPhoneNumberCountriesResponse, AWSError] = js.native
  /**
    * Lists the countries that you can order phone numbers from.
    */
  def listSupportedPhoneNumberCountries(params: ListSupportedPhoneNumberCountriesRequest): Request[ListSupportedPhoneNumberCountriesResponse, AWSError] = js.native
  def listSupportedPhoneNumberCountries(
    params: ListSupportedPhoneNumberCountriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSupportedPhoneNumberCountriesResponse, Unit]
  ): Request[ListSupportedPhoneNumberCountriesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the tags in a given resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags in a given resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
    */
  def listVoiceConnectorGroups(): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  def listVoiceConnectorGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorGroupsResponse, Unit]): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
    */
  def listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  def listVoiceConnectorGroups(
    params: ListVoiceConnectorGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorGroupsResponse, Unit]
  ): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  def listVoiceConnectorTerminationCredentials(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      Unit
    ]
  ): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  def listVoiceConnectorTerminationCredentials(
    params: ListVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      Unit
    ]
  ): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
    */
  def listVoiceConnectors(): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  def listVoiceConnectors(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorsResponse, Unit]): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
    */
  def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  def listVoiceConnectors(
    params: ListVoiceConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorsResponse, Unit]
  ): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  
  /**
    * Lists the specified voice profile domains in the administrator's AWS account. 
    */
  def listVoiceProfileDomains(): Request[ListVoiceProfileDomainsResponse, AWSError] = js.native
  def listVoiceProfileDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceProfileDomainsResponse, Unit]): Request[ListVoiceProfileDomainsResponse, AWSError] = js.native
  /**
    * Lists the specified voice profile domains in the administrator's AWS account. 
    */
  def listVoiceProfileDomains(params: ListVoiceProfileDomainsRequest): Request[ListVoiceProfileDomainsResponse, AWSError] = js.native
  def listVoiceProfileDomains(
    params: ListVoiceProfileDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceProfileDomainsResponse, Unit]
  ): Request[ListVoiceProfileDomainsResponse, AWSError] = js.native
  
  /**
    * Lists the voice profiles in a voice profile domain.
    */
  def listVoiceProfiles(): Request[ListVoiceProfilesResponse, AWSError] = js.native
  def listVoiceProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceProfilesResponse, Unit]): Request[ListVoiceProfilesResponse, AWSError] = js.native
  /**
    * Lists the voice profiles in a voice profile domain.
    */
  def listVoiceProfiles(params: ListVoiceProfilesRequest): Request[ListVoiceProfilesResponse, AWSError] = js.native
  def listVoiceProfiles(
    params: ListVoiceProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceProfilesResponse, Unit]
  ): Request[ListVoiceProfilesResponse, AWSError] = js.native
  
  /**
    * Updates the Alexa Skill configuration for the SIP media application.
    */
  def putSipMediaApplicationAlexaSkillConfiguration(): Request[PutSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  def putSipMediaApplicationAlexaSkillConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutSipMediaApplicationAlexaSkillConfigurationResponse, 
      Unit
    ]
  ): Request[PutSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  /**
    * Updates the Alexa Skill configuration for the SIP media application.
    */
  def putSipMediaApplicationAlexaSkillConfiguration(params: PutSipMediaApplicationAlexaSkillConfigurationRequest): Request[PutSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  def putSipMediaApplicationAlexaSkillConfiguration(
    params: PutSipMediaApplicationAlexaSkillConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutSipMediaApplicationAlexaSkillConfigurationResponse, 
      Unit
    ]
  ): Request[PutSipMediaApplicationAlexaSkillConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates the logging configuration for the specified SIP media application.
    */
  def putSipMediaApplicationLoggingConfiguration(): Request[PutSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  def putSipMediaApplicationLoggingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutSipMediaApplicationLoggingConfigurationResponse, 
      Unit
    ]
  ): Request[PutSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Updates the logging configuration for the specified SIP media application.
    */
  def putSipMediaApplicationLoggingConfiguration(params: PutSipMediaApplicationLoggingConfigurationRequest): Request[PutSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  def putSipMediaApplicationLoggingConfiguration(
    params: PutSipMediaApplicationLoggingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutSipMediaApplicationLoggingConfigurationResponse, 
      Unit
    ]
  ): Request[PutSipMediaApplicationLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's emergency calling configuration.
    */
  def putVoiceConnectorEmergencyCallingConfiguration(): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorEmergencyCallingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutVoiceConnectorEmergencyCallingConfigurationResponse, 
      Unit
    ]
  ): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  /**
    * Updates a Voice Connector's emergency calling configuration.
    */
  def putVoiceConnectorEmergencyCallingConfiguration(params: PutVoiceConnectorEmergencyCallingConfigurationRequest): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorEmergencyCallingConfiguration(
    params: PutVoiceConnectorEmergencyCallingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ PutVoiceConnectorEmergencyCallingConfigurationResponse, 
      Unit
    ]
  ): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's logging configuration.
    */
  def putVoiceConnectorLoggingConfiguration(): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorLoggingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Updates a Voice Connector's logging configuration.
    */
  def putVoiceConnectorLoggingConfiguration(params: PutVoiceConnectorLoggingConfigurationRequest): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorLoggingConfiguration(
    params: PutVoiceConnectorLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's origination settings.
    */
  def putVoiceConnectorOrigination(): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  def putVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorOriginationResponse, Unit]): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * Updates a Voice Connector's origination settings.
    */
  def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  def putVoiceConnectorOrigination(
    params: PutVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorOriginationResponse, Unit]
  ): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  
  /**
    * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
    */
  def putVoiceConnectorProxy(): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  def putVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorProxyResponse, Unit]): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
    */
  def putVoiceConnectorProxy(params: PutVoiceConnectorProxyRequest): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  def putVoiceConnectorProxy(
    params: PutVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorProxyResponse, Unit]
  ): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's streaming configuration settings.
    */
  def putVoiceConnectorStreamingConfiguration(): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorStreamingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Updates a Voice Connector's streaming configuration settings.
    */
  def putVoiceConnectorStreamingConfiguration(params: PutVoiceConnectorStreamingConfigurationRequest): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorStreamingConfiguration(
    params: PutVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's termination settings.
    */
  def putVoiceConnectorTermination(): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  def putVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorTerminationResponse, Unit]): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Updates a Voice Connector's termination settings.
    */
  def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  def putVoiceConnectorTermination(
    params: PutVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorTerminationResponse, Unit]
  ): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  
  /**
    * Updates a Voice Connector's termination credentials.
    */
  def putVoiceConnectorTerminationCredentials(): Request[js.Object, AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a Voice Connector's termination credentials.
    */
  def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): Request[js.Object, AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(
    params: PutVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Restores a deleted phone number.
    */
  def restorePhoneNumber(): Request[RestorePhoneNumberResponse, AWSError] = js.native
  def restorePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ RestorePhoneNumberResponse, Unit]): Request[RestorePhoneNumberResponse, AWSError] = js.native
  /**
    * Restores a deleted phone number.
    */
  def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse, AWSError] = js.native
  def restorePhoneNumber(
    params: RestorePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestorePhoneNumberResponse, Unit]
  ): Request[RestorePhoneNumberResponse, AWSError] = js.native
  
  /**
    * Searches the provisioned phone numbers in an organization.
    */
  def searchAvailablePhoneNumbers(): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, Unit]): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  /**
    * Searches the provisioned phone numbers in an organization.
    */
  def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(
    params: SearchAvailablePhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, Unit]
  ): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  
  /**
    * Starts a speaker search task.  Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK. 
    */
  def startSpeakerSearchTask(): Request[StartSpeakerSearchTaskResponse, AWSError] = js.native
  def startSpeakerSearchTask(callback: js.Function2[/* err */ AWSError, /* data */ StartSpeakerSearchTaskResponse, Unit]): Request[StartSpeakerSearchTaskResponse, AWSError] = js.native
  /**
    * Starts a speaker search task.  Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK. 
    */
  def startSpeakerSearchTask(params: StartSpeakerSearchTaskRequest): Request[StartSpeakerSearchTaskResponse, AWSError] = js.native
  def startSpeakerSearchTask(
    params: StartSpeakerSearchTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSpeakerSearchTaskResponse, Unit]
  ): Request[StartSpeakerSearchTaskResponse, AWSError] = js.native
  
  /**
    * Starts a voice tone analysis task. For more information about voice tone analysis, see Using Amazon Chime SDK voice analytics in the Amazon Chime SDK Developer Guide.  Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK. 
    */
  def startVoiceToneAnalysisTask(): Request[StartVoiceToneAnalysisTaskResponse, AWSError] = js.native
  def startVoiceToneAnalysisTask(callback: js.Function2[/* err */ AWSError, /* data */ StartVoiceToneAnalysisTaskResponse, Unit]): Request[StartVoiceToneAnalysisTaskResponse, AWSError] = js.native
  /**
    * Starts a voice tone analysis task. For more information about voice tone analysis, see Using Amazon Chime SDK voice analytics in the Amazon Chime SDK Developer Guide.  Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the speaker as required under applicable privacy and biometrics laws, and as required under the AWS service terms for the Amazon Chime SDK. 
    */
  def startVoiceToneAnalysisTask(params: StartVoiceToneAnalysisTaskRequest): Request[StartVoiceToneAnalysisTaskResponse, AWSError] = js.native
  def startVoiceToneAnalysisTask(
    params: StartVoiceToneAnalysisTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartVoiceToneAnalysisTaskResponse, Unit]
  ): Request[StartVoiceToneAnalysisTaskResponse, AWSError] = js.native
  
  /**
    * Stops a speaker search task.
    */
  def stopSpeakerSearchTask(): Request[js.Object, AWSError] = js.native
  def stopSpeakerSearchTask(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a speaker search task.
    */
  def stopSpeakerSearchTask(params: StopSpeakerSearchTaskRequest): Request[js.Object, AWSError] = js.native
  def stopSpeakerSearchTask(
    params: StopSpeakerSearchTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a voice tone analysis task.
    */
  def stopVoiceToneAnalysisTask(): Request[js.Object, AWSError] = js.native
  def stopVoiceToneAnalysisTask(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a voice tone analysis task.
    */
  def stopVoiceToneAnalysisTask(params: StopVoiceToneAnalysisTaskRequest): Request[js.Object, AWSError] = js.native
  def stopVoiceToneAnalysisTask(
    params: StopVoiceToneAnalysisTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Adds a tag to the specified resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds a tag to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
    */
  def updateGlobalSettings(): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
    */
  def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(
    params: UpdateGlobalSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can update one phone number detail at a time. For example, you can update either the product type or the calling name in one action. For numbers outside the U.S., you must use the Amazon Chime SDK SIP Media Application Dial-In product type. Updates to outbound calling names can take 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def updatePhoneNumber(): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, Unit]): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can update one phone number detail at a time. For example, you can update either the product type or the calling name in one action. For numbers outside the U.S., you must use the Amazon Chime SDK SIP Media Application Dial-In product type. Updates to outbound calling names can take 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(
    params: UpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, Unit]
  ): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  
  /**
    * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name. You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72 hours to update.
    */
  def updatePhoneNumberSettings(): Request[js.Object, AWSError] = js.native
  def updatePhoneNumberSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name. You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72 hours to update.
    */
  def updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest): Request[js.Object, AWSError] = js.native
  def updatePhoneNumberSettings(
    params: UpdatePhoneNumberSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the specified proxy session details, such as voice or SMS capabilities.
    */
  def updateProxySession(): Request[UpdateProxySessionResponse, AWSError] = js.native
  def updateProxySession(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProxySessionResponse, Unit]): Request[UpdateProxySessionResponse, AWSError] = js.native
  /**
    * Updates the specified proxy session details, such as voice or SMS capabilities.
    */
  def updateProxySession(params: UpdateProxySessionRequest): Request[UpdateProxySessionResponse, AWSError] = js.native
  def updateProxySession(
    params: UpdateProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProxySessionResponse, Unit]
  ): Request[UpdateProxySessionResponse, AWSError] = js.native
  
  /**
    * Updates the details of the specified SIP media application.
    */
  def updateSipMediaApplication(): Request[UpdateSipMediaApplicationResponse, AWSError] = js.native
  def updateSipMediaApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipMediaApplicationResponse, Unit]): Request[UpdateSipMediaApplicationResponse, AWSError] = js.native
  /**
    * Updates the details of the specified SIP media application.
    */
  def updateSipMediaApplication(params: UpdateSipMediaApplicationRequest): Request[UpdateSipMediaApplicationResponse, AWSError] = js.native
  def updateSipMediaApplication(
    params: UpdateSipMediaApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipMediaApplicationResponse, Unit]
  ): Request[UpdateSipMediaApplicationResponse, AWSError] = js.native
  
  /**
    * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update request. The Lambda function can then return a new set of actions.
    */
  def updateSipMediaApplicationCall(): Request[UpdateSipMediaApplicationCallResponse, AWSError] = js.native
  def updateSipMediaApplicationCall(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipMediaApplicationCallResponse, Unit]): Request[UpdateSipMediaApplicationCallResponse, AWSError] = js.native
  /**
    * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update request. The Lambda function can then return a new set of actions.
    */
  def updateSipMediaApplicationCall(params: UpdateSipMediaApplicationCallRequest): Request[UpdateSipMediaApplicationCallResponse, AWSError] = js.native
  def updateSipMediaApplicationCall(
    params: UpdateSipMediaApplicationCallRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipMediaApplicationCallResponse, Unit]
  ): Request[UpdateSipMediaApplicationCallResponse, AWSError] = js.native
  
  /**
    * Updates the details of the specified SIP rule.
    */
  def updateSipRule(): Request[UpdateSipRuleResponse, AWSError] = js.native
  def updateSipRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipRuleResponse, Unit]): Request[UpdateSipRuleResponse, AWSError] = js.native
  /**
    * Updates the details of the specified SIP rule.
    */
  def updateSipRule(params: UpdateSipRuleRequest): Request[UpdateSipRuleResponse, AWSError] = js.native
  def updateSipRule(
    params: UpdateSipRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSipRuleResponse, Unit]
  ): Request[UpdateSipRuleResponse, AWSError] = js.native
  
  /**
    * Updates the details for the specified Amazon Chime SDK Voice Connector.
    */
  def updateVoiceConnector(): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  def updateVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorResponse, Unit]): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Updates the details for the specified Amazon Chime SDK Voice Connector.
    */
  def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  def updateVoiceConnector(
    params: UpdateVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorResponse, Unit]
  ): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  
  /**
    * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
    */
  def updateVoiceConnectorGroup(): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  def updateVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorGroupResponse, Unit]): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
    */
  def updateVoiceConnectorGroup(params: UpdateVoiceConnectorGroupRequest): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  def updateVoiceConnectorGroup(
    params: UpdateVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorGroupResponse, Unit]
  ): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  
  /**
    * Updates the specified voice profile’s voice print and refreshes its expiration timestamp.  As a condition of using this feature, you acknowledge that the collection, use, storage, and retention of your caller’s biometric identifiers and biometric information (“biometric data”) in the form of a digital voiceprint requires the caller’s informed consent via a written release. Such consent is required under various state laws, including biometrics laws in Illinois, Texas, Washington and other state privacy laws. You must provide a written release to each caller through a process that clearly reflects each caller’s informed consent before using Amazon Chime SDK Voice Insights service, as required under the terms of your agreement with AWS governing your use of the service. 
    */
  def updateVoiceProfile(): Request[UpdateVoiceProfileResponse, AWSError] = js.native
  def updateVoiceProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceProfileResponse, Unit]): Request[UpdateVoiceProfileResponse, AWSError] = js.native
  /**
    * Updates the specified voice profile’s voice print and refreshes its expiration timestamp.  As a condition of using this feature, you acknowledge that the collection, use, storage, and retention of your caller’s biometric identifiers and biometric information (“biometric data”) in the form of a digital voiceprint requires the caller’s informed consent via a written release. Such consent is required under various state laws, including biometrics laws in Illinois, Texas, Washington and other state privacy laws. You must provide a written release to each caller through a process that clearly reflects each caller’s informed consent before using Amazon Chime SDK Voice Insights service, as required under the terms of your agreement with AWS governing your use of the service. 
    */
  def updateVoiceProfile(params: UpdateVoiceProfileRequest): Request[UpdateVoiceProfileResponse, AWSError] = js.native
  def updateVoiceProfile(
    params: UpdateVoiceProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceProfileResponse, Unit]
  ): Request[UpdateVoiceProfileResponse, AWSError] = js.native
  
  /**
    * Updates the settings for the specified voice profile domain.
    */
  def updateVoiceProfileDomain(): Request[UpdateVoiceProfileDomainResponse, AWSError] = js.native
  def updateVoiceProfileDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceProfileDomainResponse, Unit]): Request[UpdateVoiceProfileDomainResponse, AWSError] = js.native
  /**
    * Updates the settings for the specified voice profile domain.
    */
  def updateVoiceProfileDomain(params: UpdateVoiceProfileDomainRequest): Request[UpdateVoiceProfileDomainResponse, AWSError] = js.native
  def updateVoiceProfileDomain(
    params: UpdateVoiceProfileDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceProfileDomainResponse, Unit]
  ): Request[UpdateVoiceProfileDomainResponse, AWSError] = js.native
  
  /**
    * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps ensure that addresses are routed to the appropriate Public Safety Answering Point.
    */
  def validateE911Address(): Request[ValidateE911AddressResponse, AWSError] = js.native
  def validateE911Address(callback: js.Function2[/* err */ AWSError, /* data */ ValidateE911AddressResponse, Unit]): Request[ValidateE911AddressResponse, AWSError] = js.native
  /**
    * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps ensure that addresses are routed to the appropriate Public Safety Answering Point.
    */
  def validateE911Address(params: ValidateE911AddressRequest): Request[ValidateE911AddressResponse, AWSError] = js.native
  def validateE911Address(
    params: ValidateE911AddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateE911AddressResponse, Unit]
  ): Request[ValidateE911AddressResponse, AWSError] = js.native
}
