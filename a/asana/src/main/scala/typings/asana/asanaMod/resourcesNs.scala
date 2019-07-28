package typings.asana.asanaMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.asana.Anon_AsanaBaseUrl
import typings.asana.Anon_Data
import typings.asana.Anon_Name
import typings.asana.Anon_Workspace
import typings.asana.Anon_WorkspaceString
import typings.asana.asanaMod.resourcesNs.Attachments
import typings.asana.asanaMod.resourcesNs.AttachmentsNs.Type
import typings.asana.asanaMod.resourcesNs.AttachmentsStatic
import typings.asana.asanaMod.resourcesNs.Events
import typings.asana.asanaMod.resourcesNs.EventsStatic
import typings.asana.asanaMod.resourcesNs.Membership
import typings.asana.asanaMod.resourcesNs.PaginationParams
import typings.asana.asanaMod.resourcesNs.Params
import typings.asana.asanaMod.resourcesNs.Projects
import typings.asana.asanaMod.resourcesNs.ProjectsNs.CreateParams
import typings.asana.asanaMod.resourcesNs.ProjectsNs.FindAllParams
import typings.asana.asanaMod.resourcesNs.ProjectsNs.FindByParams
import typings.asana.asanaMod.resourcesNs.ProjectsNs.FollowersParams
import typings.asana.asanaMod.resourcesNs.ProjectsNs.MembersParams
import typings.asana.asanaMod.resourcesNs.ProjectsNs.Status
import typings.asana.asanaMod.resourcesNs.ProjectsStatic
import typings.asana.asanaMod.resourcesNs.Resource
import typings.asana.asanaMod.resourcesNs.ResourceList
import typings.asana.asanaMod.resourcesNs.ResourceStatic
import typings.asana.asanaMod.resourcesNs.SimpleResourceList
import typings.asana.asanaMod.resourcesNs.Stories
import typings.asana.asanaMod.resourcesNs.StoriesNs.ShortType
import typings.asana.asanaMod.resourcesNs.StoriesStatic
import typings.asana.asanaMod.resourcesNs.Tags
import typings.asana.asanaMod.resourcesNs.TagsStatic
import typings.asana.asanaMod.resourcesNs.Tasks
import typings.asana.asanaMod.resourcesNs.TasksNs.AddProjectParams
import typings.asana.asanaMod.resourcesNs.TasksNs.CommentParams
import typings.asana.asanaMod.resourcesNs.TasksNs.RemoveProjectParams
import typings.asana.asanaMod.resourcesNs.TasksNs.TagParams
import typings.asana.asanaMod.resourcesNs.TasksStatic
import typings.asana.asanaMod.resourcesNs.Teams
import typings.asana.asanaMod.resourcesNs.TeamsStatic
import typings.asana.asanaMod.resourcesNs.UserParams
import typings.asana.asanaMod.resourcesNs.Users
import typings.asana.asanaMod.resourcesNs.UsersStatic
import typings.asana.asanaMod.resourcesNs.Workspaces
import typings.asana.asanaMod.resourcesNs.WorkspacesNs.TypeaheadParams
import typings.asana.asanaMod.resourcesNs.WorkspacesStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "resources")
@js.native
object resourcesNs extends js.Object {
  /**
    * An _attachment_ object represents any file attached to a task in Asana,
    * whether it's an uploaded file or one associated via a third-party service
    * such as Dropbox or Google Drive.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Attachments extends Resource {
    /**
      * * Returns the full record for a single attachment.
      *   * @param {Number} attachment Globally unique identifier for the attachment.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param attachment
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(attachment: Double): typings.bluebird.bluebirdMod.^[Type] = js.native
    def findById(attachment: Double, params: Params): typings.bluebird.bluebirdMod.^[Type] = js.native
    def findById(attachment: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[Type] = js.native
    /**
      * * Returns the compact records for all attachments on the task.
      *   * @param {Number} task Globally unique identifier for the task.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByTask(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
    def findByTask(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
    def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[Type]] = js.native
  }
  
  @js.native
  class AttachmentsCls protected () extends Attachments {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait AttachmentsStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Attachments]
  
  @js.native
  class EventsCls protected () extends Events {
    /**
      * @param dispatcher
      * @return
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait EventsStatic extends /**
    * @param dispatcher
    * @return
    */
  Instantiable1[/* dispatcher */ Dispatcher, Events]
  
  trait Membership extends js.Object {
    var project: Resource
    var section: Resource
  }
  
  trait NextPage extends js.Object {
    var offset: String
    var path: String
    var uri: String
  }
  
  trait PaginationParams extends Params {
    var limit: js.UndefOr[Double] = js.undefined
    var offset: js.UndefOr[String] = js.undefined
  }
  
  trait Params extends js.Object {
    var opt_expand: js.UndefOr[String] = js.undefined
    var opt_fields: js.UndefOr[String] = js.undefined
  }
  
  /**
    * A _project_ represents a prioritized list of tasks in Asana. It exists in a
    * single workspace or organization and is accessible to a subset of users in
    * that workspace or organization, depending on its permissions.
    *
    * Projects in organizations are shared with a single team. You cannot currently
    * change the team of a project via the API. Non-organization workspaces do not
    * have teams and so you should not specify the team of project in a
    * regular workspace.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Projects extends Resource {
    /**
      * * Adds the specified list of users as followers to the project. Followers are a subset of members, therefore if
      * * the users are not already members of the project they will also become members as a result of this operation.
      * * Returns the updated project record.
      *   * @param {Number} project The project to add followers to.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.followers An array of followers to add to the project.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addFollowers(project: Double, data: FollowersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def addFollowers(project: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Adds the specified list of users as members of the project. Returns the updated project record.
      *   * @param {Number} project The project to add members to.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.members An array of members to add to the project.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addMembers(project: Double, data: MembersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def addMembers(project: Double, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Creates a new project in a workspace or team.
      * *
      * * Every project is required to be created in a specific workspace or
      * * organization, and this cannot be changed once set. Note that you can use
      * * the `workspace` parameter regardless of whether or not it is an
      * * organization.
      * *
      * * If the workspace for your project _is_ an organization, you must also
      * * supply a `team` to share the project with.
      * *
      * * Returns the full record of the newly created project.
      *   * @param {Object} data Data for the request
      *   * @param {String} data.workspace The workspace or organization to create the project in.
      *   * @param {String} [data.team] If creating in an organization, the specific team to create the
      *   * project in.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def create(data: CreateParams with Anon_Workspace): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def create(data: CreateParams with Anon_Workspace, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Creates a project shared with the given team.
      * *
      * * Returns the full record of the newly created project.
      *   * @param {Number} team The team to create the project in.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param team
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def createInTeam(team: Double, data: CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def createInTeam(team: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * If the workspace for your project _is_ an organization, you must also
      * * supply a `team` to share the project with.
      * *
      * * Returns the full record of the newly created project.
      *   * @param {Number} workspace The workspace or organization to create the project in.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def createInWorkspace(workspace: Double, data: CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * A specific, existing project can be deleted by making a DELETE request
      * * on the URL for that project.
      * *
      * * Returns an empty data record.
      *   * @param {Number} project The project to delete.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param dispatchOptions?
      * @return
      */
    def delete(project: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
    def delete(project: Double, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[Unit] = js.native
    /**
      * * Returns the compact project records for some filtered set of projects.
      * * Use one or more of the parameters provided to filter the projects returned.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {String} [params.workspace] The workspace or organization to filter projects on.
      *   * @param {String} [params.team] The team to filter projects on.
      *   * @param {Boolean} [params.archived] Only return projects whose `archived` field takes on the value of
      *   * this parameter.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findAll(): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findAll(params: FindAllParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    /**
      * * Returns the complete project record for a single project.
      *   * @param {Number} project The project to get.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param project
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(project: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def findById(project: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def findById(project: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Returns the compact project records for all projects in the team.
      *   * @param {Number} team The team to find projects in.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Boolean} [params.archived] Only return projects whose `archived` field takes on the value of
      *   * this parameter.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param team
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByTeam(team: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findByTeam(team: Double, params: FindByParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findByTeam(team: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    /**
      * * Returns the compact project records for all projects in the workspace.
      *   * @param {Number} workspace The workspace or organization to find projects in.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Boolean} [params.archived] Only return projects whose `archived` field takes on the value of
      *   * this parameter.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByWorkspace(workspace: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: FindByParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    /**
      * * Removes the specified list of users from following the project, this will not affect project membership status.
      * * Returns the updated project record.
      *   * @param {Number} project The project to remove followers from.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.followers An array of followers to remove from the project.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeFollowers(project: Double, data: FollowersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def removeFollowers(project: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Removes the specified list of members from the project. Returns the updated project record.
      *   * @param {Number} project The project to remove members from.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.members An array of members to remove from the project.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeMembers(project: Double, data: MembersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def removeMembers(project: Double, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    /**
      * * Returns compact records for all sections in the specified project.
      *   * @param {Number} project The project to get sections from.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def sections(project: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def sections(project: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def sections(project: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Returns the compact task records for all tasks within the given project,
      * * ordered by their priority within the project. Tasks can exist in more than one project at a time.
      *   * @param {Number} project The project in which to search for tasks.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def tasks(project: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def tasks(project: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def tasks(project: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * A specific, existing project can be updated by making a PUT request on the
      * * URL for that project. Only the fields provided in the `data` block will be
      * * updated; any unspecified fields will remain unchanged.
      * *
      * * When using this method, it is best to specify only those fields you wish
      * * to change, or else you may overwrite changes made by another user since
      * * you last retrieved the task.
      * *
      * * Returns the complete updated project record.
      *   * @param {Number} project The project to update.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param project
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def update(project: Double, data: CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
    def update(project: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type] = js.native
  }
  
  @js.native
  class ProjectsCls protected () extends Projects {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait ProjectsStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Projects]
  
  /**
    * Base class for a resource accessible via the API. Uses a `Dispatcher` to
    * access the resources.
    * @param {Dispatcher} dispatcher
    * @constructor
    */
  @js.native
  trait Resource extends js.Object {
    var id: Double = js.native
    var name: String = js.native
    /**
      * Dispatches a DELETE request to the API. The expected response is an
      * empty resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param dispatchOptions?
      * @return
      */
    def dispatchDelete(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Dispatches a GET request to the API, where the expected result is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchGet(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Dispatches a GET request to the API, where the expected result is a
      * collection.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchGetCollection(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Dispatches a POST request to the API, where the expected response is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchPost(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Dispatches a POST request to the API, where the expected response is a
      * single resource.
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise}            The response for the request
      * @param path
      * @param query?
      * @param dispatchOptions?
      * @return
      */
    def dispatchPut(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  }
  
  @js.native
  class ResourceCls protected () extends Resource {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  trait ResourceList[T /* <: Resource */] extends js.Object {
    var _dispatcher: Anon_AsanaBaseUrl
    var _response: Anon_Data[T]
    var data: js.Array[T]
  }
  
  @js.native
  trait ResourceStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Resource] {
    /**
      * @type {number} Default number of items to get per page.
      */
    var DEFAULT_PAGE_LIMIT: Double = js.native
    /**
      * Helper method that dispatches a GET request to the API, where the expected
      * result is a collection.
      * @param  {Dispatcher} dispatcher
      * @param  {String}     path    The path of the API
      * @param  {Object}     [query] The query params
      * @param  {Object}     [dispatchOptions] Options for handling the request and
      *     response. See `Dispatcher.dispatch`.
      * @return {Promise<SimpleResourceList>} The Collection response for the request
      * @param dispatcher
      * @param path
      * @param query?
      * @param dispatchOptions?
      */
    def getCollection(dispatcher: js.Any, path: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def getCollection(dispatcher: js.Any, path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def getCollection(dispatcher: js.Any, path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Helper method for any request Promise from the Dispatcher, unwraps the `data`
      * value from the payload.
      * @param  {Promise} promise A promise returned from a `Dispatcher` request.
      * @return {Promise}         The `data` portion of the response payload.
      * @param promise
      * @return
      */
    def unwrap(promise: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  }
  
  /**
    * A _story_ represents an activity associated with an object in the Asana
    * system. Stories are generated by the system whenever users take actions such
    * as creating or assigning tasks, or moving tasks between projects. _Comments_
    * are also a form of user-generated story.
    *
    * Stories are a form of history in the system, and as such they are read-only.
    * Once generated, it is not possible to modify a story.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Stories extends Resource {
    /**
      * * Adds a comment to a task. The comment will be authored by the
      * * currently authenticated user, and timestamped when the server receives
      * * the request.
      * *
      * * Returns the full record for the new story added to the task.
      *   * @param {Number} task Globally unique identifier for the task.
      *   * @param {Object} data Data for the request
      *   * @param {String} data.text The plain text of the comment to add.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def createOnTask(task: Double, data: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[ShortType]] = js.native
    def createOnTask(task: Double, data: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[ShortType]] = js.native
    /**
      * * Returns the full record for a single story.
      *   * @param {Number} story Globally unique identifier for the story.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param story
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(story: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
    def findById(story: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
    def findById(story: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
    /**
      * * Returns the compact records for all stories on the task.
      *   * @param {Number} task Globally unique identifier for the task.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByTask(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
    def findByTask(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
    def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
  }
  
  @js.native
  class StoriesCls protected () extends Stories {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait StoriesStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Stories]
  
  /**
    * A _tag_ is a label that can be attached to any task in Asana. It exists in a
    * single workspace or organization.
    *
    * Tags have some metadata associated with them, but it is possible that we will
    * simplify them in the future so it is not encouraged to rely too heavily on it.
    * Unlike projects, tags do not provide any ordering on the tasks they
    * are associated with.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Tags extends Resource {
    /**
      * * Creates a new tag in a workspace or organization.
      * *
      * * Every tag is required to be created in a specific workspace or
      * * organization, and this cannot be changed once set. Note that you can use
      * * the `workspace` parameter regardless of whether or not it is an
      * * organization.
      * *
      * * Returns the full record of the newly created tag.
      *   * @param {Object} data Data for the request
      *   * @param {String} data.workspace The workspace or organization to create the tag in.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def create(data: typings.asana.asanaMod.resourcesNs.TagsNs.Type with Anon_WorkspaceString): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    def create(
      data: typings.asana.asanaMod.resourcesNs.TagsNs.Type with Anon_WorkspaceString,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    /**
      * * Creates a new tag in a workspace or organization.
      * *
      * * Every tag is required to be created in a specific workspace or
      * * organization, and this cannot be changed once set. Note that you can use
      * * the `workspace` parameter regardless of whether or not it is an
      * * organization.
      * *
      * * Returns the full record of the newly created tag.
      *   * @param {Number} workspace The workspace or organization to create the tag in.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def createInWorkspace(workspace: Double, data: typings.asana.asanaMod.resourcesNs.TagsNs.Type): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    def createInWorkspace(workspace: Double, data: typings.asana.asanaMod.resourcesNs.TagsNs.Type, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    /**
      * * A specific, existing tag can be deleted by making a DELETE request
      * * on the URL for that tag.
      * *
      * * Returns an empty data record.
      *   * @param {Number} tag The tag to delete.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param tag
      * @param dispatchOptions?
      * @return
      */
    def delete(tag: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
    def delete(tag: Double, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[Unit] = js.native
    /**
      * * Returns the compact tag records for some filtered set of tags.
      * * Use one or more of the parameters provided to filter the tags returned.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {String} [params.workspace] The workspace or organization to filter tags on.
      *   * @param {String} [params.team] The team to filter tags on.
      *   * @param {Boolean} [params.archived] Only return tags whose `archived` field takes on the value of
      *   * this parameter.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findAll(): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def findAll(params: typings.asana.asanaMod.resourcesNs.TagsNs.FindAllParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def findAll(params: typings.asana.asanaMod.resourcesNs.TagsNs.FindAllParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    /**
      * * Returns the complete tag record for a single tag.
      *   * @param {Number} tag The tag to get.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param tag
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(tag: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    def findById(tag: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    def findById(tag: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    /**
      * * Returns the compact tag records for all tags in the workspace.
      *   * @param {Number} workspace The workspace or organization to find tags in.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByWorkspace(workspace: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    /**
      * * Returns the compact task records for all tasks with the given tag.
      * * Tasks can have more than one tag at a time.
      *   * @param {Number} tag The tag to fetch tasks from.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param tag
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def getTasksWithTag(tag: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def getTasksWithTag(tag: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def getTasksWithTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Updates the properties of a tag. Only the fields provided in the `data`
      * * block will be updated; any unspecified fields will remain unchanged.
      * *
      * * When using this method, it is best to specify only those fields you wish
      * * to change, or else you may overwrite changes made by another user since
      * * you last retrieved the task.
      * *
      * * Returns the complete updated tag record.
      *   * @param {Number} tag The tag to update.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param tag
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def update(tag: Double, data: typings.asana.asanaMod.resourcesNs.TagsNs.Type): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
    def update(tag: Double, data: typings.asana.asanaMod.resourcesNs.TagsNs.Type, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TagsNs.Type] = js.native
  }
  
  @js.native
  class TagsCls protected () extends Tags {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait TagsStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Tags]
  
  /**
    * The _task_ is the basic object around which many operations in Asana are
    * centered. In the Asana application, multiple tasks populate the middle pane
    * according to some view parameters, and the set of selected tasks determines
    * the more detailed information presented in the details pane.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Tasks extends Resource {
    /**
      * * Adds a comment to a task. The comment will be authored by the
      * * currently authenticated user, and timestamped when the server receives
      * * the request.
      * *
      * * Returns the full record for the new story added to the task.
      *   * @param {Number} task Globally unique identifier for the task.
      *   * @param {Object} data Data for the request
      *   * @param {String} data.text The plain text of the comment to add.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addComment(task: Double, data: CommentParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
    def addComment(task: Double, data: CommentParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
    /**
      * * Adds each of the specified followers to the task, if they are not already
      * * following. Returns the complete, updated record for the affected task.
      *   * @param {Number} task The task to add followers to.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.followers An array of followers to add to the task.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addFollowers(task: Double, data: typings.asana.asanaMod.resourcesNs.TasksNs.FollowersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def addFollowers(
      task: Double,
      data: typings.asana.asanaMod.resourcesNs.TasksNs.FollowersParams,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * Adds the task to the specified project, in the optional location
      * * specified. If no location arguments are given, the task will be added to
      * * the beginning of the project.
      * *
      * * `addProject` can also be used to reorder a task within a project that
      * * already contains it.
      * *
      * * Returns an empty data block.
      *   * @param {Number} task The task to add to a project.
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
    def addProject(task: Double, data: AddProjectParams): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    def addProject(task: Double, data: AddProjectParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    /**
      * * Creates a new subtask and adds it to the parent task. Returns the full record
      * * for the newly created subtask.
      *   * @param {Number} task The task to add a subtask to.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addSubtask(task: Double, data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def addSubtask(
      task: Double,
      data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * Adds a tag to a task. Returns an empty data block.
      *   * @param {Number} task The task to add a tag to.
      *   * @param {Object} data Data for the request
      *   * @param {Number} data.tag The tag to add to the task.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addTag(task: Double, data: TagParams): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    def addTag(task: Double, data: TagParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[js.Object] = js.native
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
    def create(data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams with Anon_WorkspaceString): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def create(
      data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams with Anon_WorkspaceString,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * Creating a new task is as easy as POSTing to the `/tasks` endpoint
      * * with a data block containing the fields you'd like to set on the task.
      * * Any unspecified fields will take on default values.
      * *
      * * Every task is required to be created in a specific workspace, and this
      * * workspace cannot be changed once set. The workspace need not be set
      * * explicitly if you specify a `project` or a `parent` task instead.
      *   * @param {Number} workspace The workspace to create a task in.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def createInWorkspace(workspace: Double, data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def createInWorkspace(
      workspace: Double,
      data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * A specific, existing task can be deleted by making a DELETE request on the
      * * URL for that task. Deleted tasks go into the "trash" of the user making
      * * the delete request. Tasks can be recovered from the trash within a period
      * * of 30 days; afterward they are completely removed from the system.
      * *
      * * Returns an empty data record.
      *   * @param {Number} task The task to delete.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param dispatchOptions?
      * @return
      */
    def delete(task: Double): typings.bluebird.bluebirdMod.^[Unit] = js.native
    def delete(task: Double, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[Unit] = js.native
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
    def findAll(): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findAll(params: typings.asana.asanaMod.resourcesNs.TasksNs.FindAllParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findAll(params: typings.asana.asanaMod.resourcesNs.TasksNs.FindAllParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Returns the complete task record for a single task.
      *   * @param {Number} task The task to get.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(task: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def findById(task: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def findById(task: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * Returns the compact task records for all tasks within the given project,
      * * ordered by their priority within the project.
      *   * @param {Number} projectId The project in which to search for tasks.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param projectId
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByProject(projectId: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findByProject(projectId: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findByProject(projectId: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Returns the compact task records for all tasks with the given tag.
      *   * @param {Number} tag The tag in which to search for tasks.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param tag
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByTag(tag: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findByTag(tag: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def findByTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Returns a compact representation of all of the projects the task is in.
      *   * @param {Number} task The task to get projects on.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def projects(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def projects(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    def projects(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.ProjectsNs.Type]] = js.native
    /**
      * * Removes each of the specified followers from the task if they are
      * * following. Returns the complete, updated record for the affected task.
      *   * @param {Number} task The task to remove followers from.
      *   * @param {Object} data Data for the request
      *   * @param {Array} data.followers An array of followers to remove from the task.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeFollowers(task: Double, data: typings.asana.asanaMod.resourcesNs.TasksNs.FollowersParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def removeFollowers(
      task: Double,
      data: typings.asana.asanaMod.resourcesNs.TasksNs.FollowersParams,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    /**
      * * Removes the task from the specified project. The task will still exist
      * * in the system, but it will not be in the project anymore.
      * *
      * * Returns an empty data block.
      *   * @param {Number} task The task to remove from a project.
      *   * @param {Object} data Data for the request
      *   * @param {Number} data.project The project to remove the task from.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeProject(task: Double, data: RemoveProjectParams): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    def removeProject(task: Double, data: RemoveProjectParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    /**
      * * Removes a tag from the task. Returns an empty data block.
      *   * @param {Number} task The task to remove a tag from.
      *   * @param {Object} data Data for the request
      *   * @param {String} data.tag The tag to remove from the task.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeTag(task: Double, data: TagParams): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    def removeTag(task: Double, data: TagParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[js.Object] = js.native
    /**
      * * Returns a compact representation of all of the stories on the task.
      *   * @param {Number} task The task containing the stories to get.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def stories(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
    def stories(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
    def stories(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.StoriesNs.Type]] = js.native
    /**
      * * Returns a compact representation of all of the subtasks of a task.
      *   * @param {Number} task The task to get the subtasks of.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def subtasks(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def subtasks(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    def subtasks(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TasksNs.Type]] = js.native
    /**
      * * Returns a compact representation of all of the tags the task has.
      *   * @param {Number} task The task to get tags on.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def tags(task: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def tags(task: Double, params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
    def tags(task: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.TagsNs.Type]] = js.native
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
      *   * @param {Number} task The task to update.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param task
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def update(task: Double, data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
    def update(
      task: Double,
      data: typings.asana.asanaMod.resourcesNs.TasksNs.CreateParams,
      dispatchOptions: js.Any
    ): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TasksNs.Type] = js.native
  }
  
  @js.native
  class TasksCls protected () extends Tasks {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait TasksStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Tasks]
  
  /**
    * A _team_ is used to group related projects and people together within an
    * organization. Each project in an organization is associated with a team.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Teams extends Resource {
    /**
      * * The user making this call must be a member of the team in order to add others.
      * * The user to add must exist in the same organization as the team in order to be added.
      * * The user to add can be referenced by their globally unique user ID or their email address.
      * * Returns the full user record for the added user.
      *   * @param {Number} team Globally unique identifier for the team.
      *   * @param {Object} data Data for the request
      *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
      *   * the globally unique identifier for the user, or the keyword `me`
      *   * to indicate the current user making the request.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param team
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addUser(team: Double, data: UserParams): typings.bluebird.bluebirdMod.^[_] = js.native
    def addUser(team: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * Returns the full record for a single team.
      *   * @param {Number} team Globally unique identifier for the team.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param team
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(team: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TeamsNs.Type] = js.native
    def findById(team: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TeamsNs.Type] = js.native
    def findById(team: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.TeamsNs.Type] = js.native
    /**
      * * Returns the compact records for all teams in the organization visible to
      * * the authorized user.
      *   * @param {Number} organization Globally unique identifier for the workspace or organization.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param organization
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByOrganization(organization: Double): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def findByOrganization(organization: Double, params: Params): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def findByOrganization(organization: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    /**
      * * The user to remove can be referenced by their globally unique user ID or their email address.
      * * Removes the user from the specified team. Returns an empty data record.
      *   * @param {Number} team Globally unique identifier for the team.
      *   * @param {Object} data Data for the request
      *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
      *   * the globally unique identifier for the user, or the keyword `me`
      *   * to indicate the current user making the request.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param team
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeUser(team: Double, data: UserParams): typings.bluebird.bluebirdMod.^[_] = js.native
    def removeUser(team: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * Returns the compact records for all users that are members of the team.
      *   * @param {Number} team Globally unique identifier for the team.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param team
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def users(team: Double): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def users(team: Double, params: Params): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def users(team: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
  }
  
  @js.native
  class TeamsCls protected () extends Teams {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait TeamsStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Teams]
  
  trait UserParams extends js.Object {
    var user: String | Double
  }
  
  /**
    * A _user_ object represents an account in Asana that can be given access to
    * various workspaces, projects, and tasks.
    *
    * Like other objects in the system, users are referred to by numerical IDs.
    * However, the special string identifier `me` can be used anywhere
    * a user ID is accepted, to refer to the current authenticated user.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Users extends Resource {
    /**
      * * Returns the user records for all users in all workspaces and organizations
      * * accessible to the authenticated user. Accepts an optional workspace ID
      * * parameter.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Number} [params.workspace] The workspace or organization to filter users on.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param params
      * @param dispatchOptions?
      * @return
      */
    def findAll(params: typings.asana.asanaMod.resourcesNs.UsersNs.FindAllParams): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def findAll(params: typings.asana.asanaMod.resourcesNs.UsersNs.FindAllParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    /**
      * * Returns the full user record for the single user with the provided ID.
      *   * @param {Number|String} user An identifier for the user. Can be one of an email address,
      *   * the globally unique identifier for the user, or the keyword `me`
      *   * to indicate the current user making the request.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param user
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(user: String): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def findById(user: String, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def findById(user: String, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def findById(user: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def findById(user: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def findById(user: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    /**
      * * Returns the user records for all users in the specified workspace or
      * * organization.
      *   * @param {Number} workspace The workspace in which to get users.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findByWorkspace(workspace: Double): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.UsersNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: Params): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.UsersNs.Type]] = js.native
    def findByWorkspace(workspace: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.UsersNs.Type]] = js.native
    /**
      * * Returns the full user record for the currently authenticated user.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def me(): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def me(params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def me(params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
  }
  
  @js.native
  class UsersCls protected () extends Users {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait UsersStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Users]
  
  trait VersionInfo extends js.Object {
    var language: String
    var language_version: String
    var os: String
    var os_version: String
    var version: String
  }
  
  /**
    * **Webhooks are currently in BETA - The information here may change.**
    *
    * Webhooks allow an application to be notified of changes. This is in addition
    * to the ability to fetch those changes directly as
    * [Events](/developers/api-reference/events) - in fact, Webhooks are just a way
    * to receive Events via HTTP POST at the time they occur instead of polling for
    * them. For services accessible via HTTP this is often vastly more convenient,
    * and if events are not too frequent can be significantly more efficient.
    *
    * In both cases, however, changes are represented as Event objects - refer to
    * the [Events documentation](/developers/api-reference/events) for more
    * information on what data these events contain.
    *
    * **NOTE:** While Webhooks send arrays of Event objects to their target, the
    * Event objects themselves contain *only IDs*, rather than the actual resource
    * they are referencing. So while a normal event you receive via GET /events
    * would look like this:
    *
    *     {\
    *       "resource": {\
    *         "id": 1337,\
    *         "name": "My Task"\
    *       },\
    *       "parent": null,\
    *       "created_at": "2013-08-21T18:20:37.972Z",\
    *       "user": {\
    *         "id": 1123,\
    *         "name": "Tom Bizarro"\
    *       },\
    *       "action": "changed",\
    *       "type": "task"\
    *     }
    *
    * In a Webhook payload you would instead receive this:
    *
    *     {\
    *       "resource": 1337,\
    *       "parent": null,\
    *       "created_at": "2013-08-21T18:20:37.972Z",\
    *       "user": 1123,\
    *       "action": "changed",\
    *       "type": "task"\
    *     }
    *
    * Webhooks themselves contain only the information necessary to deliver the
    * events to the desired target as they are generated.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  class Webhooks protected () extends Resource {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
    /**
      * * Establishing a webhook is a two-part process. First, a simple HTTP POST
      * * similar to any other resource creation. Since you could have multiple
      * * webhooks we recommend specifying a unique local id for each target.
      * *
      * * Next comes the confirmation handshake. When a webhook is created, we will
      * * send a test POST to the `target` with an `X-Hook-Secret` header as
      * * described in the
      * * [Resthooks Security documentation](http://resthooks.org/docs/security/).
      * * The target must respond with a `200 OK` and a matching `X-Hook-Secret`
      * * header to confirm that this webhook subscription is indeed expected.
      * *
      * * If you do not acknowledge the webhook's confirmation handshake it will
      * * fail to setup, and you will receive an error in response to your attempt
      * * to create it. This means you need to be able to receive and complete the
      * * webhook *while* the POST request is in-flight.
      *   * @param {Number} resource A resource ID to subscribe to. The resource can be a task or project.
      *   * @param {String} target The URL to receive the HTTP POST.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param resource
      * @param target
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def create(resource: Double, target: String, data: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def create(resource: Double, target: String, data: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * This method permanently removes a webhook. Note that it may be possible
      * * to receive a request that was already in flight after deleting the
      * * webhook, but no further requests will be issued.
      *   * @param {String} webhook The webhook to delete.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param webhook
      * @param dispatchOptions?
      * @return
      */
    def deleteById(webhook: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def deleteById(webhook: String, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * Returns the compact representation of all webhooks your app has
      * * registered for the authenticated user in the given workspace.
      *   * @param {Number} workspace The workspace to query for webhooks in.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Number} [params.resource] Only return webhooks for the given resource.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def getAll(workspace: Double): typings.bluebird.bluebirdMod.^[_] = js.native
    def getAll(workspace: Double, params: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def getAll(workspace: Double, params: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * Returns the full record for the given webhook.
      *   * @param {String} webhook The webhook to get.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param webhook
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def getById(webhook: String): typings.bluebird.bluebirdMod.^[_] = js.native
    def getById(webhook: String, params: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    def getById(webhook: String, params: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  }
  
  /**
    * A _workspace_ is the highest-level organizational unit in Asana. All projects
    * and tasks have an associated workspace.
    *
    * An _organization_ is a special kind of workspace that represents a company.
    * In an organization, you can group your projects into teams. You can read
    * more about how organizations work on the Asana Guide.
    * To tell if your workspace is an organization or not, check its
    * `is_organization` property.
    *
    * Over time, we intend to migrate most workspaces into organizations and to
    * release more organization-specific functionality. We may eventually deprecate
    * using workspace-based APIs for organizations. Currently, and until after
    * some reasonable grace period following any further announcements, you can
    * still reference organizations in any `workspace` parameter.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  @js.native
  trait Workspaces extends Resource {
    /**
      * * The user can be referenced by their globally unique user ID or their email address.
      * * Returns the full user record for the invited user.
      *   * @param {Number} workspace The workspace or organization to invite the user to.
      *   * @param {Object} data Data for the request
      *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
      *   * the globally unique identifier for the user, or the keyword `me`
      *   * to indicate the current user making the request.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def addUser(workspace: Double, data: UserParams): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    def addUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.UsersNs.Type] = js.native
    /**
      * * Returns the compact records for all workspaces visible to the authorized user.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findAll(): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.WorkspacesNs.ShortType]] = js.native
    def findAll(params: PaginationParams): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.WorkspacesNs.ShortType]] = js.native
    def findAll(params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[ResourceList[typings.asana.asanaMod.resourcesNs.WorkspacesNs.ShortType]] = js.native
    /**
      * * Returns the full workspace record for a single workspace.
      *   * @param {Number} workspace Globally unique identifier for the workspace or organization.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The requested resource
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def findById(workspace: Double): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.WorkspacesNs.Type] = js.native
    def findById(workspace: Double, params: Params): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.WorkspacesNs.Type] = js.native
    def findById(workspace: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.WorkspacesNs.Type] = js.native
    /**
      * * The user making this call must be an admin in the workspace.
      * * Returns an empty data record.
      *   * @param {Number} workspace The workspace or organization to invite the user to.
      *   * @param {Object} data Data for the request
      *   * @param {Number|String} data.user An identifier for the user. Can be one of an email address,
      *   * the globally unique identifier for the user, or the keyword `me`
      *   * to indicate the current user making the request.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def removeUser(workspace: Double, data: UserParams): typings.bluebird.bluebirdMod.^[_] = js.native
    def removeUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * * Retrieves objects in the workspace based on an auto-completion/typeahead
      * * search algorithm. This feature is meant to provide results quickly, so do
      * * not rely on this API to provide extremely accurate search results. The
      * * result set is limited to a single page of results with a maximum size,
      * * so you won't be able to fetch large numbers of results.
      *   * @param {Number} workspace The workspace to fetch objects from.
      *   * @param {Object} [params] Parameters for the request
      *   * @param {String} params.type The type of values the typeahead should return.
      *   * Note that unlike in the names of endpoints, the types listed here are
      *   * in singular form (e.g. `task`). Using multiple types is not yet supported.
      *   * @param {String} [params.query] The string that will be used to search for relevant objects. If an
      *   * empty string is passed in, the API will currently return an empty
      *   * result set.
      *   * @param {Number} [params.count] The number of results to return. The default is `20` if this
      *   * parameter is omitted, with a minimum of `1` and a maximum of `100`.
      *   * If there are fewer results found than requested, all will be returned.
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param params?
      * @param dispatchOptions?
      * @return
      */
    def typeahead(workspace: Double): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def typeahead(workspace: Double, params: TypeaheadParams): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    def typeahead(workspace: Double, params: TypeaheadParams, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[SimpleResourceList] = js.native
    /**
      * * A specific, existing workspace can be updated by making a PUT request on
      * * the URL for that workspace. Only the fields provided in the data block
      * * will be updated; any unspecified fields will remain unchanged.
      * *
      * * Currently the only field that can be modified for a workspace is its `name`.
      * *
      * * Returns the complete, updated workspace record.
      *   * @param {Number} workspace The workspace to update.
      *   * @param {Object} data Data for the request
      *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
      *   * @return {Promise} The response from the API
      * @param workspace
      * @param data
      * @param dispatchOptions?
      * @return
      */
    def update(workspace: Double, data: Anon_Name): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.WorkspacesNs.Type] = js.native
    def update(workspace: Double, data: Anon_Name, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[typings.asana.asanaMod.resourcesNs.WorkspacesNs.Type] = js.native
  }
  
  @js.native
  class WorkspacesCls protected () extends Workspaces {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @js.native
  trait WorkspacesStatic extends /**
    * @param dispatcher
    */
  Instantiable1[/* dispatcher */ Dispatcher, Workspaces]
  
  var Attachments: AttachmentsStatic = js.native
  var Events: EventsStatic = js.native
  var Projects: ProjectsStatic = js.native
  var Resource: ResourceStatic = js.native
  var Stories: StoriesStatic = js.native
  var Tags: TagsStatic = js.native
  var Tasks: TasksStatic = js.native
  var Teams: TeamsStatic = js.native
  var Users: UsersStatic = js.native
  var Workspaces: WorkspacesStatic = js.native
  @JSName("Attachments")
  @js.native
  object AttachmentsNs extends js.Object {
    @js.native
    trait Type extends Resource {
      val created_at: String = js.native
      val download_url: String = js.native
      val host: String = js.native
      val parent: Resource = js.native
      val view_url: String = js.native
    }
    
  }
  
  @JSName("Projects")
  @js.native
  object ProjectsNs extends js.Object {
    trait CreateParams extends js.Object {
      var color: js.UndefOr[String] = js.undefined
      var due_date: String
      var name: js.UndefOr[String] = js.undefined
      var notes: js.UndefOr[String] = js.undefined
      var public: js.UndefOr[Boolean] = js.undefined
      var team: js.UndefOr[Double] = js.undefined
    }
    
    trait FindAllParams extends PaginationParams {
      var archived: js.UndefOr[Boolean] = js.undefined
      var team: js.UndefOr[Double] = js.undefined
    }
    
    trait FindByParams extends PaginationParams {
      var archived: js.UndefOr[Boolean] = js.undefined
    }
    
    trait FollowersParams extends js.Object {
      var followers: js.Array[Double | String]
    }
    
    trait MembersParams extends js.Object {
      var members: js.Array[Double | String]
    }
    
    trait Status extends js.Object {
      var author: Resource
      var color: String
      var html_text: String
      var modified_at: String
      var text: String
    }
    
    @js.native
    trait Type extends Resource {
      var archived: Boolean = js.native
      var color: String = js.native
      var created_at: String = js.native
      var current_status: Status = js.native
      var due_date: String = js.native
      var followers: js.Array[Resource] = js.native
      var members: js.Array[Resource] = js.native
      var modified_at: String = js.native
      var notes: String = js.native
      var public: Boolean = js.native
      var team: Resource = js.native
      var workspace: Resource = js.native
    }
    
  }
  
  @JSName("Stories")
  @js.native
  object StoriesNs extends js.Object {
    @js.native
    trait ShortType extends Resource {
      var created_at: String = js.native
      var created_by: Resource = js.native
      var text: String = js.native
      var `type`: String = js.native
    }
    
    @js.native
    trait Type extends ShortType {
      var hearts: js.Array[typings.asana.asanaMod.resourcesNs.StoriesNs.Type] = js.native
      var html_text: String = js.native
      var source: String = js.native
      var target: Resource = js.native
    }
    
  }
  
  @JSName("Tags")
  @js.native
  object TagsNs extends js.Object {
    trait FindAllParams extends PaginationParams {
      var archived: js.UndefOr[Boolean] = js.undefined
      var team: js.UndefOr[Double] = js.undefined
    }
    
    @js.native
    trait Type extends Resource {
      var color: String = js.native
      var created_at: String = js.native
      var followers: js.Array[Resource] = js.native
      var notes: String = js.native
      var workspace: Resource = js.native
    }
    
  }
  
  @JSName("Tasks")
  @js.native
  object TasksNs extends js.Object {
    trait AddProjectParams extends js.Object {
      var insertAfter: js.UndefOr[Double] = js.undefined
      var insertBefore: js.UndefOr[Double] = js.undefined
      var project: Double
      var section: js.UndefOr[Double] = js.undefined
    }
    
    trait CommentParams extends js.Object {
      var text: String
    }
    
    trait CreateParams extends js.Object {
      var completed: js.UndefOr[Boolean] = js.undefined
      var hearted: js.UndefOr[Boolean] = js.undefined
      var name: String
      var notes: js.UndefOr[String] = js.undefined
    }
    
    trait FindAllParams extends PaginationParams {
      var assignee: js.UndefOr[Double] = js.undefined
      var completed_since: js.UndefOr[String] = js.undefined
      var modified_since: js.UndefOr[String] = js.undefined
      var workspace: Double
    }
    
    trait FollowersParams extends js.Object {
      var followers: js.Array[Double | String]
    }
    
    trait RemoveProjectParams extends js.Object {
      var project: Double
    }
    
    trait TagParams extends js.Object {
      var tag: String
    }
    
    @js.native
    trait Type extends Resource {
      var assignee: Resource = js.native
      var assignee_status: String = js.native
      var completed: Boolean = js.native
      var completed_at: String = js.native
      var created_at: String = js.native
      var due_at: String = js.native
      var due_on: String = js.native
      var followers: js.Array[Resource] = js.native
      var hearted: Boolean = js.native
      var memberships: js.Array[Membership] = js.native
      var modified_at: String = js.native
      var notes: String = js.native
      var num_hearts: Double = js.native
      var parent: Resource = js.native
      var projects: js.Array[Resource] = js.native
      var tags: js.Array[Resource] = js.native
      var workspace: Resource = js.native
    }
    
  }
  
  @JSName("Teams")
  @js.native
  object TeamsNs extends js.Object {
    @js.native
    trait Type extends Resource {
      var organization: Resource = js.native
    }
    
  }
  
  @JSName("Users")
  @js.native
  object UsersNs extends js.Object {
    trait FindAllParams extends PaginationParams {
      var workspace: Double
    }
    
    @js.native
    trait Type extends Resource {
      var email: String = js.native
      var photo: StringDictionary[String] = js.native
      var workspaces: js.Array[Resource] = js.native
    }
    
  }
  
  @JSName("Workspaces")
  @js.native
  object WorkspacesNs extends js.Object {
    @js.native
    trait ShortType extends Resource {
      var id_organization: js.UndefOr[Boolean] = js.native
    }
    
    @js.native
    trait Type extends Resource {
      var email_domains: js.Array[String] = js.native
      var id_organization: Boolean = js.native
    }
    
    trait TypeaheadParams extends js.Object {
      var count: js.UndefOr[Double] = js.undefined
      var query: js.UndefOr[String] = js.undefined
      var `type`: String
    }
    
  }
  
  /**
    * An _event_ is an object representing a change to a resource that was observed
    * by an event subscription.
    *
    * In general, requesting events on a resource is faster and subject to higher
    * rate limits than requesting the resource itself. Additionally, change events
    * bubble up - listening to events on a project would include when stories are
    * added to tasks in the project, even on subtasks.
    *
    * Establish an initial sync token by making a request with no sync token.
    * The response will be a `412` error - the same as if the sync token had
    * expired.
    *
    * Subsequent requests should always provide the sync token from the immediately
    * preceding call.
    *
    * Sync tokens may not be valid if you attempt to go 'backward' in the history
    * by requesting previous tokens, though re-requesting the current sync token
    * is generally safe, and will always return the same results.
    *
    * When you receive a `412 Precondition Failed` error, it means that the
    * sync token is either invalid or expired. If you are attempting to keep a set
    * of data in sync, this signals you may need to re-crawl the data.
    *
    * Sync tokens always expire after 24 hours, but may expire sooner, depending on
    * load on the service.
    * @class
    * @param {Dispatcher} dispatcher The API dispatcher
    */
  type Events = Resource
  type SimpleResourceList = ResourceList[Resource]
}

