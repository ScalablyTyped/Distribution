package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SSM: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example, you could define a set of tags for your account's managed instances that helps you track each instance's owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test. Each resource can have a maximum of 50 tags.  We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string of characters.  For more information about tags, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
    */
  def cancelCommand(): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelCommand(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelCommandResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be terminated and the underlying process stopped.
    */
  def cancelCommand(params: CancelCommandRequest): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelCommand(
    params: CancelCommandRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelCommandResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
    */
  def cancelMaintenanceWindowExecution(): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelMaintenanceWindowExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelMaintenanceWindowExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have not already starting running. (Tasks already in progress will continue to completion.)
    */
  def cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelMaintenanceWindowExecution(
    params: CancelMaintenanceWindowExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelMaintenanceWindowExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed instance. For more information about activations, see Setting Up Systems Manager in Hybrid Environments.
    */
  def createActivation(): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createActivation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateActivationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed instance. For more information about activations, see Setting Up Systems Manager in Hybrid Environments.
    */
  def createActivation(params: CreateActivationRequest): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createActivation(
    params: CreateActivationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateActivationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociation(): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociation(params: CreateAssociationRequest): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAssociation(
    params: CreateAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociationBatch(): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAssociationBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssociationBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified Systems Manager document with the specified instances or targets. When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the instance processes the document and configures the instance as specified. If you associate a document with an instance that already has an associated document, the system returns the AssociationAlreadyExists exception.
    */
  def createAssociationBatch(params: CreateAssociationBatchRequest): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAssociationBatch(
    params: CreateAssociationBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAssociationBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAssociationBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
    */
  def createDocument(): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Systems Manager document. After you create a document, you can use CreateAssociation to associate it with one or more running instances.
    */
  def createDocument(params: CreateDocumentRequest): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDocument(
    params: CreateDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Maintenance Window.
    */
  def createMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Maintenance Window.
    */
  def createMaintenanceWindow(params: CreateMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMaintenanceWindow(
    params: CreateMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def createPatchBaseline(): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a patch baseline.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def createPatchBaseline(params: CreatePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPatchBaseline(
    params: CreatePatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync. By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide.
    */
  def createResourceDataSync(): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDataSync(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the Amazon S3 bucket. To check the status of the sync, use the ListResourceDataSync. By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a restrictive bucket policy. For more information, see Configuring Resource Data Sync for Inventory in the AWS Systems Manager User Guide.
    */
  def createResourceDataSync(params: CreateResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDataSync(
    params: CreateResourceDataSyncRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
    */
  def deleteActivation(): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteActivation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteActivationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no longer use it to register additional managed instances. Deleting an activation does not de-register managed instances. You must manually de-register managed instances.
    */
  def deleteActivation(params: DeleteActivationRequest): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteActivation(
    params: DeleteActivationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteActivationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteActivationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
    */
  def deleteAssociation(): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified Systems Manager document from the specified instance. When you disassociate a document from an instance, it does not change the configuration of the instance. To change the configuration state of an instance after you disassociate a document, you must create a new document with the desired configuration and associate it with the instance.
    */
  def deleteAssociation(params: DeleteAssociationRequest): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAssociation(
    params: DeleteAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
    */
  def deleteDocument(): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the Systems Manager document and all instance associations to the document. Before you delete the document, we recommend that you use DeleteAssociation to disassociate all instances that are associated with the document.
    */
  def deleteDocument(params: DeleteDocumentRequest): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDocument(
    params: DeleteDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
    */
  def deleteInventory(): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInventory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory type is also referred to as deleting a custom inventory schema.
    */
  def deleteInventory(params: DeleteInventoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInventory(
    params: DeleteInventoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Maintenance Window.
    */
  def deleteMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Maintenance Window.
    */
  def deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMaintenanceWindow(
    params: DeleteMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a parameter from the system.
    */
  def deleteParameter(): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a parameter from the system.
    */
  def deleteParameter(params: DeleteParameterRequest): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameter(
    params: DeleteParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
    */
  def deleteParameters(): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
    */
  def deleteParameters(params: DeleteParametersRequest): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteParameters(
    params: DeleteParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a patch baseline.
    */
  def deletePatchBaseline(): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a patch baseline.
    */
  def deletePatchBaseline(params: DeletePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePatchBaseline(
    params: DeletePatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not delete data in the target Amazon S3 bucket.
    */
  def deleteResourceDataSync(): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceDataSync(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not delete data in the target Amazon S3 bucket.
    */
  def deleteResourceDataSync(params: DeleteResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceDataSync(
    params: DeleteResourceDataSyncRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
    */
  def deregisterManagedInstance(): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterManagedInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterManagedInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
    */
  def deregisterManagedInstance(params: DeregisterManagedInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterManagedInstance(
    params: DeregisterManagedInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterManagedInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterManagedInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a patch group from a patch baseline.
    */
  def deregisterPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterPatchBaselineForPatchGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a patch group from a patch baseline.
    */
  def deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterPatchBaselineForPatchGroup(
    params: DeregisterPatchBaselineForPatchGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a target from a Maintenance Window.
    */
  def deregisterTargetFromMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTargetFromMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTargetFromMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a target from a Maintenance Window.
    */
  def deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTargetFromMaintenanceWindow(
    params: DeregisterTargetFromMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTargetFromMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a task from a Maintenance Window.
    */
  def deregisterTaskFromMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTaskFromMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTaskFromMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a task from a Maintenance Window.
    */
  def deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTaskFromMaintenanceWindow(
    params: DeregisterTaskFromMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTaskFromMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTaskFromMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Details about the activation, including: the date and time the activation was created, the expiration date, the IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
    */
  def describeActivations(): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActivationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Details about the activation, including: the date and time the activation was created, the expiration date, the IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
    */
  def describeActivations(params: DescribeActivationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivations(
    params: DescribeActivationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeActivationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeActivationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
    */
  def describeAssociation(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the association for the specified target or instance. If you created the association by using the Targets parameter, then you must retrieve the association by using the association ID. If you created the association by specifying an instance ID and a Systems Manager document, then you retrieve the association by specifying the document name and the instance ID. 
    */
  def describeAssociation(params: DescribeAssociationRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociation(
    params: DescribeAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to view information about a specific execution of a specific association.
    */
  def describeAssociationExecutionTargets(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociationExecutionTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationExecutionTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to view information about a specific execution of a specific association.
    */
  def describeAssociationExecutionTargets(params: DescribeAssociationExecutionTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociationExecutionTargets(
    params: DescribeAssociationExecutionTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationExecutionTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to view all executions for a specific association ID. 
    */
  def describeAssociationExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociationExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to view all executions for a specific association ID. 
    */
  def describeAssociationExecutions(params: DescribeAssociationExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAssociationExecutions(
    params: DescribeAssociationExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAssociationExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAssociationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides details about all active and terminated Automation executions.
    */
  def describeAutomationExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutomationExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAutomationExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides details about all active and terminated Automation executions.
    */
  def describeAutomationExecutions(params: DescribeAutomationExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutomationExecutions(
    params: DescribeAutomationExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAutomationExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Information about all active and terminated step executions in an Automation workflow.
    */
  def describeAutomationStepExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutomationStepExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAutomationStepExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Information about all active and terminated step executions in an Automation workflow.
    */
  def describeAutomationStepExecutions(params: DescribeAutomationStepExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutomationStepExecutions(
    params: DescribeAutomationStepExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAutomationStepExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAutomationStepExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all patches that could possibly be included in a patch baseline.
    */
  def describeAvailablePatches(): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAvailablePatches(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAvailablePatchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all patches that could possibly be included in a patch baseline.
    */
  def describeAvailablePatches(params: DescribeAvailablePatchesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAvailablePatches(
    params: DescribeAvailablePatchesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAvailablePatchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAvailablePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified Systems Manager document.
    */
  def describeDocument(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified Systems Manager document.
    */
  def describeDocument(params: DescribeDocumentRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocument(
    params: DescribeDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
    */
  def describeDocumentPermission(): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentPermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly (All). 
    */
  def describeDocumentPermission(params: DescribeDocumentPermissionRequest): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDocumentPermission(
    params: DescribeDocumentPermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDocumentPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * All associations for the instance(s).
    */
  def describeEffectiveInstanceAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEffectiveInstanceAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEffectiveInstanceAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * All associations for the instance(s).
    */
  def describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEffectiveInstanceAssociations(
    params: DescribeEffectiveInstanceAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEffectiveInstanceAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEffectiveInstanceAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
    */
  def describeEffectivePatchesForPatchBaseline(): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEffectivePatchesForPatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEffectivePatchesForPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note that this API applies only to Windows patch baselines.
    */
  def describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeEffectivePatchesForPatchBaseline(
    params: DescribeEffectivePatchesForPatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEffectivePatchesForPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEffectivePatchesForPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The status of the associations for the instance(s).
    */
  def describeInstanceAssociationsStatus(): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceAssociationsStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstanceAssociationsStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The status of the associations for the instance(s).
    */
  def describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceAssociationsStatus(
    params: DescribeInstanceAssociationsStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstanceAssociationsStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceAssociationsStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  def describeInstanceInformation(): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceInformation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstanceInformationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more of your instances. You can use this to get information about instances like the operating system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.   The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  def describeInstanceInformation(params: DescribeInstanceInformationRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceInformation(
    params: DescribeInstanceInformationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstanceInformationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstanceInformationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the high-level patch state of one or more instances.
    */
  def describeInstancePatchStates(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatchStates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the high-level patch state of one or more instances.
    */
  def describeInstancePatchStates(params: DescribeInstancePatchStatesRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatchStates(
    params: DescribeInstancePatchStatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchStatesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the high-level patch state for the instances in the specified patch group.
    */
  def describeInstancePatchStatesForPatchGroup(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatchStatesForPatchGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchStatesForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the high-level patch state for the instances in the specified patch group.
    */
  def describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatchStatesForPatchGroup(
    params: DescribeInstancePatchStatesForPatchGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchStatesForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchStatesForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
    */
  def describeInstancePatches(): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatches(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the patches on the specified instance and their state relative to the patch baseline being used for the instance.
    */
  def describeInstancePatches(params: DescribeInstancePatchesRequest): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstancePatches(
    params: DescribeInstancePatchesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInstancePatchesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInstancePatchesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a specific delete inventory operation.
    */
  def describeInventoryDeletions(): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInventoryDeletions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInventoryDeletionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a specific delete inventory operation.
    */
  def describeInventoryDeletions(params: DescribeInventoryDeletionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInventoryDeletions(
    params: DescribeInventoryDeletionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInventoryDeletionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInventoryDeletionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the individual task executions (one per target) for a particular task run as part of a Maintenance Window execution.
    */
  def describeMaintenanceWindowExecutionTaskInvocations(): awsDashSdkLib.libRequestMod.Request[
    DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMaintenanceWindowExecutionTaskInvocations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the individual task executions (one per target) for a particular task run as part of a Maintenance Window execution.
    */
  def describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest): awsDashSdkLib.libRequestMod.Request[
    DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMaintenanceWindowExecutionTaskInvocations(
    params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DescribeMaintenanceWindowExecutionTaskInvocationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a given Maintenance Window execution, lists the tasks that were run.
    */
  def describeMaintenanceWindowExecutionTasks(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowExecutionTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a given Maintenance Window execution, lists the tasks that were run.
    */
  def describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowExecutionTasks(
    params: DescribeMaintenanceWindowExecutionTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was scheduled to be active, and information about tasks registered and run with the Maintenance Window.
    */
  def describeMaintenanceWindowExecutions(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was scheduled to be active, and information about tasks registered and run with the Maintenance Window.
    */
  def describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowExecutions(
    params: DescribeMaintenanceWindowExecutionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowExecutionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowExecutionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about upcoming executions of a Maintenance Window.
    */
  def describeMaintenanceWindowSchedule(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowScheduleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about upcoming executions of a Maintenance Window.
    */
  def describeMaintenanceWindowSchedule(params: DescribeMaintenanceWindowScheduleRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowSchedule(
    params: DescribeMaintenanceWindowScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowScheduleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowScheduleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the targets registered with the Maintenance Window.
    */
  def describeMaintenanceWindowTargets(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the targets registered with the Maintenance Window.
    */
  def describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowTargets(
    params: DescribeMaintenanceWindowTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tasks in a Maintenance Window.
    */
  def describeMaintenanceWindowTasks(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tasks in a Maintenance Window.
    */
  def describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowTasks(
    params: DescribeMaintenanceWindowTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowTasksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowTasksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Maintenance Windows in an AWS account.
    */
  def describeMaintenanceWindows(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Maintenance Windows in an AWS account.
    */
  def describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindows(
    params: DescribeMaintenanceWindowsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
    */
  def describeMaintenanceWindowsForTarget(): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowsForTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowsForTargetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
    */
  def describeMaintenanceWindowsForTarget(params: DescribeMaintenanceWindowsForTargetRequest): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMaintenanceWindowsForTarget(
    params: DescribeMaintenanceWindowsForTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMaintenanceWindowsForTargetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMaintenanceWindowsForTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get information about a parameter. Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.
    */
  def describeParameters(): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get information about a parameter. Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.
    */
  def describeParameters(params: DescribeParametersRequest): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeParameters(
    params: DescribeParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the patch baselines in your AWS account.
    */
  def describePatchBaselines(): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchBaselines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchBaselinesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the patch baselines in your AWS account.
    */
  def describePatchBaselines(params: DescribePatchBaselinesRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchBaselines(
    params: DescribePatchBaselinesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchBaselinesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchBaselinesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns high-level aggregated patch compliance state for a patch group.
    */
  def describePatchGroupState(): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchGroupState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchGroupStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns high-level aggregated patch compliance state for a patch group.
    */
  def describePatchGroupState(params: DescribePatchGroupStateRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchGroupState(
    params: DescribePatchGroupStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchGroupStateResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all patch groups that have been registered with patch baselines.
    */
  def describePatchGroups(): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all patch groups that have been registered with patch baselines.
    */
  def describePatchGroups(params: DescribePatchGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePatchGroups(
    params: DescribePatchGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePatchGroupsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePatchGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
    */
  def describeSessions(): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSessionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30 days.
    */
  def describeSessions(params: DescribeSessionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSessions(
    params: DescribeSessionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSessionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get detailed information about a particular Automation execution.
    */
  def getAutomationExecution(): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAutomationExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get detailed information about a particular Automation execution.
    */
  def getAutomationExecution(params: GetAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAutomationExecution(
    params: GetAutomationExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about command execution for an invocation or plugin. 
    */
  def getCommandInvocation(): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCommandInvocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCommandInvocationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about command execution for an invocation or plugin. 
    */
  def getCommandInvocation(params: GetCommandInvocationRequest): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCommandInvocation(
    params: GetCommandInvocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCommandInvocationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCommandInvocationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
    */
  def getConnectionStatus(): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to receive Session Manager connections.
    */
  def getConnectionStatus(params: GetConnectionStatusRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectionStatus(
    params: GetConnectionStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
    */
  def getDefaultPatchBaseline(): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDefaultPatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDefaultPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system. If you do not specify an operating system value, the default patch baseline for Windows is returned.
    */
  def getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDefaultPatchBaseline(
    params: GetDefaultPatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDefaultPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
    */
  def getDeployablePatchSnapshotForInstance(): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployablePatchSnapshotForInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeployablePatchSnapshotForInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the AWS-RunPatchBaseline Systems Manager document. 
    */
  def getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeployablePatchSnapshotForInstance(
    params: GetDeployablePatchSnapshotForInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeployablePatchSnapshotForInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeployablePatchSnapshotForInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the contents of the specified Systems Manager document.
    */
  def getDocument(): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the contents of the specified Systems Manager document.
    */
  def getDocument(params: GetDocumentRequest): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDocument(
    params: GetDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Query inventory information.
    */
  def getInventory(): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInventory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Query inventory information.
    */
  def getInventory(params: GetInventoryRequest): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInventory(
    params: GetInventoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
    */
  def getInventorySchema(): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInventorySchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInventorySchemaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Return a list of inventory type names for the account, or return a list of attribute names for a specific Inventory item type. 
    */
  def getInventorySchema(params: GetInventorySchemaRequest): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInventorySchema(
    params: GetInventorySchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInventorySchemaResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInventorySchemaResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Maintenance Window.
    */
  def getMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Maintenance Window.
    */
  def getMaintenanceWindow(params: GetMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindow(
    params: GetMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details about a specific task run as part of a Maintenance Window execution.
    */
  def getMaintenanceWindowExecution(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details about a specific task run as part of a Maintenance Window execution.
    */
  def getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowExecution(
    params: GetMaintenanceWindowExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the details about a specific task run as part of a Maintenance Window execution.
    */
  def getMaintenanceWindowExecutionTask(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowExecutionTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the details about a specific task run as part of a Maintenance Window execution.
    */
  def getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowExecutionTask(
    params: GetMaintenanceWindowExecutionTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowExecutionTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a task invocation. A task invocation is a specific task running on a specific target. Maintenance Windows report status for all invocations. 
    */
  def getMaintenanceWindowExecutionTaskInvocation(): awsDashSdkLib.libRequestMod.Request[
    GetMaintenanceWindowExecutionTaskInvocationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMaintenanceWindowExecutionTaskInvocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    GetMaintenanceWindowExecutionTaskInvocationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a task invocation. A task invocation is a specific task running on a specific target. Maintenance Windows report status for all invocations. 
    */
  def getMaintenanceWindowExecutionTaskInvocation(params: GetMaintenanceWindowExecutionTaskInvocationRequest): awsDashSdkLib.libRequestMod.Request[
    GetMaintenanceWindowExecutionTaskInvocationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMaintenanceWindowExecutionTaskInvocation(
    params: GetMaintenanceWindowExecutionTaskInvocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowExecutionTaskInvocationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    GetMaintenanceWindowExecutionTaskInvocationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tasks in a Maintenance Window.
    */
  def getMaintenanceWindowTask(): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tasks in a Maintenance Window.
    */
  def getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMaintenanceWindowTask(
    params: GetMaintenanceWindowTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMaintenanceWindowTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
    */
  def getParameter(): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get information about a parameter by using the parameter name. Don't confuse this API action with the GetParameters API action.
    */
  def getParameter(params: GetParameterRequest): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameter(
    params: GetParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Query a list of all parameters used by the AWS account.
    */
  def getParameterHistory(): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameterHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParameterHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Query a list of all parameters used by the AWS account.
    */
  def getParameterHistory(params: GetParameterHistoryRequest): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameterHistory(
    params: GetParameterHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParameterHistoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParameterHistoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
    */
  def getParameters(): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get details of a parameter. Don't confuse this API action with the GetParameter API action.
    */
  def getParameters(params: GetParametersRequest): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParameters(
    params: GetParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParametersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve parameters in a specific hierarchy. For more information, see Working with Systems Manager Parameters in the AWS Systems Manager User Guide.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.  This API action doesn't support filtering by tags.  
    */
  def getParametersByPath(): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParametersByPath(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParametersByPathResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve parameters in a specific hierarchy. For more information, see Working with Systems Manager Parameters in the AWS Systems Manager User Guide.  Request results are returned on a best-effort basis. If you specify MaxResults in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of MaxResults. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a NextToken. You can specify the NextToken in a subsequent call to get the next set of results.  This API action doesn't support filtering by tags.  
    */
  def getParametersByPath(params: GetParametersByPathRequest): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getParametersByPath(
    params: GetParametersByPathRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetParametersByPathResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetParametersByPathResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a patch baseline.
    */
  def getPatchBaseline(): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a patch baseline.
    */
  def getPatchBaseline(params: GetPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPatchBaseline(
    params: GetPatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the patch baseline that should be used for the specified patch group.
    */
  def getPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPatchBaselineForPatchGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the patch baseline that should be used for the specified patch group.
    */
  def getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPatchBaselineForPatchGroup(
    params: GetPatchBaselineForPatchGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the UpdateServiceSetting API action to change the default setting. Or use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Query the current service setting for the account. 
    */
  def getServiceSetting(): awsDashSdkLib.libRequestMod.Request[GetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceSetting(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the UpdateServiceSetting API action to change the default setting. Or use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Query the current service setting for the account. 
    */
  def getServiceSetting(params: GetServiceSettingRequest): awsDashSdkLib.libRequestMod.Request[GetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceSetting(
    params: GetServiceSettingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
    */
  def labelParameterVersion(): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def labelParameterVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LabelParameterVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a parameter, Systems Manager automatically saves a new version and increments the version number by one. A label can help you remember the purpose of a parameter when there are multiple versions.  Parameter labels have the following requirements and restrictions.   A version of a parameter can have a maximum of 10 labels.   You can't attach the same label to different versions of the same parameter. For example, if version 1 has the label Production, then you can't attach Production to version 2.   You can move a label from one version of a parameter to another.   You can't create a label when you create a new parameter. You must attach a label to a specific version of a parameter.   You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a different version of a parameter.   A label can have a maximum of 100 characters.   Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).   Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these requirements, then the label is not associated with a parameter and the system displays it in the list of InvalidLabels.  
    */
  def labelParameterVersion(params: LabelParameterVersionRequest): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def labelParameterVersion(
    params: LabelParameterVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LabelParameterVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LabelParameterVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all versions of an association for a specific association ID.
    */
  def listAssociationVersions(): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociationVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all versions of an association for a specific association ID.
    */
  def listAssociationVersions(params: ListAssociationVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociationVersions(
    params: ListAssociationVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociationVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the associations for the specified Systems Manager document or instance.
    */
  def listAssociations(): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the associations for the specified Systems Manager document or instance.
    */
  def listAssociations(params: ListAssociationsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAssociations(
    params: ListAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
    */
  def listCommandInvocations(): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCommandInvocations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCommandInvocationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about command execution.
    */
  def listCommandInvocations(params: ListCommandInvocationsRequest): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCommandInvocations(
    params: ListCommandInvocationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCommandInvocationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCommandInvocationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the commands requested by users of the AWS account.
    */
  def listCommands(): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCommands(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCommandsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the commands requested by users of the AWS account.
    */
  def listCommands(params: ListCommandsRequest): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCommands(
    params: ListCommandsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCommandsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCommandsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
    */
  def listComplianceItems(): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComplianceItems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComplianceItemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a specified resource ID, this API action returns a list of compliance statuses for different resource types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the filter. 
    */
  def listComplianceItems(params: ListComplianceItemsRequest): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComplianceItems(
    params: ListComplianceItemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComplianceItemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
    */
  def listComplianceSummaries(): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComplianceSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComplianceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call can return State Manager associations, patches, or custom compliance types according to the filter criteria that you specify. 
    */
  def listComplianceSummaries(params: ListComplianceSummariesRequest): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listComplianceSummaries(
    params: ListComplianceSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListComplianceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all versions for a document.
    */
  def listDocumentVersions(): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all versions for a document.
    */
  def listDocumentVersions(params: ListDocumentVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocumentVersions(
    params: ListDocumentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentVersionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more of your Systems Manager documents.
    */
  def listDocuments(): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocuments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more of your Systems Manager documents.
    */
  def listDocuments(params: ListDocumentsRequest): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDocuments(
    params: ListDocumentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDocumentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDocumentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A list of inventory items returned by the request.
    */
  def listInventoryEntries(): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInventoryEntries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInventoryEntriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * A list of inventory items returned by the request.
    */
  def listInventoryEntries(params: ListInventoryEntriesRequest): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInventoryEntries(
    params: ListInventoryEntriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInventoryEntriesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInventoryEntriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
    */
  def listResourceComplianceSummaries(): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceComplianceSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceComplianceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a resource-level summary count. The summary includes information about compliant and non-compliant statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
    */
  def listResourceComplianceSummaries(params: ListResourceComplianceSummariesRequest): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceComplianceSummaries(
    params: ListResourceComplianceSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceComplianceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceComplianceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
    */
  def listResourceDataSync(): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDataSync(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start, the last sync status, and the last time a sync successfully completed. The number of sync configurations might be too large to return using a single call to ListResourceDataSync. You can limit the number of sync configurations returned by using the MaxResults parameter. To determine whether there are more sync configurations to list, check the value of NextToken in the output. If there are more sync configurations to list, you can request them by specifying the NextToken returned in the call to the parameter of a subsequent call. 
    */
  def listResourceDataSync(params: ListResourceDataSyncRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDataSync(
    params: ListResourceDataSyncRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDataSyncResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDataSyncResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of the tags assigned to the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
    */
  def modifyDocumentPermission(): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDocumentPermission(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDocumentPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the AWS user account IDs for those people who can use the document. If you share a document publicly, you must specify All as the account ID.
    */
  def modifyDocumentPermission(params: ModifyDocumentPermissionRequest): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyDocumentPermission(
    params: ModifyDocumentPermissionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyDocumentPermissionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyDocumentPermissionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
    */
  def putComplianceItems(): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putComplianceItems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutComplianceItemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a compliance type and other compliance details on a designated resource. This action lets you register custom compliance details with a resource. This call overwrites existing compliance information on the resource, so you must provide a full list of compliance items each time that you send the request. ComplianceType can be one of the following:   ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.   ExecutionType: Specify patch, association, or Custom:string.   ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.   Id: The patch, association, or custom compliance ID.   Title: A title.   Status: The status of the compliance item. For example, approved for patches, or Failed for associations.   Severity: A patch severity. For example, critical.   DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.   DocumentVersion: An SSM document version number. For example, 4.   Classification: A patch classification. For example, security updates.   PatchBaselineId: A patch baseline ID.   PatchSeverity: A patch severity. For example, Critical.   PatchState: A patch state. For example, InstancesWithFailedPatches.   PatchGroup: The name of a patch group.   InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'  
    */
  def putComplianceItems(params: PutComplianceItemsRequest): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putComplianceItems(
    params: PutComplianceItemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutComplianceItemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutComplianceItemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
    */
  def putInventory(): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putInventory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't already exist, or updates an inventory item, if it does exist.
    */
  def putInventory(params: PutInventoryRequest): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putInventory(
    params: PutInventoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutInventoryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutInventoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a parameter to the system.
    */
  def putParameter(): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a parameter to the system.
    */
  def putParameter(params: PutParameterRequest): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putParameter(
    params: PutParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutParameterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutParameterResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Defines the default patch baseline.
    */
  def registerDefaultPatchBaseline(): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDefaultPatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterDefaultPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Defines the default patch baseline.
    */
  def registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDefaultPatchBaseline(
    params: RegisterDefaultPatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterDefaultPatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterDefaultPatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a patch baseline for a patch group.
    */
  def registerPatchBaselineForPatchGroup(): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerPatchBaselineForPatchGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a patch baseline for a patch group.
    */
  def registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerPatchBaselineForPatchGroup(
    params: RegisterPatchBaselineForPatchGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterPatchBaselineForPatchGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterPatchBaselineForPatchGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a target with a Maintenance Window.
    */
  def registerTargetWithMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTargetWithMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTargetWithMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a target with a Maintenance Window.
    */
  def registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTargetWithMaintenanceWindow(
    params: RegisterTargetWithMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTargetWithMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTargetWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new task to a Maintenance Window.
    */
  def registerTaskWithMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTaskWithMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTaskWithMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new task to a Maintenance Window.
    */
  def registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTaskWithMaintenanceWindow(
    params: RegisterTaskWithMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTaskWithMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTaskWithMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes all tags from the specified resource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes all tags from the specified resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Use the UpdateServiceSetting API action to change the default setting.  Reset the service setting for the account to the default value as provisioned by the AWS service team. 
    */
  def resetServiceSetting(): awsDashSdkLib.libRequestMod.Request[ResetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetServiceSetting(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Use the UpdateServiceSetting API action to change the default setting.  Reset the service setting for the account to the default value as provisioned by the AWS service team. 
    */
  def resetServiceSetting(params: ResetServiceSettingRequest): awsDashSdkLib.libRequestMod.Request[ResetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetServiceSetting(
    params: ResetServiceSettingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
    */
  def resumeSession(): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resumeSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResumeSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.  This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use. 
    */
  def resumeSession(params: ResumeSessionRequest): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resumeSession(
    params: ResumeSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResumeSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResumeSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
    */
  def sendAutomationSignal(): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendAutomationSignal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendAutomationSignalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a signal to an Automation execution to change the current behavior or status of the execution. 
    */
  def sendAutomationSignal(params: SendAutomationSignalRequest): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendAutomationSignal(
    params: SendAutomationSignalRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendAutomationSignalResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendAutomationSignalResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs commands on one or more managed instances.
    */
  def sendCommand(): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendCommand(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendCommandResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs commands on one or more managed instances.
    */
  def sendCommand(params: SendCommandRequest): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendCommand(
    params: SendCommandRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendCommandResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendCommandResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to run an association immediately and only one time. This action can be helpful when troubleshooting associations.
    */
  def startAssociationsOnce(): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAssociationsOnce(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAssociationsOnceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API action to run an association immediately and only one time. This action can be helpful when troubleshooting associations.
    */
  def startAssociationsOnce(params: StartAssociationsOnceRequest): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAssociationsOnce(
    params: StartAssociationsOnceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAssociationsOnceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAssociationsOnceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates execution of an Automation document.
    */
  def startAutomationExecution(): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAutomationExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates execution of an Automation document.
    */
  def startAutomationExecution(params: StartAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startAutomationExecution(
    params: StartAutomationExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. 
    */
  def startSession(): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and token that can be used to open a WebSocket connection for sending input and receiving outputs.  AWS CLI usage: start-session is an interactive command that requires the Session Manager plugin to be installed on the client machine making the call. For information, see  Install the Session Manager Plugin for the AWS CLI in the AWS Systems Manager User Guide. 
    */
  def startSession(params: StartSessionRequest): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSession(
    params: StartSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stop an Automation that is currently running.
    */
  def stopAutomationExecution(): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAutomationExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stop an Automation that is currently running.
    */
  def stopAutomationExecution(params: StopAutomationExecutionRequest): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopAutomationExecution(
    params: StopAutomationExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopAutomationExecutionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopAutomationExecutionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
    */
  def terminateSession(): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the instance. A terminated session cannot be resumed.
    */
  def terminateSession(params: TerminateSessionRequest): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateSession(
    params: TerminateSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TerminateSessionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TerminateSessionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.  When you update an association, the association immediately runs against the specified targets. 
    */
  def updateAssociation(): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an association. You can update the association name and version, the document version, schedule, parameters, and Amazon S3 output.  When you update an association, the association immediately runs against the specified targets. 
    */
  def updateAssociation(params: UpdateAssociationRequest): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAssociation(
    params: UpdateAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAssociationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the Systems Manager document associated with the specified instance.
    */
  def updateAssociationStatus(): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAssociationStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAssociationStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the Systems Manager document associated with the specified instance.
    */
  def updateAssociationStatus(params: UpdateAssociationStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAssociationStatus(
    params: UpdateAssociationStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAssociationStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAssociationStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The document you want to update.
    */
  def updateDocument(): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocument(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * The document you want to update.
    */
  def updateDocument(params: UpdateDocumentRequest): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocument(
    params: UpdateDocumentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDocumentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the default version of a document. 
    */
  def updateDocumentDefaultVersion(): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentDefaultVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDocumentDefaultVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the default version of a document. 
    */
  def updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDocumentDefaultVersion(
    params: UpdateDocumentDefaultVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDocumentDefaultVersionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDocumentDefaultVersionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Maintenance Window. Only specified parameters are modified.
    */
  def updateMaintenanceWindow(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing Maintenance Window. Only specified parameters are modified.
    */
  def updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindow(
    params: UpdateMaintenanceWindowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the following: The target from being an ID target to a Tag target, or a Tag target to an ID target. IDs for an ID target. Tags for a Tag target. Owner. Name. Description. If a parameter is null, then the corresponding field is not modified.
    */
  def updateMaintenanceWindowTarget(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindowTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowTargetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the following: The target from being an ID target to a Tag target, or a Tag target to an ID target. IDs for an ID target. Tags for a Tag target. Owner. Name. Description. If a parameter is null, then the corresponding field is not modified.
    */
  def updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindowTarget(
    params: UpdateMaintenanceWindowTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowTargetResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTargetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
    */
  def updateMaintenanceWindowTask(): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindowTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the following values:   TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.   ServiceRoleArn   TaskInvocationParameters   Priority   MaxConcurrency   MaxErrors   If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all fields required by the RegisterTaskWithMaintenanceWindow action are required for this request. Optional fields that aren't specified are set to null.
    */
  def updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateMaintenanceWindowTask(
    params: UpdateMaintenanceWindowTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateMaintenanceWindowTaskResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateMaintenanceWindowTaskResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
    */
  def updateManagedInstanceRole(): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateManagedInstanceRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateManagedInstanceRoleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
    */
  def updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateManagedInstanceRole(
    params: UpdateManagedInstanceRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateManagedInstanceRoleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateManagedInstanceRoleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def updatePatchBaseline(): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePatchBaseline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.  For information about valid key and value pairs in PatchFilters for each supported operating system type, see PatchFilter. 
    */
  def updatePatchBaseline(params: UpdatePatchBaselineRequest): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePatchBaseline(
    params: UpdatePatchBaselineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePatchBaselineResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePatchBaselineResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Or, use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Update the service setting for the account. 
    */
  def updateServiceSetting(): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceSetting(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  ServiceSetting is an account-level setting for an AWS service. This setting defines how a user interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the account based on feature or service usage, then the AWS service team might create a default setting of "false". This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for a paid feature. Services map a SettingId object to a setting value. AWS services teams define the default value for a SettingId. You can't create a new SettingId, but you can overwrite the default value if you have the ssm:UpdateServiceSetting permission for the setting. Use the GetServiceSetting API action to view the current value. Or, use the ResetServiceSetting to change the value back to the original value defined by the AWS service team. Update the service setting for the account. 
    */
  def updateServiceSetting(params: UpdateServiceSettingRequest): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceSetting(
    params: UpdateServiceSettingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceSettingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

