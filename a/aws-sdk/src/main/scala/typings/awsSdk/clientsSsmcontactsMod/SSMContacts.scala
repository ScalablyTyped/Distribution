package typings.awsSdk.clientsSsmcontactsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSMContacts extends Service {
  
  /**
    * Used to acknowledge an engagement to a contact channel during an incident.
    */
  def acceptPage(): Request[AcceptPageResult, AWSError] = js.native
  def acceptPage(callback: js.Function2[/* err */ AWSError, /* data */ AcceptPageResult, Unit]): Request[AcceptPageResult, AWSError] = js.native
  /**
    * Used to acknowledge an engagement to a contact channel during an incident.
    */
  def acceptPage(params: AcceptPageRequest): Request[AcceptPageResult, AWSError] = js.native
  def acceptPage(
    params: AcceptPageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptPageResult, Unit]
  ): Request[AcceptPageResult, AWSError] = js.native
  
  /**
    * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been activated.
    */
  def activateContactChannel(): Request[ActivateContactChannelResult, AWSError] = js.native
  def activateContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ ActivateContactChannelResult, Unit]): Request[ActivateContactChannelResult, AWSError] = js.native
  /**
    * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been activated.
    */
  def activateContactChannel(params: ActivateContactChannelRequest): Request[ActivateContactChannelResult, AWSError] = js.native
  def activateContactChannel(
    params: ActivateContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateContactChannelResult, Unit]
  ): Request[ActivateContactChannelResult, AWSError] = js.native
  
  @JSName("config")
  var config_SSMContacts: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that Incident Manager uses to engage contacts in phases during an incident. 
    */
  def createContact(): Request[CreateContactResult, AWSError] = js.native
  def createContact(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactResult, Unit]): Request[CreateContactResult, AWSError] = js.native
  /**
    * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that Incident Manager uses to engage contacts in phases during an incident. 
    */
  def createContact(params: CreateContactRequest): Request[CreateContactResult, AWSError] = js.native
  def createContact(
    params: CreateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactResult, Unit]
  ): Request[CreateContactResult, AWSError] = js.native
  
  /**
    * A contact channel is the method that Incident Manager uses to engage your contact.
    */
  def createContactChannel(): Request[CreateContactChannelResult, AWSError] = js.native
  def createContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactChannelResult, Unit]): Request[CreateContactChannelResult, AWSError] = js.native
  /**
    * A contact channel is the method that Incident Manager uses to engage your contact.
    */
  def createContactChannel(params: CreateContactChannelRequest): Request[CreateContactChannelResult, AWSError] = js.native
  def createContactChannel(
    params: CreateContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactChannelResult, Unit]
  ): Request[CreateContactChannelResult, AWSError] = js.native
  
  /**
    * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
    */
  def deactivateContactChannel(): Request[DeactivateContactChannelResult, AWSError] = js.native
  def deactivateContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeactivateContactChannelResult, Unit]): Request[DeactivateContactChannelResult, AWSError] = js.native
  /**
    * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
    */
  def deactivateContactChannel(params: DeactivateContactChannelRequest): Request[DeactivateContactChannelResult, AWSError] = js.native
  def deactivateContactChannel(
    params: DeactivateContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateContactChannelResult, Unit]
  ): Request[DeactivateContactChannelResult, AWSError] = js.native
  
  /**
    * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all escalation plans and related response plans. Deleting an escalation plan removes it from all related response plans. You will have to recreate the contact and its contact channels before you can use it again.
    */
  def deleteContact(): Request[DeleteContactResult, AWSError] = js.native
  def deleteContact(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactResult, Unit]): Request[DeleteContactResult, AWSError] = js.native
  /**
    * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all escalation plans and related response plans. Deleting an escalation plan removes it from all related response plans. You will have to recreate the contact and its contact channels before you can use it again.
    */
  def deleteContact(params: DeleteContactRequest): Request[DeleteContactResult, AWSError] = js.native
  def deleteContact(
    params: DeleteContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactResult, Unit]
  ): Request[DeleteContactResult, AWSError] = js.native
  
  /**
    * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a contact, you won't be able to engage that contact during an incident.
    */
  def deleteContactChannel(): Request[DeleteContactChannelResult, AWSError] = js.native
  def deleteContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactChannelResult, Unit]): Request[DeleteContactChannelResult, AWSError] = js.native
  /**
    * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a contact, you won't be able to engage that contact during an incident.
    */
  def deleteContactChannel(params: DeleteContactChannelRequest): Request[DeleteContactChannelResult, AWSError] = js.native
  def deleteContactChannel(
    params: DeleteContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactChannelResult, Unit]
  ): Request[DeleteContactChannelResult, AWSError] = js.native
  
  /**
    * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to describe the engagement that occurred during an incident.
    */
  def describeEngagement(): Request[DescribeEngagementResult, AWSError] = js.native
  def describeEngagement(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngagementResult, Unit]): Request[DescribeEngagementResult, AWSError] = js.native
  /**
    * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to describe the engagement that occurred during an incident.
    */
  def describeEngagement(params: DescribeEngagementRequest): Request[DescribeEngagementResult, AWSError] = js.native
  def describeEngagement(
    params: DescribeEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngagementResult, Unit]
  ): Request[DescribeEngagementResult, AWSError] = js.native
  
  /**
    * Lists details of the engagement to a contact channel.
    */
  def describePage(): Request[DescribePageResult, AWSError] = js.native
  def describePage(callback: js.Function2[/* err */ AWSError, /* data */ DescribePageResult, Unit]): Request[DescribePageResult, AWSError] = js.native
  /**
    * Lists details of the engagement to a contact channel.
    */
  def describePage(params: DescribePageRequest): Request[DescribePageResult, AWSError] = js.native
  def describePage(
    params: DescribePageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePageResult, Unit]
  ): Request[DescribePageResult, AWSError] = js.native
  
  /**
    * Retrieves information about the specified contact or escalation plan.
    */
  def getContact(): Request[GetContactResult, AWSError] = js.native
  def getContact(callback: js.Function2[/* err */ AWSError, /* data */ GetContactResult, Unit]): Request[GetContactResult, AWSError] = js.native
  /**
    * Retrieves information about the specified contact or escalation plan.
    */
  def getContact(params: GetContactRequest): Request[GetContactResult, AWSError] = js.native
  def getContact(
    params: GetContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactResult, Unit]
  ): Request[GetContactResult, AWSError] = js.native
  
  /**
    * List details about a specific contact channel.
    */
  def getContactChannel(): Request[GetContactChannelResult, AWSError] = js.native
  def getContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetContactChannelResult, Unit]): Request[GetContactChannelResult, AWSError] = js.native
  /**
    * List details about a specific contact channel.
    */
  def getContactChannel(params: GetContactChannelRequest): Request[GetContactChannelResult, AWSError] = js.native
  def getContactChannel(
    params: GetContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactChannelResult, Unit]
  ): Request[GetContactChannelResult, AWSError] = js.native
  
  /**
    * Retrieves the resource policies attached to the specified contact or escalation plan.
    */
  def getContactPolicy(): Request[GetContactPolicyResult, AWSError] = js.native
  def getContactPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetContactPolicyResult, Unit]): Request[GetContactPolicyResult, AWSError] = js.native
  /**
    * Retrieves the resource policies attached to the specified contact or escalation plan.
    */
  def getContactPolicy(params: GetContactPolicyRequest): Request[GetContactPolicyResult, AWSError] = js.native
  def getContactPolicy(
    params: GetContactPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactPolicyResult, Unit]
  ): Request[GetContactPolicyResult, AWSError] = js.native
  
  /**
    * Lists all contact channels for the specified contact.
    */
  def listContactChannels(): Request[ListContactChannelsResult, AWSError] = js.native
  def listContactChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListContactChannelsResult, Unit]): Request[ListContactChannelsResult, AWSError] = js.native
  /**
    * Lists all contact channels for the specified contact.
    */
  def listContactChannels(params: ListContactChannelsRequest): Request[ListContactChannelsResult, AWSError] = js.native
  def listContactChannels(
    params: ListContactChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactChannelsResult, Unit]
  ): Request[ListContactChannelsResult, AWSError] = js.native
  
  /**
    * Lists all contacts and escalation plans in Incident Manager.
    */
  def listContacts(): Request[ListContactsResult, AWSError] = js.native
  def listContacts(callback: js.Function2[/* err */ AWSError, /* data */ ListContactsResult, Unit]): Request[ListContactsResult, AWSError] = js.native
  /**
    * Lists all contacts and escalation plans in Incident Manager.
    */
  def listContacts(params: ListContactsRequest): Request[ListContactsResult, AWSError] = js.native
  def listContacts(
    params: ListContactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContactsResult, Unit]
  ): Request[ListContactsResult, AWSError] = js.native
  
  /**
    * Lists all engagements that have happened in an incident.
    */
  def listEngagements(): Request[ListEngagementsResult, AWSError] = js.native
  def listEngagements(callback: js.Function2[/* err */ AWSError, /* data */ ListEngagementsResult, Unit]): Request[ListEngagementsResult, AWSError] = js.native
  /**
    * Lists all engagements that have happened in an incident.
    */
  def listEngagements(params: ListEngagementsRequest): Request[ListEngagementsResult, AWSError] = js.native
  def listEngagements(
    params: ListEngagementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEngagementsResult, Unit]
  ): Request[ListEngagementsResult, AWSError] = js.native
  
  /**
    * Lists all of the engagements to contact channels that have been acknowledged. 
    */
  def listPageReceipts(): Request[ListPageReceiptsResult, AWSError] = js.native
  def listPageReceipts(callback: js.Function2[/* err */ AWSError, /* data */ ListPageReceiptsResult, Unit]): Request[ListPageReceiptsResult, AWSError] = js.native
  /**
    * Lists all of the engagements to contact channels that have been acknowledged. 
    */
  def listPageReceipts(params: ListPageReceiptsRequest): Request[ListPageReceiptsResult, AWSError] = js.native
  def listPageReceipts(
    params: ListPageReceiptsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPageReceiptsResult, Unit]
  ): Request[ListPageReceiptsResult, AWSError] = js.native
  
  /**
    * Lists the engagements to a contact's contact channels.
    */
  def listPagesByContact(): Request[ListPagesByContactResult, AWSError] = js.native
  def listPagesByContact(callback: js.Function2[/* err */ AWSError, /* data */ ListPagesByContactResult, Unit]): Request[ListPagesByContactResult, AWSError] = js.native
  /**
    * Lists the engagements to a contact's contact channels.
    */
  def listPagesByContact(params: ListPagesByContactRequest): Request[ListPagesByContactResult, AWSError] = js.native
  def listPagesByContact(
    params: ListPagesByContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPagesByContactResult, Unit]
  ): Request[ListPagesByContactResult, AWSError] = js.native
  
  /**
    * Lists the engagements to contact channels that occurred by engaging a contact.
    */
  def listPagesByEngagement(): Request[ListPagesByEngagementResult, AWSError] = js.native
  def listPagesByEngagement(callback: js.Function2[/* err */ AWSError, /* data */ ListPagesByEngagementResult, Unit]): Request[ListPagesByEngagementResult, AWSError] = js.native
  /**
    * Lists the engagements to contact channels that occurred by engaging a contact.
    */
  def listPagesByEngagement(params: ListPagesByEngagementRequest): Request[ListPagesByEngagementResult, AWSError] = js.native
  def listPagesByEngagement(
    params: ListPagesByEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPagesByEngagementResult, Unit]
  ): Request[ListPagesByEngagementResult, AWSError] = js.native
  
  /**
    * Lists the tags of an escalation plan or contact.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Lists the tags of an escalation plan or contact.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    * Adds a resource policy to the specified contact or escalation plan. The resource policy is used to share the contact or escalation plan using Resource Access Manager (RAM). For more information about cross-account sharing, see Setting up cross-account functionality.
    */
  def putContactPolicy(): Request[PutContactPolicyResult, AWSError] = js.native
  def putContactPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutContactPolicyResult, Unit]): Request[PutContactPolicyResult, AWSError] = js.native
  /**
    * Adds a resource policy to the specified contact or escalation plan. The resource policy is used to share the contact or escalation plan using Resource Access Manager (RAM). For more information about cross-account sharing, see Setting up cross-account functionality.
    */
  def putContactPolicy(params: PutContactPolicyRequest): Request[PutContactPolicyResult, AWSError] = js.native
  def putContactPolicy(
    params: PutContactPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutContactPolicyResult, Unit]
  ): Request[PutContactPolicyResult, AWSError] = js.native
  
  /**
    * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in the console or with the ActivateChannel operation. Incident Manager can't engage a contact channel until it has been activated.
    */
  def sendActivationCode(): Request[SendActivationCodeResult, AWSError] = js.native
  def sendActivationCode(callback: js.Function2[/* err */ AWSError, /* data */ SendActivationCodeResult, Unit]): Request[SendActivationCodeResult, AWSError] = js.native
  /**
    * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in the console or with the ActivateChannel operation. Incident Manager can't engage a contact channel until it has been activated.
    */
  def sendActivationCode(params: SendActivationCodeRequest): Request[SendActivationCodeResult, AWSError] = js.native
  def sendActivationCode(
    params: SendActivationCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendActivationCodeResult, Unit]
  ): Request[SendActivationCodeResult, AWSError] = js.native
  
  /**
    * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the incident.
    */
  def startEngagement(): Request[StartEngagementResult, AWSError] = js.native
  def startEngagement(callback: js.Function2[/* err */ AWSError, /* data */ StartEngagementResult, Unit]): Request[StartEngagementResult, AWSError] = js.native
  /**
    * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the incident.
    */
  def startEngagement(params: StartEngagementRequest): Request[StartEngagementResult, AWSError] = js.native
  def startEngagement(
    params: StartEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEngagementResult, Unit]
  ): Request[StartEngagementResult, AWSError] = js.native
  
  /**
    * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further contacts aren't engaged.
    */
  def stopEngagement(): Request[StopEngagementResult, AWSError] = js.native
  def stopEngagement(callback: js.Function2[/* err */ AWSError, /* data */ StopEngagementResult, Unit]): Request[StopEngagementResult, AWSError] = js.native
  /**
    * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further contacts aren't engaged.
    */
  def stopEngagement(params: StopEngagementRequest): Request[StopEngagementResult, AWSError] = js.native
  def stopEngagement(
    params: StopEngagementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopEngagementResult, Unit]
  ): Request[StopEngagementResult, AWSError] = js.native
  
  /**
    * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your replication set. 
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your replication set. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes tags from the specified resource. 
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes tags from the specified resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    * Updates the contact or escalation plan specified. 
    */
  def updateContact(): Request[UpdateContactResult, AWSError] = js.native
  def updateContact(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResult, Unit]): Request[UpdateContactResult, AWSError] = js.native
  /**
    * Updates the contact or escalation plan specified. 
    */
  def updateContact(params: UpdateContactRequest): Request[UpdateContactResult, AWSError] = js.native
  def updateContact(
    params: UpdateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResult, Unit]
  ): Request[UpdateContactResult, AWSError] = js.native
  
  /**
    * Updates a contact's contact channel.
    */
  def updateContactChannel(): Request[UpdateContactChannelResult, AWSError] = js.native
  def updateContactChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactChannelResult, Unit]): Request[UpdateContactChannelResult, AWSError] = js.native
  /**
    * Updates a contact's contact channel.
    */
  def updateContactChannel(params: UpdateContactChannelRequest): Request[UpdateContactChannelResult, AWSError] = js.native
  def updateContactChannel(
    params: UpdateContactChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactChannelResult, Unit]
  ): Request[UpdateContactChannelResult, AWSError] = js.native
}
