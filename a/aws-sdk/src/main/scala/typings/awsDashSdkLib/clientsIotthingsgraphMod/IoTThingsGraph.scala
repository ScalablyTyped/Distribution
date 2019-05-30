package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTThingsGraph
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTThingsGraph: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a device with a concrete thing that is in the user's registry. A thing can be associated with only one device at a time. If you associate a thing with a new device id, its previous association will be removed.
    */
  def associateEntityToThing(): awsDashSdkLib.libRequestMod.Request[AssociateEntityToThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateEntityToThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateEntityToThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateEntityToThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a device with a concrete thing that is in the user's registry. A thing can be associated with only one device at a time. If you associate a thing with a new device id, its previous association will be removed.
    */
  def associateEntityToThing(params: AssociateEntityToThingRequest): awsDashSdkLib.libRequestMod.Request[AssociateEntityToThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateEntityToThing(
    params: AssociateEntityToThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateEntityToThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateEntityToThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createFlowTemplate(): awsDashSdkLib.libRequestMod.Request[CreateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFlowTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createFlowTemplate(params: CreateFlowTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFlowTemplate(
    params: CreateFlowTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a system instance.  This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments, it updates the Greengrass group that is specified by the greengrassGroupName parameter. It also adds a file to the S3 bucket specified by the s3BucketName parameter. You need to call DeploySystemInstance after running this action. For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group and S3 bucket. Otherwise, the call will fail with an authorization error. For cloud deployments, this action requires a flowActionsRoleArn value. This is an IAM role that has permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes. If the definition document doesn't specify a version of the user's namespace, the latest version will be used by default.
    */
  def createSystemInstance(): awsDashSdkLib.libRequestMod.Request[CreateSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSystemInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a system instance.  This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments, it updates the Greengrass group that is specified by the greengrassGroupName parameter. It also adds a file to the S3 bucket specified by the s3BucketName parameter. You need to call DeploySystemInstance after running this action. For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group and S3 bucket. Otherwise, the call will fail with an authorization error. For cloud deployments, this action requires a flowActionsRoleArn value. This is an IAM role that has permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes. If the definition document doesn't specify a version of the user's namespace, the latest version will be used by default.
    */
  def createSystemInstance(params: CreateSystemInstanceRequest): awsDashSdkLib.libRequestMod.Request[CreateSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSystemInstance(
    params: CreateSystemInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a system. The system is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createSystemTemplate(): awsDashSdkLib.libRequestMod.Request[CreateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSystemTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a system. The system is validated against the entities in the latest version of the user's namespace unless another namespace version is specified in the request.
    */
  def createSystemTemplate(params: CreateSystemTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSystemTemplate(
    params: CreateSystemTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy. Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow taken at the time of deployment).
    */
  def deleteFlowTemplate(): awsDashSdkLib.libRequestMod.Request[DeleteFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFlowTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy. Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow taken at the time of deployment).
    */
  def deleteFlowTemplate(params: DeleteFlowTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeleteFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFlowTemplate(
    params: DeleteFlowTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and flows that use entities in the namespace before performing this action.
    */
  def deleteNamespace(): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and flows that use entities in the namespace before performing this action.
    */
  def deleteNamespace(params: DeleteNamespaceRequest): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can be deleted. Users can create a new system instance that has the same ID as a deleted system instance.
    */
  def deleteSystemInstance(): awsDashSdkLib.libRequestMod.Request[DeleteSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSystemInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can be deleted. Users can create a new system instance that has the same ID as a deleted system instance.
    */
  def deleteSystemInstance(params: DeleteSystemInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeleteSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSystemInstance(
    params: DeleteSystemInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
    */
  def deleteSystemTemplate(): awsDashSdkLib.libRequestMod.Request[DeleteSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSystemTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
    */
  def deleteSystemTemplate(params: DeleteSystemTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeleteSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSystemTemplate(
    params: DeleteSystemTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Greengrass and Cloud Deployments  Deploys the system instance to the target specified in CreateSystemInstance.   Greengrass Deployments  If the system or any workflows and entities have been updated before this action is called, then the deployment will create a new Amazon Simple Storage Service resource file and then deploy it. Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error. For information about the artifacts that get added to your Greengrass core device when you use this API, see AWS IoT Things Graph and AWS IoT Greengrass.
    */
  def deploySystemInstance(): awsDashSdkLib.libRequestMod.Request[DeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deploySystemInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeploySystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Greengrass and Cloud Deployments  Deploys the system instance to the target specified in CreateSystemInstance.   Greengrass Deployments  If the system or any workflows and entities have been updated before this action is called, then the deployment will create a new Amazon Simple Storage Service resource file and then deploy it. Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error. For information about the artifacts that get added to your Greengrass core device when you use this API, see AWS IoT Things Graph and AWS IoT Greengrass.
    */
  def deploySystemInstance(params: DeploySystemInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deploySystemInstance(
    params: DeploySystemInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeploySystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be deployed, but existing deployments will continue to run.
    */
  def deprecateFlowTemplate(): awsDashSdkLib.libRequestMod.Request[DeprecateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateFlowTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be deployed, but existing deployments will continue to run.
    */
  def deprecateFlowTemplate(params: DeprecateFlowTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeprecateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateFlowTemplate(
    params: DeprecateFlowTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified system.
    */
  def deprecateSystemTemplate(): awsDashSdkLib.libRequestMod.Request[DeprecateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateSystemTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified system.
    */
  def deprecateSystemTemplate(params: DeprecateSystemTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeprecateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateSystemTemplate(
    params: DeprecateSystemTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeprecateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeprecateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the latest version of the user's namespace and the public version that it is tracking.
    */
  def describeNamespace(): awsDashSdkLib.libRequestMod.Request[DescribeNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNamespace(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the latest version of the user's namespace and the public version that it is tracking.
    */
  def describeNamespace(params: DescribeNamespaceRequest): awsDashSdkLib.libRequestMod.Request[DescribeNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNamespace(
    params: DescribeNamespaceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNamespaceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNamespaceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to dissociate because only one entity of a particular type can be associated with a thing.
    */
  def dissociateEntityFromThing(): awsDashSdkLib.libRequestMod.Request[DissociateEntityFromThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def dissociateEntityFromThing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DissociateEntityFromThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DissociateEntityFromThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to dissociate because only one entity of a particular type can be associated with a thing.
    */
  def dissociateEntityFromThing(params: DissociateEntityFromThingRequest): awsDashSdkLib.libRequestMod.Request[DissociateEntityFromThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def dissociateEntityFromThing(
    params: DissociateEntityFromThingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DissociateEntityFromThingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DissociateEntityFromThingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API returns the following TDM entities.   Properties   States   Events   Actions   Capabilities   Mappings   Devices   Device Models   Services   This action doesn't return definitions for systems, flows, and deployments.
    */
  def getEntities(): awsDashSdkLib.libRequestMod.Request[GetEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API returns the following TDM entities.   Properties   States   Events   Actions   Capabilities   Mappings   Devices   Device Models   Services   This action doesn't return definitions for systems, flows, and deployments.
    */
  def getEntities(params: GetEntitiesRequest): awsDashSdkLib.libRequestMod.Request[GetEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEntities(
    params: GetEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the specified workflow.
    */
  def getFlowTemplate(): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFlowTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the latest version of the DefinitionDocument and FlowTemplateSummary for the specified workflow.
    */
  def getFlowTemplate(params: GetFlowTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFlowTemplate(
    params: GetFlowTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been deprecated, this action will return revisions that occurred before the deprecation. This action won't work for workflows that have been deleted.
    */
  def getFlowTemplateRevisions(): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFlowTemplateRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFlowTemplateRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been deprecated, this action will return revisions that occurred before the deprecation. This action won't work for workflows that have been deleted.
    */
  def getFlowTemplateRevisions(params: GetFlowTemplateRevisionsRequest): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFlowTemplateRevisions(
    params: GetFlowTemplateRevisionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFlowTemplateRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFlowTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of a namespace deletion task.
    */
  def getNamespaceDeletionStatus(): awsDashSdkLib.libRequestMod.Request[GetNamespaceDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamespaceDeletionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamespaceDeletionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamespaceDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of a namespace deletion task.
    */
  def getNamespaceDeletionStatus(params: GetNamespaceDeletionStatusRequest): awsDashSdkLib.libRequestMod.Request[GetNamespaceDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamespaceDeletionStatus(
    params: GetNamespaceDeletionStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamespaceDeletionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamespaceDeletionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a system instance.
    */
  def getSystemInstance(): awsDashSdkLib.libRequestMod.Request[GetSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a system instance.
    */
  def getSystemInstance(params: GetSystemInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemInstance(
    params: GetSystemInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a system.
    */
  def getSystemTemplate(): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a system.
    */
  def getSystemTemplate(params: GetSystemTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemTemplate(
    params: GetSystemTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system has been deprecated, this action will return the revisions that occurred before its deprecation. This action won't work with systems that have been deleted.
    */
  def getSystemTemplateRevisions(): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemTemplateRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemTemplateRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system has been deprecated, this action will return the revisions that occurred before its deprecation. This action won't work with systems that have been deleted.
    */
  def getSystemTemplateRevisions(params: GetSystemTemplateRevisionsRequest): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSystemTemplateRevisions(
    params: GetSystemTemplateRevisionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSystemTemplateRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSystemTemplateRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified upload.
    */
  def getUploadStatus(): awsDashSdkLib.libRequestMod.Request[GetUploadStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUploadStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUploadStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUploadStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the status of the specified upload.
    */
  def getUploadStatus(params: GetUploadStatusRequest): awsDashSdkLib.libRequestMod.Request[GetUploadStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUploadStatus(
    params: GetUploadStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUploadStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUploadStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of objects that contain information about events in a flow execution.
    */
  def listFlowExecutionMessages(): awsDashSdkLib.libRequestMod.Request[ListFlowExecutionMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFlowExecutionMessages(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFlowExecutionMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFlowExecutionMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of objects that contain information about events in a flow execution.
    */
  def listFlowExecutionMessages(params: ListFlowExecutionMessagesRequest): awsDashSdkLib.libRequestMod.Request[ListFlowExecutionMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFlowExecutionMessages(
    params: ListFlowExecutionMessagesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFlowExecutionMessagesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFlowExecutionMessagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on an AWS IoT Things Graph resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all tags on an AWS IoT Things Graph resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for entities of the specified type. You can search for entities in your namespace and the public namespace that you're tracking.
    */
  def searchEntities(): awsDashSdkLib.libRequestMod.Request[SearchEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for entities of the specified type. You can search for entities in your namespace and the public namespace that you're tracking.
    */
  def searchEntities(params: SearchEntitiesRequest): awsDashSdkLib.libRequestMod.Request[SearchEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchEntities(
    params: SearchEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for AWS IoT Things Graph workflow execution instances.
    */
  def searchFlowExecutions(): awsDashSdkLib.libRequestMod.Request[SearchFlowExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchFlowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchFlowExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchFlowExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for AWS IoT Things Graph workflow execution instances.
    */
  def searchFlowExecutions(params: SearchFlowExecutionsRequest): awsDashSdkLib.libRequestMod.Request[SearchFlowExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchFlowExecutions(
    params: SearchFlowExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchFlowExecutionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchFlowExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for summary information about workflows.
    */
  def searchFlowTemplates(): awsDashSdkLib.libRequestMod.Request[SearchFlowTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchFlowTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchFlowTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchFlowTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for summary information about workflows.
    */
  def searchFlowTemplates(params: SearchFlowTemplatesRequest): awsDashSdkLib.libRequestMod.Request[SearchFlowTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchFlowTemplates(
    params: SearchFlowTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchFlowTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchFlowTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for system instances in the user's account.
    */
  def searchSystemInstances(): awsDashSdkLib.libRequestMod.Request[SearchSystemInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchSystemInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchSystemInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchSystemInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for system instances in the user's account.
    */
  def searchSystemInstances(params: SearchSystemInstancesRequest): awsDashSdkLib.libRequestMod.Request[SearchSystemInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchSystemInstances(
    params: SearchSystemInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchSystemInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchSystemInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to return only systems that use the specified workflow.
    */
  def searchSystemTemplates(): awsDashSdkLib.libRequestMod.Request[SearchSystemTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchSystemTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchSystemTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchSystemTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to return only systems that use the specified workflow.
    */
  def searchSystemTemplates(params: SearchSystemTemplatesRequest): awsDashSdkLib.libRequestMod.Request[SearchSystemTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchSystemTemplates(
    params: SearchSystemTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchSystemTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchSystemTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for things associated with the specified entity. You can search by both device and device model. For example, if two different devices, camera1 and camera2, implement the camera device model, the user can associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2, but SearchThings(camera) will return both thing1 and thing2. This action searches for exact matches and doesn't perform partial text matching.
    */
  def searchThings(): awsDashSdkLib.libRequestMod.Request[SearchThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchThings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches for things associated with the specified entity. You can search by both device and device model. For example, if two different devices, camera1 and camera2, implement the camera device model, the user can associate thing1 to camera1 and thing2 to camera2. SearchThings(camera2) will return only thing2, but SearchThings(camera) will return both thing1 and thing2. This action searches for exact matches and doesn't perform partial text matching.
    */
  def searchThings(params: SearchThingsRequest): awsDashSdkLib.libRequestMod.Request[SearchThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchThings(
    params: SearchThingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchThingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchThingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a tag for the specified resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a tag for the specified resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a system instance from its target (Cloud or Greengrass).
    */
  def undeploySystemInstance(): awsDashSdkLib.libRequestMod.Request[UndeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeploySystemInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UndeploySystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UndeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a system instance from its target (Cloud or Greengrass).
    */
  def undeploySystemInstance(params: UndeploySystemInstanceRequest): awsDashSdkLib.libRequestMod.Request[UndeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeploySystemInstance(
    params: UndeploySystemInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UndeploySystemInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UndeploySystemInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a tag from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new workflow with a different ID), and update the copy. The workflow can contain only entities in the specified namespace. 
    */
  def updateFlowTemplate(): awsDashSdkLib.libRequestMod.Request[UpdateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new workflow with a different ID), and update the copy. The workflow can contain only entities in the specified namespace. 
    */
  def updateFlowTemplate(params: UpdateFlowTemplateRequest): awsDashSdkLib.libRequestMod.Request[UpdateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFlowTemplate(
    params: UpdateFlowTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFlowTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFlowTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that uses the system will see the changes in the system when it is redeployed.
    */
  def updateSystemTemplate(): awsDashSdkLib.libRequestMod.Request[UpdateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSystemTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that uses the system will see the changes in the system when it is redeployed.
    */
  def updateSystemTemplate(params: UpdateSystemTemplateRequest): awsDashSdkLib.libRequestMod.Request[UpdateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSystemTemplate(
    params: UpdateSystemTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSystemTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSystemTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Asynchronously uploads one or more entity definitions to the user's namespace. The document parameter is required if syncWithPublicNamespace and deleteExistingEntites are false. If the syncWithPublicNamespace parameter is set to true, the user's namespace will synchronize with the latest version of the public namespace. If deprecateExistingEntities is set to true, all entities in the latest version will be deleted before the new DefinitionDocument is uploaded. When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets the syncWithPublicNamespace parameter or the deprecateExistingEntities parameter to true. The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't create entities in the public namespace, but entity definitions can refer to entities in the public namespace. Valid entities are Device, DeviceModel, Service, Capability, State, Action, Event, Property, Mapping, Enum. 
    */
  def uploadEntityDefinitions(): awsDashSdkLib.libRequestMod.Request[UploadEntityDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadEntityDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadEntityDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadEntityDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Asynchronously uploads one or more entity definitions to the user's namespace. The document parameter is required if syncWithPublicNamespace and deleteExistingEntites are false. If the syncWithPublicNamespace parameter is set to true, the user's namespace will synchronize with the latest version of the public namespace. If deprecateExistingEntities is set to true, all entities in the latest version will be deleted before the new DefinitionDocument is uploaded. When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets the syncWithPublicNamespace parameter or the deprecateExistingEntities parameter to true. The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't create entities in the public namespace, but entity definitions can refer to entities in the public namespace. Valid entities are Device, DeviceModel, Service, Capability, State, Action, Event, Property, Mapping, Enum. 
    */
  def uploadEntityDefinitions(params: UploadEntityDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[UploadEntityDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def uploadEntityDefinitions(
    params: UploadEntityDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UploadEntityDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UploadEntityDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

