package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTask extends Task {
  /**
    * Uploads a file and attaches it to the job as an embedded attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addEmbeddedAttachment)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.form The form element that contains the file input control. The form parameter can be an instance of FormData. Using FormData you can send a "multipart/form-data" request to the server without having to create an HTML form element in markup. Note that the FormData api is not available in all browsers.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def addEmbeddedAttachment(params: JobTaskAddEmbeddedAttachmentParams): IPromise[String] = js.native
  def addEmbeddedAttachment(params: JobTaskAddEmbeddedAttachmentParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Adds a linked attachment to a job (url or file).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.attachmentType The type of attachment to be added.  **Possible Values:** linked-file | url
    * @param params.path The file path to the attachment.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def addLinkedAttachment(params: JobTaskAddLinkedAttachmentParams): IPromise[String] = js.native
  def addLinkedAttachment(params: JobTaskAddLinkedAttachmentParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Adds a linked property record to a job's linked properties table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedRecord)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.tableName The name of the table to which the record will be added.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def addLinkedRecord(params: JobTaskAddLinkedRecordParams): IPromise[String] = js.native
  def addLinkedRecord(params: JobTaskAddLinkedRecordParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Assigns one or more jobs to a user or group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#assignJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobIds An array of unique job Ids.
    * @param params.assignedType Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    * @param params.assignedTo The name of the user or group to whom the job will be assigned.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def assignJobs(params: JobTaskAssignJobsParams): IPromise[Boolean] = js.native
  def assignJobs(params: JobTaskAssignJobsParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Closes one or more jobs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#closeJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobIds An array of unique job Ids.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def closeJobs(params: JobTaskCloseJobsParams): IPromise[Boolean] = js.native
  def closeJobs(params: JobTaskCloseJobsParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Creates a job dependency.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.heldOnType Indicates whether the current job (to which the dependency is being added) will be held at a step, stage or status.  **Possible Values:** step | stage | status
    * @param params.heldOnValue The value of the step, stage or status at which the current job will be held.
    * @param params.depJobId The unique id of the job on which the current job will depend.
    * @param params.depOnType Indicates whether the current job (to which the dependency is being added) will be dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    * @param params.depOnValue The value of the step or status of the other job on which the current job will be dependent.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def createDependency(params: JobTaskCreateDependencyParams): IPromise[String] = js.native
  def createDependency(params: JobTaskCreateDependencyParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Creates a job hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.holdTypeId The unique id representing the hold type to be placed on the job.
    * @param params.comments Reason or more detailed information regarding why the hold is being added.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def createHold(params: JobTaskCreateHoldParams): IPromise[String] = js.native
  def createHold(params: JobTaskCreateHoldParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Creates a version specific to the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobVersion)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.name The name of the version to be created.
    * @param params.parent The name of the job's assigned geodatabase (data workspace) version, based on which the new version will be created.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def createJobVersion(params: JobTaskCreateJobVersionParams): IPromise[String] = js.native
  def createJobVersion(params: JobTaskCreateJobVersionParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Creates new jobs based on the provided parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobs)
    *
    * @param params The parameters to be used for job creation, parameters defined in the job type can be overwritten. The jobTypeId and user are required parameters when creating a job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def createJobs(params: JobCreationParameters): IPromise[js.Array[String]] = js.native
  def createJobs(params: JobCreationParameters, requestOptions: js.Any): IPromise[js.Array[String]] = js.native
  /**
    * Deletes an attachment from a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteAttachment)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.attachmentId The unique id of the attachment to be deleted.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def deleteAttachment(params: JobTaskDeleteAttachmentParams): IPromise[Boolean] = js.native
  def deleteAttachment(params: JobTaskDeleteAttachmentParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Deletes a job dependency.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.dependencyId The unique id of the dependency to be deleted.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def deleteDependency(params: JobTaskDeleteDependencyParams): IPromise[Boolean] = js.native
  def deleteDependency(params: JobTaskDeleteDependencyParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Delete one or more jobs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobIds An array of unique job Ids.
    * @param params.deleteHistory Indicates whether or not to delete the associated job history, the default is to delete job history.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def deleteJobs(params: JobTaskDeleteJobsParams): IPromise[Boolean] = js.native
  def deleteJobs(params: JobTaskDeleteJobsParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Deletes a record from a job's linked properties table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.tableName The name of the table from which linked record will be deleted.
    * @param params.recordId The unique id of the record in the table.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def deleteLinkedRecord(params: JobTaskDeleteLinkedRecordParams): IPromise[Boolean] = js.native
  def deleteLinkedRecord(params: JobTaskDeleteLinkedRecordParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Gets the activity log for a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getActivityLog)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getActivityLog(jobId: Double): IPromise[js.Array[_]] = js.native
  def getActivityLog(jobId: Double, requestOptions: js.Any): IPromise[js.Array[_]] = js.native
  /**
    * Gets the URL to access the file content of an embedded job attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getAttachmentContentUrl)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.attachmentId The Id of the attachment to be retrieved.
    *
    */
  def getAttachmentContentUrl(params: JobTaskGetAttachmentContentUrlParams): String = js.native
  /**
    * Gets all the attachments associated with the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getAttachments)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAttachments(jobId: Double): IPromise[JobAttachment] = js.native
  def getAttachments(jobId: Double, requestOptions: js.Any): IPromise[JobAttachment] = js.native
  /**
    * Gets an array of dependencies configured for a job. A job with a dependency is held at a step, stage or status of the other job, and cannot progress until the other job reaches the step, stage or status defined in the dependency. Once the other job reaches step, stage or status as defined in the dependency criteria the dependency is released and the dependent job can progress.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getDependencies)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getDependencies(jobId: Double): IPromise[JobDependency] = js.native
  def getDependencies(jobId: Double, requestOptions: js.Any): IPromise[JobDependency] = js.native
  /**
    * Gets an array of [extended properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer) for a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getExtendedProperties)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getExtendedProperties(jobId: Double): IPromise[AuxRecordContainer] = js.native
  def getExtendedProperties(jobId: Double, requestOptions: js.Any): IPromise[AuxRecordContainer] = js.native
  /**
    * Gets an array of holds on a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getHolds)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getHolds(jobId: Double): IPromise[js.Array[_]] = js.native
  def getHolds(jobId: Double, requestOptions: js.Any): IPromise[js.Array[_]] = js.native
  /**
    * Gets the [job](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo) object based on the given id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getJob)
    *
    * @param jobId The unique id of the job to be retrieved.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getJob(jobId: Double): IPromise[JobTaskJobInfo] = js.native
  def getJob(jobId: Double, requestOptions: js.Any): IPromise[JobTaskJobInfo] = js.native
  /**
    * Gets all the job ids in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getJobIds)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getJobIds(): IPromise[js.Array[String]] = js.native
  def getJobIds(requestOptions: js.Any): IPromise[js.Array[String]] = js.native
  /**
    * Gets the notes for a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getNotes)
    *
    * @param jobId The unique id of the job.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getNotes(jobId: Double): IPromise[String] = js.native
  def getNotes(jobId: Double, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Gets an array of [values and descriptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#FieldValue) for a geodatabase domain or table list extended property field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listFieldValues)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.tableName The name of the extended property table.
    * @param params.field The field name of the extended property for which to retrieve values.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def listFieldValues(params: JobTaskListFieldValuesParams): IPromise[FieldValue] = js.native
  def listFieldValues(params: JobTaskListFieldValuesParams, requestOptions: js.Any): IPromise[FieldValue] = js.native
  /**
    * Gets an array of [display values](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#FieldValue) for a given fields that comprise a multi-level table list extended property. As each display field is selected, for example using a dropdown UI control, this method can be called to obtain a list of values to display in the subsequent dropdown control.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.field The name of the field.
    * @param params.previousSelectedValues The array of previous values, on which the current value is dependent on. For example, when selecting a city based on the state and county. The value for the state and county would be the previous values.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def listMultiLevelFieldValues(params: JobTaskListMultiLevelFieldValuesParams): IPromise[FieldValue] = js.native
  def listMultiLevelFieldValues(params: JobTaskListMultiLevelFieldValuesParams, requestOptions: js.Any): IPromise[FieldValue] = js.native
  /**
    * Logs an action in a job's activity log.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.activityTypeId The unique id representing the [activity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType) of the action associated with this log record.
    * @param params.comments The comment that is added to the history.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def logAction(params: JobTaskLogActionParams): IPromise[Boolean] = js.native
  def logAction(params: JobTaskLogActionParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Queries the jobs using the queryId of an existing query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.queryId The unique id of a query, used to query jobs in the database.
    * @param params.user The username of the user who is requesting query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def queryJobs(params: JobTaskQueryJobsParams): IPromise[QueryResult] = js.native
  def queryJobs(params: JobTaskQueryJobsParams, requestOptions: js.Any): IPromise[QueryResult] = js.native
  /**
    * Queries the jobs using an ad-hoc query definition and gets the [query result](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryResult).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobsAdHoc)
    *
    * @param params The [parameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobQueryParameters) to query jobs.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def queryJobsAdHoc(params: JobQueryParameters): IPromise[QueryResult] = js.native
  def queryJobsAdHoc(params: JobQueryParameters, requestOptions: js.Any): IPromise[QueryResult] = js.native
  /**
    * Gets an array of string values representing the current display values for each display field in a multi-level table list extended property. The values from this method should be used to pre-select items in dropdown lists when initially displaying the extended properties of a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryMultiLevelSelectedValues)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.field The name of the field.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def queryMultiLevelSelectedValues(params: JobTaskQueryMultiLevelSelectedValuesParams): IPromise[js.Array[String]] = js.native
  def queryMultiLevelSelectedValues(params: JobTaskQueryMultiLevelSelectedValuesParams, requestOptions: js.Any): IPromise[js.Array[String]] = js.native
  /**
    * Releases a job hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#releaseHold)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.holdId The unique id of the hold.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def releaseHold(params: JobTaskReleaseHoldParams): IPromise[Boolean] = js.native
  def releaseHold(params: JobTaskReleaseHoldParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Reopens one or more closed jobs. Supported from 10.3 onwards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#reopenClosedJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobIds An array of unique job Ids.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def reopenClosedJobs(params: JobTaskReopenClosedJobsParams): IPromise[Boolean] = js.native
  def reopenClosedJobs(params: JobTaskReopenClosedJobsParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Performs a freeform text search and returns a set of matching job records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#searchJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.text The text which will be used to perform the search.
    * @param params.user The username of the user who is requesting search.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def searchJobs(params: JobTaskSearchJobsParams): IPromise[QueryResult] = js.native
  def searchJobs(params: JobTaskSearchJobsParams, requestOptions: js.Any): IPromise[QueryResult] = js.native
  /**
    * Unassigns one or more jobs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#unassignJobs)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobIds An array of unique job Ids.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def unassignJobs(params: JobTaskUnassignJobsParams): IPromise[Boolean] = js.native
  def unassignJobs(params: JobTaskUnassignJobsParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Update a job's properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#updateJob)
    *
    * @param params The [parameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters) to be used for job properties update, the jobId and the user are required when updating jobs.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def updateJob(params: JobUpdateParameters): IPromise[Boolean] = js.native
  def updateJob(params: JobUpdateParameters, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Updates the notes for a job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#updateNotes)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.notes The new notes for the job. Set to an empty (zero-length) string to clear the job notes.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def updateNotes(params: JobTaskUpdateNotesParams): IPromise[Boolean] = js.native
  def updateNotes(params: JobTaskUpdateNotesParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Updates the values of an extended or linked properties record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#updateRecord)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.record The record to be updated.
    * @param params.user The user name of the user who is requesting the change.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def updateRecord(params: JobTaskUpdateRecordParams): IPromise[Boolean] = js.native
  def updateRecord(params: JobTaskUpdateRecordParams, requestOptions: js.Any): IPromise[Boolean] = js.native
}

@JSGlobal("__esri.JobTask")
@js.native
/**
  * Helps you work with Workflow Manager jobs. A job is a single unit of work that is carried out within an organization. Various methods are available in the class to work with the following:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html)
  */
class JobTaskCls () extends JobTask {
  def this(properties: JobTaskProperties) = this()
}

