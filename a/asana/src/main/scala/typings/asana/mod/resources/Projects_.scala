package typings.asana.mod.resources

import typings.asana.AnonWorkspace
import typings.asana.mod.resources.Projects.CreateParams
import typings.asana.mod.resources.Projects.FindAllParams
import typings.asana.mod.resources.Projects.FindByParams
import typings.asana.mod.resources.Projects.FollowersParams
import typings.asana.mod.resources.Projects.MembersParams
import typings.asana.mod.resources.Projects.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Projects_ extends Resource {
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
  def addFollowers(project: String, data: FollowersParams): typings.bluebird.mod.^[Type] = js.native
  def addFollowers(project: String, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def addFollowers(project: Double, data: FollowersParams): typings.bluebird.mod.^[Type] = js.native
  def addFollowers(project: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def addMembers(project: String, data: MembersParams): typings.bluebird.mod.^[Type] = js.native
  def addMembers(project: String, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def addMembers(project: Double, data: MembersParams): typings.bluebird.mod.^[Type] = js.native
  def addMembers(project: Double, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def create(data: CreateParams with AnonWorkspace): typings.bluebird.mod.^[Type] = js.native
  def create(data: CreateParams with AnonWorkspace, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def createInTeam(team: Double, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInTeam(team: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def createInWorkspace(workspace: Double, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def delete(project: String): typings.bluebird.mod.^[Unit] = js.native
  def delete(project: String, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
  def delete(project: Double): typings.bluebird.mod.^[Unit] = js.native
  def delete(project: Double, dispatchOptions: js.Any): typings.bluebird.mod.^[Unit] = js.native
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
  def findAll(): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
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
  def findById(project: String): typings.bluebird.mod.^[Type] = js.native
  def findById(project: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(project: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def findByTeam(team: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
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
  def findByWorkspace(workspace: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
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
  def removeFollowers(project: String, data: FollowersParams): typings.bluebird.mod.^[Type] = js.native
  def removeFollowers(project: String, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def removeFollowers(project: Double, data: FollowersParams): typings.bluebird.mod.^[Type] = js.native
  def removeFollowers(project: Double, data: FollowersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def removeMembers(project: String, data: MembersParams): typings.bluebird.mod.^[Type] = js.native
  def removeMembers(project: String, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def removeMembers(project: Double, data: MembersParams): typings.bluebird.mod.^[Type] = js.native
  def removeMembers(project: Double, data: MembersParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
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
  def sections(project: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
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
  def tasks(project: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
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
  def update(project: String, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def update(project: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def update(project: Double, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def update(project: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
}

