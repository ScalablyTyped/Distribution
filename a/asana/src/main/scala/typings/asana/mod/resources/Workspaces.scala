package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Name
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Users.Type
import typings.asana.mod.resources.Workspaces.ShortType
import typings.asana.mod.resources.Workspaces.TypeaheadParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Workspaces
  extends StObject
     with Resource {
  
  /**
    * * The user can be referenced by their globally unique user ID or their email address.
    * * Returns the full user record for the invited user.
    *   * @param {String|Number} workspace The workspace or organization to invite the user to.
    *   * @param {Object} data Data for the request
    *   * @param {String|Number} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addUser(workspace: String, data: UserParams): typings.bluebird.mod.^[Type] = js.native
  def addUser(workspace: String, data: UserParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  def addUser(workspace: Double, data: UserParams): typings.bluebird.mod.^[Type] = js.native
  def addUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact records for all workspaces visible to the authorized user.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): typings.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def findAll(params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def findAll(params: PaginationParams): typings.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def findAll(params: PaginationParams, dispatchOptions: js.Any): typings.bluebird.mod.^[ResourceList[ShortType]] = js.native
  
  /**
    * * Returns the full workspace record for a single workspace.
    *   * @param {String|Number} workspace Globally unique identifier for the workspace or organization.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(workspace: String): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Params): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  
  /**
    * * The user making this call must be an admin in the workspace.
    * * Returns an empty data record.
    *   * @param {String|Number} workspace The workspace or organization to invite the user to.
    *   * @param {Object} data Data for the request
    *   * @param {String|Number} data.user An identifier for the user. Can be one of an email address,
    *   * the globally unique identifier for the user, or the keyword `me`
    *   * to indicate the current user making the request.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeUser(workspace: String, data: UserParams): typings.bluebird.mod.^[js.Any] = js.native
  def removeUser(workspace: String, data: UserParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Any] = js.native
  def removeUser(workspace: Double, data: UserParams): typings.bluebird.mod.^[js.Any] = js.native
  def removeUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): typings.bluebird.mod.^[js.Any] = js.native
  
  /**
    * * Retrieves objects in the workspace based on an auto-completion/typeahead
    * * search algorithm. This feature is meant to provide results quickly, so do
    * * not rely on this API to provide extremely accurate search results. The
    * * result set is limited to a single page of results with a maximum size,
    * * so you won't be able to fetch large numbers of results.
    *   * @param {String|Number} workspace The workspace to fetch objects from.
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
  def typeahead(workspace: String): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: TypeaheadParams): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: TypeaheadParams, dispatchOptions: js.Any): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: Double): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: Unit, dispatchOptions: js.Any): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams): typings.bluebird.mod.^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams, dispatchOptions: js.Any): typings.bluebird.mod.^[SimpleResourceList] = js.native
  
  /**
    * * A specific, existing workspace can be updated by making a PUT request on
    * * the URL for that workspace. Only the fields provided in the data block
    * * will be updated; any unspecified fields will remain unchanged.
    * *
    * * Currently the only field that can be modified for a workspace is its `name`.
    * *
    * * Returns the complete, updated workspace record.
    *   * @param {String|Number} workspace The workspace to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(workspace: String, data: Name): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: String, data: Name, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: Double, data: Name): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: Double, data: Name, dispatchOptions: js.Any): typings.bluebird.mod.^[typings.asana.mod.resources.Workspaces.Type] = js.native
}
object Workspaces extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Workspaces")
  @js.native
  class ^ protected ()
    extends StObject
       with Workspaces {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Workspaces")
  @js.native
  val ^ : WorkspacesStatic = js.native
  
  @js.native
  trait ShortType
    extends StObject
       with Resource {
    
    var is_organization: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait Type
    extends StObject
       with Resource {
    
    var email_domains: js.Array[String] = js.native
    
    var is_organization: Boolean = js.native
  }
  
  trait TypeaheadParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object TypeaheadParams {
    
    @scala.inline
    def apply(`type`: String): TypeaheadParams = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeaheadParams]
    }
    
    @scala.inline
    implicit class TypeaheadParamsMutableBuilder[Self <: TypeaheadParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = WorkspacesStatic
  
  /* This means you don't have to write `^`, but can instead just say `Workspaces.foo` */
  override def _to: WorkspacesStatic = ^
}
