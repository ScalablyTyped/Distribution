package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.asana.anon.CreateParamsworkspacestriApprovalstatus
import typings.asana.anon.Data
import typings.asana.anon.Project
import typings.asana.anon.User
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Stories.Type
import typings.asana.mod.resources.Tasks.AddProjectParams
import typings.asana.mod.resources.Tasks.CommentParams
import typings.asana.mod.resources.Tasks.CreateParams
import typings.asana.mod.resources.Tasks.FindAllParams
import typings.asana.mod.resources.Tasks.FollowersParams
import typings.asana.mod.resources.Tasks.RemoveProjectParams
import typings.asana.mod.resources.Tasks.TagParams
import typings.asana.mod.resources.Tasks.UpdateParams
import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The _task_ is the basic object around which many operations in Asana are
  * centered. In the Asana application, multiple tasks populate the middle pane
  * according to some view parameters, and the set of selected tasks determines
  * the more detailed information presented in the details pane.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Tasks
  extends StObject
     with TopLevelResource {
  
  /**
    * * Adds a comment to a task. The comment will be authored by the
    * * currently authenticated user, and timestamped when the server receives
    * * the request.
    * *
    * * Returns the full record for the new story added to the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.text The plain text of the comment to add.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addComment(task: String, data: CommentParams): ^[Type] = js.native
  def addComment(task: String, data: CommentParams, dispatchOptions: Any): ^[Type] = js.native
  def addComment(task: Double, data: CommentParams): ^[Type] = js.native
  def addComment(task: Double, data: CommentParams, dispatchOptions: Any): ^[Type] = js.native
  
  /**
    * * Adds each of the specified followers to the task, if they are not already
    * * following. Returns the complete, updated record for the affected task.
    *   * @param {String|Number} task The task to add followers to.
    *   * @param {Object} data Data for the request
    *   * @param {Array} data.followers An array of followers to add to the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addFollowers(task: String, data: FollowersParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: String, data: FollowersParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Adds the task to the specified project, in the optional location
    * * specified. If no location arguments are given, the task will be added to
    * * the beginning of the project.
    * *
    * * `addProject` can also be used to reorder a task within a project that
    * * already contains it.
    * *
    * * Returns an empty data block.
    *   * @param {String|Number} task The task to add to a project.
    *   * @param {Object} data Data for the request
    *   * @param {Number} data.project The project to add the task to.
    *   * @param {Number} [data.insertAfter] A task in the project to insert the task after, or `null` to
    *   * insert at the beginning of the list.
    *   * @param {Number} [data.insertBefore] A task in the project to insert the task before, or `null` to
    *   * insert at the end of the list.
    *   * @param {Number} [data.section] A section in the project to insert the task into. The task will be
    *   * inserted at the top of the section.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addProject(task: String, data: AddProjectParams): ^[js.Object] = js.native
  def addProject(task: String, data: AddProjectParams, dispatchOptions: Any): ^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams): ^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams, dispatchOptions: Any): ^[js.Object] = js.native
  
  /**
    * * Creates a new subtask and adds it to the parent task. Returns the full record
    * * for the newly created subtask.
    *   * @param {String|Number} task The task to add a subtask to.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addSubtask(task: String, data: CreateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: String, data: CreateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Adds a tag to a task. Returns an empty data block.
    *   * @param {String|Number} task The task to add a tag to.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.tag The tag to add to the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addTag(task: String, data: TagParams): ^[js.Object] = js.native
  def addTag(task: String, data: TagParams, dispatchOptions: Any): ^[js.Object] = js.native
  def addTag(task: Double, data: TagParams): ^[js.Object] = js.native
  def addTag(task: Double, data: TagParams, dispatchOptions: Any): ^[js.Object] = js.native
  
  /**
    * * Creating a new task is as easy as POSTing to the `/tasks` endpoint
    * * with a data block containing the fields you'd like to set on the task.
    * * Any unspecified fields will take on default values.
    * *
    * * Every task is required to be created in a specific workspace, and this
    * * workspace cannot be changed once set. The workspace need not be set
    * * explicitly if you specify a `project` or a `parent` task instead.
    *   * @param {Object} data Data for the request
    *   * @param {Number} [data.workspace] The workspace to create a task in.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(data: CreateParamsworkspacestriApprovalstatus): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def create(data: CreateParamsworkspacestriApprovalstatus, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  def createInWorkspace(workspace: String, data: CreateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: String, data: CreateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  /**
    * * Creating a new task is as easy as POSTing to the `/tasks` endpoint
    * * with a data block containing the fields you'd like to set on the task.
    * * Any unspecified fields will take on default values.
    * *
    * * Every task is required to be created in a specific workspace, and this
    * * workspace cannot be changed once set. The workspace need not be set
    * * explicitly if you specify a `project` or a `parent` task instead.
    *   * @param {String|Number} workspace The workspace to create a task in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: Double, data: CreateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * A specific, existing task can be deleted by making a DELETE request on the
    * * URL for that task. Deleted tasks go into the "trash" of the user making
    * * the delete request. Tasks can be recovered from the trash within a period
    * * of 30 days; afterward they are completely removed from the system.
    * *
    * * Returns an empty data record.
    *   * @param {String|Number} task The task to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param dispatchOptions?
    * @return
    */
  def delete(task: String): ^[Unit] = js.native
  def delete(task: String, dispatchOptions: Any): ^[Unit] = js.native
  def delete(task: Double): ^[Unit] = js.native
  def delete(task: Double, dispatchOptions: Any): ^[Unit] = js.native
  
  /**
    * * Returns the compact task records for some filtered set of tasks. Use one
    * * or more of the parameters provided to filter the tasks returned.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Number} [params.assignee] The assignee to filter tasks on.
    *   * @param {Number} [params.workspace] The workspace or organization to filter tasks on.
    *   * @param {Number} [params.completed_since] Only return tasks that are either incomplete or that have been
    *   * completed since this time.
    *   * @param {Number} [params.modified_since] Only return tasks that have been modified since the given time.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns the complete task record for a single task.
    *   * @param {String|Number} task The task to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(task: String): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Returns the compact task records for all tasks within the given project,
    * * ordered by their priority within the project.
    *   * @param {String|Number} projectId The project in which to search for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param projectId
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByProject(projectId: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns the compact task records for all tasks with the given tag.
    *   * @param {String|Number} tag The tag in which to search for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTag(tag: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  // https://github.com/Asana/node-asana/blob/6bf00fb3257847744bf0ebe2dc0e95c445477282/lib/resources/gen/tasks.js#L245-L262
  /**
    * Get a task
    * @param {String} taskGid: (required) The task to operate on.
    * @param {Object} params: Parameters for the request
    *  - optFields {[String]}:  Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more
    *    efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for
    *    the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    *  - optPretty {Boolean}:  Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to
    *    make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def getTask(taskGid: String): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def getTask(taskGid: String, params: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def getTask(taskGid: String, params: Any, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def getTask(taskGid: String, params: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  // https://developers.asana.com/docs/get-tasks-from-a-section
  // https://github.com/Asana/node-asana/blob/master/lib/resources/gen/tasks.js#L314-L333
  /**
    * Get tasks from a section
    * @param {String} sectionGid: (required) The globally unique identifier for the section.
    * @param {Object} [params]: Parameters for the request
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def getTasksForSection(sectionGid: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksForSection(sectionGid: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the projects the task is in.
    *   * @param {String|Number} task The task to get projects on.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def projects(task: String): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  
  /**
    * * Removes each of the specified followers from the task if they are
    * * following. Returns the complete, updated record for the affected task.
    *   * @param {String|Number} task The task to remove followers from.
    *   * @param {Object} data Data for the request
    *   * @param {Array} data.followers An array of followers to remove from the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeFollowers(task: String, data: FollowersParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: String, data: FollowersParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Removes the task from the specified project. The task will still exist
    * * in the system, but it will not be in the project anymore.
    * *
    * * Returns an empty data block.
    *   * @param {String|Number} task The task to remove from a project.
    *   * @param {Object} data Data for the request
    *   * @param {Number} data.project The project to remove the task from.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeProject(task: String, data: RemoveProjectParams): ^[js.Object] = js.native
  def removeProject(task: String, data: RemoveProjectParams, dispatchOptions: Any): ^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams): ^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams, dispatchOptions: Any): ^[js.Object] = js.native
  
  /**
    * * Removes a tag from the task. Returns an empty data block.
    *   * @param {String|Number} task The task to remove a tag from.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.tag The tag to remove from the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeTag(task: String, data: TagParams): ^[js.Object] = js.native
  def removeTag(task: String, data: TagParams, dispatchOptions: Any): ^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams): ^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams, dispatchOptions: Any): ^[js.Object] = js.native
  
  def searchInWorkspace(workspace: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  /**
    * * The search endpoint allows you to build complex queries to find and fetch exactly the data you need from Asana.
    * * For a more comprehensive description of all the query parameters and limitations of this endpoint, see our
    * * [long-form documentation](/developers/documentation/getting-started/search-api) for this feature.
    *   * @param {String|Number} workspace The workspace to search in for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def searchInWorkspace(workspace: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the stories on the task.
    *   * @param {String|Number} task The task containing the stories to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def stories(task: String): ^[ResourceList[Type]] = js.native
  def stories(task: String, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def stories(task: Double): ^[ResourceList[Type]] = js.native
  def stories(task: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams): ^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the subtasks of a task.
    *   * @param {String|Number} task The task to get the subtasks of.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def subtasks(task: String): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the tags the task has.
    *   * @param {String|Number} task The task to get tags on.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def tags(task: String): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  
  /**
    * * A specific, existing task can be updated by making a PUT request on the
    * * URL for that task. Only the fields provided in the `data` block will be
    * * updated; any unspecified fields will remain unchanged.
    * *
    * * When using this method, it is best to specify only those fields you wish
    * * to change, or else you may overwrite changes made by another user since
    * * you last retrieved the task.
    * *
    * * Returns the complete updated task record.
    *   * @param {String|Number} task The task to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(task: String, data: UpdateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: String, data: UpdateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: UpdateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: UpdateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  // https://developers.asana.com/docs/update-a-task
  // https://github.com/Asana/node-asana/blob/6bf00fb3257847744bf0ebe2dc0e95c445477282/lib/resources/gen/tasks.js#L563-L578
  /**
    * Update a task
    * @param {String} taskGid: (required) The task to operate on.
    * @param {Object} data: Data for the request
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def updateTask(taskGid: String): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def updateTask(taskGid: String, data: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def updateTask(taskGid: String, data: UpdateParams): ^[typings.asana.mod.resources.Tasks.Type] = js.native
  def updateTask(taskGid: String, data: UpdateParams, dispatchOptions: Any): ^[typings.asana.mod.resources.Tasks.Type] = js.native
}
object Tasks extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Tasks")
  @js.native
  open class ^ protected ()
    extends StObject
       with Tasks {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Tasks")
  @js.native
  val ^ : TasksStatic = js.native
  
  trait AddProjectParams extends StObject {
    
    var insertAfter: js.UndefOr[Double] = js.undefined
    
    var insertBefore: js.UndefOr[Double] = js.undefined
    
    var project: String | Double
    
    var section: js.UndefOr[Double] = js.undefined
  }
  object AddProjectParams {
    
    inline def apply(project: String | Double): AddProjectParams = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddProjectParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddProjectParams] (val x: Self) extends AnyVal {
      
      inline def setInsertAfter(value: Double): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
      
      inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      inline def setInsertBefore(value: Double): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setSection(value: Double): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    }
  }
  
  trait CommentParams extends StObject {
    
    var html_text: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object CommentParams {
    
    inline def apply(): CommentParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommentParams] (val x: Self) extends AnyVal {
      
      inline def setHtml_text(value: String): Self = StObject.set(x, "html_text", value.asInstanceOf[js.Any])
      
      inline def setHtml_textUndefined: Self = StObject.set(x, "html_text", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  // https://developers.asana.com/docs/create-a-task
  // https://forum.asana.com/t/add-task-to-a-section-upon-creation-via-api-request/51957/5
  trait CreateParams extends StObject {
    
    var approval_status: js.UndefOr[String] = js.undefined
    
    var assignee: js.UndefOr[String] = js.undefined
    
    var assignee_section: js.UndefOr[String] = js.undefined
    
    // assignee_status: string; // deprecated - use assignee_section
    var completed: js.UndefOr[Boolean] = js.undefined
    
    // hearted?: boolean | undefined; // deprecated and removed from documentation
    var custom_fields: js.UndefOr[StringDictionary[Double | String]] = js.undefined
    
    var due_at: js.UndefOr[String] = js.undefined
    
    var due_on: js.UndefOr[String | Null] = js.undefined
    
    var external: js.UndefOr[Data] = js.undefined
    
    var followers: js.UndefOr[js.Array[String]] = js.undefined
    
    // create-only
    var html_notes: js.UndefOr[String] = js.undefined
    
    var liked: js.UndefOr[Boolean] = js.undefined
    
    var memberships: js.UndefOr[js.Array[Project]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var notes: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[String] = js.undefined
    
    var projects: js.UndefOr[js.Array[String]] = js.undefined
    
    // create-only
    var resource_subtype: js.UndefOr[String] = js.undefined
    
    var start_at: js.UndefOr[String | Null] = js.undefined
    
    var start_on: js.UndefOr[String | Null] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    // create-only
    var workspace: js.UndefOr[String] = js.undefined
  }
  object CreateParams {
    
    inline def apply(): CreateParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateParams] (val x: Self) extends AnyVal {
      
      inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
      
      inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
      
      inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setAssignee_section(value: String): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
      
      inline def setAssignee_sectionUndefined: Self = StObject.set(x, "assignee_section", js.undefined)
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      inline def setCustom_fields(value: StringDictionary[Double | String]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
      
      inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
      
      inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
      
      inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
      
      inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFollowers(value: js.Array[String]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
      
      inline def setFollowersVarargs(value: String*): Self = StObject.set(x, "followers", js.Array(value*))
      
      inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
      
      inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
      
      inline def setMemberships(value: js.Array[Project]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
      
      inline def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
      
      inline def setMembershipsVarargs(value: Project*): Self = StObject.set(x, "memberships", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
      
      inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
      
      inline def setResource_subtype(value: String): Self = StObject.set(x, "resource_subtype", value.asInstanceOf[js.Any])
      
      inline def setResource_subtypeUndefined: Self = StObject.set(x, "resource_subtype", js.undefined)
      
      inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
      
      inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
      
      inline def setStart_atUndefined: Self = StObject.set(x, "start_at", js.undefined)
      
      inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
      
      inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
      
      inline def setStart_onUndefined: Self = StObject.set(x, "start_on", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait FindAllParams
    extends StObject
       with PaginationParams {
    
    var assignee: js.UndefOr[Double] = js.undefined
    
    var completed_since: js.UndefOr[String] = js.undefined
    
    var modified_since: js.UndefOr[String] = js.undefined
    
    var project: js.UndefOr[String | Double] = js.undefined
    
    var section: js.UndefOr[String | Double] = js.undefined
    
    var workspace: js.UndefOr[String | Double] = js.undefined
  }
  object FindAllParams {
    
    inline def apply(): FindAllParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      inline def setAssignee(value: Double): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setCompleted_since(value: String): Self = StObject.set(x, "completed_since", value.asInstanceOf[js.Any])
      
      inline def setCompleted_sinceUndefined: Self = StObject.set(x, "completed_since", js.undefined)
      
      inline def setModified_since(value: String): Self = StObject.set(x, "modified_since", value.asInstanceOf[js.Any])
      
      inline def setModified_sinceUndefined: Self = StObject.set(x, "modified_since", js.undefined)
      
      inline def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSection(value: String | Double): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  trait FollowersParams extends StObject {
    
    var followers: js.Array[Double | String]
  }
  object FollowersParams {
    
    inline def apply(followers: js.Array[Double | String]): FollowersParams = {
      val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any])
      __obj.asInstanceOf[FollowersParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FollowersParams] (val x: Self) extends AnyVal {
      
      inline def setFollowers(value: js.Array[Double | String]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersVarargs(value: (Double | String)*): Self = StObject.set(x, "followers", js.Array(value*))
    }
  }
  
  trait RemoveProjectParams extends StObject {
    
    var project: String | Double
  }
  object RemoveProjectParams {
    
    inline def apply(project: String | Double): RemoveProjectParams = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveProjectParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveProjectParams] (val x: Self) extends AnyVal {
      
      inline def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagParams extends StObject {
    
    var tag: String | Double
  }
  object TagParams {
    
    inline def apply(tag: String | Double): TagParams = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagParams] (val x: Self) extends AnyVal {
      
      inline def setTag(value: String | Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developers.asana.com/docs/task
  trait Type
    extends StObject
       with Resource {
    
    var approval_status: js.UndefOr[String] = js.undefined
    
    // deprecated
    var assignee: Assignee | Null
    
    var assignee_section: Resource
    
    var assignee_status: String
    
    var completed: Boolean
    
    var completed_at: String | Null
    
    var created_at: String
    
    var custom_fields: js.Array[CustomField]
    
    var dependencies: js.Array[Resource]
    
    // opt in
    var dependents: js.Array[Resource]
    
    var due_at: String | Null
    
    // opt in
    var due_on: String | Null
    
    var external: js.UndefOr[Data] = js.undefined
    
    var followers: js.Array[Resource]
    
    // deprecated
    var hearted: Boolean
    
    // deprecated
    var hearts: js.Array[Resource]
    
    var html_notes: js.UndefOr[String] = js.undefined
    
    // opt in
    var is_rendered_as_separator: js.UndefOr[Boolean] = js.undefined
    
    // opt in
    var liked: Boolean
    
    var likes: js.Array[User]
    
    var memberships: js.Array[Membership]
    
    var modified_at: String
    
    // opt in
    var notes: String
    
    var num_hearts: Double
    
    var num_likes: Double
    
    var num_subtasks: Double
    
    // deprecated
    var parent: Resource | Null
    
    var permalink_url: String
    
    var projects: js.Array[Resource]
    
    var start_at: String | Null
    
    var start_on: String | Null
    
    var tags: js.Array[Resource]
    
    var workspace: Resource
  }
  object Type {
    
    inline def apply(
      assignee_section: Resource,
      assignee_status: String,
      completed: Boolean,
      created_at: String,
      custom_fields: js.Array[CustomField],
      dependencies: js.Array[Resource],
      dependents: js.Array[Resource],
      followers: js.Array[Resource],
      gid: String,
      hearted: Boolean,
      hearts: js.Array[Resource],
      liked: Boolean,
      likes: js.Array[User],
      memberships: js.Array[Membership],
      modified_at: String,
      name: String,
      notes: String,
      num_hearts: Double,
      num_likes: Double,
      num_subtasks: Double,
      permalink_url: String,
      projects: js.Array[Resource],
      resource_type: String,
      tags: js.Array[Resource],
      workspace: Resource
    ): typings.asana.mod.resources.Tasks.Type = {
      val __obj = js.Dynamic.literal(assignee_section = assignee_section.asInstanceOf[js.Any], assignee_status = assignee_status.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], dependents = dependents.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], hearted = hearted.asInstanceOf[js.Any], hearts = hearts.asInstanceOf[js.Any], liked = liked.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], memberships = memberships.asInstanceOf[js.Any], modified_at = modified_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], num_hearts = num_hearts.asInstanceOf[js.Any], num_likes = num_likes.asInstanceOf[js.Any], num_subtasks = num_subtasks.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any], assignee = null, completed_at = null, due_at = null, due_on = null, parent = null, start_at = null, start_on = null)
      __obj.asInstanceOf[typings.asana.mod.resources.Tasks.Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.asana.mod.resources.Tasks.Type] (val x: Self) extends AnyVal {
      
      inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
      
      inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
      
      inline def setAssignee(value: Assignee): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      inline def setAssignee_section(value: Resource): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
      
      inline def setAssignee_status(value: String): Self = StObject.set(x, "assignee_status", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
      
      inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCustom_fields(value: js.Array[CustomField]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldsVarargs(value: CustomField*): Self = StObject.set(x, "custom_fields", js.Array(value*))
      
      inline def setDependencies(value: js.Array[Resource]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: Resource*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDependents(value: js.Array[Resource]): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
      
      inline def setDependentsVarargs(value: Resource*): Self = StObject.set(x, "dependents", js.Array(value*))
      
      inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
      
      inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
      
      inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
      
      inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFollowers(value: js.Array[Resource]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowersVarargs(value: Resource*): Self = StObject.set(x, "followers", js.Array(value*))
      
      inline def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      inline def setHearts(value: js.Array[Resource]): Self = StObject.set(x, "hearts", value.asInstanceOf[js.Any])
      
      inline def setHeartsVarargs(value: Resource*): Self = StObject.set(x, "hearts", js.Array(value*))
      
      inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
      
      inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
      
      inline def setIs_rendered_as_separator(value: Boolean): Self = StObject.set(x, "is_rendered_as_separator", value.asInstanceOf[js.Any])
      
      inline def setIs_rendered_as_separatorUndefined: Self = StObject.set(x, "is_rendered_as_separator", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikes(value: js.Array[User]): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
      
      inline def setLikesVarargs(value: User*): Self = StObject.set(x, "likes", js.Array(value*))
      
      inline def setMemberships(value: js.Array[Membership]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
      
      inline def setMembershipsVarargs(value: Membership*): Self = StObject.set(x, "memberships", js.Array(value*))
      
      inline def setModified_at(value: String): Self = StObject.set(x, "modified_at", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNum_hearts(value: Double): Self = StObject.set(x, "num_hearts", value.asInstanceOf[js.Any])
      
      inline def setNum_likes(value: Double): Self = StObject.set(x, "num_likes", value.asInstanceOf[js.Any])
      
      inline def setNum_subtasks(value: Double): Self = StObject.set(x, "num_subtasks", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPermalink_url(value: String): Self = StObject.set(x, "permalink_url", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: js.Array[Resource]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: Resource*): Self = StObject.set(x, "projects", js.Array(value*))
      
      inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
      
      inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
      
      inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
      
      inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
      
      inline def setTags(value: js.Array[Resource]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Resource*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setWorkspace(value: Resource): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
  
  // https://developers.asana.com/docs/update-a-task
  trait UpdateParams extends StObject {
    
    var approval_status: js.UndefOr[String] = js.undefined
    
    var assignee: js.UndefOr[String] = js.undefined
    
    var assignee_section: js.UndefOr[String] = js.undefined
    
    var completed: js.UndefOr[Boolean] = js.undefined
    
    var custom_fields: js.UndefOr[StringDictionary[Double | String]] = js.undefined
    
    var due_at: js.UndefOr[String] = js.undefined
    
    var due_on: js.UndefOr[String | Null] = js.undefined
    
    var external: js.UndefOr[Data] = js.undefined
    
    var html_notes: js.UndefOr[String] = js.undefined
    
    var liked: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var notes: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[String] = js.undefined
    
    var start_at: js.UndefOr[String | Null] = js.undefined
    
    var start_on: js.UndefOr[String | Null] = js.undefined
    
    var workspace: js.UndefOr[String] = js.undefined
  }
  object UpdateParams {
    
    inline def apply(): UpdateParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateParams] (val x: Self) extends AnyVal {
      
      inline def setApproval_status(value: String): Self = StObject.set(x, "approval_status", value.asInstanceOf[js.Any])
      
      inline def setApproval_statusUndefined: Self = StObject.set(x, "approval_status", js.undefined)
      
      inline def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      inline def setAssignee_section(value: String): Self = StObject.set(x, "assignee_section", value.asInstanceOf[js.Any])
      
      inline def setAssignee_sectionUndefined: Self = StObject.set(x, "assignee_section", js.undefined)
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      inline def setCustom_fields(value: StringDictionary[Double | String]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
      
      inline def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
      
      inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
      
      inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
      
      inline def setDue_onUndefined: Self = StObject.set(x, "due_on", js.undefined)
      
      inline def setExternal(value: Data): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setHtml_notes(value: String): Self = StObject.set(x, "html_notes", value.asInstanceOf[js.Any])
      
      inline def setHtml_notesUndefined: Self = StObject.set(x, "html_notes", js.undefined)
      
      inline def setLiked(value: Boolean): Self = StObject.set(x, "liked", value.asInstanceOf[js.Any])
      
      inline def setLikedUndefined: Self = StObject.set(x, "liked", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStart_at(value: String): Self = StObject.set(x, "start_at", value.asInstanceOf[js.Any])
      
      inline def setStart_atNull: Self = StObject.set(x, "start_at", null)
      
      inline def setStart_atUndefined: Self = StObject.set(x, "start_at", js.undefined)
      
      inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
      
      inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
      
      inline def setStart_onUndefined: Self = StObject.set(x, "start_on", js.undefined)
      
      inline def setWorkspace(value: String): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  type _To = TasksStatic
  
  /* This means you don't have to write `^`, but can instead just say `Tasks.foo` */
  override def _to: TasksStatic = ^
}
