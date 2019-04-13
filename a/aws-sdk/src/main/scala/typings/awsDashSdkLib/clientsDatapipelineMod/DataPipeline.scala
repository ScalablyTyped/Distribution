package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPipeline
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DataPipeline: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

