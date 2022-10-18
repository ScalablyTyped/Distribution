package typings.awsSdk.clientsSsmincidentsMod

import typings.awsSdk.anon.GetReplicationSetInputwai
import typings.awsSdk.awsSdkStrings.waitForReplicationSetActive
import typings.awsSdk.awsSdkStrings.waitForReplicationSetDeleted
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSMIncidents extends Service {
  
  @JSName("config")
  var config_SSMIncidents: ConfigBase & ClientConfiguration = js.native
  
  /**
    * A replication set replicates and encrypts your data to the provided Regions with the provided KMS key. 
    */
  def createReplicationSet(): Request[CreateReplicationSetOutput, AWSError] = js.native
  def createReplicationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSetOutput, Unit]): Request[CreateReplicationSetOutput, AWSError] = js.native
  /**
    * A replication set replicates and encrypts your data to the provided Regions with the provided KMS key. 
    */
  def createReplicationSet(params: CreateReplicationSetInput): Request[CreateReplicationSetOutput, AWSError] = js.native
  def createReplicationSet(
    params: CreateReplicationSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationSetOutput, Unit]
  ): Request[CreateReplicationSetOutput, AWSError] = js.native
  
  /**
    * Creates a response plan that automates the initial response to incidents. A response plan engages contacts, starts chat channel collaboration, and initiates runbooks at the beginning of an incident.
    */
  def createResponsePlan(): Request[CreateResponsePlanOutput, AWSError] = js.native
  def createResponsePlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateResponsePlanOutput, Unit]): Request[CreateResponsePlanOutput, AWSError] = js.native
  /**
    * Creates a response plan that automates the initial response to incidents. A response plan engages contacts, starts chat channel collaboration, and initiates runbooks at the beginning of an incident.
    */
  def createResponsePlan(params: CreateResponsePlanInput): Request[CreateResponsePlanOutput, AWSError] = js.native
  def createResponsePlan(
    params: CreateResponsePlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResponsePlanOutput, Unit]
  ): Request[CreateResponsePlanOutput, AWSError] = js.native
  
  /**
    * Creates a custom timeline event on the incident details page of an incident record. Timeline events are automatically created by Incident Manager, marking key moment during an incident. You can create custom timeline events to mark important events that are automatically detected by Incident Manager.
    */
  def createTimelineEvent(): Request[CreateTimelineEventOutput, AWSError] = js.native
  def createTimelineEvent(callback: js.Function2[/* err */ AWSError, /* data */ CreateTimelineEventOutput, Unit]): Request[CreateTimelineEventOutput, AWSError] = js.native
  /**
    * Creates a custom timeline event on the incident details page of an incident record. Timeline events are automatically created by Incident Manager, marking key moment during an incident. You can create custom timeline events to mark important events that are automatically detected by Incident Manager.
    */
  def createTimelineEvent(params: CreateTimelineEventInput): Request[CreateTimelineEventOutput, AWSError] = js.native
  def createTimelineEvent(
    params: CreateTimelineEventInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTimelineEventOutput, Unit]
  ): Request[CreateTimelineEventOutput, AWSError] = js.native
  
  /**
    * Delete an incident record from Incident Manager. 
    */
  def deleteIncidentRecord(): Request[DeleteIncidentRecordOutput, AWSError] = js.native
  def deleteIncidentRecord(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIncidentRecordOutput, Unit]): Request[DeleteIncidentRecordOutput, AWSError] = js.native
  /**
    * Delete an incident record from Incident Manager. 
    */
  def deleteIncidentRecord(params: DeleteIncidentRecordInput): Request[DeleteIncidentRecordOutput, AWSError] = js.native
  def deleteIncidentRecord(
    params: DeleteIncidentRecordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIncidentRecordOutput, Unit]
  ): Request[DeleteIncidentRecordOutput, AWSError] = js.native
  
  /**
    * Deletes all Regions in your replication set. Deleting the replication set deletes all Incident Manager data.
    */
  def deleteReplicationSet(): Request[DeleteReplicationSetOutput, AWSError] = js.native
  def deleteReplicationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSetOutput, Unit]): Request[DeleteReplicationSetOutput, AWSError] = js.native
  /**
    * Deletes all Regions in your replication set. Deleting the replication set deletes all Incident Manager data.
    */
  def deleteReplicationSet(params: DeleteReplicationSetInput): Request[DeleteReplicationSetOutput, AWSError] = js.native
  def deleteReplicationSet(
    params: DeleteReplicationSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationSetOutput, Unit]
  ): Request[DeleteReplicationSetOutput, AWSError] = js.native
  
  /**
    * Deletes the resource policy that Resource Access Manager uses to share your Incident Manager resource.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyOutput, Unit]): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  /**
    * Deletes the resource policy that Resource Access Manager uses to share your Incident Manager resource.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyInput): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyOutput, Unit]
  ): Request[DeleteResourcePolicyOutput, AWSError] = js.native
  
  /**
    * Deletes the specified response plan. Deleting a response plan stops all linked CloudWatch alarms and EventBridge events from creating an incident with this response plan.
    */
  def deleteResponsePlan(): Request[DeleteResponsePlanOutput, AWSError] = js.native
  def deleteResponsePlan(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResponsePlanOutput, Unit]): Request[DeleteResponsePlanOutput, AWSError] = js.native
  /**
    * Deletes the specified response plan. Deleting a response plan stops all linked CloudWatch alarms and EventBridge events from creating an incident with this response plan.
    */
  def deleteResponsePlan(params: DeleteResponsePlanInput): Request[DeleteResponsePlanOutput, AWSError] = js.native
  def deleteResponsePlan(
    params: DeleteResponsePlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResponsePlanOutput, Unit]
  ): Request[DeleteResponsePlanOutput, AWSError] = js.native
  
  /**
    * Deletes a timeline event from an incident.
    */
  def deleteTimelineEvent(): Request[DeleteTimelineEventOutput, AWSError] = js.native
  def deleteTimelineEvent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTimelineEventOutput, Unit]): Request[DeleteTimelineEventOutput, AWSError] = js.native
  /**
    * Deletes a timeline event from an incident.
    */
  def deleteTimelineEvent(params: DeleteTimelineEventInput): Request[DeleteTimelineEventOutput, AWSError] = js.native
  def deleteTimelineEvent(
    params: DeleteTimelineEventInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTimelineEventOutput, Unit]
  ): Request[DeleteTimelineEventOutput, AWSError] = js.native
  
  /**
    * Returns the details for the specified incident record.
    */
  def getIncidentRecord(): Request[GetIncidentRecordOutput, AWSError] = js.native
  def getIncidentRecord(callback: js.Function2[/* err */ AWSError, /* data */ GetIncidentRecordOutput, Unit]): Request[GetIncidentRecordOutput, AWSError] = js.native
  /**
    * Returns the details for the specified incident record.
    */
  def getIncidentRecord(params: GetIncidentRecordInput): Request[GetIncidentRecordOutput, AWSError] = js.native
  def getIncidentRecord(
    params: GetIncidentRecordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIncidentRecordOutput, Unit]
  ): Request[GetIncidentRecordOutput, AWSError] = js.native
  
  /**
    * Retrieve your Incident Manager replication set.
    */
  def getReplicationSet(): Request[GetReplicationSetOutput, AWSError] = js.native
  def getReplicationSet(callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]): Request[GetReplicationSetOutput, AWSError] = js.native
  /**
    * Retrieve your Incident Manager replication set.
    */
  def getReplicationSet(params: GetReplicationSetInput): Request[GetReplicationSetOutput, AWSError] = js.native
  def getReplicationSet(
    params: GetReplicationSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]
  ): Request[GetReplicationSetOutput, AWSError] = js.native
  
  /**
    * Retrieves the resource policies attached to the specified response plan.
    */
  def getResourcePolicies(): Request[GetResourcePoliciesOutput, AWSError] = js.native
  def getResourcePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesOutput, Unit]): Request[GetResourcePoliciesOutput, AWSError] = js.native
  /**
    * Retrieves the resource policies attached to the specified response plan.
    */
  def getResourcePolicies(params: GetResourcePoliciesInput): Request[GetResourcePoliciesOutput, AWSError] = js.native
  def getResourcePolicies(
    params: GetResourcePoliciesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcePoliciesOutput, Unit]
  ): Request[GetResourcePoliciesOutput, AWSError] = js.native
  
  /**
    * Retrieves the details of the specified response plan.
    */
  def getResponsePlan(): Request[GetResponsePlanOutput, AWSError] = js.native
  def getResponsePlan(callback: js.Function2[/* err */ AWSError, /* data */ GetResponsePlanOutput, Unit]): Request[GetResponsePlanOutput, AWSError] = js.native
  /**
    * Retrieves the details of the specified response plan.
    */
  def getResponsePlan(params: GetResponsePlanInput): Request[GetResponsePlanOutput, AWSError] = js.native
  def getResponsePlan(
    params: GetResponsePlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResponsePlanOutput, Unit]
  ): Request[GetResponsePlanOutput, AWSError] = js.native
  
  /**
    * Retrieves a timeline event based on its ID and incident record.
    */
  def getTimelineEvent(): Request[GetTimelineEventOutput, AWSError] = js.native
  def getTimelineEvent(callback: js.Function2[/* err */ AWSError, /* data */ GetTimelineEventOutput, Unit]): Request[GetTimelineEventOutput, AWSError] = js.native
  /**
    * Retrieves a timeline event based on its ID and incident record.
    */
  def getTimelineEvent(params: GetTimelineEventInput): Request[GetTimelineEventOutput, AWSError] = js.native
  def getTimelineEvent(
    params: GetTimelineEventInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTimelineEventOutput, Unit]
  ): Request[GetTimelineEventOutput, AWSError] = js.native
  
  /**
    * Lists all incident records in your account. Use this command to retrieve the Amazon Resource Name (ARN) of the incident record you want to update. 
    */
  def listIncidentRecords(): Request[ListIncidentRecordsOutput, AWSError] = js.native
  def listIncidentRecords(callback: js.Function2[/* err */ AWSError, /* data */ ListIncidentRecordsOutput, Unit]): Request[ListIncidentRecordsOutput, AWSError] = js.native
  /**
    * Lists all incident records in your account. Use this command to retrieve the Amazon Resource Name (ARN) of the incident record you want to update. 
    */
  def listIncidentRecords(params: ListIncidentRecordsInput): Request[ListIncidentRecordsOutput, AWSError] = js.native
  def listIncidentRecords(
    params: ListIncidentRecordsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIncidentRecordsOutput, Unit]
  ): Request[ListIncidentRecordsOutput, AWSError] = js.native
  
  /**
    * List all related items for an incident record.
    */
  def listRelatedItems(): Request[ListRelatedItemsOutput, AWSError] = js.native
  def listRelatedItems(callback: js.Function2[/* err */ AWSError, /* data */ ListRelatedItemsOutput, Unit]): Request[ListRelatedItemsOutput, AWSError] = js.native
  /**
    * List all related items for an incident record.
    */
  def listRelatedItems(params: ListRelatedItemsInput): Request[ListRelatedItemsOutput, AWSError] = js.native
  def listRelatedItems(
    params: ListRelatedItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRelatedItemsOutput, Unit]
  ): Request[ListRelatedItemsOutput, AWSError] = js.native
  
  /**
    * Lists details about the replication set configured in your account. 
    */
  def listReplicationSets(): Request[ListReplicationSetsOutput, AWSError] = js.native
  def listReplicationSets(callback: js.Function2[/* err */ AWSError, /* data */ ListReplicationSetsOutput, Unit]): Request[ListReplicationSetsOutput, AWSError] = js.native
  /**
    * Lists details about the replication set configured in your account. 
    */
  def listReplicationSets(params: ListReplicationSetsInput): Request[ListReplicationSetsOutput, AWSError] = js.native
  def listReplicationSets(
    params: ListReplicationSetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReplicationSetsOutput, Unit]
  ): Request[ListReplicationSetsOutput, AWSError] = js.native
  
  /**
    * Lists all response plans in your account.
    */
  def listResponsePlans(): Request[ListResponsePlansOutput, AWSError] = js.native
  def listResponsePlans(callback: js.Function2[/* err */ AWSError, /* data */ ListResponsePlansOutput, Unit]): Request[ListResponsePlansOutput, AWSError] = js.native
  /**
    * Lists all response plans in your account.
    */
  def listResponsePlans(params: ListResponsePlansInput): Request[ListResponsePlansOutput, AWSError] = js.native
  def listResponsePlans(
    params: ListResponsePlansInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResponsePlansOutput, Unit]
  ): Request[ListResponsePlansOutput, AWSError] = js.native
  
  /**
    * Lists the tags that are attached to the specified response plan.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags that are attached to the specified response plan.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists timeline events for the specified incident record.
    */
  def listTimelineEvents(): Request[ListTimelineEventsOutput, AWSError] = js.native
  def listTimelineEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListTimelineEventsOutput, Unit]): Request[ListTimelineEventsOutput, AWSError] = js.native
  /**
    * Lists timeline events for the specified incident record.
    */
  def listTimelineEvents(params: ListTimelineEventsInput): Request[ListTimelineEventsOutput, AWSError] = js.native
  def listTimelineEvents(
    params: ListTimelineEventsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTimelineEventsOutput, Unit]
  ): Request[ListTimelineEventsOutput, AWSError] = js.native
  
  /**
    * Adds a resource policy to the specified response plan. The resource policy is used to share the response plan using Resource Access Manager (RAM). For more information about cross-account sharing, see Setting up cross-account functionality.
    */
  def putResourcePolicy(): Request[PutResourcePolicyOutput, AWSError] = js.native
  def putResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyOutput, Unit]): Request[PutResourcePolicyOutput, AWSError] = js.native
  /**
    * Adds a resource policy to the specified response plan. The resource policy is used to share the response plan using Resource Access Manager (RAM). For more information about cross-account sharing, see Setting up cross-account functionality.
    */
  def putResourcePolicy(params: PutResourcePolicyInput): Request[PutResourcePolicyOutput, AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutResourcePolicyOutput, Unit]
  ): Request[PutResourcePolicyOutput, AWSError] = js.native
  
  /**
    * Used to start an incident from CloudWatch alarms, EventBridge events, or manually. 
    */
  def startIncident(): Request[StartIncidentOutput, AWSError] = js.native
  def startIncident(callback: js.Function2[/* err */ AWSError, /* data */ StartIncidentOutput, Unit]): Request[StartIncidentOutput, AWSError] = js.native
  /**
    * Used to start an incident from CloudWatch alarms, EventBridge events, or manually. 
    */
  def startIncident(params: StartIncidentInput): Request[StartIncidentOutput, AWSError] = js.native
  def startIncident(
    params: StartIncidentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartIncidentOutput, Unit]
  ): Request[StartIncidentOutput, AWSError] = js.native
  
  /**
    * Adds a tag to a response plan.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a tag to a response plan.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update deletion protection to either allow or deny deletion of the final Region in a replication set.
    */
  def updateDeletionProtection(): Request[UpdateDeletionProtectionOutput, AWSError] = js.native
  def updateDeletionProtection(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeletionProtectionOutput, Unit]): Request[UpdateDeletionProtectionOutput, AWSError] = js.native
  /**
    * Update deletion protection to either allow or deny deletion of the final Region in a replication set.
    */
  def updateDeletionProtection(params: UpdateDeletionProtectionInput): Request[UpdateDeletionProtectionOutput, AWSError] = js.native
  def updateDeletionProtection(
    params: UpdateDeletionProtectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeletionProtectionOutput, Unit]
  ): Request[UpdateDeletionProtectionOutput, AWSError] = js.native
  
  /**
    * Update the details of an incident record. You can use this operation to update an incident record from the defined chat channel. For more information about using actions in chat channels, see Interacting through chat.
    */
  def updateIncidentRecord(): Request[UpdateIncidentRecordOutput, AWSError] = js.native
  def updateIncidentRecord(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIncidentRecordOutput, Unit]): Request[UpdateIncidentRecordOutput, AWSError] = js.native
  /**
    * Update the details of an incident record. You can use this operation to update an incident record from the defined chat channel. For more information about using actions in chat channels, see Interacting through chat.
    */
  def updateIncidentRecord(params: UpdateIncidentRecordInput): Request[UpdateIncidentRecordOutput, AWSError] = js.native
  def updateIncidentRecord(
    params: UpdateIncidentRecordInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIncidentRecordOutput, Unit]
  ): Request[UpdateIncidentRecordOutput, AWSError] = js.native
  
  /**
    * Add or remove related items from the related items tab of an incident record.
    */
  def updateRelatedItems(): Request[UpdateRelatedItemsOutput, AWSError] = js.native
  def updateRelatedItems(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelatedItemsOutput, Unit]): Request[UpdateRelatedItemsOutput, AWSError] = js.native
  /**
    * Add or remove related items from the related items tab of an incident record.
    */
  def updateRelatedItems(params: UpdateRelatedItemsInput): Request[UpdateRelatedItemsOutput, AWSError] = js.native
  def updateRelatedItems(
    params: UpdateRelatedItemsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRelatedItemsOutput, Unit]
  ): Request[UpdateRelatedItemsOutput, AWSError] = js.native
  
  /**
    * Add or delete Regions from your replication set.
    */
  def updateReplicationSet(): Request[UpdateReplicationSetOutput, AWSError] = js.native
  def updateReplicationSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationSetOutput, Unit]): Request[UpdateReplicationSetOutput, AWSError] = js.native
  /**
    * Add or delete Regions from your replication set.
    */
  def updateReplicationSet(params: UpdateReplicationSetInput): Request[UpdateReplicationSetOutput, AWSError] = js.native
  def updateReplicationSet(
    params: UpdateReplicationSetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationSetOutput, Unit]
  ): Request[UpdateReplicationSetOutput, AWSError] = js.native
  
  /**
    * Updates the specified response plan.
    */
  def updateResponsePlan(): Request[UpdateResponsePlanOutput, AWSError] = js.native
  def updateResponsePlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResponsePlanOutput, Unit]): Request[UpdateResponsePlanOutput, AWSError] = js.native
  /**
    * Updates the specified response plan.
    */
  def updateResponsePlan(params: UpdateResponsePlanInput): Request[UpdateResponsePlanOutput, AWSError] = js.native
  def updateResponsePlan(
    params: UpdateResponsePlanInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResponsePlanOutput, Unit]
  ): Request[UpdateResponsePlanOutput, AWSError] = js.native
  
  /**
    * Updates a timeline event. You can update events of type Custom Event.
    */
  def updateTimelineEvent(): Request[UpdateTimelineEventOutput, AWSError] = js.native
  def updateTimelineEvent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTimelineEventOutput, Unit]): Request[UpdateTimelineEventOutput, AWSError] = js.native
  /**
    * Updates a timeline event. You can update events of type Custom Event.
    */
  def updateTimelineEvent(params: UpdateTimelineEventInput): Request[UpdateTimelineEventOutput, AWSError] = js.native
  def updateTimelineEvent(
    params: UpdateTimelineEventInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTimelineEventOutput, Unit]
  ): Request[UpdateTimelineEventOutput, AWSError] = js.native
  
  /**
    * Waits for the waitForReplicationSetActive state by periodically calling the underlying SSMIncidents.getReplicationSetoperation every 30 seconds (at most 5 times). Wait for a replication set to become ACTIVE
    */
  @JSName("waitFor")
  def waitFor_waitForReplicationSetActive(state: waitForReplicationSetActive): Request[GetReplicationSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_waitForReplicationSetActive(
    state: waitForReplicationSetActive,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]
  ): Request[GetReplicationSetOutput, AWSError] = js.native
  /**
    * Waits for the waitForReplicationSetActive state by periodically calling the underlying SSMIncidents.getReplicationSetoperation every 30 seconds (at most 5 times). Wait for a replication set to become ACTIVE
    */
  @JSName("waitFor")
  def waitFor_waitForReplicationSetActive(state: waitForReplicationSetActive, params: GetReplicationSetInputwai): Request[GetReplicationSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_waitForReplicationSetActive(
    state: waitForReplicationSetActive,
    params: GetReplicationSetInputwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]
  ): Request[GetReplicationSetOutput, AWSError] = js.native
  /**
    * Waits for the waitForReplicationSetDeleted state by periodically calling the underlying SSMIncidents.getReplicationSetoperation every 30 seconds (at most 5 times). Wait for a replication set to be deleted
    */
  @JSName("waitFor")
  def waitFor_waitForReplicationSetDeleted(state: waitForReplicationSetDeleted): Request[GetReplicationSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_waitForReplicationSetDeleted(
    state: waitForReplicationSetDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]
  ): Request[GetReplicationSetOutput, AWSError] = js.native
  /**
    * Waits for the waitForReplicationSetDeleted state by periodically calling the underlying SSMIncidents.getReplicationSetoperation every 30 seconds (at most 5 times). Wait for a replication set to be deleted
    */
  @JSName("waitFor")
  def waitFor_waitForReplicationSetDeleted(state: waitForReplicationSetDeleted, params: GetReplicationSetInputwai): Request[GetReplicationSetOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_waitForReplicationSetDeleted(
    state: waitForReplicationSetDeleted,
    params: GetReplicationSetInputwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationSetOutput, Unit]
  ): Request[GetReplicationSetOutput, AWSError] = js.native
}
