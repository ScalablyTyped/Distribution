package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.CreateParamsworkspacestriCompleted
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Stories.Type
import typings.asana.mod.resources.Tasks.AddProjectParams
import typings.asana.mod.resources.Tasks.CommentParams
import typings.asana.mod.resources.Tasks.CreateParams
import typings.asana.mod.resources.Tasks.FindAllParams
import typings.asana.mod.resources.Tasks.FollowersParams
import typings.asana.mod.resources.Tasks.RemoveProjectParams
import typings.asana.mod.resources.Tasks.TagParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  extends typings.asana.mod.resources.Resource {
  
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
  def addComment(task: String, data: CommentParams): typings.bluebird.mod.^[Type] = js.native
  def addComment(task: String, data: CommentParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def addComment(task: Double, data: CommentParams): typings.bluebird.mod.^[Type] = js.native
  def addComment(task: Double, data: CommentParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
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
  def addFollowers(task: String, data: FollowersParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: String, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
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
  def addProject(task: String, data: AddProjectParams): typings.bluebird.mod.^[js.Object] = js.native
  def addProject(task: String, data: AddProjectParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams): typings.bluebird.mod.^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  
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
  def addSubtask(task: String, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
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
  def addTag(task: String, data: TagParams): typings.bluebird.mod.^[js.Object] = js.native
  def addTag(task: String, data: TagParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  def addTag(task: Double, data: TagParams): typings.bluebird.mod.^[js.Object] = js.native
  def addTag(task: Double, data: TagParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  
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
  def create(data: CreateParamsworkspacestriCompleted): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def create(data: CreateParamsworkspacestriCompleted, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
  def createInWorkspace(workspace: String, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
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
  def createInWorkspace(workspace: Double, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
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
  def delete(task: String): typings.bluebird.mod.^[Unit] = js.native
  def delete(task: String, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
  def delete(task: Double): typings.bluebird.mod.^[Unit] = js.native
  def delete(task: Double, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
  
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
  def findAll(): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def findById(task: String): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
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
  def findByProject(projectId: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def findByTag(tag: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def projects(task: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Projects.Type]] = js.native
  
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
  def removeFollowers(task: String, data: FollowersParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: String, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  
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
  def removeProject(task: String, data: RemoveProjectParams): typings.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: String, data: RemoveProjectParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams): typings.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  
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
  def removeTag(task: String, data: TagParams): typings.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: String, data: TagParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams): typings.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Object] = js.native
  
  def searchInWorkspace(workspace: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
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
  def searchInWorkspace(workspace: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def stories(task: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
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
  def subtasks(task: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  
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
  def tags(task: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tags.Type]] = js.native
  
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
  def update(task: String, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: CreateParams): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Tasks.Type] = js.native
}
object Tasks extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Tasks")
  @js.native
  class ^ protected () extends Tasks {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Tasks")
  @js.native
  val ^ : TasksStatic = js.native
  
  @js.native
  trait AddProjectParams extends StObject {
    
    var insertAfter: js.UndefOr[Double] = js.native
    
    var insertBefore: js.UndefOr[Double] = js.native
    
    var project: String | Double = js.native
    
    var section: js.UndefOr[Double] = js.native
  }
  object AddProjectParams {
    
    @scala.inline
    def apply(project: String | Double): AddProjectParams = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddProjectParams]
    }
    
    @scala.inline
    implicit class AddProjectParamsMutableBuilder[Self <: AddProjectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertAfter(value: Double): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      @scala.inline
      def setInsertBefore(value: Double): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      @scala.inline
      def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSection(value: Double): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    }
  }
  
  @js.native
  trait CommentParams extends StObject {
    
    var html_text: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object CommentParams {
    
    @scala.inline
    def apply(): CommentParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentParams]
    }
    
    @scala.inline
    implicit class CommentParamsMutableBuilder[Self <: CommentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml_text(value: String): Self = StObject.set(x, "html_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_textUndefined: Self = StObject.set(x, "html_text", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait CreateParams extends StObject {
    
    var completed: js.UndefOr[Boolean] = js.native
    
    var custom_fields: js.UndefOr[js.Object] = js.native
    
    var hearted: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var notes: js.UndefOr[String] = js.native
  }
  object CreateParams {
    
    @scala.inline
    def apply(name: String): CreateParams = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateParams]
    }
    
    @scala.inline
    implicit class CreateParamsMutableBuilder[Self <: CreateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
      
      @scala.inline
      def setCustom_fields(value: js.Object): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      @scala.inline
      def setHearted(value: Boolean): Self = StObject.set(x, "hearted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartedUndefined: Self = StObject.set(x, "hearted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    }
  }
  
  @js.native
  trait FindAllParams extends PaginationParams {
    
    var assignee: js.UndefOr[Double] = js.native
    
    var completed_since: js.UndefOr[String] = js.native
    
    var modified_since: js.UndefOr[String] = js.native
    
    var project: js.UndefOr[String | Double] = js.native
    
    var section: js.UndefOr[String | Double] = js.native
    
    var workspace: js.UndefOr[String | Double] = js.native
  }
  object FindAllParams {
    
    @scala.inline
    def apply(): FindAllParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindAllParams]
    }
    
    @scala.inline
    implicit class FindAllParamsMutableBuilder[Self <: FindAllParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignee(value: Double): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
      
      @scala.inline
      def setCompleted_since(value: String): Self = StObject.set(x, "completed_since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleted_sinceUndefined: Self = StObject.set(x, "completed_since", js.undefined)
      
      @scala.inline
      def setModified_since(value: String): Self = StObject.set(x, "modified_since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified_sinceUndefined: Self = StObject.set(x, "modified_since", js.undefined)
      
      @scala.inline
      def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setSection(value: String | Double): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      @scala.inline
      def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  @js.native
  trait FollowersParams extends StObject {
    
    var followers: js.Array[Double | String] = js.native
  }
  object FollowersParams {
    
    @scala.inline
    def apply(followers: js.Array[Double | String]): FollowersParams = {
      val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any])
      __obj.asInstanceOf[FollowersParams]
    }
    
    @scala.inline
    implicit class FollowersParamsMutableBuilder[Self <: FollowersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowers(value: js.Array[Double | String]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowersVarargs(value: (Double | String)*): Self = StObject.set(x, "followers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RemoveProjectParams extends StObject {
    
    var project: String | Double = js.native
  }
  object RemoveProjectParams {
    
    @scala.inline
    def apply(project: String | Double): RemoveProjectParams = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveProjectParams]
    }
    
    @scala.inline
    implicit class RemoveProjectParamsMutableBuilder[Self <: RemoveProjectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagParams extends StObject {
    
    var tag: String | Double = js.native
  }
  object TagParams {
    
    @scala.inline
    def apply(tag: String | Double): TagParams = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagParams]
    }
    
    @scala.inline
    implicit class TagParamsMutableBuilder[Self <: TagParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String | Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type
    extends typings.asana.mod.resources.Resource {
    
    var assignee: Assignee | Null = js.native
    
    var assignee_status: String = js.native
    
    var completed: Boolean = js.native
    
    var completed_at: String | Null = js.native
    
    var created_at: String = js.native
    
    var custom_fields: js.Array[CustomField] = js.native
    
    var due_at: String = js.native
    
    var due_on: String = js.native
    
    var followers: js.Array[typings.asana.mod.resources.Resource] = js.native
    
    var hearted: Boolean = js.native
    
    var memberships: js.Array[Membership] = js.native
    
    var modified_at: String = js.native
    
    var notes: String = js.native
    
    var num_hearts: Double = js.native
    
    var parent: typings.asana.mod.resources.Resource = js.native
    
    var projects: js.Array[typings.asana.mod.resources.Resource] = js.native
    
    var tags: js.Array[typings.asana.mod.resources.Resource] = js.native
    
    var workspace: typings.asana.mod.resources.Resource = js.native
  }
  
  type _To = TasksStatic
  
  /* This means you don't have to write `^`, but can instead just say `Tasks.foo` */
  override def _to: TasksStatic = ^
}
