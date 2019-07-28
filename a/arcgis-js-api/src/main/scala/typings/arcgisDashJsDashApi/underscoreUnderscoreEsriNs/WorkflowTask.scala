package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTask extends Task {
  /**
    * Get the information which indicates whether this workflow step can be run.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#canRunStep)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    * @param params.user The user name of the user wanting to run the step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def canRunStep(params: WorkflowTaskCanRunStepParams): IPromise[String] = js.native
  def canRunStep(params: WorkflowTaskCanRunStepParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Executes the specified steps in order and gets back [execution information](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo) of the steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepIds The array of unique step Ids.
    * @param params.auto Indicates whether to automatically execute as many steps as possible, based on the workflow configuration. The default is false, to execute only the current step.
    * @param params.user The user name of the user executing the step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeSteps(params: WorkflowTaskExecuteStepsParams): IPromise[ExecuteInfo] = js.native
  def executeSteps(params: WorkflowTaskExecuteStepsParams, requestOptions: js.Any): IPromise[ExecuteInfo] = js.native
  /**
    * Gets all workflow [steps](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step) of a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getAllSteps)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAllSteps(jobId: Double): IPromise[Step] = js.native
  def getAllSteps(jobId: Double, requestOptions: js.Any): IPromise[Step] = js.native
  /**
    * Gets all current [steps](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step) of a job. A workflow will have more than one current step if it is configured to support parallel steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getCurrentSteps)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getCurrentSteps(jobId: Double): IPromise[Step] = js.native
  def getCurrentSteps(jobId: Double, requestOptions: js.Any): IPromise[Step] = js.native
  /**
    * Gets a specific workflow [step](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step) of a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStep)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getStep(params: WorkflowTaskGetStepParams): IPromise[Step] = js.native
  def getStep(params: WorkflowTaskGetStepParams, requestOptions: js.Any): IPromise[Step] = js.native
  /**
    * Get the help associated with a workflow step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStepDescription)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getStepDescription(params: WorkflowTaskGetStepDescriptionParams): IPromise[String] = js.native
  def getStepDescription(params: WorkflowTaskGetStepDescriptionParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Gets a URL to access the file content of a file step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStepFileUrl)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    *
    */
  def getStepFileUrl(params: WorkflowTaskGetStepFileUrlParams): String = js.native
  /**
    * Get a job's [workflow display details](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowDisplayDetails).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getWorkflowDisplayDetails)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getWorkflowDisplayDetails(jobId: Double): IPromise[WorkflowDisplayDetails] = js.native
  def getWorkflowDisplayDetails(jobId: Double, requestOptions: js.Any): IPromise[WorkflowDisplayDetails] = js.native
  /**
    * Gets a URL of an image depicting the current state of a job's workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getWorkflowImageUrl)
    *
    * @param jobId The unique id of the job.
    *
    */
  def getWorkflowImageUrl(jobId: Double): String = js.native
  /**
    * Marks the specified steps of a job workflow as completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepIds The array of unique step Ids.
    * @param params.user The user name of the user marking the step complete.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def markStepsAsDone(params: WorkflowTaskMarkStepsAsDoneParams): IPromise[ExecuteInfo] = js.native
  def markStepsAsDone(params: WorkflowTaskMarkStepsAsDoneParams, requestOptions: js.Any): IPromise[ExecuteInfo] = js.native
  /**
    * Advances the workflow to the next step based on a return code value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job Id.
    * @param params.stepId The unique id of the step.
    * @param params.returnCode A numeric value representing the return code.
    * @param params.user The user name of the user advancing the workflow to the next step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def moveToNextStep(params: WorkflowTaskMoveToNextStepParams): IPromise[Boolean] = js.native
  def moveToNextStep(params: WorkflowTaskMoveToNextStepParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * The job workflow is updated with the latest workflow of job type, after the job has been created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#recreateWorkflow)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.user The user name of the user recreating the workflow.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def recreateWorkflow(params: WorkflowTaskRecreateWorkflowParams): IPromise[Boolean] = js.native
  def recreateWorkflow(params: WorkflowTaskRecreateWorkflowParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Resolves workflow path conflicts resulting from executing or marking as complete a step, which can have two or more next steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    * @param params.optionReturnCode A numeric value representing the return code from the step where the conflict was encountered.
    * @param params.optionStepIds An array of unique step IDs of all the possible next steps.
    * @param params.user The user name of the user resolving the conflict.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def resolveConflict(params: WorkflowTaskResolveConflictParams): IPromise[Boolean] = js.native
  def resolveConflict(params: WorkflowTaskResolveConflictParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Sets a step as the current active step of a job workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#setCurrentStep)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.stepId The unique id of the step.
    * @param params.user The user name of the user setting the current step.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def setCurrentStep(params: WorkflowTaskSetCurrentStepParams): IPromise[Boolean] = js.native
  def setCurrentStep(params: WorkflowTaskSetCurrentStepParams, requestOptions: js.Any): IPromise[Boolean] = js.native
}

@JSGlobal("__esri.WorkflowTask")
@js.native
/**
  * Class to perform operations on Workflow Manager workflows and steps. The workflows are collections of steps that are executed while working on a job. Workflows are designed to organize and simplify tasks to ensure that no step is missed. The steps are the building blocks of your workflows and are connected using paths. Step and path properties determine the flow of the work.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html)
  */
class WorkflowTaskCls () extends WorkflowTask {
  def this(properties: WorkflowTaskProperties) = this()
}

