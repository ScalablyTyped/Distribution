package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/datapipeline", "DataPipeline")
@js.native
object DataPipelineNs extends js.Object {
  trait ActivatePipelineInput extends js.Object {
    /**
      * A list of parameter values to pass to the pipeline at activation.
      */
    var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
      */
    var startTimestamp: js.UndefOr[timestamp] = js.undefined
  }
  
  trait ActivatePipelineOutput extends js.Object
  
  trait AddTagsInput extends js.Object {
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The tags to add, as key/value pairs.
      */
    var tags: tagList
  }
  
  trait AddTagsOutput extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreatePipelineInput extends js.Object {
    /**
      * The description for the pipeline.
      */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS account, because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
      */
    var name: id
    /**
      * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
      */
    var tags: js.UndefOr[tagList] = js.undefined
    /**
      * A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data Pipeline. You are responsible for defining the format and ensuring the uniqueness of this identifier. You use this parameter to ensure idempotency during repeated calls to CreatePipeline. For example, if the first call to CreatePipeline does not succeed, you can pass in the same unique identifier and pipeline name combination on a subsequent call to CreatePipeline. CreatePipeline ensures that if a pipeline already exists with the same name and unique identifier, a new pipeline is not created. Instead, you'll receive the pipeline identifier from the previous attempt. The uniqueness of the name and unique identifier combination is scoped to the AWS account or IAM user credentials.
      */
    var uniqueId: id
  }
  
  trait CreatePipelineOutput extends js.Object {
    /**
      * The ID that AWS Data Pipeline assigns the newly created pipeline. For example, df-06372391ZG65EXAMPLE.
      */
    var pipelineId: id
  }
  
  trait DeactivatePipelineInput extends js.Object {
    /**
      * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects to CANCELED. If this value is false, the pipeline is deactivated after all running objects finish.
      */
    var cancelActive: js.UndefOr[cancelActive] = js.undefined
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
  }
  
  trait DeactivatePipelineOutput extends js.Object
  
  trait DeletePipelineInput extends js.Object {
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
  }
  
  trait DescribeObjectsInput extends js.Object {
    /**
      * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
      */
    var evaluateExpressions: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call DescribeObjects with the marker value from the previous call to retrieve the next set of results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25 identifiers in a single call to DescribeObjects.
      */
    var objectIds: idList
    /**
      * The ID of the pipeline that contains the object definitions.
      */
    var pipelineId: id
  }
  
  trait DescribeObjectsOutput extends js.Object {
    /**
      * Indicates whether there are more results to return.
      */
    var hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An array of object definitions.
      */
    var pipelineObjects: PipelineObjectList
  }
  
  trait DescribePipelinesInput extends js.Object {
    /**
      * The IDs of the pipelines to describe. You can pass as many as 25 identifiers in a single call. To obtain pipeline IDs, call ListPipelines.
      */
    var pipelineIds: idList
  }
  
  trait DescribePipelinesOutput extends js.Object {
    /**
      * An array of descriptions for the specified pipelines.
      */
    var pipelineDescriptionList: PipelineDescriptionList
  }
  
  trait EvaluateExpressionInput extends js.Object {
    /**
      * The expression to evaluate.
      */
    var expression: longString
    /**
      * The ID of the object.
      */
    var objectId: id
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
  }
  
  trait EvaluateExpressionOutput extends js.Object {
    /**
      * The evaluated expression.
      */
    var evaluatedExpression: longString
  }
  
  trait Field extends js.Object {
    /**
      * The field identifier.
      */
    var key: fieldNameString
    /**
      * The field value, expressed as the identifier of another object.
      */
    var refValue: js.UndefOr[fieldNameString] = js.undefined
    /**
      * The field value, expressed as a String.
      */
    var stringValue: js.UndefOr[fieldStringValue] = js.undefined
  }
  
  trait GetPipelineDefinitionInput extends js.Object {
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The version of the pipeline definition to retrieve. Set this parameter to latest (default) to use the last definition saved to the pipeline or active to use the last definition that was activated.
      */
    var version: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetPipelineDefinitionOutput extends js.Object {
    /**
      * The parameter objects used in the pipeline definition.
      */
    var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
    /**
      * The parameter values used in the pipeline definition.
      */
    var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    /**
      * The objects defined in the pipeline.
      */
    var pipelineObjects: js.UndefOr[PipelineObjectList] = js.undefined
  }
  
  trait InstanceIdentity extends js.Object {
    /**
      * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via the instance metadata service in the form of a JSON representation of an object.
      */
    var document: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance identity document.
      */
    var signature: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListPipelinesInput extends js.Object {
    /**
      * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call ListPipelines with the marker value from the previous call to retrieve the next set of results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListPipelinesOutput extends js.Object {
    /**
      * Indicates whether there are more results that can be obtained by a subsequent call.
      */
    var hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The starting point for the next page of results. To view the next page of results, call ListPipelinesOutput again with this marker value. If the value is null, there are no more results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The pipeline identifiers. If you require additional information about the pipelines, you can use these identifiers to call DescribePipelines and GetPipelineDefinition.
      */
    var pipelineIdList: pipelineList
  }
  
  trait Operator extends js.Object {
    /**
      *  The logical operation to be performed: equal (EQ), equal reference (REF_EQ), less than or equal (LE), greater than or equal (GE), or between (BETWEEN). Equal reference (REF_EQ) can be used only with reference fields. The other comparison types can be used only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.   The comparison operators EQ and REF_EQ act on the following fields:   name @sphere parent @componentParent @instanceParent @status @scheduledStartTime @scheduledEndTime @actualStartTime @actualEndTime   The comparison operators GE, LE, and BETWEEN act on the following fields:   @scheduledStartTime @scheduledEndTime @actualStartTime @actualEndTime  Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string "my".
      */
    var `type`: js.UndefOr[OperatorType] = js.undefined
    /**
      * The value that the actual field value will be compared with.
      */
    var values: js.UndefOr[stringList] = js.undefined
  }
  
  trait ParameterAttribute extends js.Object {
    /**
      * The field identifier.
      */
    var key: attributeNameString
    /**
      * The field value, expressed as a String.
      */
    var stringValue: attributeValueString
  }
  
  trait ParameterObject extends js.Object {
    /**
      * The attributes of the parameter object.
      */
    var attributes: ParameterAttributeList
    /**
      * The ID of the parameter object. 
      */
    var id: fieldNameString
  }
  
  trait ParameterValue extends js.Object {
    /**
      * The ID of the parameter value.
      */
    var id: fieldNameString
    /**
      * The field value, expressed as a String.
      */
    var stringValue: fieldStringValue
  }
  
  trait PipelineDescription extends js.Object {
    /**
      * Description of the pipeline.
      */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
      */
    var fields: fieldList
    /**
      * The name of the pipeline.
      */
    var name: id
    /**
      * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
      */
    var pipelineId: id
    /**
      * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
      */
    var tags: js.UndefOr[tagList] = js.undefined
  }
  
  trait PipelineIdName extends js.Object {
    /**
      * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form df-297EG78HU43EEXAMPLE.
      */
    var id: js.UndefOr[id] = js.undefined
    /**
      * The name of the pipeline.
      */
    var name: js.UndefOr[id] = js.undefined
  }
  
  trait PipelineObject extends js.Object {
    /**
      * Key-value pairs that define the properties of the object.
      */
    var fields: fieldList
    /**
      * The ID of the object.
      */
    var id: id
    /**
      * The name of the object.
      */
    var name: id
  }
  
  trait PipelineObjectMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PipelineObject]
  
  trait PollForTaskInput extends js.Object {
    /**
      * The public DNS name of the calling task runner.
      */
    var hostname: js.UndefOr[id] = js.undefined
    /**
      * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the instance using http://169.254.169.254/latest/meta-data/instance-id. For more information, see Instance Metadata in the Amazon Elastic Compute Cloud User Guide. Passing in this value proves that your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
      */
    var instanceIdentity: js.UndefOr[InstanceIdentity] = js.undefined
    /**
      * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup in the call to PollForTask. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
      */
    var workerGroup: java.lang.String
  }
  
  trait PollForTaskOutput extends js.Object {
    /**
      * The information needed to complete the task that is being assigned to the task runner. One of the fields returned in this object is taskId, which contains an identifier for the task being assigned. The calling task runner uses taskId in subsequent calls to ReportTaskProgress and SetTaskStatus.
      */
    var taskObject: js.UndefOr[TaskObject] = js.undefined
  }
  
  trait PutPipelineDefinitionInput extends js.Object {
    /**
      * The parameter objects used with the pipeline.
      */
    var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
    /**
      * The parameter values used with the pipeline.
      */
    var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The objects that define the pipeline. These objects overwrite the existing pipeline definition.
      */
    var pipelineObjects: PipelineObjectList
  }
  
  trait PutPipelineDefinitionOutput extends js.Object {
    /**
      * Indicates whether there were validation errors, and the pipeline definition is stored but cannot be activated until you correct the pipeline and call PutPipelineDefinition to commit the corrected pipeline.
      */
    var errored: scala.Boolean
    /**
      * The validation errors that are associated with the objects defined in pipelineObjects.
      */
    var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
    /**
      * The validation warnings that are associated with the objects defined in pipelineObjects.
      */
    var validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
  }
  
  trait Query extends js.Object {
    /**
      * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
      */
    var selectors: js.UndefOr[SelectorList] = js.undefined
  }
  
  trait QueryObjectsInput extends js.Object {
    /**
      * The maximum number of object names that QueryObjects will return in a single call. The default value is 100. 
      */
    var limit: js.UndefOr[int] = js.undefined
    /**
      * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call QueryObjects with the marker value from the previous call to retrieve the next set of results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The query that defines the objects to be returned. The Query object can contain a maximum of ten selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be applied to components, instances, and attempts.
      */
    var query: js.UndefOr[Query] = js.undefined
    /**
      * Indicates whether the query applies to components or instances. The possible values are: COMPONENT, INSTANCE, and ATTEMPT.
      */
    var sphere: java.lang.String
  }
  
  trait QueryObjectsOutput extends js.Object {
    /**
      * Indicates whether there are more results that can be obtained by a subsequent call.
      */
    var hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The identifiers that match the query selectors.
      */
    var ids: js.UndefOr[idList] = js.undefined
    /**
      * The starting point for the next page of results. To view the next page of results, call QueryObjects again with this marker value. If the value is null, there are no more results.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RemoveTagsInput extends js.Object {
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The keys of the tags to remove.
      */
    var tagKeys: stringList
  }
  
  trait RemoveTagsOutput extends js.Object
  
  trait ReportTaskProgressInput extends js.Object {
    /**
      * Key-value pairs that define the properties of the ReportTaskProgressInput object.
      */
    var fields: js.UndefOr[fieldList] = js.undefined
    /**
      * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
      */
    var taskId: taskId
  }
  
  trait ReportTaskProgressOutput extends js.Object {
    /**
      * If true, the calling task runner should cancel processing of the task. The task runner does not need to call SetTaskStatus for canceled tasks.
      */
    var canceled: scala.Boolean
  }
  
  trait ReportTaskRunnerHeartbeatInput extends js.Object {
    /**
      * The public DNS name of the task runner.
      */
    var hostname: js.UndefOr[id] = js.undefined
    /**
      * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier when it launches the application. If you have written a custom task runner, you should assign a unique identifier for the task runner.
      */
    var taskrunnerId: id
    /**
      * The type of task the task runner is configured to accept and process. The worker group is set as a field on objects in the pipeline when they are created. You can only specify a single value for workerGroup. There are no wildcard values permitted in workerGroup; the string must be an exact, case-sensitive, match.
      */
    var workerGroup: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ReportTaskRunnerHeartbeatOutput extends js.Object {
    /**
      * Indicates whether the calling task runner should terminate.
      */
    var terminate: scala.Boolean
  }
  
  trait Selector extends js.Object {
    /**
      * The name of the field that the operator will be applied to. The field name is the "key" portion of the field definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set on the object, the condition fails.
      */
    var fieldName: js.UndefOr[java.lang.String] = js.undefined
    var operator: js.UndefOr[Operator] = js.undefined
  }
  
  trait SetStatusInput extends js.Object {
    /**
      * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both types.
      */
    var objectIds: idList
    /**
      * The ID of the pipeline that contains the objects.
      */
    var pipelineId: id
    /**
      * The status to be set on all the objects specified in objectIds. For components, use PAUSE or RESUME. For instances, use TRY_CANCEL, RERUN, or MARK_FINISHED.
      */
    var status: java.lang.String
  }
  
  trait SetTaskStatusInput extends js.Object {
    /**
      * If an error occurred during the task, this value specifies the error code. This value is set on the physical attempt object. It is used to display error information to the user. It should not start with string "Service_" which is reserved by the system.
      */
    var errorId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * If an error occurred during the task, this value specifies a text description of the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
      */
    var errorMessage: js.UndefOr[errorMessage] = js.undefined
    /**
      * If an error occurred during the task, this value specifies the stack trace associated with the error. This value is set on the physical attempt object. It is used to display error information to the user. The web service does not parse this value.
      */
    var errorStackTrace: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
      */
    var taskId: taskId
    /**
      * If FINISHED, the task successfully completed. If FAILED, the task ended unsuccessfully. Preconditions use false.
      */
    var taskStatus: TaskStatus
  }
  
  trait SetTaskStatusOutput extends js.Object
  
  trait Tag extends js.Object {
    /**
      * The key name of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
      */
    var key: tagKey
    /**
      * The optional value portion of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
      */
    var value: tagValue
  }
  
  trait TaskObject extends js.Object {
    /**
      * The ID of the pipeline task attempt object. AWS Data Pipeline uses this value to track how many times a task is attempted.
      */
    var attemptId: js.UndefOr[id] = js.undefined
    /**
      * Connection information for the location where the task runner will publish the output of the task.
      */
    var objects: js.UndefOr[PipelineObjectMap] = js.undefined
    /**
      * The ID of the pipeline that provided the task.
      */
    var pipelineId: js.UndefOr[id] = js.undefined
    /**
      * An internal identifier for the task. This ID is passed to the SetTaskStatus and ReportTaskProgress actions.
      */
    var taskId: js.UndefOr[taskId] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
      */
    def activatePipeline(): awsDashSdkLib.libRequestMod.Request[ActivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activatePipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
      */
    def activatePipeline(params: ActivatePipelineInput): awsDashSdkLib.libRequestMod.Request[ActivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def activatePipeline(
      params: ActivatePipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ActivatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ActivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or modifies tags for the specified pipeline.
      */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or modifies tags for the specified pipeline.
      */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
      */
    def createPipeline(): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
      */
    def createPipeline(params: CreatePipelineInput): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPipeline(
      params: CreatePipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
      */
    def deactivatePipeline(): awsDashSdkLib.libRequestMod.Request[DeactivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivatePipeline(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeactivatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeactivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
      */
    def deactivatePipeline(params: DeactivatePipelineInput): awsDashSdkLib.libRequestMod.Request[DeactivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deactivatePipeline(
      params: DeactivatePipelineInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeactivatePipelineOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeactivatePipelineOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances associated with the pipeline that are currently being processed by task runners. Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a pipeline instead of deleting it, call SetStatus with the status set to PAUSE on individual components. Components that are paused by SetStatus can be resumed.
      */
    def deletePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a pipeline, its pipeline definition, and its run history. AWS Data Pipeline attempts to cancel instances associated with the pipeline that are currently being processed by task runners. Deleting a pipeline cannot be undone. You cannot query or restore a deleted pipeline. To temporarily pause a pipeline instead of deleting it, call SetStatus with the status set to PAUSE on individual components. Components that are paused by SetStatus can be resumed.
      */
    def deletePipeline(params: DeletePipelineInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePipeline(
      params: DeletePipelineInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
      */
    def describeObjects(): awsDashSdkLib.libRequestMod.Request[DescribeObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeObjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
      */
    def describeObjects(params: DescribeObjectsInput): awsDashSdkLib.libRequestMod.Request[DescribeObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeObjects(
      params: DescribeObjectsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
      */
    def describePipelines(): awsDashSdkLib.libRequestMod.Request[DescribePipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePipelines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
      */
    def describePipelines(params: DescribePipelinesInput): awsDashSdkLib.libRequestMod.Request[DescribePipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePipelines(
      params: DescribePipelinesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
      */
    def evaluateExpression(): awsDashSdkLib.libRequestMod.Request[EvaluateExpressionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def evaluateExpression(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EvaluateExpressionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EvaluateExpressionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
      */
    def evaluateExpression(params: EvaluateExpressionInput): awsDashSdkLib.libRequestMod.Request[EvaluateExpressionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def evaluateExpression(
      params: EvaluateExpressionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EvaluateExpressionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EvaluateExpressionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
      */
    def getPipelineDefinition(): awsDashSdkLib.libRequestMod.Request[GetPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
      */
    def getPipelineDefinition(params: GetPipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[GetPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPipelineDefinition(
      params: GetPipelineDefinitionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the pipeline identifiers for all active pipelines that you have permission to access.
      */
    def listPipelines(): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the pipeline identifiers for all active pipelines that you have permission to access.
      */
    def listPipelines(params: ListPipelinesInput): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPipelines(
      params: ListPipelinesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPipelinesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPipelinesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
      */
    def pollForTask(): awsDashSdkLib.libRequestMod.Request[PollForTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
      */
    def pollForTask(params: PollForTaskInput): awsDashSdkLib.libRequestMod.Request[PollForTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def pollForTask(
      params: PollForTaskInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PollForTaskOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PollForTaskOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
      */
    def putPipelineDefinition(): awsDashSdkLib.libRequestMod.Request[PutPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPipelineDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
      */
    def putPipelineDefinition(params: PutPipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[PutPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPipelineDefinition(
      params: PutPipelineDefinitionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Queries the specified pipeline for the names of objects that match the specified set of conditions.
      */
    def queryObjects(): awsDashSdkLib.libRequestMod.Request[QueryObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def queryObjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ QueryObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[QueryObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Queries the specified pipeline for the names of objects that match the specified set of conditions.
      */
    def queryObjects(params: QueryObjectsInput): awsDashSdkLib.libRequestMod.Request[QueryObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def queryObjects(
      params: QueryObjectsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ QueryObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[QueryObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes existing tags from the specified pipeline.
      */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes existing tags from the specified pipeline.
      */
    def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      params: RemoveTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
      */
    def reportTaskProgress(): awsDashSdkLib.libRequestMod.Request[ReportTaskProgressOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reportTaskProgress(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReportTaskProgressOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReportTaskProgressOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
      */
    def reportTaskProgress(params: ReportTaskProgressInput): awsDashSdkLib.libRequestMod.Request[ReportTaskProgressOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reportTaskProgress(
      params: ReportTaskProgressInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReportTaskProgressOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReportTaskProgressOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
      */
    def reportTaskRunnerHeartbeat(): awsDashSdkLib.libRequestMod.Request[ReportTaskRunnerHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reportTaskRunnerHeartbeat(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReportTaskRunnerHeartbeatOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReportTaskRunnerHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
      */
    def reportTaskRunnerHeartbeat(params: ReportTaskRunnerHeartbeatInput): awsDashSdkLib.libRequestMod.Request[ReportTaskRunnerHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reportTaskRunnerHeartbeat(
      params: ReportTaskRunnerHeartbeatInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReportTaskRunnerHeartbeatOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReportTaskRunnerHeartbeatOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests that the status of the specified physical or logical pipeline objects be updated in the specified pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on FINISHED pipelines and attempting to do so returns InvalidRequestException.
      */
    def setStatus(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setStatus(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests that the status of the specified physical or logical pipeline objects be updated in the specified pipeline. This update might not occur immediately, but is eventually consistent. The status that can be set depends on the type of object (for example, DataNode or Activity). You cannot perform this operation on FINISHED pipelines and attempting to do so returns InvalidRequestException.
      */
    def setStatus(params: SetStatusInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setStatus(
      params: SetStatusInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
      */
    def setTaskStatus(): awsDashSdkLib.libRequestMod.Request[SetTaskStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setTaskStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetTaskStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetTaskStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
      */
    def setTaskStatus(params: SetTaskStatusInput): awsDashSdkLib.libRequestMod.Request[SetTaskStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setTaskStatus(
      params: SetTaskStatusInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SetTaskStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SetTaskStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
      */
    def validatePipelineDefinition(): awsDashSdkLib.libRequestMod.Request[ValidatePipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validatePipelineDefinition(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidatePipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidatePipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
      */
    def validatePipelineDefinition(params: ValidatePipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[ValidatePipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validatePipelineDefinition(
      params: ValidatePipelineDefinitionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidatePipelineDefinitionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidatePipelineDefinitionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait ValidatePipelineDefinitionInput extends js.Object {
    /**
      * The parameter objects used with the pipeline.
      */
    var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
    /**
      * The parameter values used with the pipeline.
      */
    var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
    /**
      * The ID of the pipeline.
      */
    var pipelineId: id
    /**
      * The objects that define the pipeline changes to validate against the pipeline.
      */
    var pipelineObjects: PipelineObjectList
  }
  
  trait ValidatePipelineDefinitionOutput extends js.Object {
    /**
      * Indicates whether there were validation errors.
      */
    var errored: scala.Boolean
    /**
      * Any validation errors that were found.
      */
    var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
    /**
      * Any validation warnings that were found.
      */
    var validationWarnings: js.UndefOr[ValidationWarnings] = js.undefined
  }
  
  trait ValidationError extends js.Object {
    /**
      * A description of the validation error.
      */
    var errors: js.UndefOr[validationMessages] = js.undefined
    /**
      * The identifier of the object that contains the validation error.
      */
    var id: js.UndefOr[id] = js.undefined
  }
  
  trait ValidationWarning extends js.Object {
    /**
      * The identifier of the object that contains the validation warning.
      */
    var id: js.UndefOr[id] = js.undefined
    /**
      * A description of the validation warning.
      */
    var warnings: js.UndefOr[validationMessages] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type OperatorType = awsDashSdkLib.awsDashSdkLibStrings.EQ | awsDashSdkLib.awsDashSdkLibStrings.REF_EQ | awsDashSdkLib.awsDashSdkLibStrings.LE | awsDashSdkLib.awsDashSdkLibStrings.GE | awsDashSdkLib.awsDashSdkLibStrings.BETWEEN | java.lang.String
  type ParameterAttributeList = js.Array[ParameterAttribute]
  type ParameterObjectList = js.Array[ParameterObject]
  type ParameterValueList = js.Array[ParameterValue]
  type PipelineDescriptionList = js.Array[PipelineDescription]
  type PipelineObjectList = js.Array[PipelineObject]
  type SelectorList = js.Array[Selector]
  type TaskStatus = awsDashSdkLib.awsDashSdkLibStrings.FINISHED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.FALSE | java.lang.String
  type ValidationErrors = js.Array[ValidationError]
  type ValidationWarnings = js.Array[ValidationWarning]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2012-10-29` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type attributeNameString = java.lang.String
  type attributeValueString = java.lang.String
  type cancelActive = scala.Boolean
  type errorMessage = java.lang.String
  type fieldList = js.Array[Field]
  type fieldNameString = java.lang.String
  type fieldStringValue = java.lang.String
  type id = java.lang.String
  type idList = js.Array[id]
  type int = scala.Double
  type longString = java.lang.String
  type pipelineList = js.Array[PipelineIdName]
  type stringList = js.Array[java.lang.String]
  type tagKey = java.lang.String
  type tagList = js.Array[Tag]
  type tagValue = java.lang.String
  type taskId = java.lang.String
  type timestamp = stdLib.Date
  type validationMessage = java.lang.String
  type validationMessages = js.Array[validationMessage]
}

