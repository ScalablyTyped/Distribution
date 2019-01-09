package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

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
  def addFollowers(project: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FollowersParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def addFollowers(
    project: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FollowersParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def addMembers(project: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.MembersParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def addMembers(
    project: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.MembersParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def create(data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams with asanaLib.Anon_Workspace): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def create(
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams with asanaLib.Anon_Workspace,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def createInTeam(team: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def createInTeam(
    team: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def createInWorkspace(workspace: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def createInWorkspace(
    workspace: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def delete(project: scala.Double): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def delete(project: scala.Double, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
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
  def findAll(): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findAll(params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindAllParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findAll(params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindAllParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
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
  def findById(project: scala.Double): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def findById(project: scala.Double, params: Params): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def findById(project: scala.Double, params: Params, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def findByTeam(team: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findByTeam(team: scala.Double, params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindByParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findByTeam(
    team: scala.Double,
    params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindByParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
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
  def findByWorkspace(workspace: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findByWorkspace(workspace: scala.Double, params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindByParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
  def findByWorkspace(
    workspace: scala.Double,
    params: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FindByParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type]] = js.native
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
  def removeFollowers(project: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FollowersParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def removeFollowers(
    project: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.FollowersParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def removeMembers(project: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.MembersParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def removeMembers(
    project: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.MembersParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
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
  def sections(project: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
  def sections(project: scala.Double, params: PaginationParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
  def sections(project: scala.Double, params: PaginationParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
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
  def tasks(project: scala.Double): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
  def tasks(project: scala.Double, params: PaginationParams): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
  def tasks(project: scala.Double, params: PaginationParams, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[ResourceList[asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs.Type]] = js.native
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
  def update(project: scala.Double, data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
  def update(
    project: scala.Double,
    data: asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.CreateParams,
    dispatchOptions: js.Any
  ): bluebirdLib.bluebirdMod.namespaced[asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs.Type] = js.native
}

