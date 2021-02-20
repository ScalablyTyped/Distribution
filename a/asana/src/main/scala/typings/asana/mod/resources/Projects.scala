package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.CreateParamsworkspacestri
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Projects.CreateParams
import typings.asana.mod.resources.Projects.FindAllParams
import typings.asana.mod.resources.Projects.FindByParams
import typings.asana.mod.resources.Projects.FollowersParams
import typings.asana.mod.resources.Projects.MembersParams
import typings.asana.mod.resources.Projects.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Projects
  extends typings.asana.mod.resources.Resource {
  
  /**
    * * Adds the specified list of users as followers to the project. Followers are a subset of members, therefore if
    * * the users are not already members of the project they will also become members as a result of this operation.
    * * Returns the updated project record.
    *   * @param {String|Number} project The project to add followers to.
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
    *   * @param {String|Number} project The project to add members to.
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
    *   * @param {String|Number} data.workspace The workspace or organization to create the project in.
    *   * @param {String} [data.team] If creating in an organization, the specific team to create the
    *   * project in.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(data: CreateParamsworkspacestri): typings.bluebird.mod.^[Type] = js.native
  def create(data: CreateParamsworkspacestri, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * Creates a project shared with the given team.
    * *
    * * Returns the full record of the newly created project.
    *   * @param {String|Number} team The team to create the project in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param team
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInTeam(team: String, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInTeam(team: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def createInTeam(team: Double, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInTeam(team: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * If the workspace for your project _is_ an organization, you must also
    * * supply a `team` to share the project with.
    * *
    * * Returns the full record of the newly created project.
    *   * @param {String|Number} workspace The workspace or organization to create the project in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: String, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: String, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams): typings.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * A specific, existing project can be deleted by making a DELETE request
    * * on the URL for that project.
    * *
    * * Returns an empty data record.
    *   * @param {String|Number} project The project to delete.
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
  def findAll(params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the complete project record for a single project.
    *   * @param {String|Number} project The project to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param project
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(project: String): typings.bluebird.mod.^[Type] = js.native
  def findById(project: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(project: String, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(project: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double, params: Params): typings.bluebird.mod.^[Type] = js.native
  def findById(project: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact project records for all projects in the team.
    *   * @param {String|Number} team The team to find projects in.
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
  def findByTeam(team: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: String, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: String, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTeam(team: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the compact project records for all projects in the workspace.
    *   * @param {String|Number} workspace The workspace or organization to find projects in.
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
  def findByWorkspace(workspace: String): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: FindByParams): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: FindByParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Removes the specified list of users from following the project, this will not affect project membership status.
    * * Returns the updated project record.
    *   * @param {String|Number} project The project to remove followers from.
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
    *   * @param {String|Number} project The project to remove members from.
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
    *   * @param {String|Number} project The project to get sections from.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param project
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def sections(project: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  def sections(project: Double, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Sections.Type]] = js.native
  
  /**
    * * Returns the compact task records for all tasks within the given project,
    * * ordered by their priority within the project. Tasks can exist in more than one project at a time.
    *   * @param {String|Number} project The project in which to search for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param project
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def tasks(project: String): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: String, params: PaginationParams): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: String, params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: Double): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
  def tasks(project: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[typings.asana.mod.resources.Tasks.Type]] = js.native
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
    *   * @param {String|Number} project The project to update.
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
object Projects extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Projects")
  @js.native
  class ^ protected () extends Projects {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Projects")
  @js.native
  val ^ : ProjectsStatic = js.native
  
  @js.native
  trait CreateParams extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var due_date: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var public: js.UndefOr[Boolean] = js.native
    
    var team: js.UndefOr[String | Double] = js.native
  }
  object CreateParams {
    
    @scala.inline
    def apply(): CreateParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateParams]
    }
    
    @scala.inline
    implicit class CreateParamsMutableBuilder[Self <: CreateParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  @js.native
  trait FindAllParams extends PaginationParams {
    
    var archived: js.UndefOr[Boolean] = js.native
    
    var team: js.UndefOr[String | Double] = js.native
    
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
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
      
      @scala.inline
      def setTeam(value: String | Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      @scala.inline
      def setWorkspace(value: String | Double): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    }
  }
  
  @js.native
  trait FindByParams extends PaginationParams {
    
    var archived: js.UndefOr[Boolean] = js.native
  }
  object FindByParams {
    
    @scala.inline
    def apply(): FindByParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindByParams]
    }
    
    @scala.inline
    implicit class FindByParamsMutableBuilder[Self <: FindByParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
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
  trait MembersParams extends StObject {
    
    var members: js.Array[Double | String] = js.native
  }
  object MembersParams {
    
    @scala.inline
    def apply(members: js.Array[Double | String]): MembersParams = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembersParams]
    }
    
    @scala.inline
    implicit class MembersParamsMutableBuilder[Self <: MembersParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[Double | String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: (Double | String)*): Self = StObject.set(x, "members", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var author: typings.asana.mod.resources.Resource = js.native
    
    var color: String = js.native
    
    var html_text: String = js.native
    
    var modified_at: String = js.native
    
    var text: String = js.native
  }
  object Status {
    
    @scala.inline
    def apply(
      author: typings.asana.mod.resources.Resource,
      color: String,
      html_text: String,
      modified_at: String,
      text: String
    ): Status = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], html_text = html_text.asInstanceOf[js.Any], modified_at = modified_at.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: typings.asana.mod.resources.Resource): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_text(value: String): Self = StObject.set(x, "html_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified_at(value: String): Self = StObject.set(x, "modified_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type
    extends typings.asana.mod.resources.Resource {
    
    var archived: Boolean = js.native
    
    var color: String = js.native
    
    var created_at: String = js.native
    
    var current_status: Status = js.native
    
    var due_date: String = js.native
    
    var followers: js.Array[typings.asana.mod.resources.Resource] = js.native
    
    var members: js.Array[typings.asana.mod.resources.Resource] = js.native
    
    var modified_at: String = js.native
    
    var notes: String = js.native
    
    var public: Boolean = js.native
    
    var team: typings.asana.mod.resources.Resource = js.native
    
    var workspace: typings.asana.mod.resources.Resource = js.native
  }
  
  type _To = ProjectsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Projects.foo` */
  override def _to: ProjectsStatic = ^
}
