package typings.asana.asanaMod.resources

import typings.asana.asanaMod.resources.Teams.Type
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A _team_ is used to group related projects and people together within an
  * organization. Each project in an organization is associated with a team.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@JSName("Teams")
@js.native
trait Teams_ extends Resource {
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
  def addUser(team: Double, data: UserParams): ^[_] = js.native
  def addUser(team: Double, data: UserParams, dispatchOptions: js.Any): ^[_] = js.native
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
  def findById(team: Double): ^[Type] = js.native
  def findById(team: Double, params: Params): ^[Type] = js.native
  def findById(team: Double, params: Params, dispatchOptions: js.Any): ^[Type] = js.native
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
  def findByOrganization(organization: Double): ^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double, params: Params): ^[SimpleResourceList] = js.native
  def findByOrganization(organization: Double, params: Params, dispatchOptions: js.Any): ^[SimpleResourceList] = js.native
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
  def removeUser(team: Double, data: UserParams): ^[_] = js.native
  def removeUser(team: Double, data: UserParams, dispatchOptions: js.Any): ^[_] = js.native
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
  def users(team: Double): ^[SimpleResourceList] = js.native
  def users(team: Double, params: Params): ^[SimpleResourceList] = js.native
  def users(team: Double, params: Params, dispatchOptions: js.Any): ^[SimpleResourceList] = js.native
}

