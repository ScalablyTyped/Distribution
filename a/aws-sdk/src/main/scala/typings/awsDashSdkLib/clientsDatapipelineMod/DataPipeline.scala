package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPipeline
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DataPipeline: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ClientConfiguration = js.native
  /**
    * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
    */
  def activatePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def activatePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates the specified pipeline and starts processing pipeline tasks. If the pipeline does not pass validation, activation fails. If you need to pause the pipeline to investigate an issue with a component, such as a data source or script, call DeactivatePipeline. To activate a finished pipeline, modify the end date for the pipeline and then activate it.
    */
  def activatePipeline(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def activatePipeline(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ActivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or modifies tags for the specified pipeline.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or modifies tags for the specified pipeline.
    */
  def addTags(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new, empty pipeline. Use PutPipelineDefinition to populate the pipeline.
    */
  def createPipeline(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.CreatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
    */
  def deactivatePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deactivatePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deactivates the specified running pipeline. The pipeline is set to the DEACTIVATING state until the deactivation process completes. To resume a deactivated pipeline, use ActivatePipeline. By default, the pipeline resumes from the last completed execution. Optionally, you can specify the date and time to resume the pipeline.
    */
  def deactivatePipeline(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deactivatePipeline(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeactivatePipelineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deletePipeline(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeletePipelineInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DeletePipelineInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
    */
  def describeObjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the object definitions for a set of objects associated with the pipeline. Object definitions are composed of a set of fields that define the properties of the object.
    */
  def describeObjects(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeObjects(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribeObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
    */
  def describePipelines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata about one or more pipelines. The information retrieved includes the name of the pipeline, the pipeline identifier, its current state, and the user account that owns the pipeline. Using account credentials, you can retrieve metadata about pipelines that you or your IAM users have created. If you are using an IAM user account, you can retrieve metadata about only those pipelines for which you have read permissions. To retrieve the full pipeline definition instead of metadata about the pipeline, call GetPipelineDefinition.
    */
  def describePipelines(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePipelines(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.DescribePipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
    */
  def evaluateExpression(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def evaluateExpression(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call EvaluateExpression to evaluate a string in the context of the specified object. For example, a task runner can evaluate SQL queries stored in Amazon S3.
    */
  def evaluateExpression(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def evaluateExpression(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.EvaluateExpressionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
    */
  def getPipelineDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the definition of the specified pipeline. You can call GetPipelineDefinition to retrieve the pipeline definition that you provided using PutPipelineDefinition.
    */
  def getPipelineDefinition(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPipelineDefinition(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.GetPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the pipeline identifiers for all active pipelines that you have permission to access.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the pipeline identifiers for all active pipelines that you have permission to access.
    */
  def listPipelines(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ListPipelinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
    */
  def pollForTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call PollForTask to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a value for the workerGroup parameter. The task returned can come from any of the pipelines that match the workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner. If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses long-polling and holds on to a poll connection for up to a 90 seconds, during which time the first newly scheduled task is handed to the task runner. To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same workerGroup until it receives a response, and this can take up to 90 seconds. 
    */
  def pollForTask(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def pollForTask(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PollForTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
    */
  def putPipelineDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPipelineDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tasks, schedules, and preconditions to the specified pipeline. You can use PutPipelineDefinition to populate a new pipeline.  PutPipelineDefinition also validates the configuration as it adds it to the pipeline. Changes to the pipeline are saved unless one of the following three validation errors exists in the pipeline.   An object is missing a name or identifier field. A string or reference field is empty. The number of objects in the pipeline exceeds the maximum allowed objects. The pipeline is in a FINISHED state.   Pipeline object definitions are passed to the PutPipelineDefinition action and returned by the GetPipelineDefinition action. 
    */
  def putPipelineDefinition(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putPipelineDefinition(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.PutPipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Queries the specified pipeline for the names of objects that match the specified set of conditions.
    */
  def queryObjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def queryObjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Queries the specified pipeline for the names of objects that match the specified set of conditions.
    */
  def queryObjects(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def queryObjects(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.QueryObjectsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes existing tags from the specified pipeline.
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes existing tags from the specified pipeline.
    */
  def removeTags(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
    */
  def reportTaskProgress(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reportTaskProgress(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call ReportTaskProgress when assigned a task to acknowledge that it has the task. If the web service does not receive this acknowledgement within 2 minutes, it assigns the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a reportProgressTimeout field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline assumes that the task runner is unable to process the task and reassigns the task in a subsequent response to PollForTask. Task runners should call ReportTaskProgress every 60 seconds.
    */
  def reportTaskProgress(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reportTaskProgress(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskProgressOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
    */
  def reportTaskRunnerHeartbeat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reportTaskRunnerHeartbeat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. If the AWS Data Pipeline Task Runner is launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and restart a new instance.
    */
  def reportTaskRunnerHeartbeat(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reportTaskRunnerHeartbeat(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ReportTaskRunnerHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def setStatus(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetStatusInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setStatus(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetStatusInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
    */
  def setTaskStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setTaskStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Task runners call SetTaskStatus to notify AWS Data Pipeline that a task is completed and provide information about the final status. A task runner makes this call regardless of whether the task was sucessful. A task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to ReportTaskProgress.
    */
  def setTaskStatus(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setTaskStatus(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.SetTaskStatusOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
    */
  def validatePipelineDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validatePipelineDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates the specified pipeline definition to ensure that it is well formed and can be run without error.
    */
  def validatePipelineDefinition(params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validatePipelineDefinition(
    params: awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDatapipelineMod.DataPipelineNs.ValidatePipelineDefinitionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

