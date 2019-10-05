package typings.asana.asanaMod.resources

import typings.asana.Anon_Name
import typings.asana.asanaMod.resources.Users.Type
import typings.asana.asanaMod.resources.Workspaces.ShortType
import typings.asana.asanaMod.resources.Workspaces.TypeaheadParams
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSName("Workspaces")
@js.native
trait Workspaces_ extends Resource {
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
  def addUser(workspace: Double, data: UserParams): ^[Type] = js.native
  def addUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): ^[Type] = js.native
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
  def findAll(params: PaginationParams): ^[ResourceList[ShortType]] = js.native
  def findAll(params: PaginationParams, dispatchOptions: js.Any): ^[ResourceList[ShortType]] = js.native
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
  def findById(workspace: Double): ^[typings.asana.asanaMod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params): ^[typings.asana.asanaMod.resources.Workspaces.Type] = js.native
  def findById(workspace: Double, params: Params, dispatchOptions: js.Any): ^[typings.asana.asanaMod.resources.Workspaces.Type] = js.native
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
  def removeUser(workspace: Double, data: UserParams): ^[_] = js.native
  def removeUser(workspace: Double, data: UserParams, dispatchOptions: js.Any): ^[_] = js.native
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
  def typeahead(workspace: Double): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams): ^[SimpleResourceList] = js.native
  def typeahead(workspace: Double, params: TypeaheadParams, dispatchOptions: js.Any): ^[SimpleResourceList] = js.native
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
  def update(workspace: Double, data: Anon_Name): ^[typings.asana.asanaMod.resources.Workspaces.Type] = js.native
  def update(workspace: Double, data: Anon_Name, dispatchOptions: js.Any): ^[typings.asana.asanaMod.resources.Workspaces.Type] = js.native
}

