package typings.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typings.asana.anon.Name
import typings.asana.mod.Dispatcher
import typings.asana.mod.resources.Users.Type
import typings.asana.mod.resources.Workspaces.ShortType
import typings.asana.mod.resources.Workspaces.TypeaheadParams
import typings.bluebird.mod.^
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
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Workspaces
  extends StObject
     with TopLevelResource {
  
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
  def addUser(workspace: String, data: UserParams): ^[Type] = js.native
  def addUser(workspace: String, data: UserParams, dispatchOptions: Any): ^[Type] = js.native
  def addUser(workspace: Double, data: UserParams): ^[Type] = js.native
  def addUser(workspace: Double, data: UserParams, dispatchOptions: Any): ^[Type] = js.native
  
  /**
    * * Returns the compact records for all workspaces visible to the authorized user.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): ^[ResourceList[ShortType]] = js.native
  def findAll(params: Unit, dispatchOptions: Any): ^[ResourceList[ShortType]] = js.native
  def findAll(params: PaginationParams): ^[ResourceList[ShortType]] = js.native
  def findAll(params: PaginationParams, dispatchOptions: Any): ^[ResourceList[ShortType]] = js.native
  
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
  def findById(workspace: String): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Params): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: String, params: Params, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Unit, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  
  // https://github.com/Asana/node-asana/blob/6bf00fb3257847744bf0ebe2dc0e95c445477282/lib/resources/gen/workspaces.js#L57-L74
  /**
    * Get multiple workspaces
    * @param {Object} params: Parameters for the request
    *  - offset {String}:  Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next
    *    request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously
    *    paginated request.'
    *  - limit {Number}:  Results per page. The number of objects to return per page. The value must be between 1 and 100.
    *  - optFields {[String]}:  Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more
    *    efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the
    *    objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    * - optPretty {Boolean}:  Provides "pretty" output. Provides the response in a "pretty" format. In the case of JSON this means doing proper line breaking and indentation to make it
    *    readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    * @param {Object} [dispatchOptions]: Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def getWorkspaces(): ^[ResourceList[typings.asana.mod.resources.Workspaces.Type]] = js.native
  def getWorkspaces(params: Any): ^[ResourceList[typings.asana.mod.resources.Workspaces.Type]] = js.native
  def getWorkspaces(params: Any, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Workspaces.Type]] = js.native
  def getWorkspaces(params: Unit, dispatchOptions: Any): ^[ResourceList[typings.asana.mod.resources.Workspaces.Type]] = js.native
  
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
  def removeUser(workspace: String, data: UserParams): ^[Any] = js.native
  def removeUser(workspace: String, data: UserParams, dispatchOptions: Any): ^[Any] = js.native
  def removeUser(workspace: Double, data: UserParams): ^[Any] = js.native
  def removeUser(workspace: Double, data: UserParams, dispatchOptions: Any): ^[Any] = js.native
  
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
  def typeahead(workspace: String): ^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: Unit, dispatchOptions: Any): ^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: TypeaheadParams): ^[SimpleResourceList] = js.native
  def typeahead(workspace: String, params: TypeaheadParams, dispatchOptions: Any): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: Unit, dispatchOptions: Any): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams, dispatchOptions: Any): ^[SimpleResourceList] = js.native
  
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
  def update(workspace: String, data: Name): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: String, data: Name, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: Double, data: Name): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
  def update(workspace: Double, data: Name, dispatchOptions: Any): ^[typings.asana.mod.resources.Workspaces.Type] = js.native
}
object Workspaces extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Workspaces")
  @js.native
  open class ^ protected ()
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
  
  trait ShortType
    extends StObject
       with Resource {
    
    var is_organization: js.UndefOr[Boolean] = js.undefined
  }
  object ShortType {
    
    inline def apply(gid: String, name: String, resource_type: String): ShortType = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShortType] (val x: Self) extends AnyVal {
      
      inline def setIs_organization(value: Boolean): Self = StObject.set(x, "is_organization", value.asInstanceOf[js.Any])
      
      inline def setIs_organizationUndefined: Self = StObject.set(x, "is_organization", js.undefined)
    }
  }
  
  trait Type
    extends StObject
       with Resource {
    
    var email_domains: js.Array[String]
    
    var is_organization: Boolean
  }
  object Type {
    
    inline def apply(
      email_domains: js.Array[String],
      gid: String,
      is_organization: Boolean,
      name: String,
      resource_type: String
    ): typings.asana.mod.resources.Workspaces.Type = {
      val __obj = js.Dynamic.literal(email_domains = email_domains.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], is_organization = is_organization.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.asana.mod.resources.Workspaces.Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.asana.mod.resources.Workspaces.Type] (val x: Self) extends AnyVal {
      
      inline def setEmail_domains(value: js.Array[String]): Self = StObject.set(x, "email_domains", value.asInstanceOf[js.Any])
      
      inline def setEmail_domainsVarargs(value: String*): Self = StObject.set(x, "email_domains", js.Array(value*))
      
      inline def setIs_organization(value: Boolean): Self = StObject.set(x, "is_organization", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeaheadParams extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object TypeaheadParams {
    
    inline def apply(`type`: String): TypeaheadParams = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeaheadParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeaheadParams] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = WorkspacesStatic
  
  /* This means you don't have to write `^`, but can instead just say `Workspaces.foo` */
  override def _to: WorkspacesStatic = ^
}
